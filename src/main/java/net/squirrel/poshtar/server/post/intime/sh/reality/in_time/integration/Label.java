
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogistickZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Receiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LabelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalLabelsCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {
    "barcode",
    "city",
    "logistickZone",
    "sender",
    "receiver",
    "labelNumber",
    "totalLabelsCount",
    "weight",
    "volume"
})
public class Label {

    @XmlElement(name = "Barcode", required = true)
    protected String barcode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "LogistickZone", required = true)
    protected String logistickZone;
    @XmlElement(name = "Sender", required = true)
    protected String sender;
    @XmlElement(name = "Receiver", required = true)
    protected String receiver;
    @XmlElement(name = "LabelNumber", required = true)
    protected String labelNumber;
    @XmlElement(name = "TotalLabelsCount", required = true)
    protected String totalLabelsCount;
    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "Volume", required = true)
    protected String volume;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the logistickZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogistickZone() {
        return logistickZone;
    }

    /**
     * Sets the value of the logistickZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogistickZone(String value) {
        this.logistickZone = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

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
     * Gets the value of the labelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelNumber() {
        return labelNumber;
    }

    /**
     * Sets the value of the labelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelNumber(String value) {
        this.labelNumber = value;
    }

    /**
     * Gets the value of the totalLabelsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLabelsCount() {
        return totalLabelsCount;
    }

    /**
     * Sets the value of the totalLabelsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLabelsCount(String value) {
        this.totalLabelsCount = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

}
