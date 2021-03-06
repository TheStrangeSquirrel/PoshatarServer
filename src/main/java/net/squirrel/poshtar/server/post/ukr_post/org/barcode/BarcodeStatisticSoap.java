
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.ukr_post.org.barcode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BarcodeStatisticSoap", targetNamespace = "http://barcode.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BarcodeStatisticSoap {


    /**
     * 
     * @param culture
     * @param guid
     * @param barcode
     * @return
     *     returns BarcodeInfoService
     */
    @WebMethod(operationName = "GetBarcodeInfo", action = "http://barcode.org/GetBarcodeInfo")
    @WebResult(name = "GetBarcodeInfoResult", targetNamespace = "http://barcode.org/")
    @RequestWrapper(localName = "GetBarcodeInfo", targetNamespace = "http://barcode.org/", className = "GetBarcodeInfo")
    @ResponseWrapper(localName = "GetBarcodeInfoResponse", targetNamespace = "http://barcode.org/", className = "GetBarcodeInfoResponse")
    public BarcodeInfoService getBarcodeInfo(
            @WebParam(name = "guid", targetNamespace = "http://barcode.org/")
                    String guid,
            @WebParam(name = "barcode", targetNamespace = "http://barcode.org/")
                    String barcode,
            @WebParam(name = "culture", targetNamespace = "http://barcode.org/")
                    Culture culture);

}
