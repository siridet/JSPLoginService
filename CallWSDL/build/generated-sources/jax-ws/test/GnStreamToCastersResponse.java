
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnStreamToCastersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnStreamToCastersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streamToCastersResponse" type="{urn:gndbss}gnStreamToCasters"/>
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
@XmlType(name = "gnStreamToCastersResponse", propOrder = {
    "streamToCastersResponse",
    "returnCode"
})
public class GnStreamToCastersResponse {

    @XmlElement(required = true)
    protected GnStreamToCasters streamToCastersResponse;
    protected int returnCode;

    /**
     * Gets the value of the streamToCastersResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnStreamToCasters }
     *     
     */
    public GnStreamToCasters getStreamToCastersResponse() {
        return streamToCastersResponse;
    }

    /**
     * Sets the value of the streamToCastersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnStreamToCasters }
     *     
     */
    public void setStreamToCastersResponse(GnStreamToCasters value) {
        this.streamToCastersResponse = value;
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
