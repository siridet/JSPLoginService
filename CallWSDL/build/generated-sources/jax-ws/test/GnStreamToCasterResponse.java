
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnStreamToCasterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnStreamToCasterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streamToCasterResponse" type="{urn:gndbss}gnStreamToCaster"/>
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
@XmlType(name = "gnStreamToCasterResponse", propOrder = {
    "streamToCasterResponse",
    "returnCode"
})
public class GnStreamToCasterResponse {

    @XmlElement(required = true)
    protected GnStreamToCaster streamToCasterResponse;
    protected int returnCode;

    /**
     * Gets the value of the streamToCasterResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnStreamToCaster }
     *     
     */
    public GnStreamToCaster getStreamToCasterResponse() {
        return streamToCasterResponse;
    }

    /**
     * Sets the value of the streamToCasterResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnStreamToCaster }
     *     
     */
    public void setStreamToCasterResponse(GnStreamToCaster value) {
        this.streamToCasterResponse = value;
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
