
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
 *         &lt;element name="utsToAreasResponse" type="{urn:gndbss}gnUtsToAreas"/>
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
    "utsToAreasResponse",
    "returnCode"
})
@XmlRootElement(name = "gnUtsToAreasResponse")
public class GnUtsToAreasResponse {

    @XmlElement(required = true)
    protected GnUtsToAreas utsToAreasResponse;
    protected int returnCode;

    /**
     * Gets the value of the utsToAreasResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnUtsToAreas }
     *     
     */
    public GnUtsToAreas getUtsToAreasResponse() {
        return utsToAreasResponse;
    }

    /**
     * Sets the value of the utsToAreasResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUtsToAreas }
     *     
     */
    public void setUtsToAreasResponse(GnUtsToAreas value) {
        this.utsToAreasResponse = value;
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
