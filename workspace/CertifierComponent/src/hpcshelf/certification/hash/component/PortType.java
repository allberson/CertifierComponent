//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.06 at 12:26:07 AM BRT 
//


package hpcshelf.certification.hash.component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visualDescription" type="{http://www.example.org/HashComponent}VisualElementAttributes"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exposed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortType", propOrder = {
    "visualDescription"
})
public class PortType {

    @XmlElement(required = true)
    protected VisualElementAttributes visualDescription;
    @XmlAttribute(name = "pRef")
    protected String pRef;
    @XmlAttribute(name = "exposed")
    protected Boolean exposed;

    /**
     * Gets the value of the visualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VisualElementAttributes }
     *     
     */
    public VisualElementAttributes getVisualDescription() {
        return visualDescription;
    }

    /**
     * Sets the value of the visualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualElementAttributes }
     *     
     */
    public void setVisualDescription(VisualElementAttributes value) {
        this.visualDescription = value;
    }

    /**
     * Gets the value of the pRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRef() {
        return pRef;
    }

    /**
     * Sets the value of the pRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRef(String value) {
        this.pRef = value;
    }

    /**
     * Gets the value of the exposed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExposed() {
        return exposed;
    }

    /**
     * Sets the value of the exposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExposed(Boolean value) {
        this.exposed = value;
    }

}