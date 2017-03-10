/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.meest_express;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.utils.XmlTransforming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostMeestExpress implements Post {
    @Override
    public String track(String trackNumber, String language) throws Exception {
        final String ATR_AGENT = "agent=";
        String ATR_TRACKING = "tracking=" + trackNumber;
        String url = "http://apii.meest-group.com/services/t/?tracking=&lang=" + language;
        String state = "";

        String raw = HttpClient.post(url, ATR_TRACKING + "&" + ATR_AGENT);
        Pattern pattern = Pattern.compile("(?s)<div class=\"t_company_title\">.*?<span class=\"red\">(.*?)!</span>");
        Matcher matcher = pattern.matcher(raw);
        if (matcher.find()) {
            state = matcher.group(1);
        } else {
            pattern = Pattern.compile("(?s)(<table class=\"t_table_info\" id=\"t_table_info\" style=\"\">.*?</table>).*?" +
                    "(<div id=\"blc_res_inner\" class=\"blc_res_inner\" style=\"\">(.*?)</div>)");
            matcher = pattern.matcher(raw);
            matcher.find();
            state = matcher.group(1) + matcher.group(2);
            state = state.replaceFirst("(?s)<div class=\"btn_row\">.*?</div>", "");
            state = state.replaceFirst("(?s)<div class=\"t_subscribe_txt\">.*?</div>", "");
            state = state.replaceFirst("(?s)<a(.*?)</a>", "");
        }
        return XmlTransforming.marshalling(new Response(state));
    }
}
