
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Sender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WarehouseSenderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sender", propOrder = {
    "warehouseSenderCode",
    "settlementCode",
    "senderAddress",
    "phoneSender"
})
public class Sender {

    @XmlElement(name = "WarehouseSenderCode", required = true)
    protected String warehouseSenderCode;
    @XmlElementRef(name = "SettlementCode", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settlementCode;
    @XmlElement(name = "SenderAddress", required = true, nillable = true)
    protected String senderAddress;
    @XmlElement(name = "PhoneSender", required = true)
    protected String phoneSender;

    /**
     * Gets the value of the warehouseSenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseSenderCode() {
        return warehouseSenderCode;
    }

    /**
     * Sets the value of the warehouseSenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseSenderCode(String value) {
        this.warehouseSenderCode = value;
    }

    /**
     * Gets the value of the settlementCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettlementCode() {
        return settlementCode;
    }

    /**
     * Sets the value of the settlementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettlementCode(JAXBElement<String> value) {
        this.settlementCode = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the phoneSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneSender() {
        return phoneSender;
    }

    /**
     * Sets the value of the phoneSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneSender(String value) {
        this.phoneSender = value;
    }

}
