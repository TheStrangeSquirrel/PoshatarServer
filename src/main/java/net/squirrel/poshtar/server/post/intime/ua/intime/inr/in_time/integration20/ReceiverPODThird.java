
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverPODThird complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverPODThird">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiverPODThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiverPODThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneReceiverPODThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverPODThird", propOrder = {
    "receiverPODThird",
    "warehouseReceiverPODThird",
    "phoneReceiverPODThird"
})
public class ReceiverPODThird {

    @XmlElement(name = "ReceiverPODThird", required = true, nillable = true)
    protected String receiverPODThird;
    @XmlElement(name = "WarehouseReceiverPODThird", required = true, nillable = true)
    protected String warehouseReceiverPODThird;
    @XmlElement(name = "PhoneReceiverPODThird", required = true, nillable = true)
    protected String phoneReceiverPODThird;

    /**
     * Gets the value of the receiverPODThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPODThird() {
        return receiverPODThird;
    }

    /**
     * Sets the value of the receiverPODThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPODThird(String value) {
        this.receiverPODThird = value;
    }

    /**
     * Gets the value of the warehouseReceiverPODThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiverPODThird() {
        return warehouseReceiverPODThird;
    }

    /**
     * Sets the value of the warehouseReceiverPODThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiverPODThird(String value) {
        this.warehouseReceiverPODThird = value;
    }

    /**
     * Gets the value of the phoneReceiverPODThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneReceiverPODThird() {
        return phoneReceiverPODThird;
    }

    /**
     * Sets the value of the phoneReceiverPODThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneReceiverPODThird(String value) {
        this.phoneReceiverPODThird = value;
    }

}
