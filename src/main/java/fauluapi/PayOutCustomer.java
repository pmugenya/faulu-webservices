
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayOutCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayOutCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/RensoftBancassure}webRequestCommon"/>
 *         &lt;element name="OfsFunction" type="{http://temenos.com/RensoftBancassure}ofsFunction"/>
 *         &lt;element name="FUNDSTRANSFERFKLBANCPAYOUTType" type="{http://temenos.com/FUNDSTRANSFERFKLBANCPAYOUT}FUNDSTRANSFERFKLBANCPAYOUTType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayOutCustomer", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "fundstransferfklbancpayoutType"
})
public class PayOutCustomer {

    @XmlElement(name = "WebRequestCommon", namespace = "", required = true)
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction", namespace = "", required = true)
    protected OfsFunction ofsFunction;
    @XmlElement(name = "FUNDSTRANSFERFKLBANCPAYOUTType", namespace = "", required = true)
    protected FUNDSTRANSFERFKLBANCPAYOUTType fundstransferfklbancpayoutType;

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
     * Gets the value of the fundstransferfklbancpayoutType property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERFKLBANCPAYOUTType }
     *     
     */
    public FUNDSTRANSFERFKLBANCPAYOUTType getFUNDSTRANSFERFKLBANCPAYOUTType() {
        return fundstransferfklbancpayoutType;
    }

    /**
     * Sets the value of the fundstransferfklbancpayoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERFKLBANCPAYOUTType }
     *     
     */
    public void setFUNDSTRANSFERFKLBANCPAYOUTType(FUNDSTRANSFERFKLBANCPAYOUTType value) {
        this.fundstransferfklbancpayoutType = value;
    }

}
