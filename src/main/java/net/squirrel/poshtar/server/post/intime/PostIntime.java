/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.post.intime.sh.reality.in_time.api20.API20;
import net.squirrel.poshtar.server.post.intime.sh.reality.in_time.api20.API20PortType;
import net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.*;
import net.squirrel.poshtar.server.utils.XmlTransforming;

import java.util.List;


public class PostIntime implements Post {
    private static final String KEY = "***";
    private static final String ID = "***";

    @Override
    public String track(String trackNumber, String language) throws Exception {

        String stringResponse;
        API20 api20 = new API20();
        AuthData authData = new AuthData();
        authData.setKEY(KEY);
        authData.setID(ID);
        InfoTTNRequest ttnRequest = new InfoTTNRequest();
        ttnRequest.setAuth(authData);
        ttnRequest.getNumber().add(trackNumber);
        setInformationField(ttnRequest);
        API20PortType api20Soap = api20.getAPI20Soap();
        InfoTTNRespond respond = api20Soap.infoTTN(ttnRequest);

        /////////////////////////////////////////////
//        Map<String, Object> requestContext = ((BindingProvider) api20Soap).getRequestContext();
//        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 20 * 1000);
//        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 15 * 1000);
////        InfoTTNRespond respond = api20Soap.infoTTN(ttnRequest);
//        ////////////////////////////////////////////
//        InfoTTNRespond respond;
//        int i = 0;
//        do{
//            respond = api20Soap.infoTTN(ttnRequest);
////            i++;
//        }while (respond.getTTNClient().isEmpty() && i++ < 15);
//
//////////////////////////////////////////////////////////////
        if (respond.getTTNClient().isEmpty()) {
            stringResponse = "Вы ввели неверный или неполный номер.<br/>" +
                    "В Компании «Ин-Тайм» номера деклараций имеют формат десяти цифр! <br/>" +
                    "<b>Пример:</b> 1202000045";
        } else {
            TTNClient ttnClient = respond.getTTNClient().get(0);
            List<AppendField> appendField = respond.getTTNClient().get(0).getAppendField();
            stringResponse = "<b>Маршрут груза: </b>" + appendField.get(1).getAppendFieldValue() + " - " +
                    appendField.get(2).getAppendFieldValue() + "<br/>" +
                    "<b>Статус: </b>" + ttnClient.getTTNState() + "<br/>" +
                    "<b>Отправитель: </b>" + appendField.get(4).getAppendFieldValue() + "<br/>" +
                    "<b>Получатель: </b>" + appendField.get(5).getAppendFieldValue() + "<br/>" +
                    "<b>Сумма к оплате: </b>" + appendField.get(6).getAppendFieldValue() + "<br/>" +
                    "<b>Дата прибытия груза на склад получения: </b>" + ttnClient.getDeliveryDate();
        }
        return XmlTransforming.marshalling(new Response(stringResponse));
    }

    private void setInformationField(InfoTTNRequest ttnRequest) {
        List<InformationField> fields = ttnRequest.getInformationField();
        fields.add(new InformationField("DateDelivery"));
        fields.add(new InformationField("GorodOtpravitel"));
        fields.add(new InformationField("GorodPoluchatel"));
        fields.add(new InformationField("Data"));
        fields.add(new InformationField("Otpravitel"));
        fields.add(new InformationField("Poluchatel"));
        fields.add(new InformationField("Summa"));
    }
}

