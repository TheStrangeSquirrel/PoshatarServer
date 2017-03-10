
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wheel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wheel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WheelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WheelsQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wheel", propOrder = {
    "wheelCode",
    "wheelsQuantity"
})
public class Wheel {

    @XmlElement(name = "WheelCode", required = true)
    protected String wheelCode;
    @XmlElement(name = "WheelsQuantity")
    protected int wheelsQuantity;

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
     * Gets the value of the wheelsQuantity property.
     * 
     */
    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    /**
     * Sets the value of the wheelsQuantity property.
     * 
     */
    public void setWheelsQuantity(int value) {
        this.wheelsQuantity = value;
    }

}
