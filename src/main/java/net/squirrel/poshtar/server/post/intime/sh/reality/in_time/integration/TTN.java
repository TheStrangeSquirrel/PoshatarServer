
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TTN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://www.reality.sh/in-time/integration}Sender"/>
 *         &lt;element name="Receiver" type="{http://www.reality.sh/in-time/integration}Receiver"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POD" type="{http://www.reality.sh/in-time/integration}POD"/>
 *         &lt;element name="ContractorPaysThird" type="{http://www.reality.sh/in-time/integration}ContractorPaysThird"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TransportationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Packages" type="{http://www.reality.sh/in-time/integration}Package" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cargo" type="{http://www.reality.sh/in-time/integration}Cargo"/>
 *         &lt;element name="CargoParams" type="{http://www.reality.sh/in-time/integration}CargoParams"/>
 *         &lt;element name="Wheels" type="{http://www.reality.sh/in-time/integration}Wheel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTN", propOrder = {
    "sender",
    "receiver",
    "number",
    "paymentType",
    "dispatchDate",
    "pod",
    "contractorPaysThird",
    "insuranceCost",
    "transportationType",
    "packages",
    "cargo",
    "cargoParams",
    "wheels",
    "paymentMethod"
})
public class TTN {

    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "Receiver", required = true)
    protected Receiver receiver;
    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "DispatchDate", required = true)
    protected String dispatchDate;
    @XmlElement(name = "POD", required = true, nillable = true)
    protected POD pod;
    @XmlElement(name = "ContractorPaysThird", required = true, nillable = true)
    protected ContractorPaysThird contractorPaysThird;
    @XmlElement(name = "InsuranceCost", required = true)
    protected BigDecimal insuranceCost;
    @XmlElement(name = "TransportationType", required = true)
    protected String transportationType;
    @XmlElement(name = "Packages", nillable = true)
    protected List<Package> packages;
    @XmlElement(name = "Cargo", required = true)
    protected Cargo cargo;
    @XmlElement(name = "CargoParams", required = true, nillable = true)
    protected CargoParams cargoParams;
    @XmlElement(name = "Wheels", nillable = true)
    protected List<Wheel> wheels;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;

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
     *     {@link String }
     *     
     */
    public String getDispatchDate() {
        return dispatchDate;
    }

    /**
     * Sets the value of the dispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchDate(String value) {
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
     * Gets the value of the wheels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wheels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWheels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wheel }
     * 
     * 
     */
    public List<Wheel> getWheels() {
        if (wheels == null) {
            wheels = new ArrayList<Wheel>();
        }
        return this.wheels;
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

}
