
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppendField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppendField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppendFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppendFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendField", propOrder = {
    "appendFieldName",
    "appendFieldValue"
})
public class AppendField {

    @XmlElement(name = "AppendFieldName", required = true)
    protected String appendFieldName;
    @XmlElement(name = "AppendFieldValue", required = true)
    protected String appendFieldValue;

    /**
     * Gets the value of the appendFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendFieldName() {
        return appendFieldName;
    }

    /**
     * Sets the value of the appendFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendFieldName(String value) {
        this.appendFieldName = value;
    }

    /**
     * Gets the value of the appendFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendFieldValue() {
        return appendFieldValue;
    }

    /**
     * Sets the value of the appendFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendFieldValue(String value) {
        this.appendFieldValue = value;
    }

}
