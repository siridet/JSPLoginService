
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnUserToGroupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnUserToGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userToGroupResponse" type="{urn:gndbss}gnUserToGroup"/>
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
@XmlType(name = "gnUserToGroupResponse", propOrder = {
    "userToGroupResponse",
    "returnCode"
})
public class GnUserToGroupResponse {

    @XmlElement(required = true)
    protected GnUserToGroup userToGroupResponse;
    protected int returnCode;

    /**
     * Gets the value of the userToGroupResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToGroup }
     *     
     */
    public GnUserToGroup getUserToGroupResponse() {
        return userToGroupResponse;
    }

    /**
     * Sets the value of the userToGroupResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToGroup }
     *     
     */
    public void setUserToGroupResponse(GnUserToGroup value) {
        this.userToGroupResponse = value;
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
