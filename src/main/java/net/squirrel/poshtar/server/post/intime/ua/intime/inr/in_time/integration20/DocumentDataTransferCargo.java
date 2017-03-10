
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DocumentDataTransferCargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDataTransferCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TabularSection" type="{http://inr.intime.ua/in-time/integration20}TabularSectionTransferCargo" maxOccurs="unbounded"/>
 *         &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDataTransferCargo", propOrder = {
    "number",
    "date",
    "sender",
    "warehouseSender",
    "tabularSection",
    "documentStatus"
})
public class DocumentDataTransferCargo {

    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "Date", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Sender", required = true, nillable = true)
    protected String sender;
    @XmlElement(name = "WarehouseSender", required = true, nillable = true)
    protected String warehouseSender;
    @XmlElement(name = "TabularSection", required = true, nillable = true)
    protected List<TabularSectionTransferCargo> tabularSection;
    @XmlElement(name = "DocumentStatus")
    protected boolean documentStatus;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the warehouseSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseSender() {
        return warehouseSender;
    }

    /**
     * Sets the value of the warehouseSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseSender(String value) {
        this.warehouseSender = value;
    }

    /**
     * Gets the value of the tabularSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabularSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabularSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabularSectionTransferCargo }
     * 
     * 
     */
    public List<TabularSectionTransferCargo> getTabularSection() {
        if (tabularSection == null) {
            tabularSection = new ArrayList<TabularSectionTransferCargo>();
        }
        return this.tabularSection;
    }

    /**
     * Gets the value of the documentStatus property.
     * 
     */
    public boolean isDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     */
    public void setDocumentStatus(boolean value) {
        this.documentStatus = value;
    }

}
