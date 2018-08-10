
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="user" type="{urn:gndbss}gnUser"/>
 *         &lt;element name="children" type="{urn:gndbss}gnUsers"/>
 *         &lt;element name="userToGroups" type="{urn:gndbss}gnUserToGroups"/>
 *         &lt;element name="userToServices" type="{urn:gndbss}gnUserToServices"/>
 *         &lt;element name="userToInfos" type="{urn:gndbss}gnUserToInfos"/>
 *         &lt;element name="utsToAreas" type="{urn:gndbss}gnUtsToAreas"/>
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
    "user",
    "children",
    "userToGroups",
    "userToServices",
    "userToInfos",
    "utsToAreas"
})
@XmlRootElement(name = "gnuAddUser")
public class GnuAddUser {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElement(required = true)
    protected GnUser user;
    @XmlElement(required = true)
    protected GnUsers children;
    @XmlElement(required = true)
    protected GnUserToGroups userToGroups;
    @XmlElement(required = true)
    protected GnUserToServices userToServices;
    @XmlElement(required = true)
    protected GnUserToInfos userToInfos;
    @XmlElement(required = true)
    protected GnUtsToAreas utsToAreas;

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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link GnUser }
     *     
     */
    public GnUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUser }
     *     
     */
    public void setUser(GnUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link GnUsers }
     *     
     */
    public GnUsers getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUsers }
     *     
     */
    public void setChildren(GnUsers value) {
        this.children = value;
    }

    /**
     * Gets the value of the userToGroups property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToGroups }
     *     
     */
    public GnUserToGroups getUserToGroups() {
        return userToGroups;
    }

    /**
     * Sets the value of the userToGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToGroups }
     *     
     */
    public void setUserToGroups(GnUserToGroups value) {
        this.userToGroups = value;
    }

    /**
     * Gets the value of the userToServices property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToServices }
     *     
     */
    public GnUserToServices getUserToServices() {
        return userToServices;
    }

    /**
     * Sets the value of the userToServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToServices }
     *     
     */
    public void setUserToServices(GnUserToServices value) {
        this.userToServices = value;
    }

    /**
     * Gets the value of the userToInfos property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToInfos }
     *     
     */
    public GnUserToInfos getUserToInfos() {
        return userToInfos;
    }

    /**
     * Sets the value of the userToInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToInfos }
     *     
     */
    public void setUserToInfos(GnUserToInfos value) {
        this.userToInfos = value;
    }

    /**
     * Gets the value of the utsToAreas property.
     * 
     * @return
     *     possible object is
     *     {@link GnUtsToAreas }
     *     
     */
    public GnUtsToAreas getUtsToAreas() {
        return utsToAreas;
    }

    /**
     * Sets the value of the utsToAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUtsToAreas }
     *     
     */
    public void setUtsToAreas(GnUtsToAreas value) {
        this.utsToAreas = value;
    }

}
