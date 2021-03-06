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
 * <p>Java class for InterfaceSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSliceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originRef" type="{http://www.example.org/HashComponent}InterfaceRefType"/>
 *         &lt;element name="visualDescription" type="{http://www.example.org/HashComponent}VisualElementAttributes"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSliceType", propOrder = {
    "originRef",
    "visualDescription"
})
public class InterfaceSliceType {

    @XmlElement(required = true)
    protected InterfaceRefType originRef;
    @XmlElement(required = true)
    protected VisualElementAttributes visualDescription;
    @XmlAttribute(name = "isRef", required = true)
    protected String isRef;

    /**
     * Gets the value of the originRef property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRefType }
     *     
     */
    public InterfaceRefType getOriginRef() {
        return originRef;
    }

    /**
     * Sets the value of the originRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRefType }
     *     
     */
    public void setOriginRef(InterfaceRefType value) {
        this.originRef = value;
    }

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
     * Gets the value of the isRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRef() {
        return isRef;
    }

    /**
     * Sets the value of the isRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRef(String value) {
        this.isRef = value;
    }

}
