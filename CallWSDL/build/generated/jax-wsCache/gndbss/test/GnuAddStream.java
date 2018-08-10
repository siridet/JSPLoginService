
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
 *         &lt;element name="stream" type="{urn:gndbss}gnStream" minOccurs="0"/>
 *         &lt;element name="casters" type="{urn:gndbss}gnCasters" minOccurs="0"/>
 *         &lt;element name="autoSwitchStreams" type="{urn:gndbss}gnStreams" minOccurs="0"/>
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
    "stream",
    "casters",
    "autoSwitchStreams"
})
@XmlRootElement(name = "gnuAddStream")
public class GnuAddStream {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "stream", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnStream> stream;
    @XmlElementRef(name = "casters", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnCasters> casters;
    @XmlElementRef(name = "autoSwitchStreams", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnStreams> autoSwitchStreams;

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

    /**
     * Gets the value of the casters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnCasters }{@code >}
     *     
     */
    public JAXBElement<GnCasters> getCasters() {
        return casters;
    }

    /**
     * Sets the value of the casters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnCasters }{@code >}
     *     
     */
    public void setCasters(JAXBElement<GnCasters> value) {
        this.casters = value;
    }

    /**
     * Gets the value of the autoSwitchStreams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnStreams }{@code >}
     *     
     */
    public JAXBElement<GnStreams> getAutoSwitchStreams() {
        return autoSwitchStreams;
    }

    /**
     * Sets the value of the autoSwitchStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnStreams }{@code >}
     *     
     */
    public void setAutoSwitchStreams(JAXBElement<GnStreams> value) {
        this.autoSwitchStreams = value;
    }

}
