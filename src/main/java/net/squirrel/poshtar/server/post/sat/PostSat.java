/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.sat;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.post.sat.dto.CatTrackingResponse;
import net.squirrel.poshtar.server.post.sat.dto.Datum;
import net.squirrel.poshtar.server.post.sat.dto.State;
import net.squirrel.poshtar.server.utils.XmlTransforming;

public class PostSat implements Post {
    private static final String API_KEY = "***";

    @Override
    public String track(String trackNumber, String language) throws Exception {
        String url = "http://urm.sat.ua/openws/hs/api/v1.0/tracking/json?number=" + trackNumber + "&apiKey=" + API_KEY;
        String response;
        String json = HttpClient.get(url);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        CatTrackingResponse dto = gson.fromJson(json, CatTrackingResponse.class);
        if (Boolean.parseBoolean(dto.getSuccess())) {
            Datum data = dto.getData().get(0);
            StringBuffer result = new StringBuffer("<b>Посылка № </b>" + trackNumber + "<br/>" +
                    "<b>Текущее состояние: </b>" + data.getCurrentStatus() + "<br/>" +
                    "<b>История :</b> <br/>");
            for(State state : data.getStates()){
                result.append("<i>    Дата: </i>" + state.getDate() + " |<i> Статус: </i>" + state.getStatus() + "<br/>" +
                "<i>     Город: </i>" + state.getTown() + "<br/> <br/>");
            }
            response = result.toString();
        } else {
            response = "Накладная на груз по идентификатору не найдена";
        }
        return XmlTransforming.marshalling(new Response(response));
    }
}
