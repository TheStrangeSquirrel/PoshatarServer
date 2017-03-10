
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CreatingReferenceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatingReferenceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://inr.intime.ua/in-time/integration20}AuthData"/>
 *         &lt;element name="NumberTTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SenderClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiverClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneReceiverClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementReceiverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransportationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POD" type="{http://inr.intime.ua/in-time/integration20}POD"/>
 *         &lt;element name="ContractorPaysThird" type="{http://inr.intime.ua/in-time/integration20}ContractorPaysThird" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://inr.intime.ua/in-time/integration20}AdditionalServices" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReservedField" type="{http://inr.intime.ua/in-time/integration20}ReservedField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatingReferenceRequest", propOrder = {
    "auth",
    "numberTTN",
    "senderClient",
    "receiverClient",
    "phoneReceiverClient",
    "settlementReceiverCode",
    "warehouseReceiverCode",
    "paymentType",
    "paymentMethod",
    "transportationType",
    "pod",
    "contractorPaysThird",
    "additionalServices",
    "reservedField",
    "comments"
})
public class CreatingReferenceRequest {

    @XmlElement(name = "Auth", required = true)
    protected AuthData auth;
    @XmlElement(name = "NumberTTN", required = true)
    protected String numberTTN;
    @XmlElement(name = "SenderClient", required = true, nillable = true)
    protected String senderClient;
    @XmlElement(name = "ReceiverClient", required = true, nillable = true)
    protected String receiverClient;
    @XmlElement(name = "PhoneReceiverClient", required = true, nillable = true)
    protected String phoneReceiverClient;
    @XmlElement(name = "SettlementReceiverCode", required = true, nillable = true)
    protected String settlementReceiverCode;
    @XmlElement(name = "WarehouseReceiverCode", required = true, nillable = true)
    protected String warehouseReceiverCode;
    @XmlElement(name = "PaymentType", required = true, nillable = true)
    protected String paymentType;
    @XmlElement(name = "PaymentMethod", required = true, nillable = true)
    protected String paymentMethod;
    @XmlElement(name = "TransportationType", required = true, nillable = true)
    protected String transportationType;
    @XmlElement(name = "POD", required = true, nillable = true)
    protected POD pod;
    @XmlElementRef(name = "ContractorPaysThird", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<ContractorPaysThird> contractorPaysThird;
    @XmlElement(name = "AdditionalServices", nillable = true)
    protected List<AdditionalServices> additionalServices;
    @XmlElement(name = "ReservedField", nillable = true)
    protected List<ReservedField> reservedField;
    @XmlElement(name = "Comments", required = true, nillable = true)
    protected String comments;

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
     * Gets the value of the numberTTN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTTN() {
        return numberTTN;
    }

    /**
     * Sets the value of the numberTTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTTN(String value) {
        this.numberTTN = value;
    }

    /**
     * Gets the value of the senderClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderClient() {
        return senderClient;
    }

    /**
     * Sets the value of the senderClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderClient(String value) {
        this.senderClient = value;
    }

    /**
     * Gets the value of the receiverClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverClient() {
        return receiverClient;
    }

    /**
     * Sets the value of the receiverClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverClient(String value) {
        this.receiverClient = value;
    }

    /**
     * Gets the value of the phoneReceiverClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneReceiverClient() {
        return phoneReceiverClient;
    }

    /**
     * Sets the value of the phoneReceiverClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneReceiverClient(String value) {
        this.phoneReceiverClient = value;
    }

    /**
     * Gets the value of the settlementReceiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementReceiverCode() {
        return settlementReceiverCode;
    }

    /**
     * Sets the value of the settlementReceiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementReceiverCode(String value) {
        this.settlementReceiverCode = value;
    }

    /**
     * Gets the value of the warehouseReceiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiverCode() {
        return warehouseReceiverCode;
    }

    /**
     * Sets the value of the warehouseReceiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiverCode(String value) {
        this.warehouseReceiverCode = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
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
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link POD }
     *     
     */
    public POD getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link POD }
     *     
     */
    public void setPOD(POD value) {
        this.pod = value;
    }

    /**
     * Gets the value of the contractorPaysThird property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContractorPaysThird }{@code >}
     *     
     */
    public JAXBElement<ContractorPaysThird> getContractorPaysThird() {
        return contractorPaysThird;
    }

    /**
     * Sets the value of the contractorPaysThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContractorPaysThird }{@code >}
     *     
     */
    public void setContractorPaysThird(JAXBElement<ContractorPaysThird> value) {
        this.contractorPaysThird = value;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServices }
     * 
     * 
     */
    public List<AdditionalServices> getAdditionalServices() {
        if (additionalServices == null) {
            additionalServices = new ArrayList<AdditionalServices>();
        }
        return this.additionalServices;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
