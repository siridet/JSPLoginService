
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GNC-CASTER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNC-CASTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kennung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcp-addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="udp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmea" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latlon" type="{urn:gndbss}Array3Ofdouble"/>
 *         &lt;element name="misc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line-length" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="new-reference" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="use-this" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="cc-server-client" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="cc-tcp-addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cc-tcp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="cc-udp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="cc-login-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cc-password-source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNC-CASTER", propOrder = {
    "kennung",
    "tcpAddr",
    "tcpPort",
    "udpPort",
    "identifier",
    "operator",
    "nmea",
    "country",
    "latlon",
    "misc",
    "lineLength",
    "newReference",
    "useThis",
    "ccServerClient",
    "ccTcpAddr",
    "ccTcpPort",
    "ccUdpPort",
    "ccLoginName",
    "ccPasswordSource"
})
public class GNCCASTER {

    @XmlElementRef(name = "kennung", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> kennung;
    @XmlElementRef(name = "tcp-addr", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> tcpAddr;
    @XmlElement(name = "tcp-port")
    protected short tcpPort;
    @XmlElement(name = "udp-port")
    protected short udpPort;
    @XmlElementRef(name = "identifier", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> identifier;
    @XmlElementRef(name = "operator", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> operator;
    protected byte nmea;
    @XmlElementRef(name = "country", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> country;
    @XmlElement(required = true)
    protected Array3Ofdouble latlon;
    @XmlElementRef(name = "misc", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> misc;
    @XmlElement(name = "line-length")
    protected long lineLength;
    @XmlElement(name = "new-reference")
    protected short newReference;
    @XmlElement(name = "use-this")
    protected short useThis;
    @XmlElement(name = "cc-server-client")
    protected byte ccServerClient;
    @XmlElementRef(name = "cc-tcp-addr", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ccTcpAddr;
    @XmlElement(name = "cc-tcp-port")
    protected short ccTcpPort;
    @XmlElement(name = "cc-udp-port")
    protected short ccUdpPort;
    @XmlElementRef(name = "cc-login-name", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ccLoginName;
    @XmlElementRef(name = "cc-password-source", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ccPasswordSource;

    /**
     * Gets the value of the kennung property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getKennung() {
        return kennung;
    }

    /**
     * Sets the value of the kennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setKennung(JAXBElement<java.lang.String> value) {
        this.kennung = value;
    }

    /**
     * Gets the value of the tcpAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getTcpAddr() {
        return tcpAddr;
    }

    /**
     * Sets the value of the tcpAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setTcpAddr(JAXBElement<java.lang.String> value) {
        this.tcpAddr = value;
    }

    /**
     * Gets the value of the tcpPort property.
     * 
     */
    public short getTcpPort() {
        return tcpPort;
    }

    /**
     * Sets the value of the tcpPort property.
     * 
     */
    public void setTcpPort(short value) {
        this.tcpPort = value;
    }

    /**
     * Gets the value of the udpPort property.
     * 
     */
    public short getUdpPort() {
        return udpPort;
    }

    /**
     * Sets the value of the udpPort property.
     * 
     */
    public void setUdpPort(short value) {
        this.udpPort = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<java.lang.String> value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setOperator(JAXBElement<java.lang.String> value) {
        this.operator = value;
    }

    /**
     * Gets the value of the nmea property.
     * 
     */
    public byte getNmea() {
        return nmea;
    }

    /**
     * Sets the value of the nmea property.
     * 
     */
    public void setNmea(byte value) {
        this.nmea = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<java.lang.String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the latlon property.
     * 
     * @return
     *     possible object is
     *     {@link Array3Ofdouble }
     *     
     */
    public Array3Ofdouble getLatlon() {
        return latlon;
    }

    /**
     * Sets the value of the latlon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array3Ofdouble }
     *     
     */
    public void setLatlon(Array3Ofdouble value) {
        this.latlon = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setMisc(JAXBElement<java.lang.String> value) {
        this.misc = value;
    }

    /**
     * Gets the value of the lineLength property.
     * 
     */
    public long getLineLength() {
        return lineLength;
    }

    /**
     * Sets the value of the lineLength property.
     * 
     */
    public void setLineLength(long value) {
        this.lineLength = value;
    }

    /**
     * Gets the value of the newReference property.
     * 
     */
    public short getNewReference() {
        return newReference;
    }

    /**
     * Sets the value of the newReference property.
     * 
     */
    public void setNewReference(short value) {
        this.newReference = value;
    }

    /**
     * Gets the value of the useThis property.
     * 
     */
    public short getUseThis() {
        return useThis;
    }

    /**
     * Sets the value of the useThis property.
     * 
     */
    public void setUseThis(short value) {
        this.useThis = value;
    }

    /**
     * Gets the value of the ccServerClient property.
     * 
     */
    public byte getCcServerClient() {
        return ccServerClient;
    }

    /**
     * Sets the value of the ccServerClient property.
     * 
     */
    public void setCcServerClient(byte value) {
        this.ccServerClient = value;
    }

    /**
     * Gets the value of the ccTcpAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCcTcpAddr() {
        return ccTcpAddr;
    }

    /**
     * Sets the value of the ccTcpAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCcTcpAddr(JAXBElement<java.lang.String> value) {
        this.ccTcpAddr = value;
    }

    /**
     * Gets the value of the ccTcpPort property.
     * 
     */
    public short getCcTcpPort() {
        return ccTcpPort;
    }

    /**
     * Sets the value of the ccTcpPort property.
     * 
     */
    public void setCcTcpPort(short value) {
        this.ccTcpPort = value;
    }

    /**
     * Gets the value of the ccUdpPort property.
     * 
     */
    public short getCcUdpPort() {
        return ccUdpPort;
    }

    /**
     * Sets the value of the ccUdpPort property.
     * 
     */
    public void setCcUdpPort(short value) {
        this.ccUdpPort = value;
    }

    /**
     * Gets the value of the ccLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCcLoginName() {
        return ccLoginName;
    }

    /**
     * Sets the value of the ccLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCcLoginName(JAXBElement<java.lang.String> value) {
        this.ccLoginName = value;
    }

    /**
     * Gets the value of the ccPasswordSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCcPasswordSource() {
        return ccPasswordSource;
    }

    /**
     * Sets the value of the ccPasswordSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCcPasswordSource(JAXBElement<java.lang.String> value) {
        this.ccPasswordSource = value;
    }

}
