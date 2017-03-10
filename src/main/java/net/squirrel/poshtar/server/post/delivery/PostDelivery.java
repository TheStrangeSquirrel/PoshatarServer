/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.delivery;

import com.google.gson.Gson;
import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.post.delivery.dto.Data;
import net.squirrel.poshtar.server.post.delivery.dto.ReceiptDetails;
import net.squirrel.poshtar.server.utils.LogUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostDelivery implements Post {
    private static final Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());

    @Override
    public String track(String trackNumber, String language) throws Exception {
        String culture;
        String[] tag;
        switch (language) {
            case "en":
                culture = "en-US";
                tag = new String[]{"Receipt number: </b>", "<b>Route of goods: </b>",
                        "<b>Payment Status: </b> ", "<b>The total cost of the receipt: </b>", "<b>Delivery status: </b>",
                        "<b>Date of dispatch: </b>", "<b>Date of receipt: </b>", "No package was found with a number: ","Paid","Not paid"};
                break;
            case "ru":
                culture = "ru-RU";
                tag = new String[]{"<b>Квитанция № </b>", "<b>Маршрут груза: </b>",
                        "<b>Статус оплаты:</b> ", "<b>Общая стоимость квитанции: </b>", "<b>Статус доставки: </b>",
                        "<b>Дата отправки:</b> ", "<b>Дата получения: </b>", "Не найдена посылка с номером: ","Оплачено","Не оплачено"};
                break;
            case "uk":
            default:
                tag = new String[]{"<b>Квитанція № </b>", "<b>Маршрут вантажу: </b>",
                        "<b>Статус оплати:</b> ", "<b>Загальна вартість квитанції: </b>", "<b>Статус доставки: </b>",
                        "<b>Дата відправки:</b> ", "<b>Дата отримання: </b>", "Не знайдено посилку з номером: ","Оплачено","Не оплачено"};
                culture = "uk-UA";
                break;
        }
        String url = "http://www.delivery-auto.com/" + "api/Public/GetReceiptDetails?culture=" + culture + "&number=" + trackNumber;
        String query = HttpClient.get(url);
        Gson gson = new Gson();
        ReceiptDetails receiptInformation = gson.fromJson(query, ReceiptDetails.class);
        Data data = receiptInformation.getData();
        String status;
        String paymentStatus;

        if (data == null) {
            status = tag[7] + trackNumber;
        } else {
            status = tag[0] + trackNumber + "<br/>" +
                    tag[1] + data.getSenderWarehouseName() + " - " + data.getRecepientWarehouseName() + "<br/>" +
                    tag[2] + (data.getPaymentStatus() ? tag[8] : tag[9]) + "<br/>" +
                    tag[3] + data.getTotalCost() + "<br/>" +
                    tag[4] + data.getStatus() + "<br/>" +
                    tag[5] + data.getSendDate() + "<br/>" +
                    tag[6] + data.getReceiveDate();
        }
        return XmlTransforming.marshalling(new Response(status));
    }


}
