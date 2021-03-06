
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.api20;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "API20", targetNamespace = "http://www.reality.sh/in-time/Api20", wsdlLocation = "http://ws.intime.ua/API/ws/API20/?wsdl")
public class API20
    extends Service
{

    private final static URL API20_WSDL_LOCATION;
    private final static WebServiceException API20_EXCEPTION;
    private final static QName API20_QNAME = new QName("http://www.reality.sh/in-time/Api20", "API20");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.intime.ua/API/ws/API20/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        API20_WSDL_LOCATION = url;
        API20_EXCEPTION = e;
    }

    public API20() {
        super(__getWsdlLocation(), API20_QNAME);
    }

    public API20(WebServiceFeature... features) {
        super(__getWsdlLocation(), API20_QNAME, features);
    }

    public API20(URL wsdlLocation) {
        super(wsdlLocation, API20_QNAME);
    }

    public API20(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, API20_QNAME, features);
    }

    public API20(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public API20(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns API20PortType
     */
    @WebEndpoint(name = "API20Soap")
    public API20PortType getAPI20Soap() {
        return super.getPort(new QName("http://www.reality.sh/in-time/Api20", "API20Soap"), API20PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns API20PortType
     */
    @WebEndpoint(name = "API20Soap")
    public API20PortType getAPI20Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.reality.sh/in-time/Api20", "API20Soap"), API20PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (API20_EXCEPTION!= null) {
            throw API20_EXCEPTION;
        }
        return API20_WSDL_LOCATION;
    }

}
