/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.http_client.HttpClient;
import net.squirrel.poshtar.server.utils.LogUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class PostNovaPoshta implements Post {
    private static final String API_KEY = "***";
    private static final String URL_NEW_POST = "***";
    private static final Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());

    public String track(String trackNumber, String language) throws Exception {
        String state;
        String massage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<root>" +
                "<apiKey>" + API_KEY + "</apiKey>" +
                "<modelName>InternetDocument</modelName>" +
                "<calledMethod>documentsTracking</calledMethod>" +
                "<methodProperties>" +
                "<Documents>" +
                "<item>" + trackNumber + "</item>" +
                "</Documents>" +
                "</methodProperties>" +
                "<Language>UA</Language>" +
                "</root>";
        String response = HttpClient.post(URL_NEW_POST, massage);
        logger.debug("Response of new post - " + response);
        if (response == null) {
            return null;
        }
        if (trackNumber.length() < 14) {
            state = "Номер накладної занадто короткий. Будь ласка, перевірте його правильність.";
        } else {
            state = extractionState(response, trackNumber, language);
        }
        String result = XmlTransforming.marshalling(new Response(state));
        return result;

    }

    private String extractionState(String xml, String trackNumber, String language) {
        Document document = parseHowDom(xml);
        String result = null;

        String state = getTextContext(document, "StateName");
        String dateReceived = getTextContext(document, "DateReceived");

        String adr = null;
        String recipientName = getTextContext(document, "RecipientFullName");

        switch (language) {
            default:
            case "uk":
                adr = getTextContext(document, "AddressUA");
                result = "<b>Відпралення № </b>" + trackNumber + "<br/>" +
                        "<b>Стан: </b>" + state + " на - " + dateReceived + "<br/>" +
                        "<b>За адресою: </b>" + adr + "<br/>" +
                        "<b>Отримувач: </b>" + recipientName + "<br/>";
                break;
            case "ru":
                adr = getTextContext(document, "AddressRU");
                result = "<b>Посылка № </b>" + trackNumber + "<br/>" +
                        "<b>Состояние: </b>" + state + "<br/>" +
                        "<b>По адресу: </b>" + adr + "<br/>" +
                        "<b>Получающий: </b>" + recipientName + "<br/>";
                break;
        }
        return result;
    }

    private Document parseHowDom(String string) {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setValidating(false);
        Document doc = null;
        try {
            DocumentBuilder builder = f.newDocumentBuilder();
            doc = builder.parse(new InputSource(new StringReader(string)));
        } catch (Exception e) {
            logger.info("parseHowDom");
        }
        return doc;
    }

    private String getTextContext(Document doc, String tag) {
        return doc.getElementsByTagName(tag).item(0).getTextContent();
    }
}

