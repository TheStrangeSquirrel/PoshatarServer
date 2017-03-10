
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receiver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiverAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receiver", propOrder = {
    "receiver",
    "warehouseReceiver",
    "receiverAddress",
    "phoneReceiver"
})
public class Receiver {

    @XmlElement(name = "Receiver", required = true)
    protected String receiver;
    @XmlElement(name = "WarehouseReceiver", required = true)
    protected String warehouseReceiver;
    @XmlElement(name = "ReceiverAddress", required = true, nillable = true)
    protected String receiverAddress;
    @XmlElement(name = "PhoneReceiver", required = true)
    protected String phoneReceiver;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the warehouseReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiver() {
        return warehouseReceiver;
    }

    /**
     * Sets the value of the warehouseReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiver(String value) {
        this.warehouseReceiver = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the phoneReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneReceiver() {
        return phoneReceiver;
    }

    /**
     * Sets the value of the phoneReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneReceiver(String value) {
        this.phoneReceiver = value;
    }

}
