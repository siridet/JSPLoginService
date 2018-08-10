
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="groupToServicesDirect" type="{urn:gndbss}gnGroupToServices"/>
 *         &lt;element name="groupToServicesIndirect" type="{urn:gndbss}gnGroupToServices"/>
 *         &lt;element name="userToServicesDirect" type="{urn:gndbss}gnUserToServices"/>
 *         &lt;element name="userToServicesIndirect" type="{urn:gndbss}gnUserToServices"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "groupToServicesDirect",
    "groupToServicesIndirect",
    "userToServicesDirect",
    "userToServicesIndirect",
    "returnCode"
})
@XmlRootElement(name = "gnUserPermissions")
public class GnUserPermissions {

    @XmlElement(required = true)
    protected GnGroupToServices groupToServicesDirect;
    @XmlElement(required = true)
    protected GnGroupToServices groupToServicesIndirect;
    @XmlElement(required = true)
    protected GnUserToServices userToServicesDirect;
    @XmlElement(required = true)
    protected GnUserToServices userToServicesIndirect;
    protected int returnCode;

    /**
     * Gets the value of the groupToServicesDirect property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroupToServices }
     *     
     */
    public GnGroupToServices getGroupToServicesDirect() {
        return groupToServicesDirect;
    }

    /**
     * Sets the value of the groupToServicesDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroupToServices }
     *     
     */
    public void setGroupToServicesDirect(GnGroupToServices value) {
        this.groupToServicesDirect = value;
    }

    /**
     * Gets the value of the groupToServicesIndirect property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroupToServices }
     *     
     */
    public GnGroupToServices getGroupToServicesIndirect() {
        return groupToServicesIndirect;
    }

    /**
     * Sets the value of the groupToServicesIndirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroupToServices }
     *     
     */
    public void setGroupToServicesIndirect(GnGroupToServices value) {
        this.groupToServicesIndirect = value;
    }

    /**
     * Gets the value of the userToServicesDirect property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToServices }
     *     
     */
    public GnUserToServices getUserToServicesDirect() {
        return userToServicesDirect;
    }

    /**
     * Sets the value of the userToServicesDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToServices }
     *     
     */
    public void setUserToServicesDirect(GnUserToServices value) {
        this.userToServicesDirect = value;
    }

    /**
     * Gets the value of the userToServicesIndirect property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToServices }
     *     
     */
    public GnUserToServices getUserToServicesIndirect() {
        return userToServicesIndirect;
    }

    /**
     * Sets the value of the userToServicesIndirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToServices }
     *     
     */
    public void setUserToServicesIndirect(GnUserToServices value) {
        this.userToServicesIndirect = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

}
