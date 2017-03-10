
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServicesCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalServicesParametr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServices", propOrder = {
    "additionalServicesCode",
    "additionalServicesParametr"
})
public class AdditionalServices {

    @XmlElement(name = "AdditionalServicesCode", required = true, nillable = true)
    protected String additionalServicesCode;
    @XmlElement(name = "AdditionalServicesParametr", required = true, nillable = true)
    protected String additionalServicesParametr;

    /**
     * Gets the value of the additionalServicesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServicesCode() {
        return additionalServicesCode;
    }

    /**
     * Sets the value of the additionalServicesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServicesCode(String value) {
        this.additionalServicesCode = value;
    }

    /**
     * Gets the value of the additionalServicesParametr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServicesParametr() {
        return additionalServicesParametr;
    }

    /**
     * Sets the value of the additionalServicesParametr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServicesParametr(String value) {
        this.additionalServicesParametr = value;
    }

}
