
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TTNClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTNClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformationField" type="{http://inr.intime.ua/in-time/integration20}InformationField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Number2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TTNState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnPostService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnsWaybill" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppendField" type="{http://inr.intime.ua/in-time/integration20}AppendField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTNClient", propOrder = {
    "informationField",
    "number",
    "number2",
    "ttnState",
    "deliveryDate",
    "message",
    "returnPostService",
    "returnsWaybill",
    "appendField"
})
public class TTNClient {

    @XmlElement(name = "InformationField", nillable = true)
    protected List<InformationField> informationField;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Number2", required = true, nillable = true)
    protected String number2;
    @XmlElement(name = "TTNState", required = true, nillable = true)
    protected String ttnState;
    @XmlElement(name = "DeliveryDate", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "ReturnPostService", required = true, nillable = true)
    protected String returnPostService;
    @XmlElement(name = "ReturnsWaybill", required = true, nillable = true)
    protected String returnsWaybill;
    @XmlElement(name = "AppendField", nillable = true)
    protected List<AppendField> appendField;

    /**
     * Gets the value of the informationField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationField }
     * 
     * 
     */
    public List<InformationField> getInformationField() {
        if (informationField == null) {
            informationField = new ArrayList<InformationField>();
        }
        return this.informationField;
    }

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
     * Gets the value of the number2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber2(String value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the ttnState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTNState() {
        return ttnState;
    }

    /**
     * Sets the value of the ttnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTNState(String value) {
        this.ttnState = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the returnPostService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPostService() {
        return returnPostService;
    }

    /**
     * Sets the value of the returnPostService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPostService(String value) {
        this.returnPostService = value;
    }

    /**
     * Gets the value of the returnsWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsWaybill() {
        return returnsWaybill;
    }

    /**
     * Sets the value of the returnsWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsWaybill(String value) {
        this.returnsWaybill = value;
    }

    /**
     * Gets the value of the appendField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendField }
     * 
     * 
     */
    public List<AppendField> getAppendField() {
        if (appendField == null) {
            appendField = new ArrayList<AppendField>();
        }
        return this.appendField;
    }

}
