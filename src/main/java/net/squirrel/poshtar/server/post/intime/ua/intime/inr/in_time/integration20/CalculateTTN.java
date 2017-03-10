
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CalculateTTN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateTTN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://inr.intime.ua/in-time/integration20}Sender"/>
 *         &lt;element name="Receiver" type="{http://inr.intime.ua/in-time/integration20}Receiver"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="POD" type="{http://inr.intime.ua/in-time/integration20}POD"/>
 *         &lt;element name="ContractorPaysThird" type="{http://inr.intime.ua/in-time/integration20}ContractorPaysThird"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TransportationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Packages" type="{http://inr.intime.ua/in-time/integration20}Package" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://inr.intime.ua/in-time/integration20}AdditionalServices" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cargo" type="{http://inr.intime.ua/in-time/integration20}Cargo"/>
 *         &lt;element name="CargoParams" type="{http://inr.intime.ua/in-time/integration20}CargoParams"/>
 *         &lt;element name="CargoItems" type="{http://inr.intime.ua/in-time/integration20}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReservedField" type="{http://inr.intime.ua/in-time/integration20}ReservedField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PAS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateTTN", propOrder = {
    "sender",
    "receiver",
    "paymentType",
    "dispatchDate",
    "pod",
    "contractorPaysThird",
    "insuranceCost",
    "transportationType",
    "paymentMethod",
    "packages",
    "additionalServices",
    "cargo",
    "cargoParams",
    "cargoItems",
    "reservedField",
    "pas"
})
public class CalculateTTN {

    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "Receiver", required = true)
    protected Receiver receiver;
    @XmlElement(name = "PaymentType", required = true, nillable = true)
    protected String paymentType;
    @XmlElement(name = "DispatchDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dispatchDate;
    @XmlElement(name = "POD", required = true, nillable = true)
    protected POD pod;
    @XmlElement(name = "ContractorPaysThird", required = true, nillable = true)
    protected ContractorPaysThird contractorPaysThird;
    @XmlElement(name = "InsuranceCost", required = true)
    protected BigDecimal insuranceCost;
    @XmlElement(name = "TransportationType", required = true)
    protected String transportationType;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "Packages", nillable = true)
    protected List<Package> packages;
    @XmlElement(name = "AdditionalServices")
    protected List<AdditionalServices> additionalServices;
    @XmlElement(name = "Cargo", required = true)
    protected Cargo cargo;
    @XmlElement(name = "CargoParams", required = true, nillable = true)
    protected CargoParams cargoParams;
    @XmlElement(name = "CargoItems", nillable = true)
    protected List<Item> cargoItems;
    @XmlElement(name = "ReservedField")
    protected List<ReservedField> reservedField;
    @XmlElement(name = "PAS", required = true, nillable = true)
    protected String pas;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
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
     * Gets the value of the dispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDate() {
        return dispatchDate;
    }

    /**
     * Sets the value of the dispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDate(XMLGregorianCalendar value) {
        this.dispatchDate = value;
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
     *     {@link ContractorPaysThird }
     *     
     */
    public ContractorPaysThird getContractorPaysThird() {
        return contractorPaysThird;
    }

    /**
     * Sets the value of the contractorPaysThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorPaysThird }
     *     
     */
    public void setContractorPaysThird(ContractorPaysThird value) {
        this.contractorPaysThird = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceCost(BigDecimal value) {
        this.insuranceCost = value;
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
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Package }
     * 
     * 
     */
    public List<Package> getPackages() {
        if (packages == null) {
            packages = new ArrayList<Package>();
        }
        return this.packages;
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
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargo(Cargo value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the cargoParams property.
     * 
     * @return
     *     possible object is
     *     {@link CargoParams }
     *     
     */
    public CargoParams getCargoParams() {
        return cargoParams;
    }

    /**
     * Sets the value of the cargoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoParams }
     *     
     */
    public void setCargoParams(CargoParams value) {
        this.cargoParams = value;
    }

    /**
     * Gets the value of the cargoItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getCargoItems() {
        if (cargoItems == null) {
            cargoItems = new ArrayList<Item>();
        }
        return this.cargoItems;
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
     * Gets the value of the pas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAS() {
        return pas;
    }

    /**
     * Sets the value of the pas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAS(String value) {
        this.pas = value;
    }

}
