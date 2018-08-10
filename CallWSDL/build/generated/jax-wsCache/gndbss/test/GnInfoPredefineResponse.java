
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnInfoPredefineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnInfoPredefineResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoPredefineResponse" type="{urn:gndbss}gnInfoPredefine"/>
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
@XmlType(name = "gnInfoPredefineResponse", propOrder = {
    "infoPredefineResponse",
    "returnCode"
})
public class GnInfoPredefineResponse {

    @XmlElement(required = true)
    protected GnInfoPredefine infoPredefineResponse;
    protected int returnCode;

    /**
     * Gets the value of the infoPredefineResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnInfoPredefine }
     *     
     */
    public GnInfoPredefine getInfoPredefineResponse() {
        return infoPredefineResponse;
    }

    /**
     * Sets the value of the infoPredefineResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnInfoPredefine }
     *     
     */
    public void setInfoPredefineResponse(GnInfoPredefine value) {
        this.infoPredefineResponse = value;
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
