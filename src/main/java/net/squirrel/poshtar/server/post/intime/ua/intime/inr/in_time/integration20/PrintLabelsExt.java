
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
 * <p>Java class for PrintLabelsExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintLabelsExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LableDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LableTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="PlaceOverall" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Place" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberWarehouseSender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberWarehouseReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberTTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogisticsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogisticsNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sign30" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PrintLabelsExt", propOrder = {
    "lableDate",
    "lableTime",
    "placeOverall",
    "place",
    "barcode",
    "weight",
    "volume",
    "cargo",
    "warehouseSender",
    "numberWarehouseSender",
    "cityReceiver",
    "warehouseReceiver",
    "numberWarehouseReceiver",
    "numberTTN",
    "nameClient",
    "logisticsName",
    "logisticsNumber",
    "sign30",
    "appendField"
})
public class PrintLabelsExt {

    @XmlElement(name = "LableDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lableDate;
    @XmlElement(name = "LableTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lableTime;
    @XmlElement(name = "PlaceOverall", required = true)
    protected String placeOverall;
    @XmlElement(name = "Place", required = true)
    protected String place;
    @XmlElement(name = "Barcode", required = true)
    protected String barcode;
    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "Volume", required = true)
    protected BigDecimal volume;
    @XmlElement(name = "Cargo", required = true)
    protected String cargo;
    @XmlElement(name = "WarehouseSender", required = true)
    protected String warehouseSender;
    @XmlElement(name = "NumberWarehouseSender", required = true)
    protected String numberWarehouseSender;
    @XmlElement(name = "CityReceiver", required = true)
    protected String cityReceiver;
    @XmlElement(name = "WarehouseReceiver", required = true)
    protected String warehouseReceiver;
    @XmlElement(name = "NumberWarehouseReceiver", required = true)
    protected String numberWarehouseReceiver;
    @XmlElement(name = "NumberTTN", required = true)
    protected String numberTTN;
    @XmlElement(name = "NameClient", required = true)
    protected String nameClient;
    @XmlElement(name = "LogisticsName", required = true)
    protected String logisticsName;
    @XmlElement(name = "LogisticsNumber", required = true)
    protected String logisticsNumber;
    @XmlElement(name = "Sign30", required = true)
    protected String sign30;
    @XmlElement(name = "AppendField", nillable = true)
    protected List<AppendField> appendField;

    /**
     * Gets the value of the lableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLableDate() {
        return lableDate;
    }

    /**
     * Sets the value of the lableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLableDate(XMLGregorianCalendar value) {
        this.lableDate = value;
    }

    /**
     * Gets the value of the lableTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLableTime() {
        return lableTime;
    }

    /**
     * Sets the value of the lableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLableTime(XMLGregorianCalendar value) {
        this.lableTime = value;
    }

    /**
     * Gets the value of the placeOverall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOverall() {
        return placeOverall;
    }

    /**
     * Sets the value of the placeOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOverall(String value) {
        this.placeOverall = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
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
     * Gets the value of the numberWarehouseSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberWarehouseSender() {
        return numberWarehouseSender;
    }

    /**
     * Sets the value of the numberWarehouseSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberWarehouseSender(String value) {
        this.numberWarehouseSender = value;
    }

    /**
     * Gets the value of the cityReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityReceiver() {
        return cityReceiver;
    }

    /**
     * Sets the value of the cityReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityReceiver(String value) {
        this.cityReceiver = value;
    }

    /**
     * Gets the value of the warehouseReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseReceiver() {
        return warehouseReceiver;
    }

    /**
     * Sets the value of the warehouseReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseReceiver(String value) {
        this.warehouseReceiver = value;
    }

    /**
     * Gets the value of the numberWarehouseReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberWarehouseReceiver() {
        return numberWarehouseReceiver;
    }

    /**
     * Sets the value of the numberWarehouseReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberWarehouseReceiver(String value) {
        this.numberWarehouseReceiver = value;
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
     * Gets the value of the nameClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameClient() {
        return nameClient;
    }

    /**
     * Sets the value of the nameClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameClient(String value) {
        this.nameClient = value;
    }

    /**
     * Gets the value of the logisticsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsName() {
        return logisticsName;
    }

    /**
     * Sets the value of the logisticsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsName(String value) {
        this.logisticsName = value;
    }

    /**
     * Gets the value of the logisticsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    /**
     * Sets the value of the logisticsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsNumber(String value) {
        this.logisticsNumber = value;
    }

    /**
     * Gets the value of the sign30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign30() {
        return sign30;
    }

    /**
     * Sets the value of the sign30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign30(String value) {
        this.sign30 = value;
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
