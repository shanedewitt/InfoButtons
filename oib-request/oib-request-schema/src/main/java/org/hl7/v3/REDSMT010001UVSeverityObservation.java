//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.05 at 09:40:03 AM MDT 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.SeverityObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.SeverityObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interpretationCode" type="{}CD.Lite" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.SeverityObservation", propOrder = {
    "interpretationCode"
})
public class REDSMT010001UVSeverityObservation {

    @XmlElement(required = true)
    protected CDLite interpretationCode;

    /**
     * Gets the value of the interpretationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CDLite }
     *     
     */
    public CDLite getInterpretationCode() {
        return interpretationCode;
    }

    /**
     * Sets the value of the interpretationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDLite }
     *     
     */
    public void setInterpretationCode(CDLite value) {
        this.interpretationCode = value;
    }

}
