
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
 *         &lt;element name="gtsToAreasResponse" type="{urn:gndbss}gnGtsToAreas"/>
 *         &lt;element name="additional" type="{urn:gndbss}gnAdditional"/>
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
    "gtsToAreasResponse",
    "additional",
    "returnCode"
})
@XmlRootElement(name = "gnGtsToAreasAdditionalResponse")
public class GnGtsToAreasAdditionalResponse {

    @XmlElement(required = true)
    protected GnGtsToAreas gtsToAreasResponse;
    @XmlElement(required = true)
    protected GnAdditional additional;
    protected int returnCode;

    /**
     * Gets the value of the gtsToAreasResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnGtsToAreas }
     *     
     */
    public GnGtsToAreas getGtsToAreasResponse() {
        return gtsToAreasResponse;
    }

    /**
     * Sets the value of the gtsToAreasResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGtsToAreas }
     *     
     */
    public void setGtsToAreasResponse(GnGtsToAreas value) {
        this.gtsToAreasResponse = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link GnAdditional }
     *     
     */
    public GnAdditional getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnAdditional }
     *     
     */
    public void setAdditional(GnAdditional value) {
        this.additional = value;
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
