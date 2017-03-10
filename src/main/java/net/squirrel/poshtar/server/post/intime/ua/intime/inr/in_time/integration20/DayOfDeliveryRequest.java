
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DayOfDeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayOfDeliveryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthData" type="{http://inr.intime.ua/in-time/integration20}AuthData"/>
 *         &lt;element name="WarehouseSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementCodeSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementCodeReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TransportationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReservedField" type="{http://inr.intime.ua/in-time/integration20}ReservedField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfDeliveryRequest", propOrder = {
    "authData",
    "warehouseSender",
    "warehouseReceiver",
    "settlementCodeSender",
    "settlementCodeReceiver",
    "data",
    "transportationType",
    "reservedField"
})
public class DayOfDeliveryRequest {

    @XmlElement(name = "AuthData", required = true)
    protected AuthData authData;
    @XmlElement(name = "WarehouseSender", required = true)
    protected String warehouseSender;
    @XmlElement(name = "WarehouseReceiver", required = true)
    protected String warehouseReceiver;
    @XmlElement(name = "SettlementCodeSender")
    protected String settlementCodeSender;
    @XmlElement(name = "SettlementCodeReceiver")
    protected String settlementCodeReceiver;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "TransportationType", required = true)
    protected String transportationType;
    @XmlElement(name = "ReservedField")
    protected List<ReservedField> reservedField;

    /**
     * Gets the value of the authData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuthData() {
        return authData;
    }

    /**
     * Sets the value of the authData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuthData(AuthData value) {
        this.authData = value;
    }

    /**
     * Gets the value of the warehouseSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseSender() {
        return warehouseSender;
    }

    /**
     * Sets the value of the warehouseSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseSender(String value) {
        this.warehouseSender = value;
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

    /**
     * Gets the value of the settlementCodeSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCodeSender() {
        return settlementCodeSender;
    }

    /**
     * Sets the value of the settlementCodeSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCodeSender(String value) {
        this.settlementCodeSender = value;
    }

    /**
     * Gets the value of the settlementCodeReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCodeReceiver() {
        return settlementCodeReceiver;
    }

    /**
     * Sets the value of the settlementCodeReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCodeReceiver(String value) {
        this.settlementCodeReceiver = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the transportationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationType() {
        return transportationType;
    }

    /**
     * Sets the value of the transportationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationType(String value) {
        this.transportationType = value;
    }

    /**
     * Gets the value of the reservedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservedField }
     * 
     * 
     */
    public List<ReservedField> getReservedField() {
        if (reservedField == null) {
            reservedField = new ArrayList<ReservedField>();
        }
        return this.reservedField;
    }

}
