
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AddTTNRespond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTTNRespond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTNState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://inr.intime.ua/in-time/integration20}Cost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AppendFields" type="{http://inr.intime.ua/in-time/integration20}AppendField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://inr.intime.ua/in-time/integration20}Label" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTTNRespond", propOrder = {
    "interfaceState",
    "number",
    "ttnState",
    "deliveryDate",
    "cost",
    "amount",
    "appendFields",
    "labels"
})
public class AddTTNRespond {

    @XmlElement(name = "InterfaceState", required = true)
    protected String interfaceState;
    @XmlElementRef(name = "Number", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "TTNState", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ttnState;
    @XmlElement(name = "DeliveryDate")
    protected String deliveryDate;
    @XmlElement(name = "Cost", nillable = true)
    protected List<Cost> cost;
    @XmlElementRef(name = "Amount", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amount;
    @XmlElement(name = "AppendFields")
    protected List<AppendField> appendFields;
    @XmlElement(name = "Labels", nillable = true)
    protected List<Label> labels;

    /**
     * Gets the value of the interfaceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceState() {
        return interfaceState;
    }

    /**
     * Sets the value of the interfaceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceState(String value) {
        this.interfaceState = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = value;
    }

    /**
     * Gets the value of the ttnState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTTNState() {
        return ttnState;
    }

    /**
     * Sets the value of the ttnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTTNState(JAXBElement<String> value) {
        this.ttnState = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cost }
     * 
     * 
     */
    public List<Cost> getCost() {
        if (cost == null) {
            cost = new ArrayList<Cost>();
        }
        return this.cost;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmount(JAXBElement<BigDecimal> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the appendFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendField }
     * 
     * 
     */
    public List<AppendField> getAppendFields() {
        if (appendFields == null) {
            appendFields = new ArrayList<AppendField>();
        }
        return this.appendFields;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

}
