
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Warehouse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Warehouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehousePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseLogistickZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warehouse", propOrder = {
    "warehouseCode",
    "warehouseName",
    "warehousePhoneNumber",
    "warehouseAddress",
    "warehouseNumber",
    "warehouseLogistickZone"
})
public class Warehouse {

    @XmlElement(name = "WarehouseCode", required = true, nillable = true)
    protected String warehouseCode;
    @XmlElement(name = "WarehouseName", required = true, nillable = true)
    protected String warehouseName;
    @XmlElement(name = "WarehousePhoneNumber", required = true, nillable = true)
    protected String warehousePhoneNumber;
    @XmlElement(name = "WarehouseAddress", required = true, nillable = true)
    protected String warehouseAddress;
    @XmlElement(name = "WarehouseNumber", required = true, nillable = true)
    protected String warehouseNumber;
    @XmlElement(name = "WarehouseLogistickZone", required = true, nillable = true)
    protected String warehouseLogistickZone;

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the warehouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * Sets the value of the warehouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseName(String value) {
        this.warehouseName = value;
    }

    /**
     * Gets the value of the warehousePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehousePhoneNumber() {
        return warehousePhoneNumber;
    }

    /**
     * Sets the value of the warehousePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehousePhoneNumber(String value) {
        this.warehousePhoneNumber = value;
    }

    /**
     * Gets the value of the warehouseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    /**
     * Sets the value of the warehouseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseAddress(String value) {
        this.warehouseAddress = value;
    }

    /**
     * Gets the value of the warehouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    /**
     * Sets the value of the warehouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseNumber(String value) {
        this.warehouseNumber = value;
    }

    /**
     * Gets the value of the warehouseLogistickZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseLogistickZone() {
        return warehouseLogistickZone;
    }

    /**
     * Sets the value of the warehouseLogistickZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseLogistickZone(String value) {
        this.warehouseLogistickZone = value;
    }

}
