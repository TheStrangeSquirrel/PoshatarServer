
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransportationTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationType", propOrder = {
    "transportationTypeCode",
    "transportationTypeName"
})
public class TransportationType {

    @XmlElement(name = "TransportationTypeCode", required = true, nillable = true)
    protected String transportationTypeCode;
    @XmlElement(name = "TransportationTypeName", required = true, nillable = true)
    protected String transportationTypeName;

    /**
     * Gets the value of the transportationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationTypeCode() {
        return transportationTypeCode;
    }

    /**
     * Sets the value of the transportationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationTypeCode(String value) {
        this.transportationTypeCode = value;
    }

    /**
     * Gets the value of the transportationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationTypeName() {
        return transportationTypeName;
    }

    /**
     * Sets the value of the transportationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationTypeName(String value) {
        this.transportationTypeName = value;
    }

}
