
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnStreamToCaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnStreamToCaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stream-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="caster-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnStreamToCaster", propOrder = {
    "streamId",
    "casterId"
})
public class GnStreamToCaster {

    @XmlElement(name = "stream-id")
    protected long streamId;
    @XmlElement(name = "caster-id")
    protected long casterId;

    /**
     * Gets the value of the streamId property.
     * 
     */
    public long getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     */
    public void setStreamId(long value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the casterId property.
     * 
     */
    public long getCasterId() {
        return casterId;
    }

    /**
     * Sets the value of the casterId property.
     * 
     */
    public void setCasterId(long value) {
        this.casterId = value;
    }

}
