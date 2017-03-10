
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.ukr_post.org.barcode;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetBarcodeInfoResult" type="{http://barcode.org/}BarcodeInfoService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBarcodeInfoResult"
})
@XmlRootElement(name = "GetBarcodeInfoResponse")
public class GetBarcodeInfoResponse {

    @XmlElement(name = "GetBarcodeInfoResult")
    protected BarcodeInfoService getBarcodeInfoResult;

    /**
     * Gets the value of the getBarcodeInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeInfoService }
     *     
     */
    public BarcodeInfoService getGetBarcodeInfoResult() {
        return getBarcodeInfoResult;
    }

    /**
     * Sets the value of the getBarcodeInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeInfoService }
     *     
     */
    public void setGetBarcodeInfoResult(BarcodeInfoService value) {
        this.getBarcodeInfoResult = value;
    }

}
