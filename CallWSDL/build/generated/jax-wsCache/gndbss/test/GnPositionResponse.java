
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnPositionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnPositionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumberResponse" type="{urn:gndbss}gnPosition"/>
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
@XmlType(name = "gnPositionResponse", propOrder = {
    "phoneNumberResponse",
    "returnCode"
})
public class GnPositionResponse {

    @XmlElement(required = true)
    protected GnPosition phoneNumberResponse;
    protected int returnCode;

    /**
     * Gets the value of the phoneNumberResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnPosition }
     *     
     */
    public GnPosition getPhoneNumberResponse() {
        return phoneNumberResponse;
    }

    /**
     * Sets the value of the phoneNumberResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnPosition }
     *     
     */
    public void setPhoneNumberResponse(GnPosition value) {
        this.phoneNumberResponse = value;
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
