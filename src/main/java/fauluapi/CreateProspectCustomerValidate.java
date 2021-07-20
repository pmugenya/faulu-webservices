
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateProspectCustomer_Validate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateProspectCustomer_Validate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/RensoftBancassure}webRequestCommon"/>
 *         &lt;element name="OfsFunction" type="{http://temenos.com/RensoftBancassure}ofsFunction"/>
 *         &lt;element name="CUSTOMERFKLBANCPROSPType" type="{http://temenos.com/CUSTOMERFKLBANCPROSP}CUSTOMERFKLBANCPROSPType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateProspectCustomer_Validate", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "customerfklbancprospType"
})
public class CreateProspectCustomerValidate {

    @XmlElement(name = "WebRequestCommon", namespace = "", required = true)
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction", namespace = "", required = true)
    protected OfsFunction ofsFunction;
    @XmlElement(name = "CUSTOMERFKLBANCPROSPType", namespace = "", required = true)
    protected CUSTOMERFKLBANCPROSPType customerfklbancprospType;

    /**
     * Gets the value of the webRequestCommon property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Sets the value of the webRequestCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Gets the value of the ofsFunction property.
     * 
     * @return
     *     possible object is
     *     {@link OfsFunction }
     *     
     */
    public OfsFunction getOfsFunction() {
        return ofsFunction;
    }

    /**
     * Sets the value of the ofsFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfsFunction }
     *     
     */
    public void setOfsFunction(OfsFunction value) {
        this.ofsFunction = value;
    }

    /**
     * Gets the value of the customerfklbancprospType property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERFKLBANCPROSPType }
     *     
     */
    public CUSTOMERFKLBANCPROSPType getCUSTOMERFKLBANCPROSPType() {
        return customerfklbancprospType;
    }

    /**
     * Sets the value of the customerfklbancprospType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERFKLBANCPROSPType }
     *     
     */
    public void setCUSTOMERFKLBANCPROSPType(CUSTOMERFKLBANCPROSPType value) {
        this.customerfklbancprospType = value;
    }

}
