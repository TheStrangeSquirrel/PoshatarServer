
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WheelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WheelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WheelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WheelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CargoTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WheelType", propOrder = {
    "wheelCode",
    "wheelName",
    "cargoTypeCode"
})
public class WheelType {

    @XmlElement(name = "WheelCode", required = true)
    protected String wheelCode;
    @XmlElement(name = "WheelName", required = true)
    protected String wheelName;
    @XmlElement(name = "CargoTypeCode", required = true)
    protected String cargoTypeCode;

    /**
     * Gets the value of the wheelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelCode() {
        return wheelCode;
    }

    /**
     * Sets the value of the wheelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelCode(String value) {
        this.wheelCode = value;
    }

    /**
     * Gets the value of the wheelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelName() {
        return wheelName;
    }

    /**
     * Sets the value of the wheelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelName(String value) {
        this.wheelName = value;
    }

    /**
     * Gets the value of the cargoTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Sets the value of the cargoTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTypeCode(String value) {
        this.cargoTypeCode = value;
    }

}
