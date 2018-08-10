
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnTablesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnTablesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tablesResponse" type="{urn:gndbss}gnTables"/>
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
@XmlType(name = "gnTablesResponse", propOrder = {
    "tablesResponse",
    "returnCode"
})
public class GnTablesResponse {

    @XmlElement(required = true)
    protected GnTables tablesResponse;
    protected int returnCode;

    /**
     * Gets the value of the tablesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnTables }
     *     
     */
    public GnTables getTablesResponse() {
        return tablesResponse;
    }

    /**
     * Sets the value of the tablesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnTables }
     *     
     */
    public void setTablesResponse(GnTables value) {
        this.tablesResponse = value;
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
