
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnuStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnuStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stream" type="{urn:gndbss}gnStream"/>
 *         &lt;element name="casters" type="{urn:gndbss}gnCasters"/>
 *         &lt;element name="selectedCasters" type="{urn:gndbss}gnCasters"/>
 *         &lt;element name="selectedStreams" type="{urn:gndbss}gnStreams"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnuStream", propOrder = {
    "stream",
    "casters",
    "selectedCasters",
    "selectedStreams"
})
public class GnuStream {

    @XmlElement(required = true)
    protected GnStream stream;
    @XmlElement(required = true)
    protected GnCasters casters;
    @XmlElement(required = true)
    protected GnCasters selectedCasters;
    @XmlElement(required = true)
    protected GnStreams selectedStreams;

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     {@link GnStream }
     *     
     */
    public GnStream getStream() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnStream }
     *     
     */
    public void setStream(GnStream value) {
        this.stream = value;
    }

    /**
     * Gets the value of the casters property.
     * 
     * @return
     *     possible object is
     *     {@link GnCasters }
     *     
     */
    public GnCasters getCasters() {
        return casters;
    }

    /**
     * Sets the value of the casters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnCasters }
     *     
     */
    public void setCasters(GnCasters value) {
        this.casters = value;
    }

    /**
     * Gets the value of the selectedCasters property.
     * 
     * @return
     *     possible object is
     *     {@link GnCasters }
     *     
     */
    public GnCasters getSelectedCasters() {
        return selectedCasters;
    }

    /**
     * Sets the value of the selectedCasters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnCasters }
     *     
     */
    public void setSelectedCasters(GnCasters value) {
        this.selectedCasters = value;
    }

    /**
     * Gets the value of the selectedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link GnStreams }
     *     
     */
    public GnStreams getSelectedStreams() {
        return selectedStreams;
    }

    /**
     * Sets the value of the selectedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnStreams }
     *     
     */
    public void setSelectedStreams(GnStreams value) {
        this.selectedStreams = value;
    }

}
