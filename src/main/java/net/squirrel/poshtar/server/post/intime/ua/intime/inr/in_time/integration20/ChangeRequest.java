
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ChangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://inr.intime.ua/in-time/integration20}AuthData"/>
 *         &lt;element name="ChangesType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldsToChange" type="{http://inr.intime.ua/in-time/integration20}FieldToChange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ChangeRequest", propOrder = {
    "auth",
    "changesType",
    "fieldsToChange",
    "message",
    "reservedField"
})
public class ChangeRequest {

    @XmlElement(name = "Auth", required = true)
    protected AuthData auth;
    @XmlElement(name = "ChangesType", required = true)
    protected String changesType;
    @XmlElement(name = "FieldsToChange")
    protected List<FieldToChange> fieldsToChange;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "ReservedField")
    protected List<ReservedField> reservedField;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuth(AuthData value) {
        this.auth = value;
    }

    /**
     * Gets the value of the changesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesType() {
        return changesType;
    }

    /**
     * Sets the value of the changesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesType(String value) {
        this.changesType = value;
    }

    /**
     * Gets the value of the fieldsToChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldToChange }
     * 
     * 
     */
    public List<FieldToChange> getFieldsToChange() {
        if (fieldsToChange == null) {
            fieldsToChange = new ArrayList<FieldToChange>();
        }
        return this.fieldsToChange;
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
