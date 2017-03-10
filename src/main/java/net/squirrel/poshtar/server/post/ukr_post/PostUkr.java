/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.ukr_post;


import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.post.ukr_post.org.barcode.BarcodeInfoService;
import net.squirrel.poshtar.server.post.ukr_post.org.barcode.BarcodeStatistic;
import net.squirrel.poshtar.server.post.ukr_post.org.barcode.Culture;
import net.squirrel.poshtar.server.utils.XmlTransforming;

public class PostUkr implements Post {
    private static final String KEY = "fcc8d9e1-b6f9-438f-9ac8-b67ab44391dd";

    @Override
    public String track(String trackNumber, String language) throws Exception {
        BarcodeStatistic statistic = new BarcodeStatistic();
        Culture culture;

        switch (language) {
            case "en":
                culture = Culture.EN;
                break;
            default:
            case "uk":
                culture = Culture.UK;
                break;
        }
        BarcodeInfoService barcodeInfo = statistic.getBarcodeStatisticSoap().getBarcodeInfo(KEY, trackNumber, culture);
        String responseXML = XmlTransforming.marshalling( new Response(barcodeInfo.getEventdescription()));
        return responseXML;
    }
}
