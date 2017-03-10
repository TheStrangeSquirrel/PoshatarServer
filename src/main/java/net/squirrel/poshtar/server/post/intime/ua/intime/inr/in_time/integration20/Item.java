
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CargoItemsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CargoItemsQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "cargoItemsCode",
    "cargoItemsQuantity"
})
public class Item {

    @XmlElement(name = "CargoItemsCode", required = true, nillable = true)
    protected String cargoItemsCode;
    @XmlElement(name = "CargoItemsQuantity")
    protected int cargoItemsQuantity;

    /**
     * Gets the value of the cargoItemsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoItemsCode() {
        return cargoItemsCode;
    }

    /**
     * Sets the value of the cargoItemsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoItemsCode(String value) {
        this.cargoItemsCode = value;
    }

    /**
     * Gets the value of the cargoItemsQuantity property.
     * 
     */
    public int getCargoItemsQuantity() {
        return cargoItemsQuantity;
    }

    /**
     * Sets the value of the cargoItemsQuantity property.
     * 
     */
    public void setCargoItemsQuantity(int value) {
        this.cargoItemsQuantity = value;
    }

}
