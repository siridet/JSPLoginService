
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GNC-NETWORK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNC-NETWORK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kennung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="web-net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web-str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web-reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="misc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line-length" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="new-reference" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="use-this" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNC-NETWORK", propOrder = {
    "kennung",
    "identifier",
    "operator",
    "authentication",
    "fee",
    "webNet",
    "webStr",
    "webReg",
    "misc",
    "lineLength",
    "newReference",
    "useThis"
})
public class GNCNETWORK {

    @XmlElementRef(name = "kennung", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> kennung;
    @XmlElementRef(name = "identifier", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> identifier;
    @XmlElementRef(name = "operator", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> operator;
    protected byte authentication;
    protected byte fee;
    @XmlElementRef(name = "web-net", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> webNet;
    @XmlElementRef(name = "web-str", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> webStr;
    @XmlElementRef(name = "web-reg", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> webReg;
    @XmlElementRef(name = "misc", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> misc;
    @XmlElement(name = "line-length")
    protected long lineLength;
    @XmlElement(name = "new-reference")
    protected short newReference;
    @XmlElement(name = "use-this")
    protected short useThis;

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
     * Gets the value of the webNet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getWebNet() {
        return webNet;
    }

    /**
     * Sets the value of the webNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setWebNet(JAXBElement<java.lang.String> value) {
        this.webNet = value;
    }

    /**
     * Gets the value of the webStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getWebStr() {
        return webStr;
    }

    /**
     * Sets the value of the webStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setWebStr(JAXBElement<java.lang.String> value) {
        this.webStr = value;
    }

    /**
     * Gets the value of the webReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getWebReg() {
        return webReg;
    }

    /**
     * Sets the value of the webReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setWebReg(JAXBElement<java.lang.String> value) {
        this.webReg = value;
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

}
