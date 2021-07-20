
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/RensoftBancassure}webRequestCommon"/>
 *         &lt;element name="EWSBANCASSURECUSTINFOType" type="{http://temenos.com/RensoftBancassure}enquiryInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerInfo", propOrder = {
    "webRequestCommon",
    "ewsbancassurecustinfoType"
})
public class GetCustomerInfo {

    @XmlElement(name = "WebRequestCommon", namespace = "", required = true)
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "EWSBANCASSURECUSTINFOType", namespace = "", required = true)
    protected EnquiryInput ewsbancassurecustinfoType;

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
     * Gets the value of the ewsbancassurecustinfoType property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getEWSBANCASSURECUSTINFOType() {
        return ewsbancassurecustinfoType;
    }

    /**
     * Sets the value of the ewsbancassurecustinfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setEWSBANCASSURECUSTINFOType(EnquiryInput value) {
        this.ewsbancassurecustinfoType = value;
    }

}
