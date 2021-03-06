//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.16 at 06:02:05 PM IST 
//


package com.codenotfound.types.flightsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paxFareProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paxFareProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paxFareDetail" type="{http://codenotfound.com/types/flightsearch}paxFareDetailVO" minOccurs="0"/&gt;
 *         &lt;element name="paxReference" type="{http://codenotfound.com/types/flightsearch}paxReferVO" minOccurs="0"/&gt;
 *         &lt;element name="passengerTaxDetails" type="{http://codenotfound.com/types/flightsearch}paxTaxDetailsVO" minOccurs="0"/&gt;
 *         &lt;element name="fare" type="{http://codenotfound.com/types/flightsearch}fareVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fareDetails" type="{http://codenotfound.com/types/flightsearch}fareDetailsVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paxFareProduct", propOrder = {
    "paxFareDetail",
    "paxReference",
    "passengerTaxDetails",
    "fare",
    "fareDetails"
})
public class PaxFareProduct {

    protected PaxFareDetailVO paxFareDetail;
    protected PaxReferVO paxReference;
    protected PaxTaxDetailsVO passengerTaxDetails;
    protected List<FareVO> fare;
    protected FareDetailsVO fareDetails;

    /**
     * Gets the value of the paxFareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PaxFareDetailVO }
     *     
     */
    public PaxFareDetailVO getPaxFareDetail() {
        return paxFareDetail;
    }

    /**
     * Sets the value of the paxFareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxFareDetailVO }
     *     
     */
    public void setPaxFareDetail(PaxFareDetailVO value) {
        this.paxFareDetail = value;
    }

    /**
     * Gets the value of the paxReference property.
     * 
     * @return
     *     possible object is
     *     {@link PaxReferVO }
     *     
     */
    public PaxReferVO getPaxReference() {
        return paxReference;
    }

    /**
     * Sets the value of the paxReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxReferVO }
     *     
     */
    public void setPaxReference(PaxReferVO value) {
        this.paxReference = value;
    }

    /**
     * Gets the value of the passengerTaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaxTaxDetailsVO }
     *     
     */
    public PaxTaxDetailsVO getPassengerTaxDetails() {
        return passengerTaxDetails;
    }

    /**
     * Sets the value of the passengerTaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxTaxDetailsVO }
     *     
     */
    public void setPassengerTaxDetails(PaxTaxDetailsVO value) {
        this.passengerTaxDetails = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareVO }
     * 
     * 
     */
    public List<FareVO> getFare() {
        if (fare == null) {
            fare = new ArrayList<FareVO>();
        }
        return this.fare;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsVO }
     *     
     */
    public FareDetailsVO getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsVO }
     *     
     */
    public void setFareDetails(FareDetailsVO value) {
        this.fareDetails = value;
    }

}
