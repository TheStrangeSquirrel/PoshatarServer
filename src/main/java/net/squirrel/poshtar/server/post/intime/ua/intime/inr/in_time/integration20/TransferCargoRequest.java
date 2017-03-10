
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransferCargoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCargoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthData" type="{http://inr.intime.ua/in-time/integration20}AuthData"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReceiverDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransferCargo" type="{http://inr.intime.ua/in-time/integration20}TransferCargo" maxOccurs="unbounded"/>
 *         &lt;element name="ReservedField" type="{http://inr.intime.ua/in-time/integration20}ReservedField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCargoRequest", propOrder = {
    "authData",
    "dateTime",
    "receiverDepartment",
    "transferCargo",
    "reservedField",
    "comment"
})
public class TransferCargoRequest {

    @XmlElement(name = "AuthData", required = true)
    protected AuthData authData;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "ReceiverDepartment", required = true)
    protected String receiverDepartment;
    @XmlElement(name = "TransferCargo", required = true)
    protected List<TransferCargo> transferCargo;
    @XmlElement(name = "ReservedField")
    protected List<ReservedField> reservedField;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected String comment;

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
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the receiverDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverDepartment() {
        return receiverDepartment;
    }

    /**
     * Sets the value of the receiverDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverDepartment(String value) {
        this.receiverDepartment = value;
    }

    /**
     * Gets the value of the transferCargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferCargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferCargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferCargo }
     * 
     * 
     */
    public List<TransferCargo> getTransferCargo() {
        if (transferCargo == null) {
            transferCargo = new ArrayList<TransferCargo>();
        }
        return this.transferCargo;
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

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
