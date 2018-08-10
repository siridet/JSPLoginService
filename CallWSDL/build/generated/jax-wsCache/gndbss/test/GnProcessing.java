
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnProcessing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnProcessing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="exportData" type="{urn:gndbss}gnExportConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnProcessing", propOrder = {
    "processingType",
    "jobId",
    "exportData"
})
public class GnProcessing {

    protected int processingType;
    protected long jobId;
    @XmlElementRef(name = "exportData", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnExportConfiguration> exportData;

    /**
     * Gets the value of the processingType property.
     * 
     */
    public int getProcessingType() {
        return processingType;
    }

    /**
     * Sets the value of the processingType property.
     * 
     */
    public void setProcessingType(int value) {
        this.processingType = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the exportData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnExportConfiguration }{@code >}
     *     
     */
    public JAXBElement<GnExportConfiguration> getExportData() {
        return exportData;
    }

    /**
     * Sets the value of the exportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnExportConfiguration }{@code >}
     *     
     */
    public void setExportData(JAXBElement<GnExportConfiguration> value) {
        this.exportData = value;
    }

}
