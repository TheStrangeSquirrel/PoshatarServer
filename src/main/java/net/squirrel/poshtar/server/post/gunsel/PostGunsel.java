/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.gunsel;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.utils.XmlTransforming;

public class PostGunsel implements Post {
    @Override
    public String track(String trackNumber, String language) throws Exception {
        String url = "http://gunsel.ua/api.php?track=1&code=" + trackNumber;
        String response = HttpClient.get(url);
        return XmlTransforming.marshalling(new Response(response));
    }
}
