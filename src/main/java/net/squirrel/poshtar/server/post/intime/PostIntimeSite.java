/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.utils.XmlTransforming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostIntimeSite implements Post {
    @Override
    public String track(String trackNumber, String language) throws Exception {
        String url = "http://mytime.intime.ua/modules/global_functions.php?command=get_info_for_ttn&ttn=" + trackNumber;
        String intimeResponse = HttpClient.get(url);
        intimeResponse = intimeResponse.replaceFirst("<a(.*?)</a>", " ");
        Pattern pattern = Pattern.compile("(?s)<div(.*?)(</div>|Дата выдачи:</span>(.*?)</span>)");
        Matcher matcher = pattern.matcher(intimeResponse);
        matcher.find();
        String status = matcher.group(0);
        Response response = new Response(status);
        return XmlTransforming.marshalling(response);
    }
}
