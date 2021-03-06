
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
 *         &lt;element name="mountpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stream" type="{urn:gndbss}gnStream" minOccurs="0"/>
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
    "mountpoint",
    "stream"
})
@XmlRootElement(name = "setStream")
public class SetStream {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "mountpoint", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> mountpoint;
    @XmlElementRef(name = "stream", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnStream> stream;

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
     * Gets the value of the mountpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getMountpoint() {
        return mountpoint;
    }

    /**
     * Sets the value of the mountpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setMountpoint(JAXBElement<java.lang.String> value) {
        this.mountpoint = value;
    }

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnStream }{@code >}
     *     
     */
    public JAXBElement<GnStream> getStream() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnStream }{@code >}
     *     
     */
    public void setStream(JAXBElement<GnStream> value) {
        this.stream = value;
    }

}
