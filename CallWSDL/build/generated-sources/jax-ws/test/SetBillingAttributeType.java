
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAttributeType" type="{urn:gndbss}gnBillingAttributeType" minOccurs="0"/>
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
    "session",
    "attribute",
    "billingAttributeType"
})
@XmlRootElement(name = "setBillingAttributeType")
public class SetBillingAttributeType {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "attribute", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> attribute;
    @XmlElementRef(name = "billingAttributeType", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnBillingAttributeType> billingAttributeType;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setSession(JAXBElement<java.lang.String> value) {
        this.session = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAttribute(JAXBElement<java.lang.String> value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the billingAttributeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnBillingAttributeType }{@code >}
     *     
     */
    public JAXBElement<GnBillingAttributeType> getBillingAttributeType() {
        return billingAttributeType;
    }

    /**
     * Sets the value of the billingAttributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnBillingAttributeType }{@code >}
     *     
     */
    public void setBillingAttributeType(JAXBElement<GnBillingAttributeType> value) {
        this.billingAttributeType = value;
    }

}
