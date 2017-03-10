
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransferCargoVerificationRespond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCargoVerificationRespond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentNumberTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SenderCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferCargo" type="{http://inr.intime.ua/in-time/integration20}TransferCargo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackagingClient" type="{http://inr.intime.ua/in-time/integration20}PackagingClient" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransferCargoVerificationRespond", propOrder = {
    "interfaceState",
    "documentNumberTransfer",
    "dataTime",
    "senderCompany",
    "receiverCompany",
    "transferCargo",
    "packagingClient",
    "appendField"
})
public class TransferCargoVerificationRespond {

    @XmlElement(name = "InterfaceState", required = true)
    protected String interfaceState;
    @XmlElement(name = "DocumentNumberTransfer")
    protected String documentNumberTransfer;
    @XmlElement(name = "DataTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTime;
    @XmlElement(name = "SenderCompany")
    protected String senderCompany;
    @XmlElement(name = "ReceiverCompany")
    protected String receiverCompany;
    @XmlElement(name = "TransferCargo")
    protected List<TransferCargo> transferCargo;
    @XmlElement(name = "PackagingClient")
    protected List<PackagingClient> packagingClient;
    @XmlElement(name = "AppendField")
    protected List<AppendField> appendField;

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
     * Gets the value of the documentNumberTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumberTransfer() {
        return documentNumberTransfer;
    }

    /**
     * Sets the value of the documentNumberTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumberTransfer(String value) {
        this.documentNumberTransfer = value;
    }

    /**
     * Gets the value of the dataTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTime() {
        return dataTime;
    }

    /**
     * Sets the value of the dataTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTime(XMLGregorianCalendar value) {
        this.dataTime = value;
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
     * Gets the value of the packagingClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingClient }
     * 
     * 
     */
    public List<PackagingClient> getPackagingClient() {
        if (packagingClient == null) {
            packagingClient = new ArrayList<PackagingClient>();
        }
        return this.packagingClient;
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
