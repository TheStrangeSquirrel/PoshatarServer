
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="ReceiverClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "receiverClient",
    "warehouseReceiverCode",
    "settlementCode",
    "receiverAddress",
    "phoneReceiver"
})
public class Receiver {

    @XmlElement(name = "ReceiverClient", required = true)
    protected String receiverClient;
    @XmlElement(name = "WarehouseReceiverCode", required = true)
    protected String warehouseReceiverCode;
    @XmlElementRef(name = "SettlementCode", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settlementCode;
    @XmlElement(name = "ReceiverAddress", required = true, nillable = true)
    protected String receiverAddress;
    @XmlElement(name = "PhoneReceiver", required = true)
    protected String phoneReceiver;

    /**
     * Gets the value of the receiverClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverClient() {
        return receiverClient;
    }

    /**
     * Sets the value of the receiverClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverClient(String value) {
        this.receiverClient = value;
    }

    /**
     * Gets the value of the warehouseReceiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiverCode() {
        return warehouseReceiverCode;
    }

    /**
     * Sets the value of the warehouseReceiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiverCode(String value) {
        this.warehouseReceiverCode = value;
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
