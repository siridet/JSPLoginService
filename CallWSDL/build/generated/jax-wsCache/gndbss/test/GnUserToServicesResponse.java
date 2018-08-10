
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
 *         &lt;element name="userToServicesResponse" type="{urn:gndbss}gnUserToServices"/>
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
    "userToServicesResponse",
    "returnCode"
})
@XmlRootElement(name = "gnUserToServicesResponse")
public class GnUserToServicesResponse {

    @XmlElement(required = true)
    protected GnUserToServices userToServicesResponse;
    protected int returnCode;

    /**
     * Gets the value of the userToServicesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToServices }
     *     
     */
    public GnUserToServices getUserToServicesResponse() {
        return userToServicesResponse;
    }

    /**
     * Sets the value of the userToServicesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToServices }
     *     
     */
    public void setUserToServicesResponse(GnUserToServices value) {
        this.userToServicesResponse = value;
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
