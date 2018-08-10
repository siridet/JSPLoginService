
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
 *         &lt;element name="caster" type="{urn:gndbss}gnCaster" minOccurs="0"/>
 *         &lt;element name="streams" type="{urn:gndbss}gnStreams" minOccurs="0"/>
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
    "caster",
    "streams"
})
@XmlRootElement(name = "gnuAddCaster")
public class GnuAddCaster {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "caster", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnCaster> caster;
    @XmlElementRef(name = "streams", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnStreams> streams;

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

    /**
     * Gets the value of the streams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnStreams }{@code >}
     *     
     */
    public JAXBElement<GnStreams> getStreams() {
        return streams;
    }

    /**
     * Sets the value of the streams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnStreams }{@code >}
     *     
     */
    public void setStreams(JAXBElement<GnStreams> value) {
        this.streams = value;
    }

}
