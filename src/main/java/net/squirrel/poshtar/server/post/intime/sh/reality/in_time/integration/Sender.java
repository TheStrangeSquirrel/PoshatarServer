
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="WarehouseSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "warehouseSender",
    "senderAddress",
    "phoneSender"
})
public class Sender {

    @XmlElement(name = "WarehouseSender", required = true)
    protected String warehouseSender;
    @XmlElement(name = "SenderAddress", required = true, nillable = true)
    protected String senderAddress;
    @XmlElement(name = "PhoneSender", required = true)
    protected String phoneSender;

    /**
     * Gets the value of the warehouseSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseSender() {
        return warehouseSender;
    }

    /**
     * Sets the value of the warehouseSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseSender(String value) {
        this.warehouseSender = value;
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
