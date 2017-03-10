
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransferCargoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCargoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SenderCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiverCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Documents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IntimeTakingBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Unloaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "TransferCargoList", propOrder = {
    "dateTime",
    "senderCompany",
    "receiverCompany",
    "documents",
    "intimeTakingBack",
    "unloaded",
    "appendField"
})
public class TransferCargoList {

    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "SenderCompany", required = true)
    protected String senderCompany;
    @XmlElement(name = "ReceiverCompany", required = true)
    protected String receiverCompany;
    @XmlElement(name = "Documents", required = true)
    protected String documents;
    @XmlElement(name = "IntimeTakingBack")
    protected boolean intimeTakingBack;
    @XmlElement(name = "Unloaded")
    protected boolean unloaded;
    @XmlElement(name = "AppendField")
    protected List<AppendField> appendField;

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
     * Gets the value of the senderCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCompany() {
        return senderCompany;
    }

    /**
     * Sets the value of the senderCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCompany(String value) {
        this.senderCompany = value;
    }

    /**
     * Gets the value of the receiverCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCompany() {
        return receiverCompany;
    }

    /**
     * Sets the value of the receiverCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCompany(String value) {
        this.receiverCompany = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocuments(String value) {
        this.documents = value;
    }

    /**
     * Gets the value of the intimeTakingBack property.
     * 
     */
    public boolean isIntimeTakingBack() {
        return intimeTakingBack;
    }

    /**
     * Sets the value of the intimeTakingBack property.
     * 
     */
    public void setIntimeTakingBack(boolean value) {
        this.intimeTakingBack = value;
    }

    /**
     * Gets the value of the unloaded property.
     * 
     */
    public boolean isUnloaded() {
        return unloaded;
    }

    /**
     * Sets the value of the unloaded property.
     * 
     */
    public void setUnloaded(boolean value) {
        this.unloaded = value;
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
