
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
 *         &lt;element name="casterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caster" type="{urn:gndbss}gnCaster" minOccurs="0"/>
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
    "casterId",
    "caster"
})
@XmlRootElement(name = "setCaster")
public class SetCaster {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "casterId", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> casterId;
    @XmlElementRef(name = "caster", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnCaster> caster;

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
     * Gets the value of the casterId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCasterId() {
        return casterId;
    }

    /**
     * Sets the value of the casterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCasterId(JAXBElement<java.lang.String> value) {
        this.casterId = value;
    }

    /**
     * Gets the value of the caster property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnCaster }{@code >}
     *     
     */
    public JAXBElement<GnCaster> getCaster() {
        return caster;
    }

    /**
     * Sets the value of the caster property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnCaster }{@code >}
     *     
     */
    public void setCaster(JAXBElement<GnCaster> value) {
        this.caster = value;
    }

}
