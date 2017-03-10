/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.utils.IOUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostAutoLux implements Post {
    private static final String URL_UK = "http://autolux-post.com.ua/ua/tracking/";
    private static final String URL_EN = "http://autolux-post.com.ua/en/tracking/";
    private static final String URL_RU = "http://autolux-post.com.ua/tracking/";

    @Override
    public String track(String trackNumber, String language) throws Exception {
        String massage = "ttn_search=" + trackNumber;
        String url;
        switch (language) {
            case "en":
                url = URL_EN;
                break;
            case "ru":
                url = URL_RU;
                break;
            case "uk":
            default:
                url = URL_UK;
                break;
        }
        String response = postWithoutHeaders(url, massage);
        String state = extractionState(response);
        return XmlTransforming.marshalling(new Response(state));
    }

    private String postWithoutHeaders(String url, String massage) throws IOException {
        String response = null;
        InputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.connect();
            outputStream = new BufferedOutputStream(connection.getOutputStream());
            if (massage != null) {
                outputStream.write(massage.getBytes(Charset.forName("UTF-8")));
            }
            outputStream.flush();

            inputStream = connection.getInputStream();
            response = IOUtils.toString(inputStream);
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                //NOP
            }
        }
        return response;
    }
    private String extractionState(String response) {
        Pattern pattern = Pattern.compile("(?s)<div class=\"alert alert-success shadow-right\"(.*?)</div>");
        Matcher matcher = pattern.matcher(response);
        if (!matcher.find()) {
            return null;
        }
        String result = matcher.group(0);
        return result;
    }
}
