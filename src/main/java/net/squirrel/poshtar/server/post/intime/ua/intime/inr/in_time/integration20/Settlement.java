
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Settlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Settlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SettlementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityAreaWarehouse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Settlement", propOrder = {
    "settlementCode",
    "areaCode",
    "area",
    "warehouseCode",
    "cityAreaWarehouse"
})
public class Settlement {

    @XmlElement(name = "SettlementCode", required = true)
    protected String settlementCode;
    @XmlElement(name = "AreaCode", required = true)
    protected String areaCode;
    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "WarehouseCode", required = true)
    protected String warehouseCode;
    @XmlElement(name = "CityAreaWarehouse", required = true)
    protected String cityAreaWarehouse;

    /**
     * Gets the value of the settlementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCode() {
        return settlementCode;
    }

    /**
     * Sets the value of the settlementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCode(String value) {
        this.settlementCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

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
     * Gets the value of the cityAreaWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAreaWarehouse() {
        return cityAreaWarehouse;
    }

    /**
     * Sets the value of the cityAreaWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAreaWarehouse(String value) {
        this.cityAreaWarehouse = value;
    }

}
