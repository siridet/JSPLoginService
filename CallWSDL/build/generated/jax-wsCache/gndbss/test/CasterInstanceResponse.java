
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for casterInstanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="casterInstanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="casterInstanceResponse" type="{urn:gndbss}casterInstance"/>
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
@XmlType(name = "casterInstanceResponse", propOrder = {
    "casterInstanceResponse",
    "returnCode"
})
public class CasterInstanceResponse {

    @XmlElement(required = true)
    protected CasterInstance casterInstanceResponse;
    protected int returnCode;

    /**
     * Gets the value of the casterInstanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CasterInstance }
     *     
     */
    public CasterInstance getCasterInstanceResponse() {
        return casterInstanceResponse;
    }

    /**
     * Sets the value of the casterInstanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasterInstance }
     *     
     */
    public void setCasterInstanceResponse(CasterInstance value) {
        this.casterInstanceResponse = value;
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
