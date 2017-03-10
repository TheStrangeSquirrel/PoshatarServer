
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintTTNParametr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintTTNParametr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParametrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParametrValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintTTNParametr", propOrder = {
    "parametrName",
    "parametrValue"
})
public class PrintTTNParametr {

    @XmlElement(name = "ParametrName", required = true)
    protected String parametrName;
    @XmlElement(name = "ParametrValue", required = true)
    protected String parametrValue;

    /**
     * Gets the value of the parametrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametrName() {
        return parametrName;
    }

    /**
     * Sets the value of the parametrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametrName(String value) {
        this.parametrName = value;
    }

    /**
     * Gets the value of the parametrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametrValue() {
        return parametrValue;
    }

    /**
     * Sets the value of the parametrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametrValue(String value) {
        this.parametrValue = value;
    }

}
