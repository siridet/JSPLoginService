
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnUserTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnUserTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userTypeResponse" type="{urn:gndbss}gnUserType"/>
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
@XmlType(name = "gnUserTypeResponse", propOrder = {
    "userTypeResponse",
    "returnCode"
})
public class GnUserTypeResponse {

    @XmlElement(required = true)
    protected GnUserType userTypeResponse;
    protected int returnCode;

    /**
     * Gets the value of the userTypeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserType }
     *     
     */
    public GnUserType getUserTypeResponse() {
        return userTypeResponse;
    }

    /**
     * Sets the value of the userTypeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserType }
     *     
     */
    public void setUserTypeResponse(GnUserType value) {
        this.userTypeResponse = value;
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
