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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumerableUnitSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumerableUnitSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/HashComponent}EnumerableType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="splitReplica" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumerableUnitSliceType")
public class EnumerableUnitSliceType
    extends EnumerableType
{

    @XmlAttribute(name = "uRef", required = true)
    protected String uRef;
    @XmlAttribute(name = "cRef")
    protected String cRef;
    @XmlAttribute(name = "sRef")
    protected String sRef;
    @XmlAttribute(name = "splitReplica")
    protected Integer splitReplica;

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
     * Gets the value of the cRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRef() {
        return cRef;
    }

    /**
     * Sets the value of the cRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRef(String value) {
        this.cRef = value;
    }

    /**
     * Gets the value of the sRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRef() {
        return sRef;
    }

    /**
     * Sets the value of the sRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRef(String value) {
        this.sRef = value;
    }

    /**
     * Gets the value of the splitReplica property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplitReplica() {
        return splitReplica;
    }

    /**
     * Sets the value of the splitReplica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplitReplica(Integer value) {
        this.splitReplica = value;
    }

}
