
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.api20;

import net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.TransferCargoViewRequest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferCarcoViewRequest" type="{http://inr.intime.ua/in-time/integration20}TransferCargoViewRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transferCarcoViewRequest"
})
@XmlRootElement(name = "TransferCargoView")
public class TransferCargoView {

    @XmlElement(name = "TransferCarcoViewRequest", required = true)
    protected TransferCargoViewRequest transferCarcoViewRequest;

    /**
     * Gets the value of the transferCarcoViewRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCargoViewRequest }
     *     
     */
    public TransferCargoViewRequest getTransferCarcoViewRequest() {
        return transferCarcoViewRequest;
    }

    /**
     * Sets the value of the transferCarcoViewRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCargoViewRequest }
     *     
     */
    public void setTransferCarcoViewRequest(TransferCargoViewRequest value) {
        this.transferCarcoViewRequest = value;
    }

}
