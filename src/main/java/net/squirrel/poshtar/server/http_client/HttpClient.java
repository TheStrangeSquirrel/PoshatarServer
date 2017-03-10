/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.http_client;

import net.squirrel.poshtar.server.utils.IOUtils;
import net.squirrel.poshtar.server.utils.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;


public class HttpClient {
    private static final Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());

    public static String post(String url, String massage) throws IOException {
        String response = null;
        InputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded,text/xml,text/html; charset=UTF-8");
            connection.setDoOutput(true);
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.connect();
            outputStream = new BufferedOutputStream(connection.getOutputStream());
            if (massage != null) {
                outputStream.write(massage.getBytes(Charset.forName("UTF-8")));
            }
            outputStream.flush();
            logger.debug("POST Code status: " + connection.getResponseCode());

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

    public static String get(String url) throws IOException {
        String response = null;
        InputStream inputStream = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded,text/xml,text/html; charset=UTF-8");
            connection.setConnectTimeout(50 * 1000);
            connection.setReadTimeout(50 * 1000);
            connection.connect();
            logger.debug("GET Code status: " + connection.getResponseCode());
            inputStream = connection.getInputStream();
            response = IOUtils.toString(inputStream);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                //NOP
            }
        }
        return response;
    }
}
