
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{urn:gndbss}gnUser" minOccurs="0"/>
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
    "userName",
    "user"
})
@XmlRootElement(name = "setUserByName")
public class SetUserByName {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "userName", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> userName;
    @XmlElementRef(name = "user", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnUser> user;

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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<java.lang.String> value) {
        this.userName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnUser }{@code >}
     *     
     */
    public JAXBElement<GnUser> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<GnUser> value) {
        this.user = value;
    }

}
