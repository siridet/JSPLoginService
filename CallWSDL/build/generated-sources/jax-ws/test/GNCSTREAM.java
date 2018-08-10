
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GNC-STREAM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNC-STREAM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kennung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mount-point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format-details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrier-phase" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="nav-systems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latlon" type="{urn:gndbss}Array3Ofdouble"/>
 *         &lt;element name="nmea-in" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="solution" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="misc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line-length" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="server-client" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="tcp-addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="udp-port" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="tnonce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password-source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new-reference" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="use-this" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNC-STREAM", propOrder = {
    "kennung",
    "mountPoint",
    "identifier",
    "format",
    "formatDetails",
    "carrierPhase",
    "navSystems",
    "network",
    "country",
    "latlon",
    "nmeaIn",
    "solution",
    "generator",
    "compression",
    "authentication",
    "fee",
    "bitrate",
    "misc",
    "lineLength",
    "serverClient",
    "tcpAddr",
    "tcpPort",
    "udpPort",
    "active",
    "tnonce",
    "topaque",
    "loginName",
    "passwordSource",
    "newReference",
    "useThis",
    "location"
})
public class GNCSTREAM {

    @XmlElementRef(name = "kennung", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> kennung;
    @XmlElementRef(name = "mount-point", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> mountPoint;
    @XmlElementRef(name = "identifier", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> identifier;
    @XmlElementRef(name = "format", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> format;
    @XmlElementRef(name = "format-details", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> formatDetails;
    @XmlElement(name = "carrier-phase")
    protected byte carrierPhase;
    @XmlElementRef(name = "nav-systems", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> navSystems;
    @XmlElementRef(name = "network", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> network;
    @XmlElementRef(name = "country", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> country;
    @XmlElement(required = true)
    protected Array3Ofdouble latlon;
    @XmlElement(name = "nmea-in")
    protected byte nmeaIn;
    protected byte solution;
    @XmlElementRef(name = "generator", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> generator;
    @XmlElementRef(name = "compression", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> compression;
    protected byte authentication;
    protected byte fee;
    protected long bitrate;
    @XmlElementRef(name = "misc", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> misc;
    @XmlElement(name = "line-length")
    protected long lineLength;
    @XmlElement(name = "server-client")
    protected byte serverClient;
    @XmlElementRef(name = "tcp-addr", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> tcpAddr;
    @XmlElement(name = "tcp-port")
    protected short tcpPort;
    @XmlElement(name = "udp-port")
    protected short udpPort;
    protected short active;
    @XmlElementRef(name = "tnonce", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> tnonce;
    @XmlElementRef(name = "topaque", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> topaque;
    @XmlElementRef(name = "login-name", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> loginName;
    @XmlElementRef(name = "password-source", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> passwordSource;
    @XmlElement(name = "new-reference")
    protected short newReference;
    @XmlElement(name = "use-this")
    protected short useThis;
    protected short location;

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
     * Gets the value of the mountPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getMountPoint() {
        return mountPoint;
    }

    /**
     * Sets the value of the mountPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setMountPoint(JAXBElement<java.lang.String> value) {
        this.mountPoint = value;
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<java.lang.String> value) {
        this.format = value;
    }

    /**
     * Gets the value of the formatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getFormatDetails() {
        return formatDetails;
    }

    /**
     * Sets the value of the formatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setFormatDetails(JAXBElement<java.lang.String> value) {
        this.formatDetails = value;
    }

    /**
     * Gets the value of the carrierPhase property.
     * 
     */
    public byte getCarrierPhase() {
        return carrierPhase;
    }

    /**
     * Sets the value of the carrierPhase property.
     * 
     */
    public void setCarrierPhase(byte value) {
        this.carrierPhase = value;
    }

    /**
     * Gets the value of the navSystems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNavSystems() {
        return navSystems;
    }

    /**
     * Sets the value of the navSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNavSystems(JAXBElement<java.lang.String> value) {
        this.navSystems = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNetwork(JAXBElement<java.lang.String> value) {
        this.network = value;
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
     * Gets the value of the nmeaIn property.
     * 
     */
    public byte getNmeaIn() {
        return nmeaIn;
    }

    /**
     * Sets the value of the nmeaIn property.
     * 
     */
    public void setNmeaIn(byte value) {
        this.nmeaIn = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     */
    public byte getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     */
    public void setSolution(byte value) {
        this.solution = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setGenerator(JAXBElement<java.lang.String> value) {
        this.generator = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCompression(JAXBElement<java.lang.String> value) {
        this.compression = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     */
    public byte getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     */
    public void setAuthentication(byte value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     */
    public byte getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     */
    public void setFee(byte value) {
        this.fee = value;
    }

    /**
     * Gets the value of the bitrate property.
     * 
     */
    public long getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     */
    public void setBitrate(long value) {
        this.bitrate = value;
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
     * Gets the value of the serverClient property.
     * 
     */
    public byte getServerClient() {
        return serverClient;
    }

    /**
     * Sets the value of the serverClient property.
     * 
     */
    public void setServerClient(byte value) {
        this.serverClient = value;
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
     * Gets the value of the active property.
     * 
     */
    public short getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(short value) {
        this.active = value;
    }

    /**
     * Gets the value of the tnonce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getTnonce() {
        return tnonce;
    }

    /**
     * Sets the value of the tnonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setTnonce(JAXBElement<java.lang.String> value) {
        this.tnonce = value;
    }

    /**
     * Gets the value of the topaque property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getTopaque() {
        return topaque;
    }

    /**
     * Sets the value of the topaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setTopaque(JAXBElement<java.lang.String> value) {
        this.topaque = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setLoginName(JAXBElement<java.lang.String> value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the passwordSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getPasswordSource() {
        return passwordSource;
    }

    /**
     * Sets the value of the passwordSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setPasswordSource(JAXBElement<java.lang.String> value) {
        this.passwordSource = value;
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
     * Gets the value of the location property.
     * 
     */
    public short getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     */
    public void setLocation(short value) {
        this.location = value;
    }

}
