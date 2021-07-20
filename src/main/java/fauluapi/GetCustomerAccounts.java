
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/RensoftBancassure}webRequestCommon"/>
 *         &lt;element name="EWSBANCASSUREACCOUNTINFOType" type="{http://temenos.com/RensoftBancassure}enquiryInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerAccounts", propOrder = {
    "webRequestCommon",
    "ewsbancassureaccountinfoType"
})
public class GetCustomerAccounts {

    @XmlElement(name = "WebRequestCommon", namespace = "", required = true)
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "EWSBANCASSUREACCOUNTINFOType", namespace = "", required = true)
    protected EnquiryInput ewsbancassureaccountinfoType;

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
     * Gets the value of the ewsbancassureaccountinfoType property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getEWSBANCASSUREACCOUNTINFOType() {
        return ewsbancassureaccountinfoType;
    }

    /**
     * Sets the value of the ewsbancassureaccountinfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setEWSBANCASSUREACCOUNTINFOType(EnquiryInput value) {
        this.ewsbancassureaccountinfoType = value;
    }

}
