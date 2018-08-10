
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnuCaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnuCaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caster" type="{urn:gndbss}gnCaster"/>
 *         &lt;element name="streams" type="{urn:gndbss}gnStreams"/>
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
@XmlType(name = "gnuCaster", propOrder = {
    "caster",
    "streams",
    "selectedStreams"
})
public class GnuCaster {

    @XmlElement(required = true)
    protected GnCaster caster;
    @XmlElement(required = true)
    protected GnStreams streams;
    @XmlElement(required = true)
    protected GnStreams selectedStreams;

    /**
     * Gets the value of the caster property.
     * 
     * @return
     *     possible object is
     *     {@link GnCaster }
     *     
     */
    public GnCaster getCaster() {
        return caster;
    }

    /**
     * Sets the value of the caster property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnCaster }
     *     
     */
    public void setCaster(GnCaster value) {
        this.caster = value;
    }

    /**
     * Gets the value of the streams property.
     * 
     * @return
     *     possible object is
     *     {@link GnStreams }
     *     
     */
    public GnStreams getStreams() {
        return streams;
    }

    /**
     * Sets the value of the streams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnStreams }
     *     
     */
    public void setStreams(GnStreams value) {
        this.streams = value;
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
