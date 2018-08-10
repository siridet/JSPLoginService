
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnPositionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumbersResponse" type="{urn:gndbss}gnPositions"/>
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
@XmlType(name = "gnPositionsResponse", propOrder = {
    "phoneNumbersResponse",
    "returnCode"
})
public class GnPositionsResponse {

    @XmlElement(required = true)
    protected GnPositions phoneNumbersResponse;
    protected int returnCode;

    /**
     * Gets the value of the phoneNumbersResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnPositions }
     *     
     */
    public GnPositions getPhoneNumbersResponse() {
        return phoneNumbersResponse;
    }

    /**
     * Sets the value of the phoneNumbersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnPositions }
     *     
     */
    public void setPhoneNumbersResponse(GnPositions value) {
        this.phoneNumbersResponse = value;
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
