
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
 *         &lt;element name="group" type="{urn:gndbss}gnGroup" minOccurs="0"/>
 *         &lt;element name="users" type="{urn:gndbss}gnUsers" minOccurs="0"/>
 *         &lt;element name="services" type="{urn:gndbss}gnGroupToServices" minOccurs="0"/>
 *         &lt;element name="gtsToAreas" type="{urn:gndbss}gnGtsToAreas" minOccurs="0"/>
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
    "group",
    "users",
    "services",
    "gtsToAreas"
})
@XmlRootElement(name = "gnuSetGroup")
public class GnuSetGroup {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "group", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnGroup> group;
    @XmlElementRef(name = "users", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnUsers> users;
    @XmlElementRef(name = "services", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnGroupToServices> services;
    @XmlElementRef(name = "gtsToAreas", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnGtsToAreas> gtsToAreas;

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
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnGroup }{@code >}
     *     
     */
    public JAXBElement<GnGroup> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnGroup }{@code >}
     *     
     */
    public void setGroup(JAXBElement<GnGroup> value) {
        this.group = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnUsers }{@code >}
     *     
     */
    public JAXBElement<GnUsers> getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnUsers }{@code >}
     *     
     */
    public void setUsers(JAXBElement<GnUsers> value) {
        this.users = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnGroupToServices }{@code >}
     *     
     */
    public JAXBElement<GnGroupToServices> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnGroupToServices }{@code >}
     *     
     */
    public void setServices(JAXBElement<GnGroupToServices> value) {
        this.services = value;
    }

    /**
     * Gets the value of the gtsToAreas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnGtsToAreas }{@code >}
     *     
     */
    public JAXBElement<GnGtsToAreas> getGtsToAreas() {
        return gtsToAreas;
    }

    /**
     * Sets the value of the gtsToAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnGtsToAreas }{@code >}
     *     
     */
    public void setGtsToAreas(JAXBElement<GnGtsToAreas> value) {
        this.gtsToAreas = value;
    }

}
