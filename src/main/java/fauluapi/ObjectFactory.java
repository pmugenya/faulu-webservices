
package fauluapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fauluapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerAccounts_QNAME = new QName("http://temenos.com/RensoftBancassure", "GetCustomerAccounts");
    private final static QName _PayOutCustomerResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "PayOutCustomerResponse");
    private final static QName _GetCustomerInfoResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "GetCustomerInfoResponse");
    private final static QName _CreateProspectCustomerValidateResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "CreateProspectCustomer_ValidateResponse");
    private final static QName _CreateProspectCustomerValidate_QNAME = new QName("http://temenos.com/RensoftBancassure", "CreateProspectCustomer_Validate");
    private final static QName _CreateProspectCustomerResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "CreateProspectCustomerResponse");
    private final static QName _PayOutCustomerValidate_QNAME = new QName("http://temenos.com/RensoftBancassure", "PayOutCustomer_Validate");
    private final static QName _CreateProspectCustomer_QNAME = new QName("http://temenos.com/RensoftBancassure", "CreateProspectCustomer");
    private final static QName _GetCustomerAccountsResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "GetCustomerAccountsResponse");
    private final static QName _GetCustomerInfo_QNAME = new QName("http://temenos.com/RensoftBancassure", "GetCustomerInfo");
    private final static QName _PayOutCustomer_QNAME = new QName("http://temenos.com/RensoftBancassure", "PayOutCustomer");
    private final static QName _PayOutCustomerValidateResponse_QNAME = new QName("http://temenos.com/RensoftBancassure", "PayOutCustomer_ValidateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fauluapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType }
     * 
     */
    public FUNDSTRANSFERType createFUNDSTRANSFERType() {
        return new FUNDSTRANSFERType();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSMEMNO }
     * 
     */
    public FUNDSTRANSFERType.GINSMEMNO createFUNDSTRANSFERTypeGINSMEMNO() {
        return new FUNDSTRANSFERType.GINSMEMNO();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GREFDATAITEM }
     * 
     */
    public FUNDSTRANSFERType.GREFDATAITEM createFUNDSTRANSFERTypeGREFDATAITEM() {
        return new FUNDSTRANSFERType.GREFDATAITEM();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GMSGTYPE }
     * 
     */
    public FUNDSTRANSFERType.GMSGTYPE createFUNDSTRANSFERTypeGMSGTYPE() {
        return new FUNDSTRANSFERType.GMSGTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSENDTOPARTY }
     * 
     */
    public FUNDSTRANSFERType.GSENDTOPARTY createFUNDSTRANSFERTypeGSENDTOPARTY() {
        return new FUNDSTRANSFERType.GSENDTOPARTY();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY }
     * 
     */
    public FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY createFUNDSTRANSFERTypeGSENDTOPARTYMSENDTOPARTY() {
        return new FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT }
     * 
     */
    public FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT createFUNDSTRANSFERTypeGSENDTOPARTYMSENDTOPARTYSgBKTOBKOUT() {
        return new FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GRELATEDMSG }
     * 
     */
    public FUNDSTRANSFERType.GRELATEDMSG createFUNDSTRANSFERTypeGRELATEDMSG() {
        return new FUNDSTRANSFERType.GRELATEDMSG();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG }
     * 
     */
    public FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG createFUNDSTRANSFERTypeGRELATEDMSGMRELATEDMSG() {
        return new FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND }
     * 
     */
    public FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND createFUNDSTRANSFERTypeGRELATEDMSGMRELATEDMSGSgTIMEIND() {
        return new FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GTAXTYPE }
     * 
     */
    public FUNDSTRANSFERType.GTAXTYPE createFUNDSTRANSFERTypeGTAXTYPE() {
        return new FUNDSTRANSFERType.GTAXTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GCHARGETYPE }
     * 
     */
    public FUNDSTRANSFERType.GCHARGETYPE createFUNDSTRANSFERTypeGCHARGETYPE() {
        return new FUNDSTRANSFERType.GCHARGETYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GCOMMISSIONTYPE }
     * 
     */
    public FUNDSTRANSFERType.GCOMMISSIONTYPE createFUNDSTRANSFERTypeGCOMMISSIONTYPE() {
        return new FUNDSTRANSFERType.GCOMMISSIONTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERFKLBANCPAYOUTType }
     * 
     */
    public FUNDSTRANSFERFKLBANCPAYOUTType createFUNDSTRANSFERFKLBANCPAYOUTType() {
        return new FUNDSTRANSFERFKLBANCPAYOUTType();
    }

    /**
     * Create an instance of {@link EWSBANCASSUREACCOUNTINFOType }
     * 
     */
    public EWSBANCASSUREACCOUNTINFOType createEWSBANCASSUREACCOUNTINFOType() {
        return new EWSBANCASSUREACCOUNTINFOType();
    }

    /**
     * Create an instance of {@link EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType }
     * 
     */
    public EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType createEWSBANCASSUREACCOUNTINFOTypeGEWSBANCASSUREACCOUNTINFODetailType() {
        return new EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType();
    }

    /**
     * Create an instance of {@link EWSBANCASSURECUSTINFOType }
     * 
     */
    public EWSBANCASSURECUSTINFOType createEWSBANCASSURECUSTINFOType() {
        return new EWSBANCASSURECUSTINFOType();
    }

    /**
     * Create an instance of {@link EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType }
     * 
     */
    public EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType createEWSBANCASSURECUSTINFOTypeGEWSBANCASSURECUSTINFODetailType() {
        return new EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType();
    }

    /**
     * Create an instance of {@link CUSTOMERType }
     * 
     */
    public CUSTOMERType createCUSTOMERType() {
        return new CUSTOMERType();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GDOCNUMBER }
     * 
     */
    public CUSTOMERType.GDOCNUMBER createCUSTOMERTypeGDOCNUMBER() {
        return new CUSTOMERType.GDOCNUMBER();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GNMESTAHLDR }
     * 
     */
    public CUSTOMERType.GNMESTAHLDR createCUSTOMERTypeGNMESTAHLDR() {
        return new CUSTOMERType.GNMESTAHLDR();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCARDISSUED }
     * 
     */
    public CUSTOMERType.GCARDISSUED createCUSTOMERTypeGCARDISSUED() {
        return new CUSTOMERType.GCARDISSUED();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GAFYABENNAME }
     * 
     */
    public CUSTOMERType.GAFYABENNAME createCUSTOMERTypeGAFYABENNAME() {
        return new CUSTOMERType.GAFYABENNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GGROUP }
     * 
     */
    public CUSTOMERType.GGROUP createCUSTOMERTypeGGROUP() {
        return new CUSTOMERType.GGROUP();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GBUSNAME }
     * 
     */
    public CUSTOMERType.GBUSNAME createCUSTOMERTypeGBUSNAME() {
        return new CUSTOMERType.GBUSNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GINSMEMNO }
     * 
     */
    public CUSTOMERType.GINSMEMNO createCUSTOMERTypeGINSMEMNO() {
        return new CUSTOMERType.GINSMEMNO();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPLACESTUDY }
     * 
     */
    public CUSTOMERType.GPLACESTUDY createCUSTOMERTypeGPLACESTUDY() {
        return new CUSTOMERType.GPLACESTUDY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GALTERIDTYPE }
     * 
     */
    public CUSTOMERType.GALTERIDTYPE createCUSTOMERTypeGALTERIDTYPE() {
        return new CUSTOMERType.GALTERIDTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCONTACTNAME }
     * 
     */
    public CUSTOMERType.GCONTACTNAME createCUSTOMERTypeGCONTACTNAME() {
        return new CUSTOMERType.GCONTACTNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSIGNATORYCODE }
     * 
     */
    public CUSTOMERType.GSIGNATORYCODE createCUSTOMERTypeGSIGNATORYCODE() {
        return new CUSTOMERType.GSIGNATORYCODE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPARTNERS }
     * 
     */
    public CUSTOMERType.GPARTNERS createCUSTOMERTypeGPARTNERS() {
        return new CUSTOMERType.GPARTNERS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSIGNNAME }
     * 
     */
    public CUSTOMERType.GSIGNNAME createCUSTOMERTypeGSIGNNAME() {
        return new CUSTOMERType.GSIGNNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GAUDITORNAME }
     * 
     */
    public CUSTOMERType.GAUDITORNAME createCUSTOMERTypeGAUDITORNAME() {
        return new CUSTOMERType.GAUDITORNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHERACCTS }
     * 
     */
    public CUSTOMERType.GOTHERACCTS createCUSTOMERTypeGOTHERACCTS() {
        return new CUSTOMERType.GOTHERACCTS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GREFDATAITEM }
     * 
     */
    public CUSTOMERType.GREFDATAITEM createCUSTOMERTypeGREFDATAITEM() {
        return new CUSTOMERType.GREFDATAITEM();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCRUSERPROFILETY }
     * 
     */
    public CUSTOMERType.GCRUSERPROFILETY createCUSTOMERTypeGCRUSERPROFILETY() {
        return new CUSTOMERType.GCRUSERPROFILETY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEXTERNSYSID }
     * 
     */
    public CUSTOMERType.GEXTERNSYSID createCUSTOMERTypeGEXTERNSYSID() {
        return new CUSTOMERType.GEXTERNSYSID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GMANDATEAPPL }
     * 
     */
    public CUSTOMERType.GMANDATEAPPL createCUSTOMERTypeGMANDATEAPPL() {
        return new CUSTOMERType.GMANDATEAPPL();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRISKASSETTYPE }
     * 
     */
    public CUSTOMERType.GRISKASSETTYPE createCUSTOMERTypeGRISKASSETTYPE() {
        return new CUSTOMERType.GRISKASSETTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFORMERVISTYPE }
     * 
     */
    public CUSTOMERType.GFORMERVISTYPE createCUSTOMERTypeGFORMERVISTYPE() {
        return new CUSTOMERType.GFORMERVISTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE }
     * 
     */
    public CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE createCUSTOMERTypeGFORMERVISTYPEMFORMERVISTYPE() {
        return new CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT }
     * 
     */
    public CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT createCUSTOMERTypeGFORMERVISTYPEMFORMERVISTYPESgFORMERVISCOMMENT() {
        return new CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE }
     * 
     */
    public CUSTOMERType.GVISTYPE createCUSTOMERTypeGVISTYPE() {
        return new CUSTOMERType.GVISTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE.MVISTYPE }
     * 
     */
    public CUSTOMERType.GVISTYPE.MVISTYPE createCUSTOMERTypeGVISTYPEMVISTYPE() {
        return new CUSTOMERType.GVISTYPE.MVISTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE }
     * 
     */
    public CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE createCUSTOMERTypeGVISTYPEMVISTYPESgVISINTERNALREVIE() {
        return new CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT }
     * 
     */
    public CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT createCUSTOMERTypeGVISTYPEMVISTYPESgVISCOMMENT() {
        return new CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPREVIOUSNAME }
     * 
     */
    public CUSTOMERType.GPREVIOUSNAME createCUSTOMERTypeGPREVIOUSNAME() {
        return new CUSTOMERType.GPREVIOUSNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCOMMTYPE }
     * 
     */
    public CUSTOMERType.GCOMMTYPE createCUSTOMERTypeGCOMMTYPE() {
        return new CUSTOMERType.GCOMMTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHERFINREL }
     * 
     */
    public CUSTOMERType.GOTHERFINREL createCUSTOMERTypeGOTHERFINREL() {
        return new CUSTOMERType.GOTHERFINREL();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRESIDENCESTATUS }
     * 
     */
    public CUSTOMERType.GRESIDENCESTATUS createCUSTOMERTypeGRESIDENCESTATUS() {
        return new CUSTOMERType.GRESIDENCESTATUS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYMENTSTATUS }
     * 
     */
    public CUSTOMERType.GEMPLOYMENTSTATUS createCUSTOMERTypeGEMPLOYMENTSTATUS() {
        return new CUSTOMERType.GEMPLOYMENTSTATUS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS }
     * 
     */
    public CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS createCUSTOMERTypeGEMPLOYMENTSTATUSMEMPLOYMENTSTATUS() {
        return new CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD }
     * 
     */
    public CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD createCUSTOMERTypeGEMPLOYMENTSTATUSMEMPLOYMENTSTATUSSgEMPLOYERSADD() {
        return new CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPHONE1 }
     * 
     */
    public CUSTOMERType.GPHONE1 createCUSTOMERTypeGPHONE1() {
        return new CUSTOMERType.GPHONE1();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCRPROFILETYPE }
     * 
     */
    public CUSTOMERType.GCRPROFILETYPE createCUSTOMERTypeGCRPROFILETYPE() {
        return new CUSTOMERType.GCRPROFILETYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLEGALID }
     * 
     */
    public CUSTOMERType.GLEGALID createCUSTOMERTypeGLEGALID() {
        return new CUSTOMERType.GLEGALID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRELATIONCODE }
     * 
     */
    public CUSTOMERType.GRELATIONCODE createCUSTOMERTypeGRELATIONCODE() {
        return new CUSTOMERType.GRELATIONCODE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRELATIONCODE.MRELATIONCODE }
     * 
     */
    public CUSTOMERType.GRELATIONCODE.MRELATIONCODE createCUSTOMERTypeGRELATIONCODEMRELATIONCODE() {
        return new CUSTOMERType.GRELATIONCODE.MRELATIONCODE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT }
     * 
     */
    public CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT createCUSTOMERTypeGRELATIONCODEMRELATIONCODESgRELDELIVOPT() {
        return new CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLLADDRESS }
     * 
     */
    public CUSTOMERType.GLLADDRESS createCUSTOMERTypeGLLADDRESS() {
        return new CUSTOMERType.GLLADDRESS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLLADDRESS.MLLADDRESS }
     * 
     */
    public CUSTOMERType.GLLADDRESS.MLLADDRESS createCUSTOMERTypeGLLADDRESSMLLADDRESS() {
        return new CUSTOMERType.GLLADDRESS.MLLADDRESS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS }
     * 
     */
    public CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS createCUSTOMERTypeGLLADDRESSMLLADDRESSSgLLADDRESS() {
        return new CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType }
     * 
     */
    public CUSTOMERFKLBANCPROSPType createCUSTOMERFKLBANCPROSPType() {
        return new CUSTOMERFKLBANCPROSPType();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GPHONE1 }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GPHONE1 createCUSTOMERFKLBANCPROSPTypeGPHONE1() {
        return new CUSTOMERFKLBANCPROSPType.GPHONE1();
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link CreateProspectCustomerValidateResponse }
     * 
     */
    public CreateProspectCustomerValidateResponse createCreateProspectCustomerValidateResponse() {
        return new CreateProspectCustomerValidateResponse();
    }

    /**
     * Create an instance of {@link CreateProspectCustomerValidate }
     * 
     */
    public CreateProspectCustomerValidate createCreateProspectCustomerValidate() {
        return new CreateProspectCustomerValidate();
    }

    /**
     * Create an instance of {@link PayOutCustomerResponse }
     * 
     */
    public PayOutCustomerResponse createPayOutCustomerResponse() {
        return new PayOutCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerInfoResponse }
     * 
     */
    public GetCustomerInfoResponse createGetCustomerInfoResponse() {
        return new GetCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAccounts }
     * 
     */
    public GetCustomerAccounts createGetCustomerAccounts() {
        return new GetCustomerAccounts();
    }

    /**
     * Create an instance of {@link GetCustomerInfo }
     * 
     */
    public GetCustomerInfo createGetCustomerInfo() {
        return new GetCustomerInfo();
    }

    /**
     * Create an instance of {@link PayOutCustomer }
     * 
     */
    public PayOutCustomer createPayOutCustomer() {
        return new PayOutCustomer();
    }

    /**
     * Create an instance of {@link PayOutCustomerValidateResponse }
     * 
     */
    public PayOutCustomerValidateResponse createPayOutCustomerValidateResponse() {
        return new PayOutCustomerValidateResponse();
    }

    /**
     * Create an instance of {@link CreateProspectCustomer }
     * 
     */
    public CreateProspectCustomer createCreateProspectCustomer() {
        return new CreateProspectCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerAccountsResponse }
     * 
     */
    public GetCustomerAccountsResponse createGetCustomerAccountsResponse() {
        return new GetCustomerAccountsResponse();
    }

    /**
     * Create an instance of {@link CreateProspectCustomerResponse }
     * 
     */
    public CreateProspectCustomerResponse createCreateProspectCustomerResponse() {
        return new CreateProspectCustomerResponse();
    }

    /**
     * Create an instance of {@link PayOutCustomerValidate }
     * 
     */
    public PayOutCustomerValidate createPayOutCustomerValidate() {
        return new PayOutCustomerValidate();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link OfsFunction }
     * 
     */
    public OfsFunction createOfsFunction() {
        return new OfsFunction();
    }

    /**
     * Create an instance of {@link EnquiryInputCollection }
     * 
     */
    public EnquiryInputCollection createEnquiryInputCollection() {
        return new EnquiryInputCollection();
    }

    /**
     * Create an instance of {@link EnquiryInput }
     * 
     */
    public EnquiryInput createEnquiryInput() {
        return new EnquiryInput();
    }

    /**
     * Create an instance of {@link WebRequestCommon }
     * 
     */
    public WebRequestCommon createWebRequestCommon() {
        return new WebRequestCommon();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GORDERINGCUST }
     * 
     */
    public FUNDSTRANSFERType.GORDERINGCUST createFUNDSTRANSFERTypeGORDERINGCUST() {
        return new FUNDSTRANSFERType.GORDERINGCUST();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINORDERINGCUS }
     * 
     */
    public FUNDSTRANSFERType.GINORDERINGCUS createFUNDSTRANSFERTypeGINORDERINGCUS() {
        return new FUNDSTRANSFERType.GINORDERINGCUS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GORDERINGBANK }
     * 
     */
    public FUNDSTRANSFERType.GORDERINGBANK createFUNDSTRANSFERTypeGORDERINGBANK() {
        return new FUNDSTRANSFERType.GORDERINGBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINORDERINGBK }
     * 
     */
    public FUNDSTRANSFERType.GINORDERINGBK createFUNDSTRANSFERTypeGINORDERINGBK() {
        return new FUNDSTRANSFERType.GINORDERINGBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GACCTWITHBANK }
     * 
     */
    public FUNDSTRANSFERType.GACCTWITHBANK createFUNDSTRANSFERTypeGACCTWITHBANK() {
        return new FUNDSTRANSFERType.GACCTWITHBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GACCTWITHBK }
     * 
     */
    public FUNDSTRANSFERType.GACCTWITHBK createFUNDSTRANSFERTypeGACCTWITHBK() {
        return new FUNDSTRANSFERType.GACCTWITHBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBENCUSTOMER }
     * 
     */
    public FUNDSTRANSFERType.GBENCUSTOMER createFUNDSTRANSFERTypeGBENCUSTOMER() {
        return new FUNDSTRANSFERType.GBENCUSTOMER();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBENCUSTOMER }
     * 
     */
    public FUNDSTRANSFERType.GINBENCUSTOMER createFUNDSTRANSFERTypeGINBENCUSTOMER() {
        return new FUNDSTRANSFERType.GINBENCUSTOMER();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBENBANK }
     * 
     */
    public FUNDSTRANSFERType.GBENBANK createFUNDSTRANSFERTypeGBENBANK() {
        return new FUNDSTRANSFERType.GBENBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBENBANK }
     * 
     */
    public FUNDSTRANSFERType.GINBENBANK createFUNDSTRANSFERTypeGINBENBANK() {
        return new FUNDSTRANSFERType.GINBENBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GPAYMENTDETAILS }
     * 
     */
    public FUNDSTRANSFERType.GPAYMENTDETAILS createFUNDSTRANSFERTypeGPAYMENTDETAILS() {
        return new FUNDSTRANSFERType.GPAYMENTDETAILS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINPAYDETAILS }
     * 
     */
    public FUNDSTRANSFERType.GINPAYDETAILS createFUNDSTRANSFERTypeGINPAYDETAILS() {
        return new FUNDSTRANSFERType.GINPAYDETAILS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GRECCORRBANK }
     * 
     */
    public FUNDSTRANSFERType.GRECCORRBANK createFUNDSTRANSFERTypeGRECCORRBANK() {
        return new FUNDSTRANSFERType.GRECCORRBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINTERMEDBANK }
     * 
     */
    public FUNDSTRANSFERType.GINTERMEDBANK createFUNDSTRANSFERTypeGINTERMEDBANK() {
        return new FUNDSTRANSFERType.GINTERMEDBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GININTMEDBANK }
     * 
     */
    public FUNDSTRANSFERType.GININTMEDBANK createFUNDSTRANSFERTypeGININTMEDBANK() {
        return new FUNDSTRANSFERType.GININTMEDBANK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBKTOBKINFO }
     * 
     */
    public FUNDSTRANSFERType.GBKTOBKINFO createFUNDSTRANSFERTypeGBKTOBKINFO() {
        return new FUNDSTRANSFERType.GBKTOBKINFO();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBKTOBK }
     * 
     */
    public FUNDSTRANSFERType.GINBKTOBK createFUNDSTRANSFERTypeGINBKTOBK() {
        return new FUNDSTRANSFERType.GINBKTOBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GFREETEXTMSGTO }
     * 
     */
    public FUNDSTRANSFERType.GFREETEXTMSGTO createFUNDSTRANSFERTypeGFREETEXTMSGTO() {
        return new FUNDSTRANSFERType.GFREETEXTMSGTO();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GMESSAGE }
     * 
     */
    public FUNDSTRANSFERType.GMESSAGE createFUNDSTRANSFERTypeGMESSAGE() {
        return new FUNDSTRANSFERType.GMESSAGE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINRECCORRBK }
     * 
     */
    public FUNDSTRANSFERType.GINRECCORRBK createFUNDSTRANSFERTypeGINRECCORRBK() {
        return new FUNDSTRANSFERType.GINRECCORRBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSENDCORRBK }
     * 
     */
    public FUNDSTRANSFERType.GINSENDCORRBK createFUNDSTRANSFERTypeGINSENDCORRBK() {
        return new FUNDSTRANSFERType.GINSENDCORRBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GDELIVERYOUTREF }
     * 
     */
    public FUNDSTRANSFERType.GDELIVERYOUTREF createFUNDSTRANSFERTypeGDELIVERYOUTREF() {
        return new FUNDSTRANSFERType.GDELIVERYOUTREF();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINREASONOVE }
     * 
     */
    public FUNDSTRANSFERType.GINREASONOVE createFUNDSTRANSFERTypeGINREASONOVE() {
        return new FUNDSTRANSFERType.GINREASONOVE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSTRCTNCODE }
     * 
     */
    public FUNDSTRANSFERType.GINSTRCTNCODE createFUNDSTRANSFERTypeGINSTRCTNCODE() {
        return new FUNDSTRANSFERType.GINSTRCTNCODE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINTIMEIND }
     * 
     */
    public FUNDSTRANSFERType.GINTIMEIND createFUNDSTRANSFERTypeGINTIMEIND() {
        return new FUNDSTRANSFERType.GINTIMEIND();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GININSTRCODE }
     * 
     */
    public FUNDSTRANSFERType.GININSTRCODE createFUNDSTRANSFERTypeGININSTRCODE() {
        return new FUNDSTRANSFERType.GININSTRCODE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINPROCESSERR }
     * 
     */
    public FUNDSTRANSFERType.GINPROCESSERR createFUNDSTRANSFERTypeGINPROCESSERR() {
        return new FUNDSTRANSFERType.GINPROCESSERR();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSWIFTMSG }
     * 
     */
    public FUNDSTRANSFERType.GINSWIFTMSG createFUNDSTRANSFERTypeGINSWIFTMSG() {
        return new FUNDSTRANSFERType.GINSWIFTMSG();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GININTERMEDBK }
     * 
     */
    public FUNDSTRANSFERType.GININTERMEDBK createFUNDSTRANSFERTypeGININTERMEDBK() {
        return new FUNDSTRANSFERType.GININTERMEDBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GIN3RDREIMBBK }
     * 
     */
    public FUNDSTRANSFERType.GIN3RDREIMBBK createFUNDSTRANSFERTypeGIN3RDREIMBBK() {
        return new FUNDSTRANSFERType.GIN3RDREIMBBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GEXTENDINFO }
     * 
     */
    public FUNDSTRANSFERType.GEXTENDINFO createFUNDSTRANSFERTypeGEXTENDINFO() {
        return new FUNDSTRANSFERType.GEXTENDINFO();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSENDCHG }
     * 
     */
    public FUNDSTRANSFERType.GINSENDCHG createFUNDSTRANSFERTypeGINSENDCHG() {
        return new FUNDSTRANSFERType.GINSENDCHG();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSIGNATORY }
     * 
     */
    public FUNDSTRANSFERType.GSIGNATORY createFUNDSTRANSFERTypeGSIGNATORY() {
        return new FUNDSTRANSFERType.GSIGNATORY();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GCARDTXNDETAIL }
     * 
     */
    public FUNDSTRANSFERType.GCARDTXNDETAIL createFUNDSTRANSFERTypeGCARDTXNDETAIL() {
        return new FUNDSTRANSFERType.GCARDTXNDETAIL();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINCORDBK }
     * 
     */
    public FUNDSTRANSFERType.GINCORDBK createFUNDSTRANSFERTypeGINCORDBK() {
        return new FUNDSTRANSFERType.GINCORDBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINCINTMEDBK }
     * 
     */
    public FUNDSTRANSFERType.GINCINTMEDBK createFUNDSTRANSFERTypeGINCINTMEDBK() {
        return new FUNDSTRANSFERType.GINCINTMEDBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINCACCWITBK }
     * 
     */
    public FUNDSTRANSFERType.GINCACCWITBK createFUNDSTRANSFERTypeGINCACCWITBK() {
        return new FUNDSTRANSFERType.GINCACCWITBK();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINCBKTBKIN }
     * 
     */
    public FUNDSTRANSFERType.GINCBKTBKIN createFUNDSTRANSFERTypeGINCBKTBKIN() {
        return new FUNDSTRANSFERType.GINCBKTBKIN();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBICIBANBENNAME }
     * 
     */
    public FUNDSTRANSFERType.GBICIBANBENNAME createFUNDSTRANSFERTypeGBICIBANBENNAME() {
        return new FUNDSTRANSFERType.GBICIBANBENNAME();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBENNAME }
     * 
     */
    public FUNDSTRANSFERType.GBENNAME createFUNDSTRANSFERTypeGBENNAME() {
        return new FUNDSTRANSFERType.GBENNAME();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBENADDRESS }
     * 
     */
    public FUNDSTRANSFERType.GBENADDRESS createFUNDSTRANSFERTypeGBENADDRESS() {
        return new FUNDSTRANSFERType.GBENADDRESS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GBENTOWN }
     * 
     */
    public FUNDSTRANSFERType.GBENTOWN createFUNDSTRANSFERTypeGBENTOWN() {
        return new FUNDSTRANSFERType.GBENTOWN();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBENNAME }
     * 
     */
    public FUNDSTRANSFERType.GINBENNAME createFUNDSTRANSFERTypeGINBENNAME() {
        return new FUNDSTRANSFERType.GINBENNAME();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBENADDRESS }
     * 
     */
    public FUNDSTRANSFERType.GINBENADDRESS createFUNDSTRANSFERTypeGINBENADDRESS() {
        return new FUNDSTRANSFERType.GINBENADDRESS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINBENTOWN }
     * 
     */
    public FUNDSTRANSFERType.GINBENTOWN createFUNDSTRANSFERTypeGINBENTOWN() {
        return new FUNDSTRANSFERType.GINBENTOWN();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GLOCEQUIVCHGS }
     * 
     */
    public FUNDSTRANSFERType.GLOCEQUIVCHGS createFUNDSTRANSFERTypeGLOCEQUIVCHGS() {
        return new FUNDSTRANSFERType.GLOCEQUIVCHGS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GFOREQUIVCHGS }
     * 
     */
    public FUNDSTRANSFERType.GFOREQUIVCHGS createFUNDSTRANSFERTypeGFOREQUIVCHGS() {
        return new FUNDSTRANSFERType.GFOREQUIVCHGS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSTMTNOS }
     * 
     */
    public FUNDSTRANSFERType.GSTMTNOS createFUNDSTRANSFERTypeGSTMTNOS() {
        return new FUNDSTRANSFERType.GSTMTNOS();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GOVERRIDE }
     * 
     */
    public FUNDSTRANSFERType.GOVERRIDE createFUNDSTRANSFERTypeGOVERRIDE() {
        return new FUNDSTRANSFERType.GOVERRIDE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINPUTTER }
     * 
     */
    public FUNDSTRANSFERType.GINPUTTER createFUNDSTRANSFERTypeGINPUTTER() {
        return new FUNDSTRANSFERType.GINPUTTER();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GDATETIME }
     * 
     */
    public FUNDSTRANSFERType.GDATETIME createFUNDSTRANSFERTypeGDATETIME() {
        return new FUNDSTRANSFERType.GDATETIME();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GINSMEMNO.MINSMEMNO }
     * 
     */
    public FUNDSTRANSFERType.GINSMEMNO.MINSMEMNO createFUNDSTRANSFERTypeGINSMEMNOMINSMEMNO() {
        return new FUNDSTRANSFERType.GINSMEMNO.MINSMEMNO();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GREFDATAITEM.MREFDATAITEM }
     * 
     */
    public FUNDSTRANSFERType.GREFDATAITEM.MREFDATAITEM createFUNDSTRANSFERTypeGREFDATAITEMMREFDATAITEM() {
        return new FUNDSTRANSFERType.GREFDATAITEM.MREFDATAITEM();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GMSGTYPE.MMSGTYPE }
     * 
     */
    public FUNDSTRANSFERType.GMSGTYPE.MMSGTYPE createFUNDSTRANSFERTypeGMSGTYPEMMSGTYPE() {
        return new FUNDSTRANSFERType.GMSGTYPE.MMSGTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT.BKTOBKOUT }
     * 
     */
    public FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT.BKTOBKOUT createFUNDSTRANSFERTypeGSENDTOPARTYMSENDTOPARTYSgBKTOBKOUTBKTOBKOUT() {
        return new FUNDSTRANSFERType.GSENDTOPARTY.MSENDTOPARTY.SgBKTOBKOUT.BKTOBKOUT();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND.TIMEIND }
     * 
     */
    public FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND.TIMEIND createFUNDSTRANSFERTypeGRELATEDMSGMRELATEDMSGSgTIMEINDTIMEIND() {
        return new FUNDSTRANSFERType.GRELATEDMSG.MRELATEDMSG.SgTIMEIND.TIMEIND();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GTAXTYPE.MTAXTYPE }
     * 
     */
    public FUNDSTRANSFERType.GTAXTYPE.MTAXTYPE createFUNDSTRANSFERTypeGTAXTYPEMTAXTYPE() {
        return new FUNDSTRANSFERType.GTAXTYPE.MTAXTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GCHARGETYPE.MCHARGETYPE }
     * 
     */
    public FUNDSTRANSFERType.GCHARGETYPE.MCHARGETYPE createFUNDSTRANSFERTypeGCHARGETYPEMCHARGETYPE() {
        return new FUNDSTRANSFERType.GCHARGETYPE.MCHARGETYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
     * 
     */
    public FUNDSTRANSFERType.GCOMMISSIONTYPE.MCOMMISSIONTYPE createFUNDSTRANSFERTypeGCOMMISSIONTYPEMCOMMISSIONTYPE() {
        return new FUNDSTRANSFERType.GCOMMISSIONTYPE.MCOMMISSIONTYPE();
    }

    /**
     * Create an instance of {@link FUNDSTRANSFERFKLBANCPAYOUTType.GPAYMENTDETAILS }
     * 
     */
    public FUNDSTRANSFERFKLBANCPAYOUTType.GPAYMENTDETAILS createFUNDSTRANSFERFKLBANCPAYOUTTypeGPAYMENTDETAILS() {
        return new FUNDSTRANSFERFKLBANCPAYOUTType.GPAYMENTDETAILS();
    }

    /**
     * Create an instance of {@link EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType.MEWSBANCASSUREACCOUNTINFODetailType }
     * 
     */
    public EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType.MEWSBANCASSUREACCOUNTINFODetailType createEWSBANCASSUREACCOUNTINFOTypeGEWSBANCASSUREACCOUNTINFODetailTypeMEWSBANCASSUREACCOUNTINFODetailType() {
        return new EWSBANCASSUREACCOUNTINFOType.GEWSBANCASSUREACCOUNTINFODetailType.MEWSBANCASSUREACCOUNTINFODetailType();
    }

    /**
     * Create an instance of {@link EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType.MEWSBANCASSURECUSTINFODetailType }
     * 
     */
    public EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType.MEWSBANCASSURECUSTINFODetailType createEWSBANCASSURECUSTINFOTypeGEWSBANCASSURECUSTINFODetailTypeMEWSBANCASSURECUSTINFODetailType() {
        return new EWSBANCASSURECUSTINFOType.GEWSBANCASSURECUSTINFODetailType.MEWSBANCASSURECUSTINFODetailType();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSHORTNAME }
     * 
     */
    public CUSTOMERType.GSHORTNAME createCUSTOMERTypeGSHORTNAME() {
        return new CUSTOMERType.GSHORTNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GNAME1 }
     * 
     */
    public CUSTOMERType.GNAME1 createCUSTOMERTypeGNAME1() {
        return new CUSTOMERType.GNAME1();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GNAME2 }
     * 
     */
    public CUSTOMERType.GNAME2 createCUSTOMERTypeGNAME2() {
        return new CUSTOMERType.GNAME2();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSTREET }
     * 
     */
    public CUSTOMERType.GSTREET createCUSTOMERTypeGSTREET() {
        return new CUSTOMERType.GSTREET();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GTOWNCOUNTRY }
     * 
     */
    public CUSTOMERType.GTOWNCOUNTRY createCUSTOMERTypeGTOWNCOUNTRY() {
        return new CUSTOMERType.GTOWNCOUNTRY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOSTCODE }
     * 
     */
    public CUSTOMERType.GPOSTCODE createCUSTOMERTypeGPOSTCODE() {
        return new CUSTOMERType.GPOSTCODE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCOUNTRY }
     * 
     */
    public CUSTOMERType.GCOUNTRY createCUSTOMERTypeGCOUNTRY() {
        return new CUSTOMERType.GCOUNTRY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHEROFFICER }
     * 
     */
    public CUSTOMERType.GOTHEROFFICER createCUSTOMERTypeGOTHEROFFICER() {
        return new CUSTOMERType.GOTHEROFFICER();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GTEXT }
     * 
     */
    public CUSTOMERType.GTEXT createCUSTOMERTypeGTEXT() {
        return new CUSTOMERType.GTEXT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOFFPHONE }
     * 
     */
    public CUSTOMERType.GOFFPHONE createCUSTOMERTypeGOFFPHONE() {
        return new CUSTOMERType.GOFFPHONE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOSTINGRESTRICT }
     * 
     */
    public CUSTOMERType.GPOSTINGRESTRICT createCUSTOMERTypeGPOSTINGRESTRICT() {
        return new CUSTOMERType.GPOSTINGRESTRICT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCUSTOMERRATING }
     * 
     */
    public CUSTOMERType.GCUSTOMERRATING createCUSTOMERTypeGCUSTOMERRATING() {
        return new CUSTOMERType.GCUSTOMERRATING();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLEGALIDDOCNAME }
     * 
     */
    public CUSTOMERType.GLEGALIDDOCNAME createCUSTOMERTypeGLEGALIDDOCNAME() {
        return new CUSTOMERType.GLEGALIDDOCNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GINTERESTS }
     * 
     */
    public CUSTOMERType.GINTERESTS createCUSTOMERTypeGINTERESTS() {
        return new CUSTOMERType.GINTERESTS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFAX1 }
     * 
     */
    public CUSTOMERType.GFAX1 createCUSTOMERTypeGFAX1() {
        return new CUSTOMERType.GFAX1();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSPOKENLANGUAGE }
     * 
     */
    public CUSTOMERType.GSPOKENLANGUAGE createCUSTOMERTypeGSPOKENLANGUAGE() {
        return new CUSTOMERType.GSPOKENLANGUAGE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPASTIMES }
     * 
     */
    public CUSTOMERType.GPASTIMES createCUSTOMERTypeGPASTIMES() {
        return new CUSTOMERType.GPASTIMES();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFURTHERDETAILS }
     * 
     */
    public CUSTOMERType.GFURTHERDETAILS createCUSTOMERTypeGFURTHERDETAILS() {
        return new CUSTOMERType.GFURTHERDETAILS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHERNATIONALITY }
     * 
     */
    public CUSTOMERType.GOTHERNATIONALITY createCUSTOMERTypeGOTHERNATIONALITY() {
        return new CUSTOMERType.GOTHERNATIONALITY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOVERRIDEREASON }
     * 
     */
    public CUSTOMERType.GOVERRIDEREASON createCUSTOMERTypeGOVERRIDEREASON() {
        return new CUSTOMERType.GOVERRIDEREASON();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GTAXID }
     * 
     */
    public CUSTOMERType.GTAXID createCUSTOMERTypeGTAXID() {
        return new CUSTOMERType.GTAXID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GHOLDINGSPIVOT }
     * 
     */
    public CUSTOMERType.GHOLDINGSPIVOT createCUSTOMERTypeGHOLDINGSPIVOT() {
        return new CUSTOMERType.GHOLDINGSPIVOT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GALTCUSID }
     * 
     */
    public CUSTOMERType.GALTCUSID createCUSTOMERTypeGALTCUSID() {
        return new CUSTOMERType.GALTCUSID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSOCIALNTWIDS }
     * 
     */
    public CUSTOMERType.GSOCIALNTWIDS createCUSTOMERTypeGSOCIALNTWIDS() {
        return new CUSTOMERType.GSOCIALNTWIDS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOVERRIDE }
     * 
     */
    public CUSTOMERType.GOVERRIDE createCUSTOMERTypeGOVERRIDE() {
        return new CUSTOMERType.GOVERRIDE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GINPUTTER }
     * 
     */
    public CUSTOMERType.GINPUTTER createCUSTOMERTypeGINPUTTER() {
        return new CUSTOMERType.GINPUTTER();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GDATETIME }
     * 
     */
    public CUSTOMERType.GDATETIME createCUSTOMERTypeGDATETIME() {
        return new CUSTOMERType.GDATETIME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSUBURBTOWN }
     * 
     */
    public CUSTOMERType.GSUBURBTOWN createCUSTOMERTypeGSUBURBTOWN() {
        return new CUSTOMERType.GSUBURBTOWN();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCITYMUNICIPAL }
     * 
     */
    public CUSTOMERType.GCITYMUNICIPAL createCUSTOMERTypeGCITYMUNICIPAL() {
        return new CUSTOMERType.GCITYMUNICIPAL();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPROVINCESTATE }
     * 
     */
    public CUSTOMERType.GPROVINCESTATE createCUSTOMERTypeGPROVINCESTATE() {
        return new CUSTOMERType.GPROVINCESTATE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOBOXNO }
     * 
     */
    public CUSTOMERType.GPOBOXNO createCUSTOMERTypeGPOBOXNO() {
        return new CUSTOMERType.GPOBOXNO();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOSUBURBTOWN }
     * 
     */
    public CUSTOMERType.GPOSUBURBTOWN createCUSTOMERTypeGPOSUBURBTOWN() {
        return new CUSTOMERType.GPOSUBURBTOWN();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOCITYMUNICIP }
     * 
     */
    public CUSTOMERType.GPOCITYMUNICIP createCUSTOMERTypeGPOCITYMUNICIP() {
        return new CUSTOMERType.GPOCITYMUNICIP();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOPROVSTATE }
     * 
     */
    public CUSTOMERType.GPOPROVSTATE createCUSTOMERTypeGPOPROVSTATE() {
        return new CUSTOMERType.GPOPROVSTATE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYBUSADDR }
     * 
     */
    public CUSTOMERType.GEMPLOYBUSADDR createCUSTOMERTypeGEMPLOYBUSADDR() {
        return new CUSTOMERType.GEMPLOYBUSADDR();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYSUBTOWN }
     * 
     */
    public CUSTOMERType.GEMPLOYSUBTOWN createCUSTOMERTypeGEMPLOYSUBTOWN() {
        return new CUSTOMERType.GEMPLOYSUBTOWN();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLCTYMUNIC }
     * 
     */
    public CUSTOMERType.GEMPLCTYMUNIC createCUSTOMERTypeGEMPLCTYMUNIC() {
        return new CUSTOMERType.GEMPLCTYMUNIC();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLPROVSTATE }
     * 
     */
    public CUSTOMERType.GEMPLPROVSTATE createCUSTOMERTypeGEMPLPROVSTATE() {
        return new CUSTOMERType.GEMPLPROVSTATE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSECONDINCOME }
     * 
     */
    public CUSTOMERType.GSECONDINCOME createCUSTOMERTypeGSECONDINCOME() {
        return new CUSTOMERType.GSECONDINCOME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GBUSPRINCIPALS }
     * 
     */
    public CUSTOMERType.GBUSPRINCIPALS createCUSTOMERTypeGBUSPRINCIPALS() {
        return new CUSTOMERType.GBUSPRINCIPALS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GASSENTITIES }
     * 
     */
    public CUSTOMERType.GASSENTITIES createCUSTOMERTypeGASSENTITIES() {
        return new CUSTOMERType.GASSENTITIES();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPRODUCTSERVICE }
     * 
     */
    public CUSTOMERType.GPRODUCTSERVICE createCUSTOMERTypeGPRODUCTSERVICE() {
        return new CUSTOMERType.GPRODUCTSERVICE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPOSITCONNAME }
     * 
     */
    public CUSTOMERType.GPOSITCONNAME createCUSTOMERTypeGPOSITCONNAME() {
        return new CUSTOMERType.GPOSITCONNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GNONINDTEXT }
     * 
     */
    public CUSTOMERType.GNONINDTEXT createCUSTOMERTypeGNONINDTEXT() {
        return new CUSTOMERType.GNONINDTEXT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPRVPHYADD }
     * 
     */
    public CUSTOMERType.GPRVPHYADD createCUSTOMERTypeGPRVPHYADD() {
        return new CUSTOMERType.GPRVPHYADD();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSPEMPADD }
     * 
     */
    public CUSTOMERType.GSPEMPADD createCUSTOMERTypeGSPEMPADD() {
        return new CUSTOMERType.GSPEMPADD();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPLACEOFBIRTH }
     * 
     */
    public CUSTOMERType.GPLACEOFBIRTH createCUSTOMERTypeGPLACEOFBIRTH() {
        return new CUSTOMERType.GPLACEOFBIRTH();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPLACEOFDEATH }
     * 
     */
    public CUSTOMERType.GPLACEOFDEATH createCUSTOMERTypeGPLACEOFDEATH() {
        return new CUSTOMERType.GPLACEOFDEATH();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPLACEOFLIVE }
     * 
     */
    public CUSTOMERType.GPLACEOFLIVE createCUSTOMERTypeGPLACEOFLIVE() {
        return new CUSTOMERType.GPLACEOFLIVE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GDOCNUMBER.MDOCNUMBER }
     * 
     */
    public CUSTOMERType.GDOCNUMBER.MDOCNUMBER createCUSTOMERTypeGDOCNUMBERMDOCNUMBER() {
        return new CUSTOMERType.GDOCNUMBER.MDOCNUMBER();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GNMESTAHLDR.MNMESTAHLDR }
     * 
     */
    public CUSTOMERType.GNMESTAHLDR.MNMESTAHLDR createCUSTOMERTypeGNMESTAHLDRMNMESTAHLDR() {
        return new CUSTOMERType.GNMESTAHLDR.MNMESTAHLDR();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCARDISSUED.MCARDISSUED }
     * 
     */
    public CUSTOMERType.GCARDISSUED.MCARDISSUED createCUSTOMERTypeGCARDISSUEDMCARDISSUED() {
        return new CUSTOMERType.GCARDISSUED.MCARDISSUED();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GAFYABENNAME.MAFYABENNAME }
     * 
     */
    public CUSTOMERType.GAFYABENNAME.MAFYABENNAME createCUSTOMERTypeGAFYABENNAMEMAFYABENNAME() {
        return new CUSTOMERType.GAFYABENNAME.MAFYABENNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GGROUP.MGROUP }
     * 
     */
    public CUSTOMERType.GGROUP.MGROUP createCUSTOMERTypeGGROUPMGROUP() {
        return new CUSTOMERType.GGROUP.MGROUP();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GBUSNAME.MBUSNAME }
     * 
     */
    public CUSTOMERType.GBUSNAME.MBUSNAME createCUSTOMERTypeGBUSNAMEMBUSNAME() {
        return new CUSTOMERType.GBUSNAME.MBUSNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GINSMEMNO.MINSMEMNO }
     * 
     */
    public CUSTOMERType.GINSMEMNO.MINSMEMNO createCUSTOMERTypeGINSMEMNOMINSMEMNO() {
        return new CUSTOMERType.GINSMEMNO.MINSMEMNO();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPLACESTUDY.MPLACESTUDY }
     * 
     */
    public CUSTOMERType.GPLACESTUDY.MPLACESTUDY createCUSTOMERTypeGPLACESTUDYMPLACESTUDY() {
        return new CUSTOMERType.GPLACESTUDY.MPLACESTUDY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GALTERIDTYPE.MALTERIDTYPE }
     * 
     */
    public CUSTOMERType.GALTERIDTYPE.MALTERIDTYPE createCUSTOMERTypeGALTERIDTYPEMALTERIDTYPE() {
        return new CUSTOMERType.GALTERIDTYPE.MALTERIDTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCONTACTNAME.MCONTACTNAME }
     * 
     */
    public CUSTOMERType.GCONTACTNAME.MCONTACTNAME createCUSTOMERTypeGCONTACTNAMEMCONTACTNAME() {
        return new CUSTOMERType.GCONTACTNAME.MCONTACTNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSIGNATORYCODE.MSIGNATORYCODE }
     * 
     */
    public CUSTOMERType.GSIGNATORYCODE.MSIGNATORYCODE createCUSTOMERTypeGSIGNATORYCODEMSIGNATORYCODE() {
        return new CUSTOMERType.GSIGNATORYCODE.MSIGNATORYCODE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPARTNERS.MPARTNERS }
     * 
     */
    public CUSTOMERType.GPARTNERS.MPARTNERS createCUSTOMERTypeGPARTNERSMPARTNERS() {
        return new CUSTOMERType.GPARTNERS.MPARTNERS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GSIGNNAME.MSIGNNAME }
     * 
     */
    public CUSTOMERType.GSIGNNAME.MSIGNNAME createCUSTOMERTypeGSIGNNAMEMSIGNNAME() {
        return new CUSTOMERType.GSIGNNAME.MSIGNNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GAUDITORNAME.MAUDITORNAME }
     * 
     */
    public CUSTOMERType.GAUDITORNAME.MAUDITORNAME createCUSTOMERTypeGAUDITORNAMEMAUDITORNAME() {
        return new CUSTOMERType.GAUDITORNAME.MAUDITORNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHERACCTS.MOTHERACCTS }
     * 
     */
    public CUSTOMERType.GOTHERACCTS.MOTHERACCTS createCUSTOMERTypeGOTHERACCTSMOTHERACCTS() {
        return new CUSTOMERType.GOTHERACCTS.MOTHERACCTS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GREFDATAITEM.MREFDATAITEM }
     * 
     */
    public CUSTOMERType.GREFDATAITEM.MREFDATAITEM createCUSTOMERTypeGREFDATAITEMMREFDATAITEM() {
        return new CUSTOMERType.GREFDATAITEM.MREFDATAITEM();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCRUSERPROFILETY.MCRUSERPROFILETY }
     * 
     */
    public CUSTOMERType.GCRUSERPROFILETY.MCRUSERPROFILETY createCUSTOMERTypeGCRUSERPROFILETYMCRUSERPROFILETY() {
        return new CUSTOMERType.GCRUSERPROFILETY.MCRUSERPROFILETY();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEXTERNSYSID.MEXTERNSYSID }
     * 
     */
    public CUSTOMERType.GEXTERNSYSID.MEXTERNSYSID createCUSTOMERTypeGEXTERNSYSIDMEXTERNSYSID() {
        return new CUSTOMERType.GEXTERNSYSID.MEXTERNSYSID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GMANDATEAPPL.MMANDATEAPPL }
     * 
     */
    public CUSTOMERType.GMANDATEAPPL.MMANDATEAPPL createCUSTOMERTypeGMANDATEAPPLMMANDATEAPPL() {
        return new CUSTOMERType.GMANDATEAPPL.MMANDATEAPPL();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRISKASSETTYPE.MRISKASSETTYPE }
     * 
     */
    public CUSTOMERType.GRISKASSETTYPE.MRISKASSETTYPE createCUSTOMERTypeGRISKASSETTYPEMRISKASSETTYPE() {
        return new CUSTOMERType.GRISKASSETTYPE.MRISKASSETTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT.FORMERVISCOMMENT }
     * 
     */
    public CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT.FORMERVISCOMMENT createCUSTOMERTypeGFORMERVISTYPEMFORMERVISTYPESgFORMERVISCOMMENTFORMERVISCOMMENT() {
        return new CUSTOMERType.GFORMERVISTYPE.MFORMERVISTYPE.SgFORMERVISCOMMENT.FORMERVISCOMMENT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE.VISINTERNALREVIEW }
     * 
     */
    public CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE.VISINTERNALREVIEW createCUSTOMERTypeGVISTYPEMVISTYPESgVISINTERNALREVIEVISINTERNALREVIEW() {
        return new CUSTOMERType.GVISTYPE.MVISTYPE.SgVISINTERNALREVIE.VISINTERNALREVIEW();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT.VISCOMMENT }
     * 
     */
    public CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT.VISCOMMENT createCUSTOMERTypeGVISTYPEMVISTYPESgVISCOMMENTVISCOMMENT() {
        return new CUSTOMERType.GVISTYPE.MVISTYPE.SgVISCOMMENT.VISCOMMENT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPREVIOUSNAME.MPREVIOUSNAME }
     * 
     */
    public CUSTOMERType.GPREVIOUSNAME.MPREVIOUSNAME createCUSTOMERTypeGPREVIOUSNAMEMPREVIOUSNAME() {
        return new CUSTOMERType.GPREVIOUSNAME.MPREVIOUSNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCOMMTYPE.MCOMMTYPE }
     * 
     */
    public CUSTOMERType.GCOMMTYPE.MCOMMTYPE createCUSTOMERTypeGCOMMTYPEMCOMMTYPE() {
        return new CUSTOMERType.GCOMMTYPE.MCOMMTYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GOTHERFINREL.MOTHERFINREL }
     * 
     */
    public CUSTOMERType.GOTHERFINREL.MOTHERFINREL createCUSTOMERTypeGOTHERFINRELMOTHERFINREL() {
        return new CUSTOMERType.GOTHERFINREL.MOTHERFINREL();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRESIDENCESTATUS.MRESIDENCESTATUS }
     * 
     */
    public CUSTOMERType.GRESIDENCESTATUS.MRESIDENCESTATUS createCUSTOMERTypeGRESIDENCESTATUSMRESIDENCESTATUS() {
        return new CUSTOMERType.GRESIDENCESTATUS.MRESIDENCESTATUS();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD.EMPLOYERSADD }
     * 
     */
    public CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD.EMPLOYERSADD createCUSTOMERTypeGEMPLOYMENTSTATUSMEMPLOYMENTSTATUSSgEMPLOYERSADDEMPLOYERSADD() {
        return new CUSTOMERType.GEMPLOYMENTSTATUS.MEMPLOYMENTSTATUS.SgEMPLOYERSADD.EMPLOYERSADD();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GPHONE1 .MPHONE1 }
     * 
     */
    public CUSTOMERType.GPHONE1 .MPHONE1 createCUSTOMERTypeGPHONE1MPHONE1() {
        return new CUSTOMERType.GPHONE1 .MPHONE1();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GCRPROFILETYPE.MCRPROFILETYPE }
     * 
     */
    public CUSTOMERType.GCRPROFILETYPE.MCRPROFILETYPE createCUSTOMERTypeGCRPROFILETYPEMCRPROFILETYPE() {
        return new CUSTOMERType.GCRPROFILETYPE.MCRPROFILETYPE();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLEGALID.MLEGALID }
     * 
     */
    public CUSTOMERType.GLEGALID.MLEGALID createCUSTOMERTypeGLEGALIDMLEGALID() {
        return new CUSTOMERType.GLEGALID.MLEGALID();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT.RELDELIVOPT }
     * 
     */
    public CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT.RELDELIVOPT createCUSTOMERTypeGRELATIONCODEMRELATIONCODESgRELDELIVOPTRELDELIVOPT() {
        return new CUSTOMERType.GRELATIONCODE.MRELATIONCODE.SgRELDELIVOPT.RELDELIVOPT();
    }

    /**
     * Create an instance of {@link CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS.ADDRESS }
     * 
     */
    public CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS.ADDRESS createCUSTOMERTypeGLLADDRESSMLLADDRESSSgLLADDRESSADDRESS() {
        return new CUSTOMERType.GLLADDRESS.MLLADDRESS.SgLLADDRESS.ADDRESS();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GSHORTNAME }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GSHORTNAME createCUSTOMERFKLBANCPROSPTypeGSHORTNAME() {
        return new CUSTOMERFKLBANCPROSPType.GSHORTNAME();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GNAME1 }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GNAME1 createCUSTOMERFKLBANCPROSPTypeGNAME1() {
        return new CUSTOMERFKLBANCPROSPType.GNAME1();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GNAME2 }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GNAME2 createCUSTOMERFKLBANCPROSPTypeGNAME2() {
        return new CUSTOMERFKLBANCPROSPType.GNAME2();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GLEGALID }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GLEGALID createCUSTOMERFKLBANCPROSPTypeGLEGALID() {
        return new CUSTOMERFKLBANCPROSPType.GLEGALID();
    }

    /**
     * Create an instance of {@link CUSTOMERFKLBANCPROSPType.GPHONE1 .MPHONE1 }
     * 
     */
    public CUSTOMERFKLBANCPROSPType.GPHONE1 .MPHONE1 createCUSTOMERFKLBANCPROSPTypeGPHONE1MPHONE1() {
        return new CUSTOMERFKLBANCPROSPType.GPHONE1 .MPHONE1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "GetCustomerAccounts")
    public JAXBElement<GetCustomerAccounts> createGetCustomerAccounts(GetCustomerAccounts value) {
        return new JAXBElement<GetCustomerAccounts>(_GetCustomerAccounts_QNAME, GetCustomerAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOutCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "PayOutCustomerResponse")
    public JAXBElement<PayOutCustomerResponse> createPayOutCustomerResponse(PayOutCustomerResponse value) {
        return new JAXBElement<PayOutCustomerResponse>(_PayOutCustomerResponse_QNAME, PayOutCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "GetCustomerInfoResponse")
    public JAXBElement<GetCustomerInfoResponse> createGetCustomerInfoResponse(GetCustomerInfoResponse value) {
        return new JAXBElement<GetCustomerInfoResponse>(_GetCustomerInfoResponse_QNAME, GetCustomerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProspectCustomerValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "CreateProspectCustomer_ValidateResponse")
    public JAXBElement<CreateProspectCustomerValidateResponse> createCreateProspectCustomerValidateResponse(CreateProspectCustomerValidateResponse value) {
        return new JAXBElement<CreateProspectCustomerValidateResponse>(_CreateProspectCustomerValidateResponse_QNAME, CreateProspectCustomerValidateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProspectCustomerValidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "CreateProspectCustomer_Validate")
    public JAXBElement<CreateProspectCustomerValidate> createCreateProspectCustomerValidate(CreateProspectCustomerValidate value) {
        return new JAXBElement<CreateProspectCustomerValidate>(_CreateProspectCustomerValidate_QNAME, CreateProspectCustomerValidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProspectCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "CreateProspectCustomerResponse")
    public JAXBElement<CreateProspectCustomerResponse> createCreateProspectCustomerResponse(CreateProspectCustomerResponse value) {
        return new JAXBElement<CreateProspectCustomerResponse>(_CreateProspectCustomerResponse_QNAME, CreateProspectCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOutCustomerValidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "PayOutCustomer_Validate")
    public JAXBElement<PayOutCustomerValidate> createPayOutCustomerValidate(PayOutCustomerValidate value) {
        return new JAXBElement<PayOutCustomerValidate>(_PayOutCustomerValidate_QNAME, PayOutCustomerValidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProspectCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "CreateProspectCustomer")
    public JAXBElement<CreateProspectCustomer> createCreateProspectCustomer(CreateProspectCustomer value) {
        return new JAXBElement<CreateProspectCustomer>(_CreateProspectCustomer_QNAME, CreateProspectCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "GetCustomerAccountsResponse")
    public JAXBElement<GetCustomerAccountsResponse> createGetCustomerAccountsResponse(GetCustomerAccountsResponse value) {
        return new JAXBElement<GetCustomerAccountsResponse>(_GetCustomerAccountsResponse_QNAME, GetCustomerAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "GetCustomerInfo")
    public JAXBElement<GetCustomerInfo> createGetCustomerInfo(GetCustomerInfo value) {
        return new JAXBElement<GetCustomerInfo>(_GetCustomerInfo_QNAME, GetCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOutCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "PayOutCustomer")
    public JAXBElement<PayOutCustomer> createPayOutCustomer(PayOutCustomer value) {
        return new JAXBElement<PayOutCustomer>(_PayOutCustomer_QNAME, PayOutCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOutCustomerValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/RensoftBancassure", name = "PayOutCustomer_ValidateResponse")
    public JAXBElement<PayOutCustomerValidateResponse> createPayOutCustomerValidateResponse(PayOutCustomerValidateResponse value) {
        return new JAXBElement<PayOutCustomerValidateResponse>(_PayOutCustomerValidateResponse_QNAME, PayOutCustomerValidateResponse.class, null, value);
    }

}
