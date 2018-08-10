
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnUtsToArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnUtsToArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uts-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="area-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnUtsToArea", propOrder = {
    "utsId",
    "areaId"
})
public class GnUtsToArea {

    @XmlElement(name = "uts-id")
    protected long utsId;
    @XmlElement(name = "area-id")
    protected long areaId;

    /**
     * Gets the value of the utsId property.
     * 
     */
    public long getUtsId() {
        return utsId;
    }

    /**
     * Sets the value of the utsId property.
     * 
     */
    public void setUtsId(long value) {
        this.utsId = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     */
    public long getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     */
    public void setAreaId(long value) {
        this.areaId = value;
    }

}
