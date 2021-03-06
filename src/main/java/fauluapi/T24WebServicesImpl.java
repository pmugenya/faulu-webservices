
package fauluapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "T24WebServicesImpl", targetNamespace = "http://temenos.com/RensoftBancassure")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface T24WebServicesImpl {


    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.PayOutCustomerValidateResponse
     */
    @WebMethod(operationName = "PayOutCustomer_Validate")
    @WebResult(name = "PayOutCustomer_ValidateResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/PayOutCustomer_ValidateRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/PayOutCustomer_ValidateResponse")
    public PayOutCustomerValidateResponse payOutCustomerValidate(
            @WebParam(name = "PayOutCustomer_Validate", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    PayOutCustomerValidate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.CreateProspectCustomerValidateResponse
     */
    @WebMethod(operationName = "CreateProspectCustomer_Validate")
    @WebResult(name = "CreateProspectCustomer_ValidateResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/CreateProspectCustomer_ValidateRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/CreateProspectCustomer_ValidateResponse")
    public CreateProspectCustomerValidateResponse createProspectCustomerValidate(
            @WebParam(name = "CreateProspectCustomer_Validate", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    CreateProspectCustomerValidate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.CreateProspectCustomerResponse
     */
    @WebMethod(operationName = "CreateProspectCustomer")
    @WebResult(name = "CreateProspectCustomerResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/CreateProspectCustomerRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/CreateProspectCustomerResponse")
    public CreateProspectCustomerResponse createProspectCustomer(
            @WebParam(name = "CreateProspectCustomer", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    CreateProspectCustomer parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.PayOutCustomerResponse
     */
    @WebMethod(operationName = "PayOutCustomer")
    @WebResult(name = "PayOutCustomerResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/PayOutCustomerRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/PayOutCustomerResponse")
    public PayOutCustomerResponse payOutCustomer(
            @WebParam(name = "PayOutCustomer", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    PayOutCustomer parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.GetCustomerAccountsResponse
     */
    @WebMethod(operationName = "GetCustomerAccounts")
    @WebResult(name = "GetCustomerAccountsResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/GetCustomerAccountsRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/GetCustomerAccountsResponse")
    public GetCustomerAccountsResponse getCustomerAccounts(
            @WebParam(name = "GetCustomerAccounts", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    GetCustomerAccounts parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fauluapi.GetCustomerInfoResponse
     */
    @WebMethod(operationName = "GetCustomerInfo")
    @WebResult(name = "GetCustomerInfoResponse", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
    @Action(input = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/GetCustomerInfoRequest", output = "http://temenos.com/RensoftBancassure/T24WebServicesImpl/GetCustomerInfoResponse")
    public GetCustomerInfoResponse getCustomerInfo(
            @WebParam(name = "GetCustomerInfo", targetNamespace = "http://temenos.com/RensoftBancassure", partName = "parameters")
                    GetCustomerInfo parameters);

}
