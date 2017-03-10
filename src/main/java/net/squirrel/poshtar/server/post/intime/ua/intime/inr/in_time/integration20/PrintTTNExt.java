
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PrintTTNExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintTTNExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomerDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataDocument" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NomerKvitantsii" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zayavka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Firm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Liter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sekyurpark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SummaPropisyu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GorodOtprevitel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdresPodrazdileniyaOtpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OplachivaetOtpravitel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelPodrazdeleniyaOtpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GorodPoluchatel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataDostavki" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="AdresPodrazdileniyaPoluch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OplachivaetPoluchatel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelPodrazdeleniyaPoluch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Otpravitel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KontLitsOtpravitelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefonOtpravitelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdresOtpravitelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentOtpravitelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelOtpravkiSMSOtpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Poluchatel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KontLitsPolychatelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefonPolychatelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdresPolychatelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentPolychatelya" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MelkiyTekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MelkiyKol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelOtpravkiSMSPoluch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OpisanieGruza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KvoMest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ves" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Obem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPSZaRahNadpis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OplataTretimLitsomNadpis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RasporjazhenieOtpraviteljaS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VozvratTaryZashet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OplataTretimLitsom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VozvratPSNa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrintTTNParametr" type="{http://inr.intime.ua/in-time/integration20}PrintTTNParametr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Oplata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintTTNExt", propOrder = {
    "nomerDocument",
    "dataDocument",
    "nomerKvitantsii",
    "zayavka",
    "firm",
    "liter",
    "sekyurpark",
    "summaPropisyu",
    "gorodOtprevitel",
    "adresPodrazdileniyaOtpr",
    "oplachivaetOtpravitel",
    "telPodrazdeleniyaOtpr",
    "gorodPoluchatel",
    "dataDostavki",
    "adresPodrazdileniyaPoluch",
    "oplachivaetPoluchatel",
    "telPodrazdeleniyaPoluch",
    "otpravitel",
    "kontLitsOtpravitelya",
    "telefonOtpravitelya",
    "adresOtpravitelya",
    "documentOtpravitelya",
    "telOtpravkiSMSOtpr",
    "poluchatel",
    "kontLitsPolychatelya",
    "telefonPolychatelya",
    "adresPolychatelya",
    "documentPolychatelya",
    "melkiyTekst",
    "melkiyKol",
    "telOtpravkiSMSPoluch",
    "opisanieGruza",
    "kvoMest",
    "ves",
    "obem",
    "spsZaRahNadpis",
    "oplataTretimLitsomNadpis",
    "rasporjazhenieOtpraviteljaS",
    "vozvratTaryZashet",
    "oplataTretimLitsom",
    "vozvratPSNa",
    "printTTNParametr",
    "oplata"
})
public class PrintTTNExt {

