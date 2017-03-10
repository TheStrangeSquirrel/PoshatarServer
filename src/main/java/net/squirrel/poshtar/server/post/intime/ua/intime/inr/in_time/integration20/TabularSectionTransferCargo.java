
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for TabularSectionTransferCargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabularSectionTransferCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FactFromClient" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FactFromIntime" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PlanFromClient" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WarehouseReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabularSectionTransferCargo", propOrder = {
    "number",
    "ttn",
    "factFromClient",
    "factFromIntime",
    "planFromClient",
    "weight",
    "volume",
    "warehouseReceiver"
})
public class TabularSectionTransferCargo {

    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "TTN", required = true, nillable = true)
    protected String ttn;
    @XmlElement(name = "FactFromClient", required = true, nillable = true)
    protected BigDecimal factFromClient;
    @XmlElement(name = "FactFromIntime", required = true, nillable = true)
    protected BigDecimal factFromIntime;
    @XmlElement(name = "PlanFromClient", required = true, nillable = true)
    protected BigDecimal planFromClient;
    @XmlElement(name = "Weight", required = true, nillable = true)
    protected BigDecimal weight;
    @XmlElement(name = "Volume", required = true, nillable = true)
    protected BigDecimal volume;
    @XmlElement(name = "WarehouseReceiver", required = true, nillable = true)
    protected String warehouseReceiver;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the ttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTN() {
        return ttn;
    }

    /**
     * Sets the value of the ttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTN(String value) {
        this.ttn = value;
    }

    /**
     * Gets the value of the factFromClient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactFromClient() {
        return factFromClient;
    }

    /**
     * Sets the value of the factFromClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactFromClient(BigDecimal value) {
        this.factFromClient = value;
    }

    /**
     * Gets the value of the factFromIntime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactFromIntime() {
        return factFromIntime;
    }

    /**
     * Sets the value of the factFromIntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactFromIntime(BigDecimal value) {
        this.factFromIntime = value;
    }

    /**
     * Gets the value of the planFromClient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanFromClient() {
        return planFromClient;
    }

    /**
     * Sets the value of the planFromClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanFromClient(BigDecimal value) {
        this.planFromClient = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the warehouseReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiver() {
        return warehouseReceiver;
    }

    /**
     * Sets the value of the warehouseReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiver(String value) {
        this.warehouseReceiver = value;
    }

}
