
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnGtsToArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnGtsToArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gts-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "gnGtsToArea", propOrder = {
    "gtsId",
    "areaId"
})
public class GnGtsToArea {

    @XmlElement(name = "gts-id")
    protected long gtsId;
    @XmlElement(name = "area-id")
    protected long areaId;

    /**
     * Gets the value of the gtsId property.
     * 
     */
    public long getGtsId() {
        return gtsId;
    }

    /**
     * Sets the value of the gtsId property.
     * 
     */
    public void setGtsId(long value) {
        this.gtsId = value;
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
