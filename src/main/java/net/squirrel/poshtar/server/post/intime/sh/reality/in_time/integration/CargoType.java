
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CargoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CargoTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CargoTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoType", propOrder = {
    "cargoTypeCode",
    "cargoTypeName"
})
public class CargoType {

    @XmlElement(name = "CargoTypeCode", required = true, nillable = true)
    protected String cargoTypeCode;
    @XmlElement(name = "CargoTypeName", required = true, nillable = true)
    protected String cargoTypeName;

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

    /**
     * Gets the value of the cargoTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTypeName() {
        return cargoTypeName;
    }

    /**
     * Sets the value of the cargoTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTypeName(String value) {
        this.cargoTypeName = value;
    }

}
