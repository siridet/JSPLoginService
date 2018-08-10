
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
 *         &lt;element name="areaResponse" type="{urn:gndbss}gnArea"/>
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
    "areaResponse",
    "returnCode"
})
@XmlRootElement(name = "gnAreaResponse")
public class GnAreaResponse {

    @XmlElement(required = true)
    protected GnArea areaResponse;
    protected int returnCode;

    /**
     * Gets the value of the areaResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnArea }
     *     
     */
    public GnArea getAreaResponse() {
        return areaResponse;
    }

    /**
     * Sets the value of the areaResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnArea }
     *     
     */
    public void setAreaResponse(GnArea value) {
        this.areaResponse = value;
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