    @XmlElement(name = "NomerDocument", required = true)
    protected String nomerDocument;
    @XmlElement(name = "DataDocument", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocument;
    @XmlElement(name = "NomerKvitantsii", required = true)
    protected String nomerKvitantsii;
    @XmlElement(name = "Zayavka", required = true)
    protected String zayavka;
    @XmlElement(name = "Firm", required = true)
    protected String firm;
    @XmlElement(name = "Liter", required = true)
    protected String liter;
    @XmlElement(name = "Sekyurpark", required = true)
    protected String sekyurpark;
    @XmlElement(name = "SummaPropisyu", required = true)
    protected String summaPropisyu;
    @XmlElement(name = "GorodOtprevitel", required = true)
    protected String gorodOtprevitel;
    @XmlElement(name = "AdresPodrazdileniyaOtpr", required = true)
    protected String adresPodrazdileniyaOtpr;
    @XmlElement(name = "OplachivaetOtpravitel", required = true)
    protected String oplachivaetOtpravitel;
    @XmlElement(name = "TelPodrazdeleniyaOtpr", required = true)
    protected String telPodrazdeleniyaOtpr;
    @XmlElement(name = "GorodPoluchatel", required = true)
    protected String gorodPoluchatel;
    @XmlElement(name = "DataDostavki", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDostavki;
    @XmlElement(name = "AdresPodrazdileniyaPoluch", required = true)
    protected String adresPodrazdileniyaPoluch;
    @XmlElement(name = "OplachivaetPoluchatel", required = true)
    protected String oplachivaetPoluchatel;
    @XmlElement(name = "TelPodrazdeleniyaPoluch", required = true)
    protected String telPodrazdeleniyaPoluch;
    @XmlElement(name = "Otpravitel", required = true)
    protected String otpravitel;
    @XmlElement(name = "KontLitsOtpravitelya", required = true)
    protected String kontLitsOtpravitelya;
    @XmlElement(name = "TelefonOtpravitelya", required = true)
    protected String telefonOtpravitelya;
    @XmlElement(name = "AdresOtpravitelya", required = true)
    protected String adresOtpravitelya;
    @XmlElement(name = "DocumentOtpravitelya", required = true)
    protected String documentOtpravitelya;
    @XmlElement(name = "TelOtpravkiSMSOtpr", required = true)
    protected String telOtpravkiSMSOtpr;
    @XmlElement(name = "Poluchatel", required = true)
    protected String poluchatel;
    @XmlElement(name = "KontLitsPolychatelya", required = true)
    protected String kontLitsPolychatelya;
    @XmlElement(name = "TelefonPolychatelya", required = true)
    protected String telefonPolychatelya;
    @XmlElement(name = "AdresPolychatelya", required = true)
    protected String adresPolychatelya;
    @XmlElement(name = "DocumentPolychatelya", required = true)
    protected String documentPolychatelya;
    @XmlElement(name = "MelkiyTekst", required = true)
    protected String melkiyTekst;
    @XmlElement(name = "MelkiyKol", required = true)
    protected String melkiyKol;
    @XmlElement(name = "TelOtpravkiSMSPoluch", required = true)
    protected String telOtpravkiSMSPoluch;
    @XmlElement(name = "OpisanieGruza", required = true)
    protected String opisanieGruza;
    @XmlElement(name = "KvoMest", required = true)
    protected String kvoMest;
    @XmlElement(name = "Ves", required = true)
    protected String ves;
    @XmlElement(name = "Obem", required = true)
    protected String obem;
    @XmlElement(name = "SPSZaRahNadpis", required = true)
    protected String spsZaRahNadpis;
    @XmlElement(name = "OplataTretimLitsomNadpis", required = true)
    protected String oplataTretimLitsomNadpis;
    @XmlElement(name = "RasporjazhenieOtpraviteljaS", required = true)
    protected String rasporjazhenieOtpraviteljaS;
    @XmlElement(name = "VozvratTaryZashet", required = true)
    protected String vozvratTaryZashet;
    @XmlElement(name = "OplataTretimLitsom", required = true)
    protected String oplataTretimLitsom;
    @XmlElement(name = "VozvratPSNa")
    protected boolean vozvratPSNa;
    @XmlElement(name = "PrintTTNParametr", nillable = true)
    protected List<PrintTTNParametr> printTTNParametr;
    @XmlElement(name = "Oplata", required = true)
    protected String oplata;

    /**
     * Gets the value of the nomerDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomerDocument() {
        return nomerDocument;
    }

    /**
     * Sets the value of the nomerDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomerDocument(String value) {
        this.nomerDocument = value;
    }

    /**
     * Gets the value of the dataDocument property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocument() {
        return dataDocument;
    }

    /**
     * Sets the value of the dataDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocument(XMLGregorianCalendar value) {
        this.dataDocument = value;
    }

    /**
     * Gets the value of the nomerKvitantsii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomerKvitantsii() {
        return nomerKvitantsii;
    }

    /**
     * Sets the value of the nomerKvitantsii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomerKvitantsii(String value) {
        this.nomerKvitantsii = value;
    }

    /**
     * Gets the value of the zayavka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZayavka() {
        return zayavka;
    }

    /**
     * Sets the value of the zayavka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZayavka(String value) {
        this.zayavka = value;
    }

    /**
     * Gets the value of the firm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirm() {
        return firm;
    }

    /**
     * Sets the value of the firm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirm(String value) {
        this.firm = value;
    }

    /**
     * Gets the value of the liter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiter() {
        return liter;
    }

    /**
     * Sets the value of the liter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiter(String value) {
        this.liter = value;
    }

    /**
     * Gets the value of the sekyurpark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSekyurpark() {
        return sekyurpark;
    }

    /**
     * Sets the value of the sekyurpark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSekyurpark(String value) {
        this.sekyurpark = value;
    }

    /**
     * Gets the value of the summaPropisyu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaPropisyu() {
        return summaPropisyu;
    }

    /**
     * Sets the value of the summaPropisyu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaPropisyu(String value) {
        this.summaPropisyu = value;
    }

    /**
     * Gets the value of the gorodOtprevitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGorodOtprevitel() {
        return gorodOtprevitel;
    }

    /**
     * Sets the value of the gorodOtprevitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGorodOtprevitel(String value) {
        this.gorodOtprevitel = value;
    }

    /**
     * Gets the value of the adresPodrazdileniyaOtpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresPodrazdileniyaOtpr() {
        return adresPodrazdileniyaOtpr;
    }

    /**
     * Sets the value of the adresPodrazdileniyaOtpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresPodrazdileniyaOtpr(String value) {
        this.adresPodrazdileniyaOtpr = value;
    }

    /**
     * Gets the value of the oplachivaetOtpravitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplachivaetOtpravitel() {
        return oplachivaetOtpravitel;
    }

    /**
     * Sets the value of the oplachivaetOtpravitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplachivaetOtpravitel(String value) {
        this.oplachivaetOtpravitel = value;
    }

    /**
     * Gets the value of the telPodrazdeleniyaOtpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelPodrazdeleniyaOtpr() {
        return telPodrazdeleniyaOtpr;
    }

    /**
     * Sets the value of the telPodrazdeleniyaOtpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelPodrazdeleniyaOtpr(String value) {
        this.telPodrazdeleniyaOtpr = value;
    }

    /**
     * Gets the value of the gorodPoluchatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGorodPoluchatel() {
        return gorodPoluchatel;
    }

    /**
     * Sets the value of the gorodPoluchatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGorodPoluchatel(String value) {
        this.gorodPoluchatel = value;
    }

    /**
     * Gets the value of the dataDostavki property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDostavki() {
        return dataDostavki;
    }

    /**
     * Sets the value of the dataDostavki property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDostavki(XMLGregorianCalendar value) {
        this.dataDostavki = value;
    }

    /**
     * Gets the value of the adresPodrazdileniyaPoluch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresPodrazdileniyaPoluch() {
        return adresPodrazdileniyaPoluch;
    }

    /**
     * Sets the value of the adresPodrazdileniyaPoluch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresPodrazdileniyaPoluch(String value) {
        this.adresPodrazdileniyaPoluch = value;
    }

    /**
     * Gets the value of the oplachivaetPoluchatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplachivaetPoluchatel() {
        return oplachivaetPoluchatel;
    }

    /**
     * Sets the value of the oplachivaetPoluchatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplachivaetPoluchatel(String value) {
        this.oplachivaetPoluchatel = value;
    }

    /**
     * Gets the value of the telPodrazdeleniyaPoluch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelPodrazdeleniyaPoluch() {
        return telPodrazdeleniyaPoluch;
    }

    /**
     * Sets the value of the telPodrazdeleniyaPoluch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelPodrazdeleniyaPoluch(String value) {
        this.telPodrazdeleniyaPoluch = value;
    }

    /**
     * Gets the value of the otpravitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpravitel() {
        return otpravitel;
    }

    /**
     * Sets the value of the otpravitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpravitel(String value) {
        this.otpravitel = value;
    }

    /**
     * Gets the value of the kontLitsOtpravitelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontLitsOtpravitelya() {
        return kontLitsOtpravitelya;
    }

    /**
     * Sets the value of the kontLitsOtpravitelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontLitsOtpravitelya(String value) {
        this.kontLitsOtpravitelya = value;
    }

    /**
     * Gets the value of the telefonOtpravitelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonOtpravitelya() {
        return telefonOtpravitelya;
    }

    /**
     * Sets the value of the telefonOtpravitelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonOtpravitelya(String value) {
        this.telefonOtpravitelya = value;
    }

    /**
     * Gets the value of the adresOtpravitelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresOtpravitelya() {
        return adresOtpravitelya;
    }

    /**
     * Sets the value of the adresOtpravitelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresOtpravitelya(String value) {
        this.adresOtpravitelya = value;
    }

    /**
     * Gets the value of the documentOtpravitelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentOtpravitelya() {
        return documentOtpravitelya;
    }

    /**
     * Sets the value of the documentOtpravitelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentOtpravitelya(String value) {
        this.documentOtpravitelya = value;
    }

    /**
     * Gets the value of the telOtpravkiSMSOtpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelOtpravkiSMSOtpr() {
        return telOtpravkiSMSOtpr;
    }

    /**
     * Sets the value of the telOtpravkiSMSOtpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelOtpravkiSMSOtpr(String value) {
        this.telOtpravkiSMSOtpr = value;
    }

    /**
     * Gets the value of the poluchatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoluchatel() {
        return poluchatel;
    }

    /**
     * Sets the value of the poluchatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoluchatel(String value) {
        this.poluchatel = value;
    }

    /**
     * Gets the value of the kontLitsPolychatelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontLitsPolychatelya() {
        return kontLitsPolychatelya;
    }

    /**
     * Sets the value of the kontLitsPolychatelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontLitsPolychatelya(String value) {
        this.kontLitsPolychatelya = value;
    }

    /**
     * Gets the value of the telefonPolychatelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonPolychatelya() {
        return telefonPolychatelya;
    }

    /**
     * Sets the value of the telefonPolychatelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonPolychatelya(String value) {
        this.telefonPolychatelya = value;
    }

    /**
     * Gets the value of the adresPolychatelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresPolychatelya() {
        return adresPolychatelya;
    }

    /**
     * Sets the value of the adresPolychatelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresPolychatelya(String value) {
        this.adresPolychatelya = value;
    }

    /**
     * Gets the value of the documentPolychatelya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentPolychatelya() {
        return documentPolychatelya;
    }

    /**
     * Sets the value of the documentPolychatelya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentPolychatelya(String value) {
        this.documentPolychatelya = value;
    }

    /**
     * Gets the value of the melkiyTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMelkiyTekst() {
        return melkiyTekst;
    }

    /**
     * Sets the value of the melkiyTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMelkiyTekst(String value) {
        this.melkiyTekst = value;
    }

    /**
     * Gets the value of the melkiyKol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMelkiyKol() {
        return melkiyKol;
    }

    /**
     * Sets the value of the melkiyKol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMelkiyKol(String value) {
        this.melkiyKol = value;
    }

    /**
     * Gets the value of the telOtpravkiSMSPoluch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelOtpravkiSMSPoluch() {
        return telOtpravkiSMSPoluch;
    }

    /**
     * Sets the value of the telOtpravkiSMSPoluch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelOtpravkiSMSPoluch(String value) {
        this.telOtpravkiSMSPoluch = value;
    }

    /**
     * Gets the value of the opisanieGruza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpisanieGruza() {
        return opisanieGruza;
    }

    /**
     * Sets the value of the opisanieGruza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpisanieGruza(String value) {
        this.opisanieGruza = value;
    }

    /**
     * Gets the value of the kvoMest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvoMest() {
        return kvoMest;
    }

    /**
     * Sets the value of the kvoMest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvoMest(String value) {
        this.kvoMest = value;
    }

    /**
     * Gets the value of the ves property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVes() {
        return ves;
    }

    /**
     * Sets the value of the ves property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVes(String value) {
        this.ves = value;
    }

    /**
     * Gets the value of the obem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObem() {
        return obem;
    }

    /**
     * Sets the value of the obem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObem(String value) {
        this.obem = value;
    }

    /**
     * Gets the value of the spsZaRahNadpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPSZaRahNadpis() {
        return spsZaRahNadpis;
    }

    /**
     * Sets the value of the spsZaRahNadpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPSZaRahNadpis(String value) {
        this.spsZaRahNadpis = value;
    }

    /**
     * Gets the value of the oplataTretimLitsomNadpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplataTretimLitsomNadpis() {
        return oplataTretimLitsomNadpis;
    }

    /**
     * Sets the value of the oplataTretimLitsomNadpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplataTretimLitsomNadpis(String value) {
        this.oplataTretimLitsomNadpis = value;
    }

    /**
     * Gets the value of the rasporjazhenieOtpraviteljaS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRasporjazhenieOtpraviteljaS() {
        return rasporjazhenieOtpraviteljaS;
    }

    /**
     * Sets the value of the rasporjazhenieOtpraviteljaS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRasporjazhenieOtpraviteljaS(String value) {
        this.rasporjazhenieOtpraviteljaS = value;
    }

    /**
     * Gets the value of the vozvratTaryZashet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVozvratTaryZashet() {
        return vozvratTaryZashet;
    }

    /**
     * Sets the value of the vozvratTaryZashet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVozvratTaryZashet(String value) {
        this.vozvratTaryZashet = value;
    }

    /**
     * Gets the value of the oplataTretimLitsom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplataTretimLitsom() {
        return oplataTretimLitsom;
    }

    /**
     * Sets the value of the oplataTretimLitsom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplataTretimLitsom(String value) {
        this.oplataTretimLitsom = value;
    }

    /**
     * Gets the value of the vozvratPSNa property.
     * 
     */
    public boolean isVozvratPSNa() {
        return vozvratPSNa;
    }

    /**
     * Sets the value of the vozvratPSNa property.
     * 
     */
    public void setVozvratPSNa(boolean value) {
        this.vozvratPSNa = value;
    }

    /**
     * Gets the value of the printTTNParametr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printTTNParametr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintTTNParametr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrintTTNParametr }
     * 
     * 
     */
    public List<PrintTTNParametr> getPrintTTNParametr() {
        if (printTTNParametr == null) {
            printTTNParametr = new ArrayList<PrintTTNParametr>();
        }
        return this.printTTNParametr;
    }

    /**
     * Gets the value of the oplata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplata() {
        return oplata;
    }

    /**
     * Sets the value of the oplata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplata(String value) {
        this.oplata = value;
    }

}
