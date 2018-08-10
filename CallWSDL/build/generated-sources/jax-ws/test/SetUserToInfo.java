
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
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="infoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userToInfo" type="{urn:gndbss}gnUserToInfo" minOccurs="0"/>
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
    "userId",
    "infoId",
    "userToInfo"
})
@XmlRootElement(name = "setUserToInfo")
public class SetUserToInfo {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    protected long userId;
    protected long infoId;
    @XmlElementRef(name = "userToInfo", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnUserToInfo> userToInfo;

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
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the infoId property.
     * 
     */
    public long getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     */
    public void setInfoId(long value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the userToInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnUserToInfo }{@code >}
     *     
     */
    public JAXBElement<GnUserToInfo> getUserToInfo() {
        return userToInfo;
    }

    /**
     * Sets the value of the userToInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnUserToInfo }{@code >}
     *     
     */
    public void setUserToInfo(JAXBElement<GnUserToInfo> value) {
        this.userToInfo = value;
    }

}
