
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservedField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservedField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservedFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReservedFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservedField", propOrder = {
    "reservedFieldName",
    "reservedFieldValue"
})
public class ReservedField {

    @XmlElement(name = "ReservedFieldName", required = true, nillable = true)
    protected String reservedFieldName;
    @XmlElement(name = "ReservedFieldValue", required = true, nillable = true)
    protected String reservedFieldValue;

    /**
     * Gets the value of the reservedFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedFieldName() {
        return reservedFieldName;
    }

    /**
     * Sets the value of the reservedFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedFieldName(String value) {
        this.reservedFieldName = value;
    }

    /**
     * Gets the value of the reservedFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedFieldValue() {
        return reservedFieldValue;
    }

    /**
     * Sets the value of the reservedFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedFieldValue(String value) {
        this.reservedFieldValue = value;
    }

}
