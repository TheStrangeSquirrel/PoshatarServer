
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for InfoNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TTNState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssociatedDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "InfoNumber", propOrder = {
    "number",
    "numberState",
    "ttnState",
    "associatedDocument",
    "appendField"
})
public class InfoNumber {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "NumberState", required = true)
    protected String numberState;
    @XmlElement(name = "TTNState", required = true, nillable = true)
    protected String ttnState;
    @XmlElementRef(name = "AssociatedDocument", namespace = "http://inr.intime.ua/in-time/integration20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> associatedDocument;
    @XmlElement(name = "AppendField")
    protected List<AppendField> appendField;

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
     * Gets the value of the numberState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberState() {
        return numberState;
    }

    /**
     * Sets the value of the numberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberState(String value) {
        this.numberState = value;
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
     * Gets the value of the associatedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssociatedDocument() {
        return associatedDocument;
    }

    /**
     * Sets the value of the associatedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssociatedDocument(JAXBElement<String> value) {
        this.associatedDocument = value;
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
