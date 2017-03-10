
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ClaimRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthData" type="{http://inr.intime.ua/in-time/integration20}AuthData"/>
 *         &lt;element name="ClaimCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentsNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClaimComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ClaimRequest", propOrder = {
    "authData",
    "claimCode",
    "documentsNumber",
    "claimComment",
    "reservedField"
})
public class ClaimRequest {

    @XmlElement(name = "AuthData", required = true)
    protected AuthData authData;
    @XmlElement(name = "ClaimCode", required = true)
    protected String claimCode;
    @XmlElement(name = "DocumentsNumber", required = true)
    protected String documentsNumber;
    @XmlElementRef(name = "ClaimComment", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimComment;
    @XmlElement(name = "ReservedField", nillable = true)
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
     * Gets the value of the claimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimCode() {
        return claimCode;
    }

    /**
     * Sets the value of the claimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimCode(String value) {
        this.claimCode = value;
    }

    /**
     * Gets the value of the documentsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsNumber() {
        return documentsNumber;
    }

    /**
     * Sets the value of the documentsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsNumber(String value) {
        this.documentsNumber = value;
    }

    /**
     * Gets the value of the claimComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimComment() {
        return claimComment;
    }

    /**
     * Sets the value of the claimComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimComment(JAXBElement<String> value) {
        this.claimComment = value;
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
