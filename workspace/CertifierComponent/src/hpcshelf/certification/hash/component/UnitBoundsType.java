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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitBoundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitBoundsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visualDescription" type="{http://www.example.org/HashComponent}VisualElementAttributes"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parallel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="slice_replica" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="unit_replica" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="replica" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitBoundsType", propOrder = {
    "visualDescription"
})
public class UnitBoundsType {

    @XmlElement(required = true)
    protected VisualElementAttributes visualDescription;
    @XmlAttribute(name = "uRef")
    protected String uRef;
    @XmlAttribute(name = "parallel")
    protected Boolean parallel;
    @XmlAttribute(name = "slice_replica")
    protected Integer sliceReplica;
    @XmlAttribute(name = "unit_replica")
    protected Integer unitReplica;
    @XmlAttribute(name = "replica")
    @XmlSchemaType(name = "unsignedInt")
    protected Long replica;

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
     * Gets the value of the uRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURef() {
        return uRef;
    }

    /**
     * Sets the value of the uRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURef(String value) {
        this.uRef = value;
    }

    /**
     * Gets the value of the parallel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallel() {
        return parallel;
    }

    /**
     * Sets the value of the parallel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallel(Boolean value) {
        this.parallel = value;
    }

    /**
     * Gets the value of the sliceReplica property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSliceReplica() {
        if (sliceReplica == null) {
            return  0;
        } else {
            return sliceReplica;
        }
    }

    /**
     * Sets the value of the sliceReplica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSliceReplica(Integer value) {
        this.sliceReplica = value;
    }

    /**
     * Gets the value of the unitReplica property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getUnitReplica() {
        if (unitReplica == null) {
            return  0;
        } else {
            return unitReplica;
        }
    }

    /**
     * Sets the value of the unitReplica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitReplica(Integer value) {
        this.unitReplica = value;
    }

    /**
     * Gets the value of the replica property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getReplica() {
        if (replica == null) {
            return  0L;
        } else {
            return replica;
        }
    }

    /**
     * Sets the value of the replica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplica(Long value) {
        this.replica = value;
    }

}