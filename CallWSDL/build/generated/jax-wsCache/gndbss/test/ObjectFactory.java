
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static javax.xml.namespace.QName _Language_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "language");
    private final static javax.xml.namespace.QName _NonNegativeInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "nonNegativeInteger");
    private final static javax.xml.namespace.QName _Integer_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "integer");
    private final static javax.xml.namespace.QName _Float_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float");
    private final static javax.xml.namespace.QName _NormalizedString_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "normalizedString");
    private final static javax.xml.namespace.QName _Long_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long");
    private final static javax.xml.namespace.QName _Struct_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Struct");
    private final static javax.xml.namespace.QName _Name_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Name");
    private final static javax.xml.namespace.QName _NCName_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NCName");
    private final static javax.xml.namespace.QName _DateTime_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "dateTime");
    private final static javax.xml.namespace.QName _Date_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "date");
    private final static javax.xml.namespace.QName _String_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
    private final static javax.xml.namespace.QName _AnyType_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "anyType");
    private final static javax.xml.namespace.QName _UnsignedByte_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedByte");
    private final static javax.xml.namespace.QName _GDay_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gDay");
    private final static javax.xml.namespace.QName _ID_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ID");
    private final static javax.xml.namespace.QName _ENTITIES_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITIES");
    private final static javax.xml.namespace.QName _UnsignedLong_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedLong");
    private final static javax.xml.namespace.QName _IDREF_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "IDREF");
    private final static javax.xml.namespace.QName _GMonthDay_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonthDay");
    private final static javax.xml.namespace.QName _UnsignedShort_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedShort");
    private final static javax.xml.namespace.QName _Duration_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "duration");
    private final static javax.xml.namespace.QName _GYear_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gYear");
    private final static javax.xml.namespace.QName _ENTITY_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITY");
    private final static javax.xml.namespace.QName _HexBinary_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "hexBinary");
    private final static javax.xml.namespace.QName _NegativeInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "negativeInteger");
    private final static javax.xml.namespace.QName _AnyURI_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "anyURI");
    private final static javax.xml.namespace.QName _GMonth_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonth");
    private final static javax.xml.namespace.QName _IDREFS_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "IDREFS");
    private final static javax.xml.namespace.QName _Int_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int");
    private final static javax.xml.namespace.QName _Token_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "token");
    private final static javax.xml.namespace.QName _Double_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double");
    private final static javax.xml.namespace.QName _QName_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "QName");
    private final static javax.xml.namespace.QName _Byte_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "byte");
    private final static javax.xml.namespace.QName _NOTATION_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NOTATION");
    private final static javax.xml.namespace.QName _UnsignedInt_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedInt");
    private final static javax.xml.namespace.QName _Short_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short");
    private final static javax.xml.namespace.QName _Time_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "time");
    private final static javax.xml.namespace.QName _Decimal_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal");
    private final static javax.xml.namespace.QName _GYearMonth_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gYearMonth");
    private final static javax.xml.namespace.QName _Array_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Array");
    private final static javax.xml.namespace.QName _NonPositiveInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "nonPositiveInteger");
    private final static javax.xml.namespace.QName _Boolean_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean");
    private final static javax.xml.namespace.QName _Base64Binary_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary");
    private final static javax.xml.namespace.QName _NMTOKEN_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NMTOKEN");
    private final static javax.xml.namespace.QName _NMTOKENS_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NMTOKENS");
    private final static javax.xml.namespace.QName _PositiveInteger_QNAME = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "positiveInteger");
    private final static javax.xml.namespace.QName _GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME = new javax.xml.namespace.QName("urn:gndbss", "options");
    private final static javax.xml.namespace.QName _GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME = new javax.xml.namespace.QName("urn:gndbss", "session");
    private final static javax.xml.namespace.QName _GnUserTypeType_QNAME = new javax.xml.namespace.QName("urn:gndbss", "type");
    private final static javax.xml.namespace.QName _GnGroupToServiceLicence_QNAME = new javax.xml.namespace.QName("urn:gndbss", "licence");
    private final static javax.xml.namespace.QName _GnuAddCasterCaster_QNAME = new javax.xml.namespace.QName("urn:gndbss", "caster");
    private final static javax.xml.namespace.QName _GnuAddCasterStreams_QNAME = new javax.xml.namespace.QName("urn:gndbss", "streams");
    private final static javax.xml.namespace.QName _GncIsMountpointPermittedUserName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "userName");
    private final static javax.xml.namespace.QName _GncIsMountpointPermittedPassword_QNAME = new javax.xml.namespace.QName("urn:gndbss", "password");
    private final static javax.xml.namespace.QName _GetBillingAttributeTypeAttribute_QNAME = new javax.xml.namespace.QName("urn:gndbss", "attribute");
    private final static javax.xml.namespace.QName _GncIsUserInsideByChzIdMountpoint_QNAME = new javax.xml.namespace.QName("urn:gndbss", "mountpoint");
    private final static javax.xml.namespace.QName _GnuDeleteUserUser_QNAME = new javax.xml.namespace.QName("urn:gndbss", "user");
    private final static javax.xml.namespace.QName _AddServiceService_QNAME = new javax.xml.namespace.QName("urn:gndbss", "service");
    private final static javax.xml.namespace.QName _SetServiceToInfoServiceToInfo_QNAME = new javax.xml.namespace.QName("urn:gndbss", "serviceToInfo");
    private final static javax.xml.namespace.QName _GnImportAreasConfigurationCharEncoding_QNAME = new javax.xml.namespace.QName("urn:gndbss", "charEncoding");
    private final static javax.xml.namespace.QName _GnImportAreasConfigurationDescriptionColumn_QNAME = new javax.xml.namespace.QName("urn:gndbss", "descriptionColumn");
    private final static javax.xml.namespace.QName _GnImportAreasConfigurationNameColumn_QNAME = new javax.xml.namespace.QName("urn:gndbss", "nameColumn");
    private final static javax.xml.namespace.QName _GnServiceToInfoContent_QNAME = new javax.xml.namespace.QName("urn:gndbss", "content");
    private final static javax.xml.namespace.QName _GnuSetInfoInfo_QNAME = new javax.xml.namespace.QName("urn:gndbss", "info");
    private final static javax.xml.namespace.QName _GnuAddGroupServices_QNAME = new javax.xml.namespace.QName("urn:gndbss", "services");
    private final static javax.xml.namespace.QName _GnuAddGroupGroup_QNAME = new javax.xml.namespace.QName("urn:gndbss", "group");
    private final static javax.xml.namespace.QName _GnuAddGroupUsers_QNAME = new javax.xml.namespace.QName("urn:gndbss", "users");
    private final static javax.xml.namespace.QName _GnuAddGroupGtsToAreas_QNAME = new javax.xml.namespace.QName("urn:gndbss", "gtsToAreas");
    private final static javax.xml.namespace.QName _GnStreamComprEncryp_QNAME = new javax.xml.namespace.QName("urn:gndbss", "compr-encryp");
    private final static javax.xml.namespace.QName _GnStreamAuthentication_QNAME = new javax.xml.namespace.QName("urn:gndbss", "authentication");
    private final static javax.xml.namespace.QName _GnStreamMisc_QNAME = new javax.xml.namespace.QName("urn:gndbss", "misc");
    private final static javax.xml.namespace.QName _GnStreamNavSystems_QNAME = new javax.xml.namespace.QName("urn:gndbss", "nav-systems");
    private final static javax.xml.namespace.QName _GnStreamServerIp_QNAME = new javax.xml.namespace.QName("urn:gndbss", "server-ip");
    private final static javax.xml.namespace.QName _GnStreamGenerator_QNAME = new javax.xml.namespace.QName("urn:gndbss", "generator");
    private final static javax.xml.namespace.QName _GnStreamServerPassword_QNAME = new javax.xml.namespace.QName("urn:gndbss", "server-password");
    private final static javax.xml.namespace.QName _GnStreamClientUser_QNAME = new javax.xml.namespace.QName("urn:gndbss", "client-user");
    private final static javax.xml.namespace.QName _GnStreamDataFormat_QNAME = new javax.xml.namespace.QName("urn:gndbss", "data-format");
    private final static javax.xml.namespace.QName _GnStreamIdentifier_QNAME = new javax.xml.namespace.QName("urn:gndbss", "identifier");
    private final static javax.xml.namespace.QName _GnStreamFormatDetails_QNAME = new javax.xml.namespace.QName("urn:gndbss", "format-details");
    private final static javax.xml.namespace.QName _GnStreamCountry_QNAME = new javax.xml.namespace.QName("urn:gndbss", "country");
    private final static javax.xml.namespace.QName _GnStreamClientPassword_QNAME = new javax.xml.namespace.QName("urn:gndbss", "client-password");
    private final static javax.xml.namespace.QName _GnStreamFee_QNAME = new javax.xml.namespace.QName("urn:gndbss", "fee");
    private final static javax.xml.namespace.QName _GnStreamServerMountpoint_QNAME = new javax.xml.namespace.QName("urn:gndbss", "server-mountpoint");
    private final static javax.xml.namespace.QName _GnProcessingExportData_QNAME = new javax.xml.namespace.QName("urn:gndbss", "exportData");
    private final static javax.xml.namespace.QName _SetUserToInfoUserToInfo_QNAME = new javax.xml.namespace.QName("urn:gndbss", "userToInfo");
    private final static javax.xml.namespace.QName _DeleteCasterCasterId_QNAME = new javax.xml.namespace.QName("urn:gndbss", "casterId");
    private final static javax.xml.namespace.QName _SetBillingByIdBilling_QNAME = new javax.xml.namespace.QName("urn:gndbss", "billing");
    private final static javax.xml.namespace.QName _GNCCASTERTcpAddr_QNAME = new javax.xml.namespace.QName("urn:gndbss", "tcp-addr");
    private final static javax.xml.namespace.QName _GNCCASTERCcLoginName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "cc-login-name");
    private final static javax.xml.namespace.QName _GNCCASTERCcPasswordSource_QNAME = new javax.xml.namespace.QName("urn:gndbss", "cc-password-source");
    private final static javax.xml.namespace.QName _GNCCASTEROperator_QNAME = new javax.xml.namespace.QName("urn:gndbss", "operator");
    private final static javax.xml.namespace.QName _GNCCASTERCcTcpAddr_QNAME = new javax.xml.namespace.QName("urn:gndbss", "cc-tcp-addr");
    private final static javax.xml.namespace.QName _GNCCASTERKennung_QNAME = new javax.xml.namespace.QName("urn:gndbss", "kennung");
    private final static javax.xml.namespace.QName _GnGroupDescription_QNAME = new javax.xml.namespace.QName("urn:gndbss", "description");
    private final static javax.xml.namespace.QName _GnGroupName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "name");
    private final static javax.xml.namespace.QName _SetBillingAttributeBillingAttribute_QNAME = new javax.xml.namespace.QName("urn:gndbss", "billingAttribute");
    private final static javax.xml.namespace.QName _LoginByEmailEmail_QNAME = new javax.xml.namespace.QName("urn:gndbss", "email");
    private final static javax.xml.namespace.QName _GnBillingStationMountpoint_QNAME = new javax.xml.namespace.QName("urn:gndbss", "station-mountpoint");
    private final static javax.xml.namespace.QName _GnBillingUserName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "user-name");
    private final static javax.xml.namespace.QName _GetServiceByRootRoot_QNAME = new javax.xml.namespace.QName("urn:gndbss", "root");
    private final static javax.xml.namespace.QName _GncAddConnectionInfoKeyWord_QNAME = new javax.xml.namespace.QName("urn:gndbss", "keyWord");
    private final static javax.xml.namespace.QName _GncAddConnectionInfoMessage_QNAME = new javax.xml.namespace.QName("urn:gndbss", "message");
    private final static javax.xml.namespace.QName _GetOptionsSortColumn_QNAME = new javax.xml.namespace.QName("urn:gndbss", "sortColumn");
    private final static javax.xml.namespace.QName _GetOptionsWhereClause_QNAME = new javax.xml.namespace.QName("urn:gndbss", "whereClause");
    private final static javax.xml.namespace.QName _AddNetworkNetwork_QNAME = new javax.xml.namespace.QName("urn:gndbss", "network");
    private final static javax.xml.namespace.QName _DeleteInfoPredefineValue_QNAME = new javax.xml.namespace.QName("urn:gndbss", "value");
    private final static javax.xml.namespace.QName _GnuSetStreamCasters_QNAME = new javax.xml.namespace.QName("urn:gndbss", "casters");
    private final static javax.xml.namespace.QName _GnuSetStreamAutoSwitchStreams_QNAME = new javax.xml.namespace.QName("urn:gndbss", "autoSwitchStreams");
    private final static javax.xml.namespace.QName _GnuSetStreamStream_QNAME = new javax.xml.namespace.QName("urn:gndbss", "stream");
    private final static javax.xml.namespace.QName _GncIsServicePermittedServiceRoot_QNAME = new javax.xml.namespace.QName("urn:gndbss", "serviceRoot");
    private final static javax.xml.namespace.QName _SetUserTypeUserType_QNAME = new javax.xml.namespace.QName("urn:gndbss", "userType");
    private final static javax.xml.namespace.QName _SetGroupServiceGroupToService_QNAME = new javax.xml.namespace.QName("urn:gndbss", "groupToService");
    private final static javax.xml.namespace.QName _AddInfoPredefinePredefine_QNAME = new javax.xml.namespace.QName("urn:gndbss", "predefine");
    private final static javax.xml.namespace.QName _GnTableTableName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "table-name");
    private final static javax.xml.namespace.QName _GnTableLatestChange_QNAME = new javax.xml.namespace.QName("urn:gndbss", "latest-change");
    private final static javax.xml.namespace.QName _GnExportConfigurationHeader_QNAME = new javax.xml.namespace.QName("urn:gndbss", "header");
    private final static javax.xml.namespace.QName _GnExportConfigurationFilter_QNAME = new javax.xml.namespace.QName("urn:gndbss", "filter");
    private final static javax.xml.namespace.QName _SetNetworkNetworkId_QNAME = new javax.xml.namespace.QName("urn:gndbss", "networkId");
    private final static javax.xml.namespace.QName _GncGetUsernameByPhoneNumberPhone_QNAME = new javax.xml.namespace.QName("urn:gndbss", "phone");
    private final static javax.xml.namespace.QName _AddGtsToAreaGtsToArea_QNAME = new javax.xml.namespace.QName("urn:gndbss", "gtsToArea");
    private final static javax.xml.namespace.QName _SetAreaByIdArea_QNAME = new javax.xml.namespace.QName("urn:gndbss", "area");
    private final static javax.xml.namespace.QName _GNCSTREAMLoginName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "login-name");
    private final static javax.xml.namespace.QName _GNCSTREAMPasswordSource_QNAME = new javax.xml.namespace.QName("urn:gndbss", "password-source");
    private final static javax.xml.namespace.QName _GNCSTREAMCompression_QNAME = new javax.xml.namespace.QName("urn:gndbss", "compression");
    private final static javax.xml.namespace.QName _GNCSTREAMFormat_QNAME = new javax.xml.namespace.QName("urn:gndbss", "format");
    private final static javax.xml.namespace.QName _GNCSTREAMTnonce_QNAME = new javax.xml.namespace.QName("urn:gndbss", "tnonce");
    private final static javax.xml.namespace.QName _GNCSTREAMTopaque_QNAME = new javax.xml.namespace.QName("urn:gndbss", "topaque");
    private final static javax.xml.namespace.QName _GNCSTREAMMountPoint_QNAME = new javax.xml.namespace.QName("urn:gndbss", "mount-point");
    private final static javax.xml.namespace.QName _AddBillingAttributeTypeBillingAttributeType_QNAME = new javax.xml.namespace.QName("urn:gndbss", "billingAttributeType");
    private final static javax.xml.namespace.QName _GNCNETWORKWebNet_QNAME = new javax.xml.namespace.QName("urn:gndbss", "web-net");
    private final static javax.xml.namespace.QName _GNCNETWORKWebStr_QNAME = new javax.xml.namespace.QName("urn:gndbss", "web-str");
    private final static javax.xml.namespace.QName _GNCNETWORKWebReg_QNAME = new javax.xml.namespace.QName("urn:gndbss", "web-reg");
    private final static javax.xml.namespace.QName _CheckPermissionPermission_QNAME = new javax.xml.namespace.QName("urn:gndbss", "permission");
    private final static javax.xml.namespace.QName _GnVersionComment_QNAME = new javax.xml.namespace.QName("urn:gndbss", "comment");
    private final static javax.xml.namespace.QName _GnVersionVersion_QNAME = new javax.xml.namespace.QName("urn:gndbss", "version");
    private final static javax.xml.namespace.QName _GetProcessedListProcessiongType_QNAME = new javax.xml.namespace.QName("urn:gndbss", "processiongType");
    private final static javax.xml.namespace.QName _GnCasterFallbackHost_QNAME = new javax.xml.namespace.QName("urn:gndbss", "fallback-host");
    private final static javax.xml.namespace.QName _GnCasterHost_QNAME = new javax.xml.namespace.QName("urn:gndbss", "host");
    private final static javax.xml.namespace.QName _GnCasterCasterInstance_QNAME = new javax.xml.namespace.QName("urn:gndbss", "caster-instance");
    private final static javax.xml.namespace.QName _GnCasterProtocol_QNAME = new javax.xml.namespace.QName("urn:gndbss", "protocol");
    private final static javax.xml.namespace.QName _GnCasterCasterId_QNAME = new javax.xml.namespace.QName("urn:gndbss", "caster-id");
    private final static javax.xml.namespace.QName _AddUtsToAreaUtsToArea_QNAME = new javax.xml.namespace.QName("urn:gndbss", "utsToArea");
    private final static javax.xml.namespace.QName _CasterInstanceIpAdress_QNAME = new javax.xml.namespace.QName("urn:gndbss", "ip-adress");
    private final static javax.xml.namespace.QName _GnCasterDataCasterInstance_QNAME = new javax.xml.namespace.QName("urn:gndbss", "casterInstance");
    private final static javax.xml.namespace.QName _GnCasterDataGnCasterRoot_QNAME = new javax.xml.namespace.QName("urn:gndbss", "gnCasterRoot");
    private final static javax.xml.namespace.QName _AddUserServiceReturningUserToService_QNAME = new javax.xml.namespace.QName("urn:gndbss", "userToService");
    private final static javax.xml.namespace.QName _AddUserGroupUserTogroup_QNAME = new javax.xml.namespace.QName("urn:gndbss", "userTogroup");
    private final static javax.xml.namespace.QName _GncGetServiceTimeToDisconnMountpoint_QNAME = new javax.xml.namespace.QName("urn:gndbss", "Mountpoint");
    private final static javax.xml.namespace.QName _GnLoginSessionId_QNAME = new javax.xml.namespace.QName("urn:gndbss", "session-id");
    private final static javax.xml.namespace.QName _SetUserServiceByIdData_QNAME = new javax.xml.namespace.QName("urn:gndbss", "data");
    private final static javax.xml.namespace.QName _GnUserLastName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "last-name");
    private final static javax.xml.namespace.QName _GnUserZipCode_QNAME = new javax.xml.namespace.QName("urn:gndbss", "zip-code");
    private final static javax.xml.namespace.QName _GnUserFax_QNAME = new javax.xml.namespace.QName("urn:gndbss", "fax");
    private final static javax.xml.namespace.QName _GnUserStreet_QNAME = new javax.xml.namespace.QName("urn:gndbss", "street");
    private final static javax.xml.namespace.QName _GnUserFirstName_QNAME = new javax.xml.namespace.QName("urn:gndbss", "first-name");
    private final static javax.xml.namespace.QName _GnUserTitle_QNAME = new javax.xml.namespace.QName("urn:gndbss", "title");
    private final static javax.xml.namespace.QName _GnUserCity_QNAME = new javax.xml.namespace.QName("urn:gndbss", "city");
    private final static javax.xml.namespace.QName _GnBillingAttributeDatatype_QNAME = new javax.xml.namespace.QName("urn:gndbss", "datatype");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GncIsServicePermittedResponse }
     * 
     */
    public GncIsServicePermittedResponse createGncIsServicePermittedResponse() {
        return new GncIsServicePermittedResponse();
    }

    /**
     * Create an instance of {@link DeleteUserByEmailResponse }
     * 
     */
    public DeleteUserByEmailResponse createDeleteUserByEmailResponse() {
        return new DeleteUserByEmailResponse();
    }

    /**
     * Create an instance of {@link GnServiceToInfosResponse }
     * 
     */
    public GnServiceToInfosResponse createGnServiceToInfosResponse() {
        return new GnServiceToInfosResponse();
    }

    /**
     * Create an instance of {@link GnServiceToInfos }
     * 
     */
    public GnServiceToInfos createGnServiceToInfos() {
        return new GnServiceToInfos();
    }

    /**
     * Create an instance of {@link DeleteServiceByRootResponse }
     * 
     */
    public DeleteServiceByRootResponse createDeleteServiceByRootResponse() {
        return new DeleteServiceByRootResponse();
    }

    /**
     * Create an instance of {@link GnuSetGroup }
     * 
     */
    public GnuSetGroup createGnuSetGroup() {
        return new GnuSetGroup();
    }

    /**
     * Create an instance of {@link GnGroup }
     * 
     */
    public GnGroup createGnGroup() {
        return new GnGroup();
    }

    /**
     * Create an instance of {@link GnUsers }
     * 
     */
    public GnUsers createGnUsers() {
        return new GnUsers();
    }

    /**
     * Create an instance of {@link GnGroupToServices }
     * 
     */
    public GnGroupToServices createGnGroupToServices() {
        return new GnGroupToServices();
    }

    /**
     * Create an instance of {@link GnGtsToAreas }
     * 
     */
    public GnGtsToAreas createGnGtsToAreas() {
        return new GnGtsToAreas();
    }

    /**
     * Create an instance of {@link GetUserToInfosWithOptionsAdditional }
     * 
     */
    public GetUserToInfosWithOptionsAdditional createGetUserToInfosWithOptionsAdditional() {
        return new GetUserToInfosWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetOptions }
     * 
     */
    public GetOptions createGetOptions() {
        return new GetOptions();
    }

    /**
     * Create an instance of {@link GetNetworksWithOptionsAdditional }
     * 
     */
    public GetNetworksWithOptionsAdditional createGetNetworksWithOptionsAdditional() {
        return new GetNetworksWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link CheckPermission }
     * 
     */
    public CheckPermission createCheckPermission() {
        return new CheckPermission();
    }

    /**
     * Create an instance of {@link GnPermission }
     * 
     */
    public GnPermission createGnPermission() {
        return new GnPermission();
    }

    /**
     * Create an instance of {@link GnuGroupResponse }
     * 
     */
    public GnuGroupResponse createGnuGroupResponse() {
        return new GnuGroupResponse();
    }

    /**
     * Create an instance of {@link GnuGroup }
     * 
     */
    public GnuGroup createGnuGroup() {
        return new GnuGroup();
    }

    /**
     * Create an instance of {@link SetGroupService }
     * 
     */
    public SetGroupService createSetGroupService() {
        return new SetGroupService();
    }

    /**
     * Create an instance of {@link GnGroupToService }
     * 
     */
    public GnGroupToService createGnGroupToService() {
        return new GnGroupToService();
    }

    /**
     * Create an instance of {@link AddUserTypeResponse }
     * 
     */
    public AddUserTypeResponse createAddUserTypeResponse() {
        return new AddUserTypeResponse();
    }

    /**
     * Create an instance of {@link GetUserDataBySession }
     * 
     */
    public GetUserDataBySession createGetUserDataBySession() {
        return new GetUserDataBySession();
    }

    /**
     * Create an instance of {@link SetBillingByTemporary }
     * 
     */
    public SetBillingByTemporary createSetBillingByTemporary() {
        return new SetBillingByTemporary();
    }

    /**
     * Create an instance of {@link GnBilling }
     * 
     */
    public GnBilling createGnBilling() {
        return new GnBilling();
    }

    /**
     * Create an instance of {@link GNCResponse }
     * 
     */
    public GNCResponse createGNCResponse() {
        return new GNCResponse();
    }

    /**
     * Create an instance of {@link GNCCASTERs }
     * 
     */
    public GNCCASTERs createGNCCASTERs() {
        return new GNCCASTERs();
    }

    /**
     * Create an instance of {@link GNCNETWORKs }
     * 
     */
    public GNCNETWORKs createGNCNETWORKs() {
        return new GNCNETWORKs();
    }

    /**
     * Create an instance of {@link GNCSTREAMs }
     * 
     */
    public GNCSTREAMs createGNCSTREAMs() {
        return new GNCSTREAMs();
    }

    /**
     * Create an instance of {@link AddUserReturning }
     * 
     */
    public AddUserReturning createAddUserReturning() {
        return new AddUserReturning();
    }

    /**
     * Create an instance of {@link GnUser }
     * 
     */
    public GnUser createGnUser() {
        return new GnUser();
    }

    /**
     * Create an instance of {@link GnUserTypesAdditionalResponse }
     * 
     */
    public GnUserTypesAdditionalResponse createGnUserTypesAdditionalResponse() {
        return new GnUserTypesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnUserTypes }
     * 
     */
    public GnUserTypes createGnUserTypes() {
        return new GnUserTypes();
    }

    /**
     * Create an instance of {@link GnAdditional }
     * 
     */
    public GnAdditional createGnAdditional() {
        return new GnAdditional();
    }

    /**
     * Create an instance of {@link GnuAddUser }
     * 
     */
    public GnuAddUser createGnuAddUser() {
        return new GnuAddUser();
    }

    /**
     * Create an instance of {@link GnUserToGroups }
     * 
     */
    public GnUserToGroups createGnUserToGroups() {
        return new GnUserToGroups();
    }

    /**
     * Create an instance of {@link GnUserToServices }
     * 
     */
    public GnUserToServices createGnUserToServices() {
        return new GnUserToServices();
    }

    /**
     * Create an instance of {@link GnUserToInfos }
     * 
     */
    public GnUserToInfos createGnUserToInfos() {
        return new GnUserToInfos();
    }

    /**
     * Create an instance of {@link GnUtsToAreas }
     * 
     */
    public GnUtsToAreas createGnUtsToAreas() {
        return new GnUtsToAreas();
    }

    /**
     * Create an instance of {@link SetUserToInfoResponse }
     * 
     */
    public SetUserToInfoResponse createSetUserToInfoResponse() {
        return new SetUserToInfoResponse();
    }

    /**
     * Create an instance of {@link GetExportBillings }
     * 
     */
    public GetExportBillings createGetExportBillings() {
        return new GetExportBillings();
    }

    /**
     * Create an instance of {@link GnExportBillingsConfiguration }
     * 
     */
    public GnExportBillingsConfiguration createGnExportBillingsConfiguration() {
        return new GnExportBillingsConfiguration();
    }

    /**
     * Create an instance of {@link GnuAddCaster }
     * 
     */
    public GnuAddCaster createGnuAddCaster() {
        return new GnuAddCaster();
    }

    /**
     * Create an instance of {@link GnCaster }
     * 
     */
    public GnCaster createGnCaster() {
        return new GnCaster();
    }

    /**
     * Create an instance of {@link GnStreams }
     * 
     */
    public GnStreams createGnStreams() {
        return new GnStreams();
    }

    /**
     * Create an instance of {@link GetServiceById }
     * 
     */
    public GetServiceById createGetServiceById() {
        return new GetServiceById();
    }

    /**
     * Create an instance of {@link DeleteGtsToArea }
     * 
     */
    public DeleteGtsToArea createDeleteGtsToArea() {
        return new DeleteGtsToArea();
    }

    /**
     * Create an instance of {@link DeleteBillingsAndConnInfosByTimeResponse }
     * 
     */
    public DeleteBillingsAndConnInfosByTimeResponse createDeleteBillingsAndConnInfosByTimeResponse() {
        return new DeleteBillingsAndConnInfosByTimeResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingAttributeTypeResponse }
     * 
     */
    public DeleteBillingAttributeTypeResponse createDeleteBillingAttributeTypeResponse() {
        return new DeleteBillingAttributeTypeResponse();
    }

    /**
     * Create an instance of {@link GetBillingsBySet }
     * 
     */
    public GetBillingsBySet createGetBillingsBySet() {
        return new GetBillingsBySet();
    }

    /**
     * Create an instance of {@link GetInfoPredefinesByInfoIdWithOptionsAdditional }
     * 
     */
    public GetInfoPredefinesByInfoIdWithOptionsAdditional createGetInfoPredefinesByInfoIdWithOptionsAdditional() {
        return new GetInfoPredefinesByInfoIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetUserGroupsWithOptionsAdditional }
     * 
     */
    public GetUserGroupsWithOptionsAdditional createGetUserGroupsWithOptionsAdditional() {
        return new GetUserGroupsWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetGroupToServiceByUserIdAndServiceParentId }
     * 
     */
    public GetGroupToServiceByUserIdAndServiceParentId createGetGroupToServiceByUserIdAndServiceParentId() {
        return new GetGroupToServiceByUserIdAndServiceParentId();
    }

    /**
     * Create an instance of {@link BuildServiceStructureResponse }
     * 
     */
    public BuildServiceStructureResponse createBuildServiceStructureResponse() {
        return new BuildServiceStructureResponse();
    }

    /**
     * Create an instance of {@link AddUserService }
     * 
     */
    public AddUserService createAddUserService() {
        return new AddUserService();
    }

    /**
     * Create an instance of {@link GnUserToService }
     * 
     */
    public GnUserToService createGnUserToService() {
        return new GnUserToService();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link DeleteUserByName }
     * 
     */
    public DeleteUserByName createDeleteUserByName() {
        return new DeleteUserByName();
    }

    /**
     * Create an instance of {@link GnuAddInfoResponse }
     * 
     */
    public GnuAddInfoResponse createGnuAddInfoResponse() {
        return new GnuAddInfoResponse();
    }

    /**
     * Create an instance of {@link AddBillingAttributeType }
     * 
     */
    public AddBillingAttributeType createAddBillingAttributeType() {
        return new AddBillingAttributeType();
    }

    /**
     * Create an instance of {@link GnBillingAttributeType }
     * 
     */
    public GnBillingAttributeType createGnBillingAttributeType() {
        return new GnBillingAttributeType();
    }

    /**
     * Create an instance of {@link SetBillingByIdResponse }
     * 
     */
    public SetBillingByIdResponse createSetBillingByIdResponse() {
        return new SetBillingByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingsByServiceId }
     * 
     */
    public DeleteBillingsByServiceId createDeleteBillingsByServiceId() {
        return new DeleteBillingsByServiceId();
    }

    /**
     * Create an instance of {@link GetVersionGNUserDBResponse }
     * 
     */
    public GetVersionGNUserDBResponse createGetVersionGNUserDBResponse() {
        return new GetVersionGNUserDBResponse();
    }

    /**
     * Create an instance of {@link GetServiceByRoot }
     * 
     */
    public GetServiceByRoot createGetServiceByRoot() {
        return new GetServiceByRoot();
    }

    /**
     * Create an instance of {@link DeleteUserGroupResponse }
     * 
     */
    public DeleteUserGroupResponse createDeleteUserGroupResponse() {
        return new DeleteUserGroupResponse();
    }

    /**
     * Create an instance of {@link GetInfoPredefinesByInfoId }
     * 
     */
    public GetInfoPredefinesByInfoId createGetInfoPredefinesByInfoId() {
        return new GetInfoPredefinesByInfoId();
    }

    /**
     * Create an instance of {@link GncGetPhoneNumberByUserName }
     * 
     */
    public GncGetPhoneNumberByUserName createGncGetPhoneNumberByUserName() {
        return new GncGetPhoneNumberByUserName();
    }

    /**
     * Create an instance of {@link GncGetServiceTimeToDisconnResponse }
     * 
     */
    public GncGetServiceTimeToDisconnResponse createGncGetServiceTimeToDisconnResponse() {
        return new GncGetServiceTimeToDisconnResponse();
    }

    /**
     * Create an instance of {@link GnuGetGroup }
     * 
     */
    public GnuGetGroup createGnuGetGroup() {
        return new GnuGetGroup();
    }

    /**
     * Create an instance of {@link SetUserServiceByIdResponse }
     * 
     */
    public SetUserServiceByIdResponse createSetUserServiceByIdResponse() {
        return new SetUserServiceByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingsByFilterResponse }
     * 
     */
    public DeleteBillingsByFilterResponse createDeleteBillingsByFilterResponse() {
        return new DeleteBillingsByFilterResponse();
    }

    /**
     * Create an instance of {@link GnUserToGroupsAdditionalResponse }
     * 
     */
    public GnUserToGroupsAdditionalResponse createGnUserToGroupsAdditionalResponse() {
        return new GnUserToGroupsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnInfoPredefinesAdditionalResponse }
     * 
     */
    public GnInfoPredefinesAdditionalResponse createGnInfoPredefinesAdditionalResponse() {
        return new GnInfoPredefinesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnInfoPredefines }
     * 
     */
    public GnInfoPredefines createGnInfoPredefines() {
        return new GnInfoPredefines();
    }

    /**
     * Create an instance of {@link GnuGetUser }
     * 
     */
    public GnuGetUser createGnuGetUser() {
        return new GnuGetUser();
    }

    /**
     * Create an instance of {@link GetUserByEmail }
     * 
     */
    public GetUserByEmail createGetUserByEmail() {
        return new GetUserByEmail();
    }

    /**
     * Create an instance of {@link GncGetUserOrganisationResponse }
     * 
     */
    public GncGetUserOrganisationResponse createGncGetUserOrganisationResponse() {
        return new GncGetUserOrganisationResponse();
    }

    /**
     * Create an instance of {@link GetVersionGNCasterDB }
     * 
     */
    public GetVersionGNCasterDB createGetVersionGNCasterDB() {
        return new GetVersionGNCasterDB();
    }

    /**
     * Create an instance of {@link SetNetwork }
     * 
     */
    public SetNetwork createSetNetwork() {
        return new SetNetwork();
    }

    /**
     * Create an instance of {@link GnNetwork }
     * 
     */
    public GnNetwork createGnNetwork() {
        return new GnNetwork();
    }

    /**
     * Create an instance of {@link GetServiceAncestorsById }
     * 
     */
    public GetServiceAncestorsById createGetServiceAncestorsById() {
        return new GetServiceAncestorsById();
    }

    /**
     * Create an instance of {@link GnGroupResponse }
     * 
     */
    public GnGroupResponse createGnGroupResponse() {
        return new GnGroupResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttributeResponse }
     * 
     */
    public GnBillingAttributeResponse createGnBillingAttributeResponse() {
        return new GnBillingAttributeResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttribute }
     * 
     */
    public GnBillingAttribute createGnBillingAttribute() {
        return new GnBillingAttribute();
    }

    /**
     * Create an instance of {@link GetUserAncestorsById }
     * 
     */
    public GetUserAncestorsById createGetUserAncestorsById() {
        return new GetUserAncestorsById();
    }

    /**
     * Create an instance of {@link GncIsUserInsideResponse }
     * 
     */
    public GncIsUserInsideResponse createGncIsUserInsideResponse() {
        return new GncIsUserInsideResponse();
    }

    /**
     * Create an instance of {@link DeleteNetworkResponse }
     * 
     */
    public DeleteNetworkResponse createDeleteNetworkResponse() {
        return new DeleteNetworkResponse();
    }

    /**
     * Create an instance of {@link GnServiceResponse }
     * 
     */
    public GnServiceResponse createGnServiceResponse() {
        return new GnServiceResponse();
    }

    /**
     * Create an instance of {@link GnService }
     * 
     */
    public GnService createGnService() {
        return new GnService();
    }

    /**
     * Create an instance of {@link AddGtsToAreaResponse }
     * 
     */
    public AddGtsToAreaResponse createAddGtsToAreaResponse() {
        return new AddGtsToAreaResponse();
    }

    /**
     * Create an instance of {@link SetStreamResponse }
     * 
     */
    public SetStreamResponse createSetStreamResponse() {
        return new SetStreamResponse();
    }

    /**
     * Create an instance of {@link GetVersionGNUserDB }
     * 
     */
    public GetVersionGNUserDB createGetVersionGNUserDB() {
        return new GetVersionGNUserDB();
    }

    /**
     * Create an instance of {@link GetCastersWithOptionsAdditional }
     * 
     */
    public GetCastersWithOptionsAdditional createGetCastersWithOptionsAdditional() {
        return new GetCastersWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GnuSetUser }
     * 
     */
    public GnuSetUser createGnuSetUser() {
        return new GnuSetUser();
    }

    /**
     * Create an instance of {@link GnUserPermissions }
     * 
     */
    public GnUserPermissions createGnUserPermissions() {
        return new GnUserPermissions();
    }

    /**
     * Create an instance of {@link GetServiceAncestorsByIdWithOptionsAdditional }
     * 
     */
    public GetServiceAncestorsByIdWithOptionsAdditional createGetServiceAncestorsByIdWithOptionsAdditional() {
        return new GetServiceAncestorsByIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link AddGtsToArea }
     * 
     */
    public AddGtsToArea createAddGtsToArea() {
        return new AddGtsToArea();
    }

    /**
     * Create an instance of {@link GnGtsToArea }
     * 
     */
    public GnGtsToArea createGnGtsToArea() {
        return new GnGtsToArea();
    }

    /**
     * Create an instance of {@link GetErrorMsgResponse }
     * 
     */
    public GetErrorMsgResponse createGetErrorMsgResponse() {
        return new GetErrorMsgResponse();
    }

    /**
     * Create an instance of {@link GetGroupUsers }
     * 
     */
    public GetGroupUsers createGetGroupUsers() {
        return new GetGroupUsers();
    }

    /**
     * Create an instance of {@link GetUserPwdResponse }
     * 
     */
    public GetUserPwdResponse createGetUserPwdResponse() {
        return new GetUserPwdResponse();
    }

    /**
     * Create an instance of {@link GnGroupsAdditionalResponse }
     * 
     */
    public GnGroupsAdditionalResponse createGnGroupsAdditionalResponse() {
        return new GnGroupsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnGroups }
     * 
     */
    public GnGroups createGnGroups() {
        return new GnGroups();
    }

    /**
     * Create an instance of {@link GetInfoPredefinesWithOptionsAdditional }
     * 
     */
    public GetInfoPredefinesWithOptionsAdditional createGetInfoPredefinesWithOptionsAdditional() {
        return new GetInfoPredefinesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link DeleteUserByNameResponse }
     * 
     */
    public DeleteUserByNameResponse createDeleteUserByNameResponse() {
        return new DeleteUserByNameResponse();
    }

    /**
     * Create an instance of {@link GetVersionWsdlResponse }
     * 
     */
    public GetVersionWsdlResponse createGetVersionWsdlResponse() {
        return new GetVersionWsdlResponse();
    }

    /**
     * Create an instance of {@link GetUserServicesByUserId }
     * 
     */
    public GetUserServicesByUserId createGetUserServicesByUserId() {
        return new GetUserServicesByUserId();
    }

    /**
     * Create an instance of {@link GetAllPermissionsByUserId }
     * 
     */
    public GetAllPermissionsByUserId createGetAllPermissionsByUserId() {
        return new GetAllPermissionsByUserId();
    }

    /**
     * Create an instance of {@link GetProcessedList }
     * 
     */
    public GetProcessedList createGetProcessedList() {
        return new GetProcessedList();
    }

    /**
     * Create an instance of {@link SetServiceByRootResponse }
     * 
     */
    public SetServiceByRootResponse createSetServiceByRootResponse() {
        return new SetServiceByRootResponse();
    }

    /**
     * Create an instance of {@link DeleteGroupByIdResponse }
     * 
     */
    public DeleteGroupByIdResponse createDeleteGroupByIdResponse() {
        return new DeleteGroupByIdResponse();
    }

    /**
     * Create an instance of {@link GetBillingAttributeTypesWithOptionsAdditional }
     * 
     */
    public GetBillingAttributeTypesWithOptionsAdditional createGetBillingAttributeTypesWithOptionsAdditional() {
        return new GetBillingAttributeTypesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetUUIDResponse }
     * 
     */
    public GetUUIDResponse createGetUUIDResponse() {
        return new GetUUIDResponse();
    }

    /**
     * Create an instance of {@link GetCaster }
     * 
     */
    public GetCaster createGetCaster() {
        return new GetCaster();
    }

    /**
     * Create an instance of {@link GnServiceToInfosAdditionalResponse }
     * 
     */
    public GnServiceToInfosAdditionalResponse createGnServiceToInfosAdditionalResponse() {
        return new GnServiceToInfosAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnInfosResponse }
     * 
     */
    public GnInfosResponse createGnInfosResponse() {
        return new GnInfosResponse();
    }

    /**
     * Create an instance of {@link GnInfos }
     * 
     */
    public GnInfos createGnInfos() {
        return new GnInfos();
    }

    /**
     * Create an instance of {@link GnStreamResponse }
     * 
     */
    public GnStreamResponse createGnStreamResponse() {
        return new GnStreamResponse();
    }

    /**
     * Create an instance of {@link GnStream }
     * 
     */
    public GnStream createGnStream() {
        return new GnStream();
    }

    /**
     * Create an instance of {@link DeleteUserById }
     * 
     */
    public DeleteUserById createDeleteUserById() {
        return new DeleteUserById();
    }

    /**
     * Create an instance of {@link AddCasterResponse }
     * 
     */
    public AddCasterResponse createAddCasterResponse() {
        return new AddCasterResponse();
    }

    /**
     * Create an instance of {@link SetServiceByIdResponse }
     * 
     */
    public SetServiceByIdResponse createSetServiceByIdResponse() {
        return new SetServiceByIdResponse();
    }

    /**
     * Create an instance of {@link GnuSetGroupResponse }
     * 
     */
    public GnuSetGroupResponse createGnuSetGroupResponse() {
        return new GnuSetGroupResponse();
    }

    /**
     * Create an instance of {@link SetUserServiceById }
     * 
     */
    public SetUserServiceById createSetUserServiceById() {
        return new SetUserServiceById();
    }

    /**
     * Create an instance of {@link GetAreasByGtsId }
     * 
     */
    public GetAreasByGtsId createGetAreasByGtsId() {
        return new GetAreasByGtsId();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByIdResponse }
     * 
     */
    public DeleteUserServiceByIdResponse createDeleteUserServiceByIdResponse() {
        return new DeleteUserServiceByIdResponse();
    }

    /**
     * Create an instance of {@link GncGetUserPassword }
     * 
     */
    public GncGetUserPassword createGncGetUserPassword() {
        return new GncGetUserPassword();
    }

    /**
     * Create an instance of {@link GnCasterData }
     * 
     */
    public GnCasterData createGnCasterData() {
        return new GnCasterData();
    }

    /**
     * Create an instance of {@link DeleteBillingByIdResponse }
     * 
     */
    public DeleteBillingByIdResponse createDeleteBillingByIdResponse() {
        return new DeleteBillingByIdResponse();
    }

    /**
     * Create an instance of {@link GetUtsToAreasWithOptionsAdditional }
     * 
     */
    public GetUtsToAreasWithOptionsAdditional createGetUtsToAreasWithOptionsAdditional() {
        return new GetUtsToAreasWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GncGetAreaTimeToDisconn }
     * 
     */
    public GncGetAreaTimeToDisconn createGncGetAreaTimeToDisconn() {
        return new GncGetAreaTimeToDisconn();
    }

    /**
     * Create an instance of {@link DeleteBillingsByUserIdResponse }
     * 
     */
    public DeleteBillingsByUserIdResponse createDeleteBillingsByUserIdResponse() {
        return new DeleteBillingsByUserIdResponse();
    }

    /**
     * Create an instance of {@link GncGetUsernameByPhoneNumber }
     * 
     */
    public GncGetUsernameByPhoneNumber createGncGetUsernameByPhoneNumber() {
        return new GncGetUsernameByPhoneNumber();
    }

    /**
     * Create an instance of {@link GetUserServicesByLicenceWithOptionsAdditional }
     * 
     */
    public GetUserServicesByLicenceWithOptionsAdditional createGetUserServicesByLicenceWithOptionsAdditional() {
        return new GetUserServicesByLicenceWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link DeleteServiceToInfo }
     * 
     */
    public DeleteServiceToInfo createDeleteServiceToInfo() {
        return new DeleteServiceToInfo();
    }

    /**
     * Create an instance of {@link AddStreamReturning }
     * 
     */
    public AddStreamReturning createAddStreamReturning() {
        return new AddStreamReturning();
    }

    /**
     * Create an instance of {@link GnUsersResponse }
     * 
     */
    public GnUsersResponse createGnUsersResponse() {
        return new GnUsersResponse();
    }

    /**
     * Create an instance of {@link GncUpdateBilling }
     * 
     */
    public GncUpdateBilling createGncUpdateBilling() {
        return new GncUpdateBilling();
    }

    /**
     * Create an instance of {@link FillBilling }
     * 
     */
    public FillBilling createFillBilling() {
        return new FillBilling();
    }

    /**
     * Create an instance of {@link DeleteUserToInfo }
     * 
     */
    public DeleteUserToInfo createDeleteUserToInfo() {
        return new DeleteUserToInfo();
    }

    /**
     * Create an instance of {@link AddBillingAttributeTypeResponse }
     * 
     */
    public AddBillingAttributeTypeResponse createAddBillingAttributeTypeResponse() {
        return new AddBillingAttributeTypeResponse();
    }

    /**
     * Create an instance of {@link GncIsUserInsideByChzIdResponse }
     * 
     */
    public GncIsUserInsideByChzIdResponse createGncIsUserInsideByChzIdResponse() {
        return new GncIsUserInsideByChzIdResponse();
    }

    /**
     * Create an instance of {@link SetServiceToInfoResponse }
     * 
     */
    public SetServiceToInfoResponse createSetServiceToInfoResponse() {
        return new SetServiceToInfoResponse();
    }

    /**
     * Create an instance of {@link AddUserToInfoResponse }
     * 
     */
    public AddUserToInfoResponse createAddUserToInfoResponse() {
        return new AddUserToInfoResponse();
    }

    /**
     * Create an instance of {@link GnuSetCaster }
     * 
     */
    public GnuSetCaster createGnuSetCaster() {
        return new GnuSetCaster();
    }

    /**
     * Create an instance of {@link DeleteServiceByRoot }
     * 
     */
    public DeleteServiceByRoot createDeleteServiceByRoot() {
        return new DeleteServiceByRoot();
    }

    /**
     * Create an instance of {@link DeleteInfoPredefine }
     * 
     */
    public DeleteInfoPredefine createDeleteInfoPredefine() {
        return new DeleteInfoPredefine();
    }

    /**
     * Create an instance of {@link GncIsUserInside }
     * 
     */
    public GncIsUserInside createGncIsUserInside() {
        return new GncIsUserInside();
    }

    /**
     * Create an instance of {@link EventGetExpiredUsers }
     * 
     */
    public EventGetExpiredUsers createEventGetExpiredUsers() {
        return new EventGetExpiredUsers();
    }

    /**
     * Create an instance of {@link GnUtsToAreaResponse }
     * 
     */
    public GnUtsToAreaResponse createGnUtsToAreaResponse() {
        return new GnUtsToAreaResponse();
    }

    /**
     * Create an instance of {@link GnUtsToArea }
     * 
     */
    public GnUtsToArea createGnUtsToArea() {
        return new GnUtsToArea();
    }

    /**
     * Create an instance of {@link GetBillingById }
     * 
     */
    public GetBillingById createGetBillingById() {
        return new GetBillingById();
    }

    /**
     * Create an instance of {@link SetAreaByIdResponse }
     * 
     */
    public SetAreaByIdResponse createSetAreaByIdResponse() {
        return new SetAreaByIdResponse();
    }

    /**
     * Create an instance of {@link EventGetExpiredUserToServices }
     * 
     */
    public EventGetExpiredUserToServices createEventGetExpiredUserToServices() {
        return new EventGetExpiredUserToServices();
    }

    /**
     * Create an instance of {@link GncIsServicePermitted }
     * 
     */
    public GncIsServicePermitted createGncIsServicePermitted() {
        return new GncIsServicePermitted();
    }

    /**
     * Create an instance of {@link DeleteGroupByNameResponse }
     * 
     */
    public DeleteGroupByNameResponse createDeleteGroupByNameResponse() {
        return new DeleteGroupByNameResponse();
    }

    /**
     * Create an instance of {@link GnuGetCaster }
     * 
     */
    public GnuGetCaster createGnuGetCaster() {
        return new GnuGetCaster();
    }

    /**
     * Create an instance of {@link ImportAreas }
     * 
     */
    public ImportAreas createImportAreas() {
        return new ImportAreas();
    }

    /**
     * Create an instance of {@link GnImportAreasConfiguration }
     * 
     */
    public GnImportAreasConfiguration createGnImportAreasConfiguration() {
        return new GnImportAreasConfiguration();
    }

    /**
     * Create an instance of {@link GetUserChildrenById }
     * 
     */
    public GetUserChildrenById createGetUserChildrenById() {
        return new GetUserChildrenById();
    }

    /**
     * Create an instance of {@link GetInfoByName }
     * 
     */
    public GetInfoByName createGetInfoByName() {
        return new GetInfoByName();
    }

    /**
     * Create an instance of {@link GetAreasByUtsId }
     * 
     */
    public GetAreasByUtsId createGetAreasByUtsId() {
        return new GetAreasByUtsId();
    }

    /**
     * Create an instance of {@link DeleteBillingsByTimeResponse }
     * 
     */
    public DeleteBillingsByTimeResponse createDeleteBillingsByTimeResponse() {
        return new DeleteBillingsByTimeResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttributeTypeResponse }
     * 
     */
    public GnBillingAttributeTypeResponse createGnBillingAttributeTypeResponse() {
        return new GnBillingAttributeTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingById }
     * 
     */
    public DeleteBillingById createDeleteBillingById() {
        return new DeleteBillingById();
    }

    /**
     * Create an instance of {@link EventGetNewUsers }
     * 
     */
    public EventGetNewUsers createEventGetNewUsers() {
        return new EventGetNewUsers();
    }

    /**
     * Create an instance of {@link DeleteInfoPredefineResponse }
     * 
     */
    public DeleteInfoPredefineResponse createDeleteInfoPredefineResponse() {
        return new DeleteInfoPredefineResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetServiceToInfosWithOptionsAdditional }
     * 
     */
    public GetServiceToInfosWithOptionsAdditional createGetServiceToInfosWithOptionsAdditional() {
        return new GetServiceToInfosWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetStreams }
     * 
     */
    public GetStreams createGetStreams() {
        return new GetStreams();
    }

    /**
     * Create an instance of {@link SetGroupByIdResponse }
     * 
     */
    public SetGroupByIdResponse createSetGroupByIdResponse() {
        return new SetGroupByIdResponse();
    }

    /**
     * Create an instance of {@link AddBillingAttribute }
     * 
     */
    public AddBillingAttribute createAddBillingAttribute() {
        return new AddBillingAttribute();
    }

    /**
     * Create an instance of {@link GnBillingAttributesResponse }
     * 
     */
    public GnBillingAttributesResponse createGnBillingAttributesResponse() {
        return new GnBillingAttributesResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttributes }
     * 
     */
    public GnBillingAttributes createGnBillingAttributes() {
        return new GnBillingAttributes();
    }

    /**
     * Create an instance of {@link GnuSetStreamResponse }
     * 
     */
    public GnuSetStreamResponse createGnuSetStreamResponse() {
        return new GnuSetStreamResponse();
    }

    /**
     * Create an instance of {@link SetUserByIdResponse }
     * 
     */
    public SetUserByIdResponse createSetUserByIdResponse() {
        return new SetUserByIdResponse();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link SetNetworkResponse }
     * 
     */
    public SetNetworkResponse createSetNetworkResponse() {
        return new SetNetworkResponse();
    }

    /**
     * Create an instance of {@link GetGtsToAreaByGtsIdAndAreaId }
     * 
     */
    public GetGtsToAreaByGtsIdAndAreaId createGetGtsToAreaByGtsIdAndAreaId() {
        return new GetGtsToAreaByGtsIdAndAreaId();
    }

    /**
     * Create an instance of {@link GetStartTimeResponse }
     * 
     */
    public GetStartTimeResponse createGetStartTimeResponse() {
        return new GetStartTimeResponse();
    }

    /**
     * Create an instance of {@link GnuAddCasterResponse }
     * 
     */
    public GnuAddCasterResponse createGnuAddCasterResponse() {
        return new GnuAddCasterResponse();
    }

    /**
     * Create an instance of {@link GnUtsToAreasResponse }
     * 
     */
    public GnUtsToAreasResponse createGnUtsToAreasResponse() {
        return new GnUtsToAreasResponse();
    }

    /**
     * Create an instance of {@link AddGroupServiceResponse }
     * 
     */
    public AddGroupServiceResponse createAddGroupServiceResponse() {
        return new AddGroupServiceResponse();
    }

    /**
     * Create an instance of {@link GetBillingAttributes }
     * 
     */
    public GetBillingAttributes createGetBillingAttributes() {
        return new GetBillingAttributes();
    }

    /**
     * Create an instance of {@link GnStreamsResponse }
     * 
     */
    public GnStreamsResponse createGnStreamsResponse() {
        return new GnStreamsResponse();
    }

    /**
     * Create an instance of {@link GncCheckOnlineAccounts }
     * 
     */
    public GncCheckOnlineAccounts createGncCheckOnlineAccounts() {
        return new GncCheckOnlineAccounts();
    }

    /**
     * Create an instance of {@link GetGroupUsersWithOptionsAdditional }
     * 
     */
    public GetGroupUsersWithOptionsAdditional createGetGroupUsersWithOptionsAdditional() {
        return new GetGroupUsersWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GnCountResponse }
     * 
     */
    public GnCountResponse createGnCountResponse() {
        return new GnCountResponse();
    }

    /**
     * Create an instance of {@link DeleteServiceByIdResponse }
     * 
     */
    public DeleteServiceByIdResponse createDeleteServiceByIdResponse() {
        return new DeleteServiceByIdResponse();
    }

    /**
     * Create an instance of {@link GncUpdateBillings }
     * 
     */
    public GncUpdateBillings createGncUpdateBillings() {
        return new GncUpdateBillings();
    }

    /**
     * Create an instance of {@link FillBillings }
     * 
     */
    public FillBillings createFillBillings() {
        return new FillBillings();
    }

    /**
     * Create an instance of {@link GnUserToInfoResponse }
     * 
     */
    public GnUserToInfoResponse createGnUserToInfoResponse() {
        return new GnUserToInfoResponse();
    }

    /**
     * Create an instance of {@link GnUserToInfo }
     * 
     */
    public GnUserToInfo createGnUserToInfo() {
        return new GnUserToInfo();
    }

    /**
     * Create an instance of {@link GetGtsToAreasByGtsId }
     * 
     */
    public GetGtsToAreasByGtsId createGetGtsToAreasByGtsId() {
        return new GetGtsToAreasByGtsId();
    }

    /**
     * Create an instance of {@link GncGetUserGlonassBiasClassResponse }
     * 
     */
    public GncGetUserGlonassBiasClassResponse createGncGetUserGlonassBiasClassResponse() {
        return new GncGetUserGlonassBiasClassResponse();
    }

    /**
     * Create an instance of {@link AddServiceReturning }
     * 
     */
    public AddServiceReturning createAddServiceReturning() {
        return new AddServiceReturning();
    }

    /**
     * Create an instance of {@link SetBillingAttributeTypeResponse }
     * 
     */
    public SetBillingAttributeTypeResponse createSetBillingAttributeTypeResponse() {
        return new SetBillingAttributeTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteGtsToAreaResponse }
     * 
     */
    public DeleteGtsToAreaResponse createDeleteGtsToAreaResponse() {
        return new DeleteGtsToAreaResponse();
    }

    /**
     * Create an instance of {@link DeleteInfoPredefineByInfoPredefineResponse }
     * 
     */
    public DeleteInfoPredefineByInfoPredefineResponse createDeleteInfoPredefineByInfoPredefineResponse() {
        return new DeleteInfoPredefineByInfoPredefineResponse();
    }

    /**
     * Create an instance of {@link AddServiceToInfoResponse }
     * 
     */
    public AddServiceToInfoResponse createAddServiceToInfoResponse() {
        return new AddServiceToInfoResponse();
    }

    /**
     * Create an instance of {@link GetCountServiceChildrenById }
     * 
     */
    public GetCountServiceChildrenById createGetCountServiceChildrenById() {
        return new GetCountServiceChildrenById();
    }

    /**
     * Create an instance of {@link DoProcessing }
     * 
     */
    public DoProcessing createDoProcessing() {
        return new DoProcessing();
    }

    /**
     * Create an instance of {@link GnProcessing }
     * 
     */
    public GnProcessing createGnProcessing() {
        return new GnProcessing();
    }

    /**
     * Create an instance of {@link StopServiceResponse }
     * 
     */
    public StopServiceResponse createStopServiceResponse() {
        return new StopServiceResponse();
    }

    /**
     * Create an instance of {@link LoginByUsername }
     * 
     */
    public LoginByUsername createLoginByUsername() {
        return new LoginByUsername();
    }

    /**
     * Create an instance of {@link DeleteUserServiceById }
     * 
     */
    public DeleteUserServiceById createDeleteUserServiceById() {
        return new DeleteUserServiceById();
    }

    /**
     * Create an instance of {@link SetUserTypeResponse }
     * 
     */
    public SetUserTypeResponse createSetUserTypeResponse() {
        return new SetUserTypeResponse();
    }

    /**
     * Create an instance of {@link GnuSetUserResponse }
     * 
     */
    public GnuSetUserResponse createGnuSetUserResponse() {
        return new GnuSetUserResponse();
    }

    /**
     * Create an instance of {@link GncGetUserOrganisationMembers }
     * 
     */
    public GncGetUserOrganisationMembers createGncGetUserOrganisationMembers() {
        return new GncGetUserOrganisationMembers();
    }

    /**
     * Create an instance of {@link GnStreamsAdditionalResponse }
     * 
     */
    public GnStreamsAdditionalResponse createGnStreamsAdditionalResponse() {
        return new GnStreamsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnuAddStream }
     * 
     */
    public GnuAddStream createGnuAddStream() {
        return new GnuAddStream();
    }

    /**
     * Create an instance of {@link GnCasters }
     * 
     */
    public GnCasters createGnCasters() {
        return new GnCasters();
    }

    /**
     * Create an instance of {@link DeleteUserGroup }
     * 
     */
    public DeleteUserGroup createDeleteUserGroup() {
        return new DeleteUserGroup();
    }

    /**
     * Create an instance of {@link GncGetServiceTimeToDisconn }
     * 
     */
    public GncGetServiceTimeToDisconn createGncGetServiceTimeToDisconn() {
        return new GncGetServiceTimeToDisconn();
    }

    /**
     * Create an instance of {@link GnuSetInfo }
     * 
     */
    public GnuSetInfo createGnuSetInfo() {
        return new GnuSetInfo();
    }

    /**
     * Create an instance of {@link GnInfo }
     * 
     */
    public GnInfo createGnInfo() {
        return new GnInfo();
    }

    /**
     * Create an instance of {@link GetUserToInfos }
     * 
     */
    public GetUserToInfos createGetUserToInfos() {
        return new GetUserToInfos();
    }

    /**
     * Create an instance of {@link AddUserToInfo }
     * 
     */
    public AddUserToInfo createAddUserToInfo() {
        return new AddUserToInfo();
    }

    /**
     * Create an instance of {@link GncApplyCasterInstance }
     * 
     */
    public GncApplyCasterInstance createGncApplyCasterInstance() {
        return new GncApplyCasterInstance();
    }

    /**
     * Create an instance of {@link GnuDeleteGroupResponse }
     * 
     */
    public GnuDeleteGroupResponse createGnuDeleteGroupResponse() {
        return new GnuDeleteGroupResponse();
    }

    /**
     * Create an instance of {@link GnuSetInfoResponse }
     * 
     */
    public GnuSetInfoResponse createGnuSetInfoResponse() {
        return new GnuSetInfoResponse();
    }

    /**
     * Create an instance of {@link GnuDeleteInfo }
     * 
     */
    public GnuDeleteInfo createGnuDeleteInfo() {
        return new GnuDeleteInfo();
    }

    /**
     * Create an instance of {@link GetBillingAttributeTypes }
     * 
     */
    public GetBillingAttributeTypes createGetBillingAttributeTypes() {
        return new GetBillingAttributeTypes();
    }

    /**
     * Create an instance of {@link LoginByEmail }
     * 
     */
    public LoginByEmail createLoginByEmail() {
        return new LoginByEmail();
    }

    /**
     * Create an instance of {@link GetCountUserChildrenById }
     * 
     */
    public GetCountUserChildrenById createGetCountUserChildrenById() {
        return new GetCountUserChildrenById();
    }

    /**
     * Create an instance of {@link GnPair }
     * 
     */
    public GnPair createGnPair() {
        return new GnPair();
    }

    /**
     * Create an instance of {@link Strings }
     * 
     */
    public Strings createStrings() {
        return new Strings();
    }

    /**
     * Create an instance of {@link GetStream }
     * 
     */
    public GetStream createGetStream() {
        return new GetStream();
    }

    /**
     * Create an instance of {@link LoginByAdmin }
     * 
     */
    public LoginByAdmin createLoginByAdmin() {
        return new LoginByAdmin();
    }

    /**
     * Create an instance of {@link SetUserByEmail }
     * 
     */
    public SetUserByEmail createSetUserByEmail() {
        return new SetUserByEmail();
    }

    /**
     * Create an instance of {@link SetStream }
     * 
     */
    public SetStream createSetStream() {
        return new SetStream();
    }

    /**
     * Create an instance of {@link DeleteStreamResponse }
     * 
     */
    public DeleteStreamResponse createDeleteStreamResponse() {
        return new DeleteStreamResponse();
    }

    /**
     * Create an instance of {@link GetBillingsByServiceId }
     * 
     */
    public GetBillingsByServiceId createGetBillingsByServiceId() {
        return new GetBillingsByServiceId();
    }

    /**
     * Create an instance of {@link GetExportResponse }
     * 
     */
    public GetExportResponse createGetExportResponse() {
        return new GetExportResponse();
    }

    /**
     * Create an instance of {@link GetBillingsUsersOrgsAndManagers }
     * 
     */
    public GetBillingsUsersOrgsAndManagers createGetBillingsUsersOrgsAndManagers() {
        return new GetBillingsUsersOrgsAndManagers();
    }

    /**
     * Create an instance of {@link GetGroupServices }
     * 
     */
    public GetGroupServices createGetGroupServices() {
        return new GetGroupServices();
    }

    /**
     * Create an instance of {@link GnUserToServicesResponse }
     * 
     */
    public GnUserToServicesResponse createGnUserToServicesResponse() {
        return new GnUserToServicesResponse();
    }

    /**
     * Create an instance of {@link AddBilling }
     * 
     */
    public AddBilling createAddBilling() {
        return new AddBilling();
    }

    /**
     * Create an instance of {@link DeleteBillingsByFilter }
     * 
     */
    public DeleteBillingsByFilter createDeleteBillingsByFilter() {
        return new DeleteBillingsByFilter();
    }

    /**
     * Create an instance of {@link SetGroupByName }
     * 
     */
    public SetGroupByName createSetGroupByName() {
        return new SetGroupByName();
    }

    /**
     * Create an instance of {@link DeleteUserType }
     * 
     */
    public DeleteUserType createDeleteUserType() {
        return new DeleteUserType();
    }

    /**
     * Create an instance of {@link GnuDeleteGroup }
     * 
     */
    public GnuDeleteGroup createGnuDeleteGroup() {
        return new GnuDeleteGroup();
    }

    /**
     * Create an instance of {@link CheckPermissionResponse }
     * 
     */
    public CheckPermissionResponse createCheckPermissionResponse() {
        return new CheckPermissionResponse();
    }

    /**
     * Create an instance of {@link GetUserByServiceId }
     * 
     */
    public GetUserByServiceId createGetUserByServiceId() {
        return new GetUserByServiceId();
    }

    /**
     * Create an instance of {@link GnLoginResponse }
     * 
     */
    public GnLoginResponse createGnLoginResponse() {
        return new GnLoginResponse();
    }

    /**
     * Create an instance of {@link GnLogin }
     * 
     */
    public GnLogin createGnLogin() {
        return new GnLogin();
    }

    /**
     * Create an instance of {@link GncAddConnectionInfoResponse }
     * 
     */
    public GncAddConnectionInfoResponse createGncAddConnectionInfoResponse() {
        return new GncAddConnectionInfoResponse();
    }

    /**
     * Create an instance of {@link AddServiceToInfoReturning }
     * 
     */
    public AddServiceToInfoReturning createAddServiceToInfoReturning() {
        return new AddServiceToInfoReturning();
    }

    /**
     * Create an instance of {@link GnServiceToInfo }
     * 
     */
    public GnServiceToInfo createGnServiceToInfo() {
        return new GnServiceToInfo();
    }

    /**
     * Create an instance of {@link AddInfoPredefine }
     * 
     */
    public AddInfoPredefine createAddInfoPredefine() {
        return new AddInfoPredefine();
    }

    /**
     * Create an instance of {@link GnInfoPredefine }
     * 
     */
    public GnInfoPredefine createGnInfoPredefine() {
        return new GnInfoPredefine();
    }

    /**
     * Create an instance of {@link GnBillingResponse }
     * 
     */
    public GnBillingResponse createGnBillingResponse() {
        return new GnBillingResponse();
    }

    /**
     * Create an instance of {@link DeleteInfo }
     * 
     */
    public DeleteInfo createDeleteInfo() {
        return new DeleteInfo();
    }

    /**
     * Create an instance of {@link AddUtsToAreaResponse }
     * 
     */
    public AddUtsToAreaResponse createAddUtsToAreaResponse() {
        return new AddUtsToAreaResponse();
    }

    /**
     * Create an instance of {@link AddNetwork }
     * 
     */
    public AddNetwork createAddNetwork() {
        return new AddNetwork();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetUserServicesWithOptionsAdditional }
     * 
     */
    public GetUserServicesWithOptionsAdditional createGetUserServicesWithOptionsAdditional() {
        return new GetUserServicesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GnBillingsResponse }
     * 
     */
    public GnBillingsResponse createGnBillingsResponse() {
        return new GnBillingsResponse();
    }

    /**
     * Create an instance of {@link GnBillings }
     * 
     */
    public GnBillings createGnBillings() {
        return new GnBillings();
    }

    /**
     * Create an instance of {@link GetBillingAttributeType }
     * 
     */
    public GetBillingAttributeType createGetBillingAttributeType() {
        return new GetBillingAttributeType();
    }

    /**
     * Create an instance of {@link DeleteInfoResponse }
     * 
     */
    public DeleteInfoResponse createDeleteInfoResponse() {
        return new DeleteInfoResponse();
    }

    /**
     * Create an instance of {@link SetCaster }
     * 
     */
    public SetCaster createSetCaster() {
        return new SetCaster();
    }

    /**
     * Create an instance of {@link GnBillingAttributeTypesResponse }
     * 
     */
    public GnBillingAttributeTypesResponse createGnBillingAttributeTypesResponse() {
        return new GnBillingAttributeTypesResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttributeTypes }
     * 
     */
    public GnBillingAttributeTypes createGnBillingAttributeTypes() {
        return new GnBillingAttributeTypes();
    }

    /**
     * Create an instance of {@link SetUserByNameResponse }
     * 
     */
    public SetUserByNameResponse createSetUserByNameResponse() {
        return new SetUserByNameResponse();
    }

    /**
     * Create an instance of {@link GnUserToServicesAdditionalResponse }
     * 
     */
    public GnUserToServicesAdditionalResponse createGnUserToServicesAdditionalResponse() {
        return new GnUserToServicesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetServicesWithOptionsAdditional }
     * 
     */
    public GetServicesWithOptionsAdditional createGetServicesWithOptionsAdditional() {
        return new GetServicesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GncStartUserBilling }
     * 
     */
    public GncStartUserBilling createGncStartUserBilling() {
        return new GncStartUserBilling();
    }

    /**
     * Create an instance of {@link GncIsMountpointPermitted }
     * 
     */
    public GncIsMountpointPermitted createGncIsMountpointPermitted() {
        return new GncIsMountpointPermitted();
    }

    /**
     * Create an instance of {@link DeleteUserTypeResponse }
     * 
     */
    public DeleteUserTypeResponse createDeleteUserTypeResponse() {
        return new DeleteUserTypeResponse();
    }

    /**
     * Create an instance of {@link AddNetworkReturning }
     * 
     */
    public AddNetworkReturning createAddNetworkReturning() {
        return new AddNetworkReturning();
    }

    /**
     * Create an instance of {@link GncDidSourceTableChange }
     * 
     */
    public GncDidSourceTableChange createGncDidSourceTableChange() {
        return new GncDidSourceTableChange();
    }

    /**
     * Create an instance of {@link GnNetworkResponse }
     * 
     */
    public GnNetworkResponse createGnNetworkResponse() {
        return new GnNetworkResponse();
    }

    /**
     * Create an instance of {@link SetServiceToInfo }
     * 
     */
    public SetServiceToInfo createSetServiceToInfo() {
        return new SetServiceToInfo();
    }

    /**
     * Create an instance of {@link AddUserGroupResponse }
     * 
     */
    public AddUserGroupResponse createAddUserGroupResponse() {
        return new AddUserGroupResponse();
    }

    /**
     * Create an instance of {@link GetUserGroups }
     * 
     */
    public GetUserGroups createGetUserGroups() {
        return new GetUserGroups();
    }

    /**
     * Create an instance of {@link GetGroupsWithOptionsAdditional }
     * 
     */
    public GetGroupsWithOptionsAdditional createGetGroupsWithOptionsAdditional() {
        return new GetGroupsWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link StopService }
     * 
     */
    public StopService createStopService() {
        return new StopService();
    }

    /**
     * Create an instance of {@link DeleteArea }
     * 
     */
    public DeleteArea createDeleteArea() {
        return new DeleteArea();
    }

    /**
     * Create an instance of {@link GetInfosWithOptionsAdditional }
     * 
     */
    public GetInfosWithOptionsAdditional createGetInfosWithOptionsAdditional() {
        return new GetInfosWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetUserTypesWithOptionsAdditional }
     * 
     */
    public GetUserTypesWithOptionsAdditional createGetUserTypesWithOptionsAdditional() {
        return new GetUserTypesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link AddInfoReturning }
     * 
     */
    public AddInfoReturning createAddInfoReturning() {
        return new AddInfoReturning();
    }

    /**
     * Create an instance of {@link DeleteBillingAttributeType }
     * 
     */
    public DeleteBillingAttributeType createDeleteBillingAttributeType() {
        return new DeleteBillingAttributeType();
    }

    /**
     * Create an instance of {@link DeleteInfoByName }
     * 
     */
    public DeleteInfoByName createDeleteInfoByName() {
        return new DeleteInfoByName();
    }

    /**
     * Create an instance of {@link GnGroupToServicesAdditionalResponse }
     * 
     */
    public GnGroupToServicesAdditionalResponse createGnGroupToServicesAdditionalResponse() {
        return new GnGroupToServicesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnuGetStream }
     * 
     */
    public GnuGetStream createGnuGetStream() {
        return new GnuGetStream();
    }

    /**
     * Create an instance of {@link DeleteGroupService }
     * 
     */
    public DeleteGroupService createDeleteGroupService() {
        return new DeleteGroupService();
    }

    /**
     * Create an instance of {@link GetBillingsByUserId }
     * 
     */
    public GetBillingsByUserId createGetBillingsByUserId() {
        return new GetBillingsByUserId();
    }

    /**
     * Create an instance of {@link GNCWithAutoSwitchResponse }
     * 
     */
    public GNCWithAutoSwitchResponse createGNCWithAutoSwitchResponse() {
        return new GNCWithAutoSwitchResponse();
    }

    /**
     * Create an instance of {@link GNCAutoSwitchArray }
     * 
     */
    public GNCAutoSwitchArray createGNCAutoSwitchArray() {
        return new GNCAutoSwitchArray();
    }

    /**
     * Create an instance of {@link GnGroupToServicesResponse }
     * 
     */
    public GnGroupToServicesResponse createGnGroupToServicesResponse() {
        return new GnGroupToServicesResponse();
    }

    /**
     * Create an instance of {@link GnUsersAdditionalResponse }
     * 
     */
    public GnUsersAdditionalResponse createGnUsersAdditionalResponse() {
        return new GnUsersAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetUserServicesByLicence }
     * 
     */
    public GetUserServicesByLicence createGetUserServicesByLicence() {
        return new GetUserServicesByLicence();
    }

    /**
     * Create an instance of {@link SetUserById }
     * 
     */
    public SetUserById createSetUserById() {
        return new SetUserById();
    }

    /**
     * Create an instance of {@link GncCheckUserNamePasswordResponse }
     * 
     */
    public GncCheckUserNamePasswordResponse createGncCheckUserNamePasswordResponse() {
        return new GncCheckUserNamePasswordResponse();
    }

    /**
     * Create an instance of {@link GnuDeleteInfoResponse }
     * 
     */
    public GnuDeleteInfoResponse createGnuDeleteInfoResponse() {
        return new GnuDeleteInfoResponse();
    }

    /**
     * Create an instance of {@link GetGroupServicesWithOptionsAdditional }
     * 
     */
    public GetGroupServicesWithOptionsAdditional createGetGroupServicesWithOptionsAdditional() {
        return new GetGroupServicesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GncGetSourceTable }
     * 
     */
    public GncGetSourceTable createGncGetSourceTable() {
        return new GncGetSourceTable();
    }

    /**
     * Create an instance of {@link GetUserServicesByUserIdAndServiceIdWithOptionsAdditional }
     * 
     */
    public GetUserServicesByUserIdAndServiceIdWithOptionsAdditional createGetUserServicesByUserIdAndServiceIdWithOptionsAdditional() {
        return new GetUserServicesByUserIdAndServiceIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetGtsToAreasWithOptionsAdditional }
     * 
     */
    public GetGtsToAreasWithOptionsAdditional createGetGtsToAreasWithOptionsAdditional() {
        return new GetGtsToAreasWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetBillings }
     * 
     */
    public GetBillings createGetBillings() {
        return new GetBillings();
    }

    /**
     * Create an instance of {@link DeleteUtsToAreaResponse }
     * 
     */
    public DeleteUtsToAreaResponse createDeleteUtsToAreaResponse() {
        return new DeleteUtsToAreaResponse();
    }

    /**
     * Create an instance of {@link DeleteInfoByNameResponse }
     * 
     */
    public DeleteInfoByNameResponse createDeleteInfoByNameResponse() {
        return new DeleteInfoByNameResponse();
    }

    /**
     * Create an instance of {@link GnUserToInfosResponse }
     * 
     */
    public GnUserToInfosResponse createGnUserToInfosResponse() {
        return new GnUserToInfosResponse();
    }

    /**
     * Create an instance of {@link AddInfoResponse }
     * 
     */
    public AddInfoResponse createAddInfoResponse() {
        return new AddInfoResponse();
    }

    /**
     * Create an instance of {@link AddUserServiceResponse }
     * 
     */
    public AddUserServiceResponse createAddUserServiceResponse() {
        return new AddUserServiceResponse();
    }

    /**
     * Create an instance of {@link GetProcessedFileResponse }
     * 
     */
    public GetProcessedFileResponse createGetProcessedFileResponse() {
        return new GetProcessedFileResponse();
    }

    /**
     * Create an instance of {@link GetUserPwd }
     * 
     */
    public GetUserPwd createGetUserPwd() {
        return new GetUserPwd();
    }

    /**
     * Create an instance of {@link GnuDeleteCasterResponse }
     * 
     */
    public GnuDeleteCasterResponse createGnuDeleteCasterResponse() {
        return new GnuDeleteCasterResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingsByUserId }
     * 
     */
    public DeleteBillingsByUserId createDeleteBillingsByUserId() {
        return new DeleteBillingsByUserId();
    }

    /**
     * Create an instance of {@link DeleteUserByIdResponse }
     * 
     */
    public DeleteUserByIdResponse createDeleteUserByIdResponse() {
        return new DeleteUserByIdResponse();
    }

    /**
     * Create an instance of {@link EventGetAlmostExpiredUsers }
     * 
     */
    public EventGetAlmostExpiredUsers createEventGetAlmostExpiredUsers() {
        return new EventGetAlmostExpiredUsers();
    }

    /**
     * Create an instance of {@link GnInfoPredefinesResponse }
     * 
     */
    public GnInfoPredefinesResponse createGnInfoPredefinesResponse() {
        return new GnInfoPredefinesResponse();
    }

    /**
     * Create an instance of {@link CoordInArea }
     * 
     */
    public CoordInArea createCoordInArea() {
        return new CoordInArea();
    }

    /**
     * Create an instance of {@link GnuUserRemainingResponse }
     * 
     */
    public GnuUserRemainingResponse createGnuUserRemainingResponse() {
        return new GnuUserRemainingResponse();
    }

    /**
     * Create an instance of {@link GetBillingsWithOptionsAdditional }
     * 
     */
    public GetBillingsWithOptionsAdditional createGetBillingsWithOptionsAdditional() {
        return new GetBillingsWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link DoProcessingResponse }
     * 
     */
    public DoProcessingResponse createDoProcessingResponse() {
        return new DoProcessingResponse();
    }

    /**
     * Create an instance of {@link GnCastersResponse }
     * 
     */
    public GnCastersResponse createGnCastersResponse() {
        return new GnCastersResponse();
    }

    /**
     * Create an instance of {@link GetNetwork }
     * 
     */
    public GetNetwork createGetNetwork() {
        return new GetNetwork();
    }

    /**
     * Create an instance of {@link GncInitGNCaster }
     * 
     */
    public GncInitGNCaster createGncInitGNCaster() {
        return new GncInitGNCaster();
    }

    /**
     * Create an instance of {@link GnAreasAdditionalResponse }
     * 
     */
    public GnAreasAdditionalResponse createGnAreasAdditionalResponse() {
        return new GnAreasAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnAreas }
     * 
     */
    public GnAreas createGnAreas() {
        return new GnAreas();
    }

    /**
     * Create an instance of {@link GnUserToServiceResponse }
     * 
     */
    public GnUserToServiceResponse createGnUserToServiceResponse() {
        return new GnUserToServiceResponse();
    }

    /**
     * Create an instance of {@link BuildServiceStructure }
     * 
     */
    public BuildServiceStructure createBuildServiceStructure() {
        return new BuildServiceStructure();
    }

    /**
     * Create an instance of {@link GnServices }
     * 
     */
    public GnServices createGnServices() {
        return new GnServices();
    }

    /**
     * Create an instance of {@link GncGetSourceTableByUserName }
     * 
     */
    public GncGetSourceTableByUserName createGncGetSourceTableByUserName() {
        return new GncGetSourceTableByUserName();
    }

    /**
     * Create an instance of {@link GnuDeleteStream }
     * 
     */
    public GnuDeleteStream createGnuDeleteStream() {
        return new GnuDeleteStream();
    }

    /**
     * Create an instance of {@link GetServiceChildrenByIdWithOptionsAdditional }
     * 
     */
    public GetServiceChildrenByIdWithOptionsAdditional createGetServiceChildrenByIdWithOptionsAdditional() {
        return new GetServiceChildrenByIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetInfoPredefines }
     * 
     */
    public GetInfoPredefines createGetInfoPredefines() {
        return new GetInfoPredefines();
    }

    /**
     * Create an instance of {@link GetUserByBillingId }
     * 
     */
    public GetUserByBillingId createGetUserByBillingId() {
        return new GetUserByBillingId();
    }

    /**
     * Create an instance of {@link GnTableResponse }
     * 
     */
    public GnTableResponse createGnTableResponse() {
        return new GnTableResponse();
    }

    /**
     * Create an instance of {@link GnTable }
     * 
     */
    public GnTable createGnTable() {
        return new GnTable();
    }

    /**
     * Create an instance of {@link AddInfoPredefineResponse }
     * 
     */
    public AddInfoPredefineResponse createAddInfoPredefineResponse() {
        return new AddInfoPredefineResponse();
    }

    /**
     * Create an instance of {@link EventGetExpiredGroupToServices }
     * 
     */
    public EventGetExpiredGroupToServices createEventGetExpiredGroupToServices() {
        return new EventGetExpiredGroupToServices();
    }

    /**
     * Create an instance of {@link AddBillingAttributeResponse }
     * 
     */
    public AddBillingAttributeResponse createAddBillingAttributeResponse() {
        return new AddBillingAttributeResponse();
    }

    /**
     * Create an instance of {@link GetUtsToAreasByUtsId }
     * 
     */
    public GetUtsToAreasByUtsId createGetUtsToAreasByUtsId() {
        return new GetUtsToAreasByUtsId();
    }

    /**
     * Create an instance of {@link DeleteGroupByName }
     * 
     */
    public DeleteGroupByName createDeleteGroupByName() {
        return new DeleteGroupByName();
    }

    /**
     * Create an instance of {@link SetInfo }
     * 
     */
    public SetInfo createSetInfo() {
        return new SetInfo();
    }

    /**
     * Create an instance of {@link GnUtsToAreasAdditionalResponse }
     * 
     */
    public GnUtsToAreasAdditionalResponse createGnUtsToAreasAdditionalResponse() {
        return new GnUtsToAreasAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnuInfoResponse }
     * 
     */
    public GnuInfoResponse createGnuInfoResponse() {
        return new GnuInfoResponse();
    }

    /**
     * Create an instance of {@link GnuInfo }
     * 
     */
    public GnuInfo createGnuInfo() {
        return new GnuInfo();
    }

    /**
     * Create an instance of {@link SetBillingAttributeType }
     * 
     */
    public SetBillingAttributeType createSetBillingAttributeType() {
        return new SetBillingAttributeType();
    }

    /**
     * Create an instance of {@link DeleteInfoPredefineByInfoPredefine }
     * 
     */
    public DeleteInfoPredefineByInfoPredefine createDeleteInfoPredefineByInfoPredefine() {
        return new DeleteInfoPredefineByInfoPredefine();
    }

    /**
     * Create an instance of {@link GnAreaResponse }
     * 
     */
    public GnAreaResponse createGnAreaResponse() {
        return new GnAreaResponse();
    }

    /**
     * Create an instance of {@link GnArea }
     * 
     */
    public GnArea createGnArea() {
        return new GnArea();
    }

    /**
     * Create an instance of {@link DeleteAreaResponse }
     * 
     */
    public DeleteAreaResponse createDeleteAreaResponse() {
        return new DeleteAreaResponse();
    }

    /**
     * Create an instance of {@link SetGroupByNameResponse }
     * 
     */
    public SetGroupByNameResponse createSetGroupByNameResponse() {
        return new SetGroupByNameResponse();
    }

    /**
     * Create an instance of {@link GnuUserResponse }
     * 
     */
    public GnuUserResponse createGnuUserResponse() {
        return new GnuUserResponse();
    }

    /**
     * Create an instance of {@link GnuUser }
     * 
     */
    public GnuUser createGnuUser() {
        return new GnuUser();
    }

    /**
     * Create an instance of {@link DeleteServiceToInfoResponse }
     * 
     */
    public DeleteServiceToInfoResponse createDeleteServiceToInfoResponse() {
        return new DeleteServiceToInfoResponse();
    }

    /**
     * Create an instance of {@link GnInfosAdditionalResponse }
     * 
     */
    public GnInfosAdditionalResponse createGnInfosAdditionalResponse() {
        return new GnInfosAdditionalResponse();
    }

    /**
     * Create an instance of {@link DeleteBillingsByServiceIdResponse }
     * 
     */
    public DeleteBillingsByServiceIdResponse createDeleteBillingsByServiceIdResponse() {
        return new DeleteBillingsByServiceIdResponse();
    }

    /**
     * Create an instance of {@link GetServiceChildrenById }
     * 
     */
    public GetServiceChildrenById createGetServiceChildrenById() {
        return new GetServiceChildrenById();
    }

    /**
     * Create an instance of {@link SetUserType }
     * 
     */
    public SetUserType createSetUserType() {
        return new SetUserType();
    }

    /**
     * Create an instance of {@link GnUserType }
     * 
     */
    public GnUserType createGnUserType() {
        return new GnUserType();
    }

    /**
     * Create an instance of {@link SetBillingById }
     * 
     */
    public SetBillingById createSetBillingById() {
        return new SetBillingById();
    }

    /**
     * Create an instance of {@link GnGtsToAreasAdditionalResponse }
     * 
     */
    public GnGtsToAreasAdditionalResponse createGnGtsToAreasAdditionalResponse() {
        return new GnGtsToAreasAdditionalResponse();
    }

    /**
     * Create an instance of {@link EventGetAlmostExpiredGroupToServices }
     * 
     */
    public EventGetAlmostExpiredGroupToServices createEventGetAlmostExpiredGroupToServices() {
        return new EventGetAlmostExpiredGroupToServices();
    }

    /**
     * Create an instance of {@link EventGetExpiredGroups }
     * 
     */
    public EventGetExpiredGroups createEventGetExpiredGroups() {
        return new EventGetExpiredGroups();
    }

    /**
     * Create an instance of {@link GnuAddGroupResponse }
     * 
     */
    public GnuAddGroupResponse createGnuAddGroupResponse() {
        return new GnuAddGroupResponse();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link GetVersionDLL }
     * 
     */
    public GetVersionDLL createGetVersionDLL() {
        return new GetVersionDLL();
    }

    /**
     * Create an instance of {@link GetUserServiceById }
     * 
     */
    public GetUserServiceById createGetUserServiceById() {
        return new GetUserServiceById();
    }

    /**
     * Create an instance of {@link GncCheckUserNamePassword }
     * 
     */
    public GncCheckUserNamePassword createGncCheckUserNamePassword() {
        return new GncCheckUserNamePassword();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByUserId }
     * 
     */
    public DeleteUserServiceByUserId createDeleteUserServiceByUserId() {
        return new DeleteUserServiceByUserId();
    }

    /**
     * Create an instance of {@link GnuDeleteUser }
     * 
     */
    public GnuDeleteUser createGnuDeleteUser() {
        return new GnuDeleteUser();
    }

    /**
     * Create an instance of {@link GnUsersAndBillingsAdditionalResponse }
     * 
     */
    public GnUsersAndBillingsAdditionalResponse createGnUsersAndBillingsAdditionalResponse() {
        return new GnUsersAndBillingsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetServiceToInfo }
     * 
     */
    public GetServiceToInfo createGetServiceToInfo() {
        return new GetServiceToInfo();
    }

    /**
     * Create an instance of {@link ImportAreasResponse }
     * 
     */
    public ImportAreasResponse createImportAreasResponse() {
        return new ImportAreasResponse();
    }

    /**
     * Create an instance of {@link GncGetUserOrganisation }
     * 
     */
    public GncGetUserOrganisation createGncGetUserOrganisation() {
        return new GncGetUserOrganisation();
    }

    /**
     * Create an instance of {@link SetBillingAttributeResponse }
     * 
     */
    public SetBillingAttributeResponse createSetBillingAttributeResponse() {
        return new SetBillingAttributeResponse();
    }

    /**
     * Create an instance of {@link GetVersionWsdl }
     * 
     */
    public GetVersionWsdl createGetVersionWsdl() {
        return new GetVersionWsdl();
    }

    /**
     * Create an instance of {@link AddUtsToArea }
     * 
     */
    public AddUtsToArea createAddUtsToArea() {
        return new AddUtsToArea();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByUserIdResponse }
     * 
     */
    public DeleteUserServiceByUserIdResponse createDeleteUserServiceByUserIdResponse() {
        return new DeleteUserServiceByUserIdResponse();
    }

    /**
     * Create an instance of {@link AddUserServiceReturningResponse }
     * 
     */
    public AddUserServiceReturningResponse createAddUserServiceReturningResponse() {
        return new AddUserServiceReturningResponse();
    }

    /**
     * Create an instance of {@link GncUpdateBillingsResponse }
     * 
     */
    public GncUpdateBillingsResponse createGncUpdateBillingsResponse() {
        return new GncUpdateBillingsResponse();
    }

    /**
     * Create an instance of {@link AddService }
     * 
     */
    public AddService createAddService() {
        return new AddService();
    }

    /**
     * Create an instance of {@link DeleteCasterResponse }
     * 
     */
    public DeleteCasterResponse createDeleteCasterResponse() {
        return new DeleteCasterResponse();
    }

    /**
     * Create an instance of {@link DeleteGroupServiceResponse }
     * 
     */
    public DeleteGroupServiceResponse createDeleteGroupServiceResponse() {
        return new DeleteGroupServiceResponse();
    }

    /**
     * Create an instance of {@link GnBillingAttributesAdditionalResponse }
     * 
     */
    public GnBillingAttributesAdditionalResponse createGnBillingAttributesAdditionalResponse() {
        return new GnBillingAttributesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GncAddConnectionInfo }
     * 
     */
    public GncAddConnectionInfo createGncAddConnectionInfo() {
        return new GncAddConnectionInfo();
    }

    /**
     * Create an instance of {@link GetUserServices }
     * 
     */
    public GetUserServices createGetUserServices() {
        return new GetUserServices();
    }

    /**
     * Create an instance of {@link GnNetworksAdditionalResponse }
     * 
     */
    public GnNetworksAdditionalResponse createGnNetworksAdditionalResponse() {
        return new GnNetworksAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnNetworks }
     * 
     */
    public GnNetworks createGnNetworks() {
        return new GnNetworks();
    }

    /**
     * Create an instance of {@link GetErrorMsg }
     * 
     */
    public GetErrorMsg createGetErrorMsg() {
        return new GetErrorMsg();
    }

    /**
     * Create an instance of {@link GnuCasterResponse }
     * 
     */
    public GnuCasterResponse createGnuCasterResponse() {
        return new GnuCasterResponse();
    }

    /**
     * Create an instance of {@link GnuCaster }
     * 
     */
    public GnuCaster createGnuCaster() {
        return new GnuCaster();
    }

    /**
     * Create an instance of {@link GetExport }
     * 
     */
    public GetExport createGetExport() {
        return new GetExport();
    }

    /**
     * Create an instance of {@link GnExportConfiguration }
     * 
     */
    public GnExportConfiguration createGnExportConfiguration() {
        return new GnExportConfiguration();
    }

    /**
     * Create an instance of {@link GncGetUsernameByPhoneNumberResponse }
     * 
     */
    public GncGetUsernameByPhoneNumberResponse createGncGetUsernameByPhoneNumberResponse() {
        return new GncGetUsernameByPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link GetVersionDLLResponse }
     * 
     */
    public GetVersionDLLResponse createGetVersionDLLResponse() {
        return new GetVersionDLLResponse();
    }

    /**
     * Create an instance of {@link AddGroupResponse }
     * 
     */
    public AddGroupResponse createAddGroupResponse() {
        return new AddGroupResponse();
    }

    /**
     * Create an instance of {@link EventGetAlmostExpiredGroups }
     * 
     */
    public EventGetAlmostExpiredGroups createEventGetAlmostExpiredGroups() {
        return new EventGetAlmostExpiredGroups();
    }

    /**
     * Create an instance of {@link DeleteUserByEmail }
     * 
     */
    public DeleteUserByEmail createDeleteUserByEmail() {
        return new DeleteUserByEmail();
    }

    /**
     * Create an instance of {@link AddBillingReturning }
     * 
     */
    public AddBillingReturning createAddBillingReturning() {
        return new AddBillingReturning();
    }

    /**
     * Create an instance of {@link GnBillingAttributeTypesAdditionalResponse }
     * 
     */
    public GnBillingAttributeTypesAdditionalResponse createGnBillingAttributeTypesAdditionalResponse() {
        return new GnBillingAttributeTypesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetUtsToAreaByUtsIdAndAreaId }
     * 
     */
    public GetUtsToAreaByUtsIdAndAreaId createGetUtsToAreaByUtsIdAndAreaId() {
        return new GetUtsToAreaByUtsIdAndAreaId();
    }

    /**
     * Create an instance of {@link GetBillingsByServiceIdWithOptionsAdditional }
     * 
     */
    public GetBillingsByServiceIdWithOptionsAdditional createGetBillingsByServiceIdWithOptionsAdditional() {
        return new GetBillingsByServiceIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetUsersWithOptionsAdditional }
     * 
     */
    public GetUsersWithOptionsAdditional createGetUsersWithOptionsAdditional() {
        return new GetUsersWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GncCheckOnlineAccountsResponse }
     * 
     */
    public GncCheckOnlineAccountsResponse createGncCheckOnlineAccountsResponse() {
        return new GncCheckOnlineAccountsResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GnuDeleteStreamResponse }
     * 
     */
    public GnuDeleteStreamResponse createGnuDeleteStreamResponse() {
        return new GnuDeleteStreamResponse();
    }

    /**
     * Create an instance of {@link GnAreasResponse }
     * 
     */
    public GnAreasResponse createGnAreasResponse() {
        return new GnAreasResponse();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByUserIdAndServiceId }
     * 
     */
    public DeleteUserServiceByUserIdAndServiceId createDeleteUserServiceByUserIdAndServiceId() {
        return new DeleteUserServiceByUserIdAndServiceId();
    }

    /**
     * Create an instance of {@link GetStartTime }
     * 
     */
    public GetStartTime createGetStartTime() {
        return new GetStartTime();
    }

    /**
     * Create an instance of {@link SetServiceById }
     * 
     */
    public SetServiceById createSetServiceById() {
        return new SetServiceById();
    }

    /**
     * Create an instance of {@link AddBillingResponse }
     * 
     */
    public AddBillingResponse createAddBillingResponse() {
        return new AddBillingResponse();
    }

    /**
     * Create an instance of {@link GnGroupsResponse }
     * 
     */
    public GnGroupsResponse createGnGroupsResponse() {
        return new GnGroupsResponse();
    }

    /**
     * Create an instance of {@link GncUpdateBillingResponse }
     * 
     */
    public GncUpdateBillingResponse createGncUpdateBillingResponse() {
        return new GncUpdateBillingResponse();
    }

    /**
     * Create an instance of {@link GncIsMountpointPermittedResponse }
     * 
     */
    public GncIsMountpointPermittedResponse createGncIsMountpointPermittedResponse() {
        return new GncIsMountpointPermittedResponse();
    }

    /**
     * Create an instance of {@link GetTable }
     * 
     */
    public GetTable createGetTable() {
        return new GetTable();
    }

    /**
     * Create an instance of {@link AddGroupReturning }
     * 
     */
    public AddGroupReturning createAddGroupReturning() {
        return new AddGroupReturning();
    }

    /**
     * Create an instance of {@link GnuAddInfo }
     * 
     */
    public GnuAddInfo createGnuAddInfo() {
        return new GnuAddInfo();
    }

    /**
     * Create an instance of {@link GetGroupById }
     * 
     */
    public GetGroupById createGetGroupById() {
        return new GetGroupById();
    }

    /**
     * Create an instance of {@link GnServiceToInfoResponse }
     * 
     */
    public GnServiceToInfoResponse createGnServiceToInfoResponse() {
        return new GnServiceToInfoResponse();
    }

    /**
     * Create an instance of {@link GnUserToInfosAdditionalResponse }
     * 
     */
    public GnUserToInfosAdditionalResponse createGnUserToInfosAdditionalResponse() {
        return new GnUserToInfosAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetServiceToInfos }
     * 
     */
    public GetServiceToInfos createGetServiceToInfos() {
        return new GetServiceToInfos();
    }

    /**
     * Create an instance of {@link GnuGetInfo }
     * 
     */
    public GnuGetInfo createGnuGetInfo() {
        return new GnuGetInfo();
    }

    /**
     * Create an instance of {@link GnGtsToAreasResponse }
     * 
     */
    public GnGtsToAreasResponse createGnGtsToAreasResponse() {
        return new GnGtsToAreasResponse();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByServiceIdResponse }
     * 
     */
    public DeleteUserServiceByServiceIdResponse createDeleteUserServiceByServiceIdResponse() {
        return new DeleteUserServiceByServiceIdResponse();
    }

    /**
     * Create an instance of {@link AddBillingAttributeReturning }
     * 
     */
    public AddBillingAttributeReturning createAddBillingAttributeReturning() {
        return new AddBillingAttributeReturning();
    }

    /**
     * Create an instance of {@link GncGetAreaTimeToDisconnResponse }
     * 
     */
    public GncGetAreaTimeToDisconnResponse createGncGetAreaTimeToDisconnResponse() {
        return new GncGetAreaTimeToDisconnResponse();
    }

    /**
     * Create an instance of {@link SetInfoResponse }
     * 
     */
    public SetInfoResponse createSetInfoResponse() {
        return new SetInfoResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link GnCasterResponse }
     * 
     */
    public GnCasterResponse createGnCasterResponse() {
        return new GnCasterResponse();
    }

    /**
     * Create an instance of {@link SetUserByName }
     * 
     */
    public SetUserByName createSetUserByName() {
        return new SetUserByName();
    }

    /**
     * Create an instance of {@link GnuSetStream }
     * 
     */
    public GnuSetStream createGnuSetStream() {
        return new GnuSetStream();
    }

    /**
     * Create an instance of {@link GncInitGNCasterResponse }
     * 
     */
    public GncInitGNCasterResponse createGncInitGNCasterResponse() {
        return new GncInitGNCasterResponse();
    }

    /**
     * Create an instance of {@link GetInfos }
     * 
     */
    public GetInfos createGetInfos() {
        return new GetInfos();
    }

    /**
     * Create an instance of {@link AddGroupService }
     * 
     */
    public AddGroupService createAddGroupService() {
        return new AddGroupService();
    }

    /**
     * Create an instance of {@link GnuAddGroup }
     * 
     */
    public GnuAddGroup createGnuAddGroup() {
        return new GnuAddGroup();
    }

    /**
     * Create an instance of {@link AddGroup }
     * 
     */
    public AddGroup createAddGroup() {
        return new AddGroup();
    }

    /**
     * Create an instance of {@link AddNetworkResponse }
     * 
     */
    public AddNetworkResponse createAddNetworkResponse() {
        return new AddNetworkResponse();
    }

    /**
     * Create an instance of {@link GnServicesAdditionalResponse }
     * 
     */
    public GnServicesAdditionalResponse createGnServicesAdditionalResponse() {
        return new GnServicesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetNetworks }
     * 
     */
    public GetNetworks createGetNetworks() {
        return new GetNetworks();
    }

    /**
     * Create an instance of {@link GnInfoResponse }
     * 
     */
    public GnInfoResponse createGnInfoResponse() {
        return new GnInfoResponse();
    }

    /**
     * Create an instance of {@link AddUserGroup }
     * 
     */
    public AddUserGroup createAddUserGroup() {
        return new AddUserGroup();
    }

    /**
     * Create an instance of {@link GnUserToGroup }
     * 
     */
    public GnUserToGroup createGnUserToGroup() {
        return new GnUserToGroup();
    }

    /**
     * Create an instance of {@link DeleteUserToInfoResponse }
     * 
     */
    public DeleteUserToInfoResponse createDeleteUserToInfoResponse() {
        return new DeleteUserToInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByUserIdAndServiceIdResponse }
     * 
     */
    public DeleteUserServiceByUserIdAndServiceIdResponse createDeleteUserServiceByUserIdAndServiceIdResponse() {
        return new DeleteUserServiceByUserIdAndServiceIdResponse();
    }

    /**
     * Create an instance of {@link GnUserTypesResponse }
     * 
     */
    public GnUserTypesResponse createGnUserTypesResponse() {
        return new GnUserTypesResponse();
    }

    /**
     * Create an instance of {@link CoordInAreaResponse }
     * 
     */
    public CoordInAreaResponse createCoordInAreaResponse() {
        return new CoordInAreaResponse();
    }

    /**
     * Create an instance of {@link GncGetUserGlonassBiasClass }
     * 
     */
    public GncGetUserGlonassBiasClass createGncGetUserGlonassBiasClass() {
        return new GncGetUserGlonassBiasClass();
    }

    /**
     * Create an instance of {@link GetUserServicesByUserIdAndServiceId }
     * 
     */
    public GetUserServicesByUserIdAndServiceId createGetUserServicesByUserIdAndServiceId() {
        return new GetUserServicesByUserIdAndServiceId();
    }

    /**
     * Create an instance of {@link AddUserServiceReturning }
     * 
     */
    public AddUserServiceReturning createAddUserServiceReturning() {
        return new AddUserServiceReturning();
    }

    /**
     * Create an instance of {@link AddInfo }
     * 
     */
    public AddInfo createAddInfo() {
        return new AddInfo();
    }

    /**
     * Create an instance of {@link SetGroupServiceResponse }
     * 
     */
    public SetGroupServiceResponse createSetGroupServiceResponse() {
        return new SetGroupServiceResponse();
    }

    /**
     * Create an instance of {@link AddUserType }
     * 
     */
    public AddUserType createAddUserType() {
        return new AddUserType();
    }

    /**
     * Create an instance of {@link GncIsUserInsideByChzId }
     * 
     */
    public GncIsUserInsideByChzId createGncIsUserInsideByChzId() {
        return new GncIsUserInsideByChzId();
    }

    /**
     * Create an instance of {@link AddServiceResponse }
     * 
     */
    public AddServiceResponse createAddServiceResponse() {
        return new AddServiceResponse();
    }

    /**
     * Create an instance of {@link GetCasters }
     * 
     */
    public GetCasters createGetCasters() {
        return new GetCasters();
    }

    /**
     * Create an instance of {@link GetUserByName }
     * 
     */
    public GetUserByName createGetUserByName() {
        return new GetUserByName();
    }

    /**
     * Create an instance of {@link GetUserServicesByServiceId }
     * 
     */
    public GetUserServicesByServiceId createGetUserServicesByServiceId() {
        return new GetUserServicesByServiceId();
    }

    /**
     * Create an instance of {@link GetUserServicesByServiceIdWithOptionsAdditional }
     * 
     */
    public GetUserServicesByServiceIdWithOptionsAdditional createGetUserServicesByServiceIdWithOptionsAdditional() {
        return new GetUserServicesByServiceIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetUserChildrenWithOptionsAdditional }
     * 
     */
    public GetUserChildrenWithOptionsAdditional createGetUserChildrenWithOptionsAdditional() {
        return new GetUserChildrenWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link EventGetAlmostExpiredUserToServices }
     * 
     */
    public EventGetAlmostExpiredUserToServices createEventGetAlmostExpiredUserToServices() {
        return new EventGetAlmostExpiredUserToServices();
    }

    /**
     * Create an instance of {@link GnuAddUserResponse }
     * 
     */
    public GnuAddUserResponse createGnuAddUserResponse() {
        return new GnuAddUserResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link GetUserServicesByUserIdWithOptionsAdditional }
     * 
     */
    public GetUserServicesByUserIdWithOptionsAdditional createGetUserServicesByUserIdWithOptionsAdditional() {
        return new GetUserServicesByUserIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GnBillingsAdditionalResponse }
     * 
     */
    public GnBillingsAdditionalResponse createGnBillingsAdditionalResponse() {
        return new GnBillingsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GetCountUtsToAreasByUtsId }
     * 
     */
    public GetCountUtsToAreasByUtsId createGetCountUtsToAreasByUtsId() {
        return new GetCountUtsToAreasByUtsId();
    }

    /**
     * Create an instance of {@link SetBillingAttribute }
     * 
     */
    public SetBillingAttribute createSetBillingAttribute() {
        return new SetBillingAttribute();
    }

    /**
     * Create an instance of {@link GncGetUserPasswordResponse }
     * 
     */
    public GncGetUserPasswordResponse createGncGetUserPasswordResponse() {
        return new GncGetUserPasswordResponse();
    }

    /**
     * Create an instance of {@link GnServicesResponse }
     * 
     */
    public GnServicesResponse createGnServicesResponse() {
        return new GnServicesResponse();
    }

    /**
     * Create an instance of {@link AddStream }
     * 
     */
    public AddStream createAddStream() {
        return new AddStream();
    }

    /**
     * Create an instance of {@link GetUsersOrgsAndManagers }
     * 
     */
    public GetUsersOrgsAndManagers createGetUsersOrgsAndManagers() {
        return new GetUsersOrgsAndManagers();
    }

    /**
     * Create an instance of {@link GnNetworksResponse }
     * 
     */
    public GnNetworksResponse createGnNetworksResponse() {
        return new GnNetworksResponse();
    }

    /**
     * Create an instance of {@link GetUUID }
     * 
     */
    public GetUUID createGetUUID() {
        return new GetUUID();
    }

    /**
     * Create an instance of {@link GncDidSourceTableChangeResponse }
     * 
     */
    public GncDidSourceTableChangeResponse createGncDidSourceTableChangeResponse() {
        return new GncDidSourceTableChangeResponse();
    }

    /**
     * Create an instance of {@link AddCasterReturning }
     * 
     */
    public AddCasterReturning createAddCasterReturning() {
        return new AddCasterReturning();
    }

    /**
     * Create an instance of {@link AddCaster }
     * 
     */
    public AddCaster createAddCaster() {
        return new AddCaster();
    }

    /**
     * Create an instance of {@link GnuStreamResponse }
     * 
     */
    public GnuStreamResponse createGnuStreamResponse() {
        return new GnuStreamResponse();
    }

    /**
     * Create an instance of {@link GnuStream }
     * 
     */
    public GnuStream createGnuStream() {
        return new GnuStream();
    }

    /**
     * Create an instance of {@link GetCountGtsToAreasByGtsId }
     * 
     */
    public GetCountGtsToAreasByGtsId createGetCountGtsToAreasByGtsId() {
        return new GetCountGtsToAreasByGtsId();
    }

    /**
     * Create an instance of {@link GetGroups }
     * 
     */
    public GetGroups createGetGroups() {
        return new GetGroups();
    }

    /**
     * Create an instance of {@link DeleteBillingAttribute }
     * 
     */
    public DeleteBillingAttribute createDeleteBillingAttribute() {
        return new DeleteBillingAttribute();
    }

    /**
     * Create an instance of {@link GetStreamsWithOptionsAdditional }
     * 
     */
    public GetStreamsWithOptionsAdditional createGetStreamsWithOptionsAdditional() {
        return new GetStreamsWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link SetBillingByTemporaryResponse }
     * 
     */
    public SetBillingByTemporaryResponse createSetBillingByTemporaryResponse() {
        return new SetBillingByTemporaryResponse();
    }

    /**
     * Create an instance of {@link DeleteServiceById }
     * 
     */
    public DeleteServiceById createDeleteServiceById() {
        return new DeleteServiceById();
    }

    /**
     * Create an instance of {@link GetBillingsByUserIdAndChildrenWithOptionAdditional }
     * 
     */
    public GetBillingsByUserIdAndChildrenWithOptionAdditional createGetBillingsByUserIdAndChildrenWithOptionAdditional() {
        return new GetBillingsByUserIdAndChildrenWithOptionAdditional();
    }

    /**
     * Create an instance of {@link DeleteBillingsAndConnInfosByTime }
     * 
     */
    public DeleteBillingsAndConnInfosByTime createDeleteBillingsAndConnInfosByTime() {
        return new DeleteBillingsAndConnInfosByTime();
    }

    /**
     * Create an instance of {@link DeleteBillingAttributeResponse }
     * 
     */
    public DeleteBillingAttributeResponse createDeleteBillingAttributeResponse() {
        return new DeleteBillingAttributeResponse();
    }

    /**
     * Create an instance of {@link GetUserTypes }
     * 
     */
    public GetUserTypes createGetUserTypes() {
        return new GetUserTypes();
    }

    /**
     * Create an instance of {@link GnGtsToAreaResponse }
     * 
     */
    public GnGtsToAreaResponse createGnGtsToAreaResponse() {
        return new GnGtsToAreaResponse();
    }

    /**
     * Create an instance of {@link DeleteNetwork }
     * 
     */
    public DeleteNetwork createDeleteNetwork() {
        return new DeleteNetwork();
    }

    /**
     * Create an instance of {@link GnCastersAdditionalResponse }
     * 
     */
    public GnCastersAdditionalResponse createGnCastersAdditionalResponse() {
        return new GnCastersAdditionalResponse();
    }

    /**
     * Create an instance of {@link DeleteGroupById }
     * 
     */
    public DeleteGroupById createDeleteGroupById() {
        return new DeleteGroupById();
    }

    /**
     * Create an instance of {@link DeleteStream }
     * 
     */
    public DeleteStream createDeleteStream() {
        return new DeleteStream();
    }

    /**
     * Create an instance of {@link SetAreaById }
     * 
     */
    public SetAreaById createSetAreaById() {
        return new SetAreaById();
    }

    /**
     * Create an instance of {@link GetDefaultUser }
     * 
     */
    public GetDefaultUser createGetDefaultUser() {
        return new GetDefaultUser();
    }

    /**
     * Create an instance of {@link SetUserByEmailResponse }
     * 
     */
    public SetUserByEmailResponse createSetUserByEmailResponse() {
        return new SetUserByEmailResponse();
    }

    /**
     * Create an instance of {@link GetBillingAttributesWithOptionsAdditional }
     * 
     */
    public GetBillingAttributesWithOptionsAdditional createGetBillingAttributesWithOptionsAdditional() {
        return new GetBillingAttributesWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetAreasWithOptionsAdditional }
     * 
     */
    public GetAreasWithOptionsAdditional createGetAreasWithOptionsAdditional() {
        return new GetAreasWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetBillingsBySetWithOptionsAdditional }
     * 
     */
    public GetBillingsBySetWithOptionsAdditional createGetBillingsBySetWithOptionsAdditional() {
        return new GetBillingsBySetWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link DeleteBillingsByTime }
     * 
     */
    public DeleteBillingsByTime createDeleteBillingsByTime() {
        return new DeleteBillingsByTime();
    }

    /**
     * Create an instance of {@link GetNetworkById }
     * 
     */
    public GetNetworkById createGetNetworkById() {
        return new GetNetworkById();
    }

    /**
     * Create an instance of {@link GncGetSourceTableWithAutoSwitch }
     * 
     */
    public GncGetSourceTableWithAutoSwitch createGncGetSourceTableWithAutoSwitch() {
        return new GncGetSourceTableWithAutoSwitch();
    }

    /**
     * Create an instance of {@link AddServiceToInfo }
     * 
     */
    public AddServiceToInfo createAddServiceToInfo() {
        return new AddServiceToInfo();
    }

    /**
     * Create an instance of {@link GetGroupService }
     * 
     */
    public GetGroupService createGetGroupService() {
        return new GetGroupService();
    }

    /**
     * Create an instance of {@link SetUserToInfo }
     * 
     */
    public SetUserToInfo createSetUserToInfo() {
        return new SetUserToInfo();
    }

    /**
     * Create an instance of {@link AddStreamResponse }
     * 
     */
    public AddStreamResponse createAddStreamResponse() {
        return new AddStreamResponse();
    }

    /**
     * Create an instance of {@link GetExportBillingsResponse }
     * 
     */
    public GetExportBillingsResponse createGetExportBillingsResponse() {
        return new GetExportBillingsResponse();
    }

    /**
     * Create an instance of {@link GetProcessedFile }
     * 
     */
    public GetProcessedFile createGetProcessedFile() {
        return new GetProcessedFile();
    }

    /**
     * Create an instance of {@link GetServices }
     * 
     */
    public GetServices createGetServices() {
        return new GetServices();
    }

    /**
     * Create an instance of {@link GnUserToGroupsResponse }
     * 
     */
    public GnUserToGroupsResponse createGnUserToGroupsResponse() {
        return new GnUserToGroupsResponse();
    }

    /**
     * Create an instance of {@link GnuDeleteCaster }
     * 
     */
    public GnuDeleteCaster createGnuDeleteCaster() {
        return new GnuDeleteCaster();
    }

    /**
     * Create an instance of {@link GnuAddStreamResponse }
     * 
     */
    public GnuAddStreamResponse createGnuAddStreamResponse() {
        return new GnuAddStreamResponse();
    }

    /**
     * Create an instance of {@link CasterInstancesResponse }
     * 
     */
    public CasterInstancesResponse createCasterInstancesResponse() {
        return new CasterInstancesResponse();
    }

    /**
     * Create an instance of {@link CasterInstances }
     * 
     */
    public CasterInstances createCasterInstances() {
        return new CasterInstances();
    }

    /**
     * Create an instance of {@link SetCasterResponse }
     * 
     */
    public SetCasterResponse createSetCasterResponse() {
        return new SetCasterResponse();
    }

    /**
     * Create an instance of {@link GetBillingsByUserIdWithOptionsAdditional }
     * 
     */
    public GetBillingsByUserIdWithOptionsAdditional createGetBillingsByUserIdWithOptionsAdditional() {
        return new GetBillingsByUserIdWithOptionsAdditional();
    }

    /**
     * Create an instance of {@link GetGroupByName }
     * 
     */
    public GetGroupByName createGetGroupByName() {
        return new GetGroupByName();
    }

    /**
     * Create an instance of {@link GetVersionGNCasterDBResponse }
     * 
     */
    public GetVersionGNCasterDBResponse createGetVersionGNCasterDBResponse() {
        return new GetVersionGNCasterDBResponse();
    }

    /**
     * Create an instance of {@link GetUserToInfo }
     * 
     */
    public GetUserToInfo createGetUserToInfo() {
        return new GetUserToInfo();
    }

    /**
     * Create an instance of {@link SetServiceByRoot }
     * 
     */
    public SetServiceByRoot createSetServiceByRoot() {
        return new SetServiceByRoot();
    }

    /**
     * Create an instance of {@link DeleteCaster }
     * 
     */
    public DeleteCaster createDeleteCaster() {
        return new DeleteCaster();
    }

    /**
     * Create an instance of {@link GnuSetCasterResponse }
     * 
     */
    public GnuSetCasterResponse createGnuSetCasterResponse() {
        return new GnuSetCasterResponse();
    }

    /**
     * Create an instance of {@link DeleteUserServiceByServiceId }
     * 
     */
    public DeleteUserServiceByServiceId createDeleteUserServiceByServiceId() {
        return new DeleteUserServiceByServiceId();
    }

    /**
     * Create an instance of {@link GnUserResponse }
     * 
     */
    public GnUserResponse createGnUserResponse() {
        return new GnUserResponse();
    }

    /**
     * Create an instance of {@link GetAreaById }
     * 
     */
    public GetAreaById createGetAreaById() {
        return new GetAreaById();
    }

    /**
     * Create an instance of {@link SetGroupById }
     * 
     */
    public SetGroupById createSetGroupById() {
        return new SetGroupById();
    }

    /**
     * Create an instance of {@link AddUserToInfoReturning }
     * 
     */
    public AddUserToInfoReturning createAddUserToInfoReturning() {
        return new AddUserToInfoReturning();
    }

    /**
     * Create an instance of {@link DeleteUtsToArea }
     * 
     */
    public DeleteUtsToArea createDeleteUtsToArea() {
        return new DeleteUtsToArea();
    }

    /**
     * Create an instance of {@link GnTablesAdditionalResponse }
     * 
     */
    public GnTablesAdditionalResponse createGnTablesAdditionalResponse() {
        return new GnTablesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnPermissions }
     * 
     */
    public GnPermissions createGnPermissions() {
        return new GnPermissions();
    }

    /**
     * Create an instance of {@link CasterInstancesAdditionalResponse }
     * 
     */
    public CasterInstancesAdditionalResponse createCasterInstancesAdditionalResponse() {
        return new CasterInstancesAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnStreamToCasters }
     * 
     */
    public GnStreamToCasters createGnStreamToCasters() {
        return new GnStreamToCasters();
    }

    /**
     * Create an instance of {@link GNCSTREAM }
     * 
     */
    public GNCSTREAM createGNCSTREAM() {
        return new GNCSTREAM();
    }

    /**
     * Create an instance of {@link EmptyResponse }
     * 
     */
    public EmptyResponse createEmptyResponse() {
        return new EmptyResponse();
    }

    /**
     * Create an instance of {@link GnTables }
     * 
     */
    public GnTables createGnTables() {
        return new GnTables();
    }

    /**
     * Create an instance of {@link GnPosition }
     * 
     */
    public GnPosition createGnPosition() {
        return new GnPosition();
    }

    /**
     * Create an instance of {@link GnVersionResponse }
     * 
     */
    public GnVersionResponse createGnVersionResponse() {
        return new GnVersionResponse();
    }

    /**
     * Create an instance of {@link Array3Ofdouble }
     * 
     */
    public Array3Ofdouble createArray3Ofdouble() {
        return new Array3Ofdouble();
    }

    /**
     * Create an instance of {@link GNCAutoSwitch }
     * 
     */
    public GNCAutoSwitch createGNCAutoSwitch() {
        return new GNCAutoSwitch();
    }

    /**
     * Create an instance of {@link CasterInstanceResponse }
     * 
     */
    public CasterInstanceResponse createCasterInstanceResponse() {
        return new CasterInstanceResponse();
    }

    /**
     * Create an instance of {@link GnUserToGroupResponse }
     * 
     */
    public GnUserToGroupResponse createGnUserToGroupResponse() {
        return new GnUserToGroupResponse();
    }

    /**
     * Create an instance of {@link GNCCASTER }
     * 
     */
    public GNCCASTER createGNCCASTER() {
        return new GNCCASTER();
    }

    /**
     * Create an instance of {@link GnPositionResponse }
     * 
     */
    public GnPositionResponse createGnPositionResponse() {
        return new GnPositionResponse();
    }

    /**
     * Create an instance of {@link GnPermissionsResponse }
     * 
     */
    public GnPermissionsResponse createGnPermissionsResponse() {
        return new GnPermissionsResponse();
    }

    /**
     * Create an instance of {@link GnGroupToServiceResponse }
     * 
     */
    public GnGroupToServiceResponse createGnGroupToServiceResponse() {
        return new GnGroupToServiceResponse();
    }

    /**
     * Create an instance of {@link GNCNETWORK }
     * 
     */
    public GNCNETWORK createGNCNETWORK() {
        return new GNCNETWORK();
    }

    /**
     * Create an instance of {@link GnPositions }
     * 
     */
    public GnPositions createGnPositions() {
        return new GnPositions();
    }

    /**
     * Create an instance of {@link GnVersion }
     * 
     */
    public GnVersion createGnVersion() {
        return new GnVersion();
    }

    /**
     * Create an instance of {@link GnUserTypeResponse }
     * 
     */
    public GnUserTypeResponse createGnUserTypeResponse() {
        return new GnUserTypeResponse();
    }

    /**
     * Create an instance of {@link GnInfoPredefineResponse }
     * 
     */
    public GnInfoPredefineResponse createGnInfoPredefineResponse() {
        return new GnInfoPredefineResponse();
    }

    /**
     * Create an instance of {@link GnTablesResponse }
     * 
     */
    public GnTablesResponse createGnTablesResponse() {
        return new GnTablesResponse();
    }

    /**
     * Create an instance of {@link GnPermissionsAdditionalResponse }
     * 
     */
    public GnPermissionsAdditionalResponse createGnPermissionsAdditionalResponse() {
        return new GnPermissionsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnVersionsAdditionalResponse }
     * 
     */
    public GnVersionsAdditionalResponse createGnVersionsAdditionalResponse() {
        return new GnVersionsAdditionalResponse();
    }

    /**
     * Create an instance of {@link GnVersionsResponse }
     * 
     */
    public GnVersionsResponse createGnVersionsResponse() {
        return new GnVersionsResponse();
    }

    /**
     * Create an instance of {@link GnStreamToCaster }
     * 
     */
    public GnStreamToCaster createGnStreamToCaster() {
        return new GnStreamToCaster();
    }

    /**
     * Create an instance of {@link GnStreamToCastersResponse }
     * 
     */
    public GnStreamToCastersResponse createGnStreamToCastersResponse() {
        return new GnStreamToCastersResponse();
    }

    /**
     * Create an instance of {@link CasterInstance }
     * 
     */
    public CasterInstance createCasterInstance() {
        return new CasterInstance();
    }

    /**
     * Create an instance of {@link GnVersions }
     * 
     */
    public GnVersions createGnVersions() {
        return new GnVersions();
    }

    /**
     * Create an instance of {@link GnStreamToCasterResponse }
     * 
     */
    public GnStreamToCasterResponse createGnStreamToCasterResponse() {
        return new GnStreamToCasterResponse();
    }

    /**
     * Create an instance of {@link GnPositionsResponse }
     * 
     */
    public GnPositionsResponse createGnPositionsResponse() {
        return new GnPositionsResponse();
    }

    /**
     * Create an instance of {@link GnPermissionResponse }
     * 
     */
    public GnPermissionResponse createGnPermissionResponse() {
        return new GnPermissionResponse();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link test.String }
     * 
     */
    public test.String createString() {
        return new test.String();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link NonNegativeInteger }
     * 
     */
    public NonNegativeInteger createNonNegativeInteger() {
        return new NonNegativeInteger();
    }

    /**
     * Create an instance of {@link Integer }
     * 
     */
    public Integer createInteger() {
        return new Integer();
    }

    /**
     * Create an instance of {@link Float }
     * 
     */
    public Float createFloat() {
        return new Float();
    }

    /**
     * Create an instance of {@link NormalizedString }
     * 
     */
    public NormalizedString createNormalizedString() {
        return new NormalizedString();
    }

    /**
     * Create an instance of {@link Long }
     * 
     */
    public Long createLong() {
        return new Long();
    }

    /**
     * Create an instance of {@link Struct }
     * 
     */
    public Struct createStruct() {
        return new Struct();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link GYear }
     * 
     */
    public GYear createGYear() {
        return new GYear();
    }

    /**
     * Create an instance of {@link ENTITY }
     * 
     */
    public ENTITY createENTITY() {
        return new ENTITY();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link NegativeInteger }
     * 
     */
    public NegativeInteger createNegativeInteger() {
        return new NegativeInteger();
    }

    /**
     * Create an instance of {@link UnsignedByte }
     * 
     */
    public UnsignedByte createUnsignedByte() {
        return new UnsignedByte();
    }

    /**
     * Create an instance of {@link GDay }
     * 
     */
    public GDay createGDay() {
        return new GDay();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link ENTITIES }
     * 
     */
    public ENTITIES createENTITIES() {
        return new ENTITIES();
    }

    /**
     * Create an instance of {@link UnsignedLong }
     * 
     */
    public UnsignedLong createUnsignedLong() {
        return new UnsignedLong();
    }

    /**
     * Create an instance of {@link IDREF }
     * 
     */
    public IDREF createIDREF() {
        return new IDREF();
    }

    /**
     * Create an instance of {@link GMonthDay }
     * 
     */
    public GMonthDay createGMonthDay() {
        return new GMonthDay();
    }

    /**
     * Create an instance of {@link UnsignedShort }
     * 
     */
    public UnsignedShort createUnsignedShort() {
        return new UnsignedShort();
    }

    /**
     * Create an instance of {@link Double }
     * 
     */
    public Double createDouble() {
        return new Double();
    }

    /**
     * Create an instance of {@link test.QName }
     * 
     */
    public test.QName createQName() {
        return new test.QName();
    }

    /**
     * Create an instance of {@link Byte }
     * 
     */
    public Byte createByte() {
        return new Byte();
    }

    /**
     * Create an instance of {@link AnyURI }
     * 
     */
    public AnyURI createAnyURI() {
        return new AnyURI();
    }

    /**
     * Create an instance of {@link GMonth }
     * 
     */
    public GMonth createGMonth() {
        return new GMonth();
    }

    /**
     * Create an instance of {@link IDREFS }
     * 
     */
    public IDREFS createIDREFS() {
        return new IDREFS();
    }

    /**
     * Create an instance of {@link Int }
     * 
     */
    public Int createInt() {
        return new Int();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link Array }
     * 
     */
    public Array createArray() {
        return new Array();
    }

    /**
     * Create an instance of {@link NonPositiveInteger }
     * 
     */
    public NonPositiveInteger createNonPositiveInteger() {
        return new NonPositiveInteger();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link NMTOKEN }
     * 
     */
    public NMTOKEN createNMTOKEN() {
        return new NMTOKEN();
    }

    /**
     * Create an instance of {@link NMTOKENS }
     * 
     */
    public NMTOKENS createNMTOKENS() {
        return new NMTOKENS();
    }

    /**
     * Create an instance of {@link PositiveInteger }
     * 
     */
    public PositiveInteger createPositiveInteger() {
        return new PositiveInteger();
    }

    /**
     * Create an instance of {@link NOTATION }
     * 
     */
    public NOTATION createNOTATION() {
        return new NOTATION();
    }

    /**
     * Create an instance of {@link UnsignedInt }
     * 
     */
    public UnsignedInt createUnsignedInt() {
        return new UnsignedInt();
    }

    /**
     * Create an instance of {@link Short }
     * 
     */
    public Short createShort() {
        return new Short();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Decimal }
     * 
     */
    public Decimal createDecimal() {
        return new Decimal();
    }

    /**
     * Create an instance of {@link GYearMonth }
     * 
     */
    public GYearMonth createGYearMonth() {
        return new GYearMonth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonNegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "nonNegativeInteger")
    public JAXBElement<NonNegativeInteger> createNonNegativeInteger(NonNegativeInteger value) {
        return new JAXBElement<NonNegativeInteger>(_NonNegativeInteger_QNAME, NonNegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "integer")
    public JAXBElement<Integer> createInteger(Integer value) {
        return new JAXBElement<Integer>(_Integer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormalizedString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "normalizedString")
    public JAXBElement<NormalizedString> createNormalizedString(NormalizedString value) {
        return new JAXBElement<NormalizedString>(_NormalizedString_QNAME, NormalizedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Struct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Struct")
    public JAXBElement<Struct> createStruct(Struct value) {
        return new JAXBElement<Struct>(_Struct_QNAME, Struct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NCName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NCName")
    public JAXBElement<NCName> createNCName(NCName value) {
        return new JAXBElement<NCName>(_NCName_QNAME, NCName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "dateTime")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link test.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "string")
    public JAXBElement<test.String> createString(test.String value) {
        return new JAXBElement<test.String>(_String_QNAME, test.String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedByte")
    public JAXBElement<UnsignedByte> createUnsignedByte(UnsignedByte value) {
        return new JAXBElement<UnsignedByte>(_UnsignedByte_QNAME, UnsignedByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gDay")
    public JAXBElement<GDay> createGDay(GDay value) {
        return new JAXBElement<GDay>(_GDay_QNAME, GDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ENTITIES")
    public JAXBElement<ENTITIES> createENTITIES(ENTITIES value) {
        return new JAXBElement<ENTITIES>(_ENTITIES_QNAME, ENTITIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedLong")
    public JAXBElement<UnsignedLong> createUnsignedLong(UnsignedLong value) {
        return new JAXBElement<UnsignedLong>(_UnsignedLong_QNAME, UnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "IDREF")
    public JAXBElement<IDREF> createIDREF(IDREF value) {
        return new JAXBElement<IDREF>(_IDREF_QNAME, IDREF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonthDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gMonthDay")
    public JAXBElement<GMonthDay> createGMonthDay(GMonthDay value) {
        return new JAXBElement<GMonthDay>(_GMonthDay_QNAME, GMonthDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedShort")
    public JAXBElement<UnsignedShort> createUnsignedShort(UnsignedShort value) {
        return new JAXBElement<UnsignedShort>(_UnsignedShort_QNAME, UnsignedShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gYear")
    public JAXBElement<GYear> createGYear(GYear value) {
        return new JAXBElement<GYear>(_GYear_QNAME, GYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITY }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "ENTITY")
    public JAXBElement<ENTITY> createENTITY(ENTITY value) {
        return new JAXBElement<ENTITY>(_ENTITY_QNAME, ENTITY.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HexBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "hexBinary")
    public JAXBElement<HexBinary> createHexBinary(HexBinary value) {
        return new JAXBElement<HexBinary>(_HexBinary_QNAME, HexBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "negativeInteger")
    public JAXBElement<NegativeInteger> createNegativeInteger(NegativeInteger value) {
        return new JAXBElement<NegativeInteger>(_NegativeInteger_QNAME, NegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "anyURI")
    public JAXBElement<AnyURI> createAnyURI(AnyURI value) {
        return new JAXBElement<AnyURI>(_AnyURI_QNAME, AnyURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gMonth")
    public JAXBElement<GMonth> createGMonth(GMonth value) {
        return new JAXBElement<GMonth>(_GMonth_QNAME, GMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREFS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "IDREFS")
    public JAXBElement<IDREFS> createIDREFS(IDREFS value) {
        return new JAXBElement<IDREFS>(_IDREFS_QNAME, IDREFS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Int }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "int")
    public JAXBElement<Int> createInt(Int value) {
        return new JAXBElement<Int>(_Int_QNAME, Int.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link test.QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "QName")
    public JAXBElement<test.QName> createQName(test.QName value) {
        return new JAXBElement<test.QName>(_QName_QNAME, test.QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTATION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NOTATION")
    public JAXBElement<NOTATION> createNOTATION(NOTATION value) {
        return new JAXBElement<NOTATION>(_NOTATION_QNAME, NOTATION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "unsignedInt")
    public JAXBElement<UnsignedInt> createUnsignedInt(UnsignedInt value) {
        return new JAXBElement<UnsignedInt>(_UnsignedInt_QNAME, UnsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "decimal")
    public JAXBElement<Decimal> createDecimal(Decimal value) {
        return new JAXBElement<Decimal>(_Decimal_QNAME, Decimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYearMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "gYearMonth")
    public JAXBElement<GYearMonth> createGYearMonth(GYearMonth value) {
        return new JAXBElement<GYearMonth>(_GYearMonth_QNAME, GYearMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Array }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "Array")
    public JAXBElement<Array> createArray(Array value) {
        return new JAXBElement<Array>(_Array_QNAME, Array.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonPositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "nonPositiveInteger")
    public JAXBElement<NonPositiveInteger> createNonPositiveInteger(NonPositiveInteger value) {
        return new JAXBElement<NonPositiveInteger>(_NonPositiveInteger_QNAME, NonPositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "base64Binary")
    public JAXBElement<Base64Binary> createBase64Binary(Base64Binary value) {
        return new JAXBElement<Base64Binary>(_Base64Binary_QNAME, Base64Binary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NMTOKEN")
    public JAXBElement<NMTOKEN> createNMTOKEN(NMTOKEN value) {
        return new JAXBElement<NMTOKEN>(_NMTOKEN_QNAME, NMTOKEN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKENS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "NMTOKENS")
    public JAXBElement<NMTOKENS> createNMTOKENS(NMTOKENS value) {
        return new JAXBElement<NMTOKENS>(_NMTOKENS_QNAME, NMTOKENS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/encoding/", name = "positiveInteger")
    public JAXBElement<PositiveInteger> createPositiveInteger(PositiveInteger value) {
        return new JAXBElement<PositiveInteger>(_PositiveInteger_QNAME, PositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingsByServiceIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingsByServiceIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingsByServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsByServiceIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingsByServiceIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsByServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "type", scope = GnUserType.class)
    public JAXBElement<java.lang.String> createGnUserTypeType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserTypeType_QNAME, java.lang.String.class, GnUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServices.class)
    public JAXBElement<java.lang.String> createGetUserServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "licence", scope = GnGroupToService.class)
    public JAXBElement<java.lang.String> createGnGroupToServiceLicence(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupToServiceLicence_QNAME, java.lang.String.class, GnGroupToService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserToInfosWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserToInfosWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserToInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserToInfosWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserToInfosWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserToInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster", scope = GnuAddCaster.class)
    public JAXBElement<GnCaster> createGnuAddCasterCaster(GnCaster value) {
        return new JAXBElement<GnCaster>(_GnuAddCasterCaster_QNAME, GnCaster.class, GnuAddCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStreams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "streams", scope = GnuAddCaster.class)
    public JAXBElement<GnStreams> createGnuAddCasterStreams(GnStreams value) {
        return new JAXBElement<GnStreams>(_GnuAddCasterStreams_QNAME, GnStreams.class, GnuAddCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuAddCaster.class)
    public JAXBElement<java.lang.String> createGnuAddCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuAddCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserPwd.class)
    public JAXBElement<java.lang.String> createGetUserPwdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserPwd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetServiceChildrenByIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetServiceChildrenByIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetServiceChildrenByIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceChildrenByIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetServiceChildrenByIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceChildrenByIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncIsMountpointPermitted.class)
    public JAXBElement<java.lang.String> createGncIsMountpointPermittedUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncIsMountpointPermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = GncIsMountpointPermitted.class)
    public JAXBElement<java.lang.String> createGncIsMountpointPermittedPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, GncIsMountpointPermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncIsMountpointPermitted.class)
    public JAXBElement<java.lang.String> createGncIsMountpointPermittedSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncIsMountpointPermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetGroupServicesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetGroupServicesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetGroupServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupServicesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetGroupServicesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetNetworkById.class)
    public JAXBElement<java.lang.String> createGetNetworkByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetNetworkById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = GetBillingAttributeType.class)
    public JAXBElement<java.lang.String> createGetBillingAttributeTypeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, GetBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingAttributeType.class)
    public JAXBElement<java.lang.String> createGetBillingAttributeTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = GncIsUserInsideByChzId.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideByChzIdMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, GncIsUserInsideByChzId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncIsUserInsideByChzId.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideByChzIdUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncIsUserInsideByChzId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncIsUserInsideByChzId.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideByChzIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncIsUserInsideByChzId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetStreamsWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetStreamsWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetStreamsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetStreamsWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetStreamsWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetStreamsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = GnuDeleteUser.class)
    public JAXBElement<GnUser> createGnuDeleteUserUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, GnuDeleteUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuDeleteUser.class)
    public JAXBElement<java.lang.String> createGnuDeleteUserSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuDeleteUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingsByServiceId.class)
    public JAXBElement<java.lang.String> createDeleteBillingsByServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingsByServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddService.class)
    public JAXBElement<java.lang.String> createAddServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "service", scope = AddService.class)
    public JAXBElement<GnService> createAddServiceService(GnService value) {
        return new JAXBElement<GnService>(_AddServiceService_QNAME, GnService.class, AddService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnServiceToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "serviceToInfo", scope = SetServiceToInfo.class)
    public JAXBElement<GnServiceToInfo> createSetServiceToInfoServiceToInfo(GnServiceToInfo value) {
        return new JAXBElement<GnServiceToInfo>(_SetServiceToInfoServiceToInfo_QNAME, GnServiceToInfo.class, SetServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetServiceToInfo.class)
    public JAXBElement<java.lang.String> createSetServiceToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserServiceByServiceId.class)
    public JAXBElement<java.lang.String> createDeleteUserServiceByServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserServiceByServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = CoordInArea.class)
    public JAXBElement<java.lang.String> createCoordInAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, CoordInArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "charEncoding", scope = GnImportAreasConfiguration.class)
    public JAXBElement<java.lang.String> createGnImportAreasConfigurationCharEncoding(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnImportAreasConfigurationCharEncoding_QNAME, java.lang.String.class, GnImportAreasConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "descriptionColumn", scope = GnImportAreasConfiguration.class)
    public JAXBElement<java.lang.String> createGnImportAreasConfigurationDescriptionColumn(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnImportAreasConfigurationDescriptionColumn_QNAME, java.lang.String.class, GnImportAreasConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "nameColumn", scope = GnImportAreasConfiguration.class)
    public JAXBElement<java.lang.String> createGnImportAreasConfigurationNameColumn(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnImportAreasConfigurationNameColumn_QNAME, java.lang.String.class, GnImportAreasConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "content", scope = GnServiceToInfo.class)
    public JAXBElement<java.lang.String> createGnServiceToInfoContent(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnServiceToInfoContent_QNAME, java.lang.String.class, GnServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "info", scope = GnuSetInfo.class)
    public JAXBElement<GnInfo> createGnuSetInfoInfo(GnInfo value) {
        return new JAXBElement<GnInfo>(_GnuSetInfoInfo_QNAME, GnInfo.class, GnuSetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuSetInfo.class)
    public JAXBElement<java.lang.String> createGnuSetInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuSetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = CheckLogin.class)
    public JAXBElement<java.lang.String> createCheckLoginSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, CheckLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCountUserChildrenById.class)
    public JAXBElement<java.lang.String> createGetCountUserChildrenByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCountUserChildrenById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroupToServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "services", scope = GnuAddGroup.class)
    public JAXBElement<GnGroupToServices> createGnuAddGroupServices(GnGroupToServices value) {
        return new JAXBElement<GnGroupToServices>(_GnuAddGroupServices_QNAME, GnGroupToServices.class, GnuAddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = GnuAddGroup.class)
    public JAXBElement<GnGroup> createGnuAddGroupGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, GnuAddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "users", scope = GnuAddGroup.class)
    public JAXBElement<GnUsers> createGnuAddGroupUsers(GnUsers value) {
        return new JAXBElement<GnUsers>(_GnuAddGroupUsers_QNAME, GnUsers.class, GnuAddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGtsToAreas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "gtsToAreas", scope = GnuAddGroup.class)
    public JAXBElement<GnGtsToAreas> createGnuAddGroupGtsToAreas(GnGtsToAreas value) {
        return new JAXBElement<GnGtsToAreas>(_GnuAddGroupGtsToAreas_QNAME, GnGtsToAreas.class, GnuAddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuAddGroup.class)
    public JAXBElement<java.lang.String> createGnuAddGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuAddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteArea.class)
    public JAXBElement<java.lang.String> createDeleteAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCountServiceChildrenById.class)
    public JAXBElement<java.lang.String> createGetCountServiceChildrenByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCountServiceChildrenById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetServicesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetServicesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServicesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetServicesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "licence", scope = GetUserServicesByLicence.class)
    public JAXBElement<java.lang.String> createGetUserServicesByLicenceLicence(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupToServiceLicence_QNAME, java.lang.String.class, GetUserServicesByLicence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByLicence.class)
    public JAXBElement<java.lang.String> createGetUserServicesByLicenceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByLicence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUtsToAreasByUtsId.class)
    public JAXBElement<java.lang.String> createGetUtsToAreasByUtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUtsToAreasByUtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetVersionGNUserDB.class)
    public JAXBElement<java.lang.String> createGetVersionGNUserDBSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetVersionGNUserDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuDeleteInfo.class)
    public JAXBElement<java.lang.String> createGnuDeleteInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuDeleteInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "compr-encryp", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamComprEncryp(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamComprEncryp_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "authentication", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamAuthentication(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamAuthentication_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "nav-systems", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamNavSystems(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamNavSystems_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "service", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamService(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_AddServiceService_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "server-ip", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamServerIp(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamServerIp_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "generator", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamGenerator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamGenerator_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "server-password", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamServerPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamServerPassword_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "client-user", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamClientUser(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamClientUser_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "data-format", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamDataFormat(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamDataFormat_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "format-details", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamFormatDetails(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamFormatDetails_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "country", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamCountry(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamCountry_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "client-password", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamClientPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamClientPassword_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "fee", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamFee(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamFee_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "server-mountpoint", scope = GnStream.class)
    public JAXBElement<java.lang.String> createGnStreamServerMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamServerMountpoint_QNAME, java.lang.String.class, GnStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserDataBySession.class)
    public JAXBElement<java.lang.String> createGetUserDataBySessionSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserDataBySession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = DeleteBillingAttributeType.class)
    public JAXBElement<java.lang.String> createDeleteBillingAttributeTypeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, DeleteBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingAttributeType.class)
    public JAXBElement<java.lang.String> createDeleteBillingAttributeTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByUserId.class)
    public JAXBElement<java.lang.String> createGetUserServicesByUserIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingById.class)
    public JAXBElement<java.lang.String> createGetBillingByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GetUserByName.class)
    public JAXBElement<java.lang.String> createGetUserByNameUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GetUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserByName.class)
    public JAXBElement<java.lang.String> createGetUserByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetServiceAncestorsByIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetServiceAncestorsByIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetServiceAncestorsByIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceAncestorsByIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetServiceAncestorsByIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceAncestorsByIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetInfoPredefinesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetInfoPredefinesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetInfoPredefinesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfoPredefinesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetInfoPredefinesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfoPredefinesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnExportConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "exportData", scope = GnProcessing.class)
    public JAXBElement<GnExportConfiguration> createGnProcessingExportData(GnExportConfiguration value) {
        return new JAXBElement<GnExportConfiguration>(_GnProcessingExportData_QNAME, GnExportConfiguration.class, GnProcessing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "licence", scope = GnPermission.class)
    public JAXBElement<java.lang.String> createGnPermissionLicence(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupToServiceLicence_QNAME, java.lang.String.class, GnPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsBySet.class)
    public JAXBElement<java.lang.String> createGetBillingsBySetSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsBySet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserToInfo.class)
    public JAXBElement<java.lang.String> createSetUserToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userToInfo", scope = SetUserToInfo.class)
    public JAXBElement<GnUserToInfo> createSetUserToInfoUserToInfo(GnUserToInfo value) {
        return new JAXBElement<GnUserToInfo>(_SetUserToInfoUserToInfo_QNAME, GnUserToInfo.class, SetUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casterId", scope = DeleteCaster.class)
    public JAXBElement<java.lang.String> createDeleteCasterCasterId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteCasterCasterId_QNAME, java.lang.String.class, DeleteCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteCaster.class)
    public JAXBElement<java.lang.String> createDeleteCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casterId", scope = GetCaster.class)
    public JAXBElement<java.lang.String> createGetCasterCasterId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteCasterCasterId_QNAME, java.lang.String.class, GetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCaster.class)
    public JAXBElement<java.lang.String> createGetCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfos.class)
    public JAXBElement<java.lang.String> createGetInfosSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetExpiredGroupToServices.class)
    public JAXBElement<java.lang.String> createEventGetExpiredGroupToServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetExpiredGroupToServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBilling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billing", scope = SetBillingById.class)
    public JAXBElement<GnBilling> createSetBillingByIdBilling(GnBilling value) {
        return new JAXBElement<GnBilling>(_SetBillingByIdBilling_QNAME, GnBilling.class, SetBillingById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetBillingById.class)
    public JAXBElement<java.lang.String> createSetBillingByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetBillingById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserServicesByServiceIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserServicesByServiceIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserServicesByServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByServiceIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesByServiceIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "tcp-addr", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERTcpAddr(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERTcpAddr_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "cc-login-name", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERCcLoginName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERCcLoginName_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "cc-password-source", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERCcPasswordSource(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERCcPasswordSource_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "operator", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTEROperator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTEROperator_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "cc-tcp-addr", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERCcTcpAddr(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERCcTcpAddr_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "kennung", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERKennung(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERKennung_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "country", scope = GNCCASTER.class)
    public JAXBElement<java.lang.String> createGNCCASTERCountry(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamCountry_QNAME, java.lang.String.class, GNCCASTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServices.class)
    public JAXBElement<java.lang.String> createGetServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DoProcessing.class)
    public JAXBElement<java.lang.String> createDoProcessingSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DoProcessing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserToInfo.class)
    public JAXBElement<java.lang.String> createDeleteUserToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "description", scope = GnGroup.class)
    public JAXBElement<java.lang.String> createGnGroupDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupDescription_QNAME, java.lang.String.class, GnGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GnGroup.class)
    public JAXBElement<java.lang.String> createGnGroupName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GnGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetAlmostExpiredGroups.class)
    public JAXBElement<java.lang.String> createEventGetAlmostExpiredGroupsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetAlmostExpiredGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetUserOrganisation.class)
    public JAXBElement<java.lang.String> createGncGetUserOrganisationUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetUserOrganisation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetUserOrganisation.class)
    public JAXBElement<java.lang.String> createGncGetUserOrganisationSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetUserOrganisation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = SetBillingAttribute.class)
    public JAXBElement<java.lang.String> createSetBillingAttributeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, SetBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetBillingAttribute.class)
    public JAXBElement<java.lang.String> createSetBillingAttributeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBillingAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billingAttribute", scope = SetBillingAttribute.class)
    public JAXBElement<GnBillingAttribute> createSetBillingAttributeBillingAttribute(GnBillingAttribute value) {
        return new JAXBElement<GnBillingAttribute>(_SetBillingAttributeBillingAttribute_QNAME, GnBillingAttribute.class, SetBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserServicesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserServicesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "email", scope = LoginByEmail.class)
    public JAXBElement<java.lang.String> createLoginByEmailEmail(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_LoginByEmailEmail_QNAME, java.lang.String.class, LoginByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = LoginByEmail.class)
    public JAXBElement<java.lang.String> createLoginByEmailPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, LoginByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserById.class)
    public JAXBElement<java.lang.String> createDeleteUserByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetUserPassword.class)
    public JAXBElement<java.lang.String> createGncGetUserPasswordUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetUserPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetUserPassword.class)
    public JAXBElement<java.lang.String> createGncGetUserPasswordSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetUserPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfoPredefines.class)
    public JAXBElement<java.lang.String> createGetInfoPredefinesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfoPredefines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = AddUser.class)
    public JAXBElement<GnUser> createAddUserUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUser.class)
    public JAXBElement<java.lang.String> createAddUserSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetExport.class)
    public JAXBElement<java.lang.String> createGetExportSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddBillingAttribute.class)
    public JAXBElement<java.lang.String> createAddBillingAttributeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBillingAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billingAttribute", scope = AddBillingAttribute.class)
    public JAXBElement<GnBillingAttribute> createAddBillingAttributeBillingAttribute(GnBillingAttribute value) {
        return new JAXBElement<GnBillingAttribute>(_SetBillingAttributeBillingAttribute_QNAME, GnBillingAttribute.class, AddBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = GncIsUserInside.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, GncIsUserInside.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncIsUserInside.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncIsUserInside.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncIsUserInside.class)
    public JAXBElement<java.lang.String> createGncIsUserInsideSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncIsUserInside.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "station-mountpoint", scope = GnBilling.class)
    public JAXBElement<java.lang.String> createGnBillingStationMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnBillingStationMountpoint_QNAME, java.lang.String.class, GnBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user-name", scope = GnBilling.class)
    public JAXBElement<java.lang.String> createGnBillingUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnBillingUserName_QNAME, java.lang.String.class, GnBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "root", scope = GetServiceByRoot.class)
    public JAXBElement<java.lang.String> createGetServiceByRootRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetServiceByRootRoot_QNAME, java.lang.String.class, GetServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceByRoot.class)
    public JAXBElement<java.lang.String> createGetServiceByRootSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetGroupUsersWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetGroupUsersWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetGroupUsersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupUsersWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetGroupUsersWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupUsersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddServiceReturning.class)
    public JAXBElement<java.lang.String> createAddServiceReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddServiceReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "service", scope = AddServiceReturning.class)
    public JAXBElement<GnService> createAddServiceReturningService(GnService value) {
        return new JAXBElement<GnService>(_AddServiceService_QNAME, GnService.class, AddServiceReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUsersWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUsersWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUsersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUsersWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUsersWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUsersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "keyWord", scope = GncAddConnectionInfo.class)
    public JAXBElement<java.lang.String> createGncAddConnectionInfoKeyWord(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncAddConnectionInfoKeyWord_QNAME, java.lang.String.class, GncAddConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "message", scope = GncAddConnectionInfo.class)
    public JAXBElement<java.lang.String> createGncAddConnectionInfoMessage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncAddConnectionInfoMessage_QNAME, java.lang.String.class, GncAddConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncAddConnectionInfo.class)
    public JAXBElement<java.lang.String> createGncAddConnectionInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncAddConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByServiceId.class)
    public JAXBElement<java.lang.String> createGetUserServicesByServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceToInfos.class)
    public JAXBElement<java.lang.String> createGetServiceToInfosSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceToInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "sortColumn", scope = GetOptions.class)
    public JAXBElement<java.lang.String> createGetOptionsSortColumn(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetOptionsSortColumn_QNAME, java.lang.String.class, GetOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "whereClause", scope = GetOptions.class)
    public JAXBElement<java.lang.String> createGetOptionsWhereClause(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetOptionsWhereClause_QNAME, java.lang.String.class, GetOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetNetworksWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetNetworksWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetNetworksWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetNetworksWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetNetworksWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetNetworksWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = AddUserReturning.class)
    public JAXBElement<GnUser> createAddUserReturningUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, AddUserReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserReturning.class)
    public JAXBElement<java.lang.String> createAddUserReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "network", scope = AddNetwork.class)
    public JAXBElement<GnNetwork> createAddNetworkNetwork(GnNetwork value) {
        return new JAXBElement<GnNetwork>(_AddNetworkNetwork_QNAME, GnNetwork.class, AddNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddNetwork.class)
    public JAXBElement<java.lang.String> createAddNetworkSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "value", scope = DeleteInfoPredefine.class)
    public JAXBElement<java.lang.String> createDeleteInfoPredefineValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteInfoPredefineValue_QNAME, java.lang.String.class, DeleteInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteInfoPredefine.class)
    public JAXBElement<java.lang.String> createDeleteInfoPredefineSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceById.class)
    public JAXBElement<java.lang.String> createGetServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuAddUser.class)
    public JAXBElement<java.lang.String> createGnuAddUserSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuAddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserGroup.class)
    public JAXBElement<java.lang.String> createDeleteUserGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "licence", scope = GnUserToService.class)
    public JAXBElement<java.lang.String> createGnUserToServiceLicence(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupToServiceLicence_QNAME, java.lang.String.class, GnUserToService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetSourceTable.class)
    public JAXBElement<java.lang.String> createGncGetSourceTableSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetSourceTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupService.class)
    public JAXBElement<java.lang.String> createGetGroupServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteServiceToInfo.class)
    public JAXBElement<java.lang.String> createDeleteServiceToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncDidSourceTableChange.class)
    public JAXBElement<java.lang.String> createGncDidSourceTableChangeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncDidSourceTableChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCasters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casters", scope = GnuSetStream.class)
    public JAXBElement<GnCasters> createGnuSetStreamCasters(GnCasters value) {
        return new JAXBElement<GnCasters>(_GnuSetStreamCasters_QNAME, GnCasters.class, GnuSetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStreams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "autoSwitchStreams", scope = GnuSetStream.class)
    public JAXBElement<GnStreams> createGnuSetStreamAutoSwitchStreams(GnStreams value) {
        return new JAXBElement<GnStreams>(_GnuSetStreamAutoSwitchStreams_QNAME, GnStreams.class, GnuSetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuSetStream.class)
    public JAXBElement<java.lang.String> createGnuSetStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuSetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = GnuSetStream.class)
    public JAXBElement<GnStream> createGnuSetStreamStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, GnuSetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "serviceRoot", scope = GncIsServicePermitted.class)
    public JAXBElement<java.lang.String> createGncIsServicePermittedServiceRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsServicePermittedServiceRoot_QNAME, java.lang.String.class, GncIsServicePermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncIsServicePermitted.class)
    public JAXBElement<java.lang.String> createGncIsServicePermittedUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncIsServicePermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = GncIsServicePermitted.class)
    public JAXBElement<java.lang.String> createGncIsServicePermittedPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, GncIsServicePermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncIsServicePermitted.class)
    public JAXBElement<java.lang.String> createGncIsServicePermittedSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncIsServicePermitted.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "info", scope = GnuAddInfo.class)
    public JAXBElement<GnInfo> createGnuAddInfoInfo(GnInfo value) {
        return new JAXBElement<GnInfo>(_GnuSetInfoInfo_QNAME, GnInfo.class, GnuAddInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuAddInfo.class)
    public JAXBElement<java.lang.String> createGnuAddInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuAddInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuSetUser.class)
    public JAXBElement<java.lang.String> createGnuSetUserSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuSetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserServicesByUserIdAndServiceIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserServicesByUserIdAndServiceIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserServicesByUserIdAndServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByUserIdAndServiceIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesByUserIdAndServiceIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByUserIdAndServiceIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetAreaById.class)
    public JAXBElement<java.lang.String> createGetAreaByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetAreaById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GetTable.class)
    public JAXBElement<java.lang.String> createGetTableName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GetTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetTable.class)
    public JAXBElement<java.lang.String> createGetTableSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuGetUser.class)
    public JAXBElement<java.lang.String> createGnuGetUserSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuGetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = AddGroup.class)
    public JAXBElement<GnGroup> createAddGroupGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, AddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddGroup.class)
    public JAXBElement<java.lang.String> createAddGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetExpiredUserToServices.class)
    public JAXBElement<java.lang.String> createEventGetExpiredUserToServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetExpiredUserToServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "email", scope = SetUserByEmail.class)
    public JAXBElement<java.lang.String> createSetUserByEmailEmail(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_LoginByEmailEmail_QNAME, java.lang.String.class, SetUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = SetUserByEmail.class)
    public JAXBElement<GnUser> createSetUserByEmailUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, SetUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserByEmail.class)
    public JAXBElement<java.lang.String> createSetUserByEmailSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userType", scope = SetUserType.class)
    public JAXBElement<GnUserType> createSetUserTypeUserType(GnUserType value) {
        return new JAXBElement<GnUserType>(_SetUserTypeUserType_QNAME, GnUserType.class, SetUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "type", scope = SetUserType.class)
    public JAXBElement<java.lang.String> createSetUserTypeType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserTypeType_QNAME, java.lang.String.class, SetUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserType.class)
    public JAXBElement<java.lang.String> createSetUserTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddBillingAttributeReturning.class)
    public JAXBElement<java.lang.String> createAddBillingAttributeReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddBillingAttributeReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBillingAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billingAttribute", scope = AddBillingAttributeReturning.class)
    public JAXBElement<GnBillingAttribute> createAddBillingAttributeReturningBillingAttribute(GnBillingAttribute value) {
        return new JAXBElement<GnBillingAttribute>(_SetBillingAttributeBillingAttribute_QNAME, GnBillingAttribute.class, AddBillingAttributeReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCasters.class)
    public JAXBElement<java.lang.String> createGetCastersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCasters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsByServiceId.class)
    public JAXBElement<java.lang.String> createGetBillingsByServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsByServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroupToService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "groupToService", scope = SetGroupService.class)
    public JAXBElement<GnGroupToService> createSetGroupServiceGroupToService(GnGroupToService value) {
        return new JAXBElement<GnGroupToService>(_SetGroupServiceGroupToService_QNAME, GnGroupToService.class, SetGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetGroupService.class)
    public JAXBElement<java.lang.String> createSetGroupServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfoPredefine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "predefine", scope = AddInfoPredefine.class)
    public JAXBElement<GnInfoPredefine> createAddInfoPredefinePredefine(GnInfoPredefine value) {
        return new JAXBElement<GnInfoPredefine>(_AddInfoPredefinePredefine_QNAME, GnInfoPredefine.class, AddInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddInfoPredefine.class)
    public JAXBElement<java.lang.String> createAddInfoPredefineSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillings.class)
    public JAXBElement<java.lang.String> createGetBillingsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetAlmostExpiredUserToServices.class)
    public JAXBElement<java.lang.String> createEventGetAlmostExpiredUserToServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetAlmostExpiredUserToServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "table-name", scope = GnTable.class)
    public JAXBElement<java.lang.String> createGnTableTableName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnTableTableName_QNAME, java.lang.String.class, GnTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "latest-change", scope = GnTable.class)
    public JAXBElement<java.lang.String> createGnTableLatestChange(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnTableLatestChange_QNAME, java.lang.String.class, GnTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingsByUserId.class)
    public JAXBElement<java.lang.String> createDeleteBillingsByUserIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingsByUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetProcessedFile.class)
    public JAXBElement<java.lang.String> createGetProcessedFileSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetProcessedFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "description", scope = GnArea.class)
    public JAXBElement<java.lang.String> createGnAreaDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupDescription_QNAME, java.lang.String.class, GnArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GnArea.class)
    public JAXBElement<java.lang.String> createGnAreaName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GnArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroupToServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "services", scope = GnuSetGroup.class)
    public JAXBElement<GnGroupToServices> createGnuSetGroupServices(GnGroupToServices value) {
        return new JAXBElement<GnGroupToServices>(_GnuAddGroupServices_QNAME, GnGroupToServices.class, GnuSetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = GnuSetGroup.class)
    public JAXBElement<GnGroup> createGnuSetGroupGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, GnuSetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "users", scope = GnuSetGroup.class)
    public JAXBElement<GnUsers> createGnuSetGroupUsers(GnUsers value) {
        return new JAXBElement<GnUsers>(_GnuAddGroupUsers_QNAME, GnUsers.class, GnuSetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGtsToAreas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "gtsToAreas", scope = GnuSetGroup.class)
    public JAXBElement<GnGtsToAreas> createGnuSetGroupGtsToAreas(GnGtsToAreas value) {
        return new JAXBElement<GnGtsToAreas>(_GnuAddGroupGtsToAreas_QNAME, GnGtsToAreas.class, GnuSetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuSetGroup.class)
    public JAXBElement<java.lang.String> createGnuSetGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuSetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUtsToAreasWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUtsToAreasWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUtsToAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUtsToAreasWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUtsToAreasWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUtsToAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingAttributesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingAttributesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingAttributesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingAttributesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingAttributesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingAttributesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "root", scope = SetServiceByRoot.class)
    public JAXBElement<java.lang.String> createSetServiceByRootRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetServiceByRootRoot_QNAME, java.lang.String.class, SetServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetServiceByRoot.class)
    public JAXBElement<java.lang.String> createSetServiceByRootSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "service", scope = SetServiceByRoot.class)
    public JAXBElement<GnService> createSetServiceByRootService(GnService value) {
        return new JAXBElement<GnService>(_AddServiceService_QNAME, GnService.class, SetServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetCastersWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetCastersWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetCastersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCastersWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetCastersWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCastersWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuGetGroup.class)
    public JAXBElement<java.lang.String> createGnuGetGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuGetGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetSourceTableWithAutoSwitch.class)
    public JAXBElement<java.lang.String> createGncGetSourceTableWithAutoSwitchSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetSourceTableWithAutoSwitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUtsToArea.class)
    public JAXBElement<java.lang.String> createDeleteUtsToAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupUsers.class)
    public JAXBElement<java.lang.String> createGetGroupUsersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserGroups.class)
    public JAXBElement<java.lang.String> createGetUserGroupsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingsByTime.class)
    public JAXBElement<java.lang.String> createDeleteBillingsByTimeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingsByTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = SetGroupByName.class)
    public JAXBElement<java.lang.String> createSetGroupByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, SetGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = SetGroupByName.class)
    public JAXBElement<GnGroup> createSetGroupByNameGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, SetGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetGroupByName.class)
    public JAXBElement<java.lang.String> createSetGroupByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetStreams.class)
    public JAXBElement<java.lang.String> createGetStreamsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetStreams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = SetStream.class)
    public JAXBElement<java.lang.String> createSetStreamMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, SetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetStream.class)
    public JAXBElement<java.lang.String> createSetStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = SetStream.class)
    public JAXBElement<GnStream> createSetStreamStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, SetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroups.class)
    public JAXBElement<java.lang.String> createGetGroupsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "header", scope = GnExportConfiguration.class)
    public JAXBElement<java.lang.String> createGnExportConfigurationHeader(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationHeader_QNAME, java.lang.String.class, GnExportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "type", scope = GnExportConfiguration.class)
    public JAXBElement<java.lang.String> createGnExportConfigurationType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserTypeType_QNAME, java.lang.String.class, GnExportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "filter", scope = GnExportConfiguration.class)
    public JAXBElement<java.lang.String> createGnExportConfigurationFilter(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationFilter_QNAME, java.lang.String.class, GnExportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupServices.class)
    public JAXBElement<java.lang.String> createGetGroupServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceAncestorsById.class)
    public JAXBElement<java.lang.String> createGetServiceAncestorsByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceAncestorsById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = DeleteGroupByName.class)
    public JAXBElement<java.lang.String> createDeleteGroupByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, DeleteGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteGroupByName.class)
    public JAXBElement<java.lang.String> createDeleteGroupByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfo.class)
    public JAXBElement<java.lang.String> createGetInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupToServiceByUserIdAndServiceParentId.class)
    public JAXBElement<java.lang.String> createGetGroupToServiceByUserIdAndServiceParentIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupToServiceByUserIdAndServiceParentId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncInitGNCaster.class)
    public JAXBElement<java.lang.String> createGncInitGNCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncInitGNCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "networkId", scope = SetNetwork.class)
    public JAXBElement<java.lang.String> createSetNetworkNetworkId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SetNetworkNetworkId_QNAME, java.lang.String.class, SetNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "network", scope = SetNetwork.class)
    public JAXBElement<GnNetwork> createSetNetworkNetwork(GnNetwork value) {
        return new JAXBElement<GnNetwork>(_AddNetworkNetwork_QNAME, GnNetwork.class, SetNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetNetwork.class)
    public JAXBElement<java.lang.String> createSetNetworkSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteGtsToArea.class)
    public JAXBElement<java.lang.String> createDeleteGtsToAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteGtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCasters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casters", scope = GnuAddStream.class)
    public JAXBElement<GnCasters> createGnuAddStreamCasters(GnCasters value) {
        return new JAXBElement<GnCasters>(_GnuSetStreamCasters_QNAME, GnCasters.class, GnuAddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStreams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "autoSwitchStreams", scope = GnuAddStream.class)
    public JAXBElement<GnStreams> createGnuAddStreamAutoSwitchStreams(GnStreams value) {
        return new JAXBElement<GnStreams>(_GnuSetStreamAutoSwitchStreams_QNAME, GnStreams.class, GnuAddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuAddStream.class)
    public JAXBElement<java.lang.String> createGnuAddStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuAddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = GnuAddStream.class)
    public JAXBElement<GnStream> createGnuAddStreamStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, GnuAddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetPhoneNumberByUserName.class)
    public JAXBElement<java.lang.String> createGncGetPhoneNumberByUserNameUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetPhoneNumberByUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetPhoneNumberByUserName.class)
    public JAXBElement<java.lang.String> createGncGetPhoneNumberByUserNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetPhoneNumberByUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "email", scope = GetUserByEmail.class)
    public JAXBElement<java.lang.String> createGetUserByEmailEmail(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_LoginByEmailEmail_QNAME, java.lang.String.class, GetUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserByEmail.class)
    public JAXBElement<java.lang.String> createGetUserByEmailSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user-name", scope = FillBilling.class)
    public JAXBElement<java.lang.String> createFillBillingUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnBillingUserName_QNAME, java.lang.String.class, FillBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "type", scope = DeleteUserType.class)
    public JAXBElement<java.lang.String> createDeleteUserTypeType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserTypeType_QNAME, java.lang.String.class, DeleteUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserType.class)
    public JAXBElement<java.lang.String> createDeleteUserTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserById.class)
    public JAXBElement<java.lang.String> createGetUserByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GetGroupByName.class)
    public JAXBElement<java.lang.String> createGetGroupByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GetGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupByName.class)
    public JAXBElement<java.lang.String> createGetGroupByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncUpdateBilling.class)
    public JAXBElement<java.lang.String> createGncUpdateBillingSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncUpdateBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCountGtsToAreasByGtsId.class)
    public JAXBElement<java.lang.String> createGetCountGtsToAreasByGtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCountGtsToAreasByGtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetUsernameByPhoneNumber.class)
    public JAXBElement<java.lang.String> createGncGetUsernameByPhoneNumberSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetUsernameByPhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "phone", scope = GncGetUsernameByPhoneNumber.class)
    public JAXBElement<java.lang.String> createGncGetUsernameByPhoneNumberPhone(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncGetUsernameByPhoneNumberPhone_QNAME, java.lang.String.class, GncGetUsernameByPhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuDeleteStream.class)
    public JAXBElement<java.lang.String> createGnuDeleteStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuDeleteStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = GnuDeleteStream.class)
    public JAXBElement<GnStream> createGnuDeleteStreamStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, GnuDeleteStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "info", scope = SetInfo.class)
    public JAXBElement<GnInfo> createSetInfoInfo(GnInfo value) {
        return new JAXBElement<GnInfo>(_GnuSetInfoInfo_QNAME, GnInfo.class, SetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetInfo.class)
    public JAXBElement<java.lang.String> createSetInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = GnBillingAttributeType.class)
    public JAXBElement<java.lang.String> createGnBillingAttributeTypeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, GnBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "description", scope = GnBillingAttributeType.class)
    public JAXBElement<java.lang.String> createGnBillingAttributeTypeDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupDescription_QNAME, java.lang.String.class, GnBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserGroupsWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserGroupsWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserGroupsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserGroupsWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserGroupsWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserGroupsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetExpiredUsers.class)
    public JAXBElement<java.lang.String> createEventGetExpiredUsersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetExpiredUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByUserIdAndServiceId.class)
    public JAXBElement<java.lang.String> createGetUserServicesByUserIdAndServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByUserIdAndServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncApplyCasterInstance.class)
    public JAXBElement<java.lang.String> createGncApplyCasterInstanceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncApplyCasterInstance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "networkId", scope = GetNetwork.class)
    public JAXBElement<java.lang.String> createGetNetworkNetworkId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SetNetworkNetworkId_QNAME, java.lang.String.class, GetNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetNetwork.class)
    public JAXBElement<java.lang.String> createGetNetworkSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserServicesByUserIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserServicesByUserIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserServicesByUserIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByUserIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesByUserIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByUserIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddStream.class)
    public JAXBElement<java.lang.String> createAddStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = AddStream.class)
    public JAXBElement<GnStream> createAddStreamStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, AddStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserTypes.class)
    public JAXBElement<java.lang.String> createGetUserTypesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = LoginByAdmin.class)
    public JAXBElement<java.lang.String> createLoginByAdminName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, LoginByAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = LoginByAdmin.class)
    public JAXBElement<java.lang.String> createLoginByAdminSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, LoginByAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetNetworks.class)
    public JAXBElement<java.lang.String> createGetNetworksSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetNetworks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetVersionGNCasterDB.class)
    public JAXBElement<java.lang.String> createGetVersionGNCasterDBSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetVersionGNCasterDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetStartTime.class)
    public JAXBElement<java.lang.String> createGetStartTimeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetStartTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetAreaTimeToDisconn.class)
    public JAXBElement<java.lang.String> createGncGetAreaTimeToDisconnUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetAreaTimeToDisconn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetAreaTimeToDisconn.class)
    public JAXBElement<java.lang.String> createGncGetAreaTimeToDisconnSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetAreaTimeToDisconn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetAreasByUtsId.class)
    public JAXBElement<java.lang.String> createGetAreasByUtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetAreasByUtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetBillingByTemporary.class)
    public JAXBElement<java.lang.String> createSetBillingByTemporarySession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetBillingByTemporary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "filter", scope = GnExportBillingsConfiguration.class)
    public JAXBElement<java.lang.String> createGnExportBillingsConfigurationFilter(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationFilter_QNAME, java.lang.String.class, GnExportBillingsConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GetInfoByName.class)
    public JAXBElement<java.lang.String> createGetInfoByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GetInfoByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfoByName.class)
    public JAXBElement<java.lang.String> createGetInfoByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfoByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = GetStream.class)
    public JAXBElement<java.lang.String> createGetStreamMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, GetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetStream.class)
    public JAXBElement<java.lang.String> createGetStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteInfoPredefineByInfoPredefine.class)
    public JAXBElement<java.lang.String> createDeleteInfoPredefineByInfoPredefineSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteInfoPredefineByInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetAlmostExpiredGroupToServices.class)
    public JAXBElement<java.lang.String> createEventGetAlmostExpiredGroupToServicesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetAlmostExpiredGroupToServices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "email", scope = DeleteUserByEmail.class)
    public JAXBElement<java.lang.String> createDeleteUserByEmailEmail(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_LoginByEmailEmail_QNAME, java.lang.String.class, DeleteUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserByEmail.class)
    public JAXBElement<java.lang.String> createDeleteUserByEmailSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserByEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBilling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billing", scope = AddBillingReturning.class)
    public JAXBElement<GnBilling> createAddBillingReturningBilling(GnBilling value) {
        return new JAXBElement<GnBilling>(_SetBillingByIdBilling_QNAME, GnBilling.class, AddBillingReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddBillingReturning.class)
    public JAXBElement<java.lang.String> createAddBillingReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddBillingReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserChildrenById.class)
    public JAXBElement<java.lang.String> createGetUserChildrenByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserChildrenById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster", scope = GnuSetCaster.class)
    public JAXBElement<GnCaster> createGnuSetCasterCaster(GnCaster value) {
        return new JAXBElement<GnCaster>(_GnuAddCasterCaster_QNAME, GnCaster.class, GnuSetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStreams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "streams", scope = GnuSetCaster.class)
    public JAXBElement<GnStreams> createGnuSetCasterStreams(GnStreams value) {
        return new JAXBElement<GnStreams>(_GnuAddCasterStreams_QNAME, GnStreams.class, GnuSetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuSetCaster.class)
    public JAXBElement<java.lang.String> createGnuSetCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuSetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetAlmostExpiredUsers.class)
    public JAXBElement<java.lang.String> createEventGetAlmostExpiredUsersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetAlmostExpiredUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "filter", scope = DeleteBillingsByFilter.class)
    public JAXBElement<java.lang.String> createDeleteBillingsByFilterFilter(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationFilter_QNAME, java.lang.String.class, DeleteBillingsByFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingsByFilter.class)
    public JAXBElement<java.lang.String> createDeleteBillingsByFilterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingsByFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userType", scope = AddUserType.class)
    public JAXBElement<GnUserType> createAddUserTypeUserType(GnUserType value) {
        return new JAXBElement<GnUserType>(_SetUserTypeUserType_QNAME, GnUserType.class, AddUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserType.class)
    public JAXBElement<java.lang.String> createAddUserTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetGroupsWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetGroupsWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetGroupsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupsWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetGroupsWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUsers.class)
    public JAXBElement<java.lang.String> createGetUsersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingsAndConnInfosByTime.class)
    public JAXBElement<java.lang.String> createDeleteBillingsAndConnInfosByTimeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingsAndConnInfosByTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = DeleteUserByName.class)
    public JAXBElement<java.lang.String> createDeleteUserByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, DeleteUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserByName.class)
    public JAXBElement<java.lang.String> createDeleteUserByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddStreamReturning.class)
    public JAXBElement<java.lang.String> createAddStreamReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddStreamReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "stream", scope = AddStreamReturning.class)
    public JAXBElement<GnStream> createAddStreamReturningStream(GnStream value) {
        return new JAXBElement<GnStream>(_GnuSetStreamStream_QNAME, GnStream.class, AddStreamReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserServiceByUserId.class)
    public JAXBElement<java.lang.String> createDeleteUserServiceByUserIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserServiceByUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "value", scope = GnInfoPredefine.class)
    public JAXBElement<java.lang.String> createGnInfoPredefineValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteInfoPredefineValue_QNAME, java.lang.String.class, GnInfoPredefine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteGroupService.class)
    public JAXBElement<java.lang.String> createDeleteGroupServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = SetGroupById.class)
    public JAXBElement<GnGroup> createSetGroupByIdGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, SetGroupById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetGroupById.class)
    public JAXBElement<java.lang.String> createSetGroupByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetGroupById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuDeleteCaster.class)
    public JAXBElement<java.lang.String> createGnuDeleteCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuDeleteCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGtsToArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "gtsToArea", scope = AddGtsToArea.class)
    public JAXBElement<GnGtsToArea> createAddGtsToAreaGtsToArea(GnGtsToArea value) {
        return new JAXBElement<GnGtsToArea>(_AddGtsToAreaGtsToArea_QNAME, GnGtsToArea.class, AddGtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddGtsToArea.class)
    public JAXBElement<java.lang.String> createAddGtsToAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddGtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "area", scope = SetAreaById.class)
    public JAXBElement<GnArea> createSetAreaByIdArea(GnArea value) {
        return new JAXBElement<GnArea>(_SetAreaByIdArea_QNAME, GnArea.class, SetAreaById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetAreaById.class)
    public JAXBElement<java.lang.String> createSetAreaByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetAreaById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingById.class)
    public JAXBElement<java.lang.String> createDeleteBillingByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncCheckOnlineAccounts.class)
    public JAXBElement<java.lang.String> createGncCheckOnlineAccountsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncCheckOnlineAccounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = LoginByUsername.class)
    public JAXBElement<java.lang.String> createLoginByUsernameUser(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnuDeleteUserUser_QNAME, java.lang.String.class, LoginByUsername.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = LoginByUsername.class)
    public JAXBElement<java.lang.String> createLoginByUsernamePassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, LoginByUsername.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "network", scope = AddNetworkReturning.class)
    public JAXBElement<GnNetwork> createAddNetworkReturningNetwork(GnNetwork value) {
        return new JAXBElement<GnNetwork>(_AddNetworkNetwork_QNAME, GnNetwork.class, AddNetworkReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddNetworkReturning.class)
    public JAXBElement<java.lang.String> createAddNetworkReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddNetworkReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingsByUserIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingsByUserIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingsByUserIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsByUserIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingsByUserIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsByUserIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuGetStream.class)
    public JAXBElement<java.lang.String> createGnuGetStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuGetStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteInfo.class)
    public JAXBElement<java.lang.String> createDeleteInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetNewUsers.class)
    public JAXBElement<java.lang.String> createEventGetNewUsersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetNewUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnServiceToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "serviceToInfo", scope = AddServiceToInfo.class)
    public JAXBElement<GnServiceToInfo> createAddServiceToInfoServiceToInfo(GnServiceToInfo value) {
        return new JAXBElement<GnServiceToInfo>(_SetServiceToInfoServiceToInfo_QNAME, GnServiceToInfo.class, AddServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddServiceToInfo.class)
    public JAXBElement<java.lang.String> createAddServiceToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetAreasWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetAreasWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetAreasWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetAreasWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroupToService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "groupToService", scope = AddGroupService.class)
    public JAXBElement<GnGroupToService> createAddGroupServiceGroupToService(GnGroupToService value) {
        return new JAXBElement<GnGroupToService>(_SetGroupServiceGroupToService_QNAME, GnGroupToService.class, AddGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddGroupService.class)
    public JAXBElement<java.lang.String> createAddGroupServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddGroupService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster", scope = AddCasterReturning.class)
    public JAXBElement<GnCaster> createAddCasterReturningCaster(GnCaster value) {
        return new JAXBElement<GnCaster>(_GnuAddCasterCaster_QNAME, GnCaster.class, AddCasterReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddCasterReturning.class)
    public JAXBElement<java.lang.String> createAddCasterReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddCasterReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = DeleteBillingAttribute.class)
    public JAXBElement<java.lang.String> createDeleteBillingAttributeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, DeleteBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteBillingAttribute.class)
    public JAXBElement<java.lang.String> createDeleteBillingAttributeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = ImportAreas.class)
    public JAXBElement<java.lang.String> createImportAreasSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, ImportAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetServiceToInfosWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetServiceToInfosWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetServiceToInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceToInfosWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetServiceToInfosWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceToInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncUpdateBillings.class)
    public JAXBElement<java.lang.String> createGncUpdateBillingsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncUpdateBillings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetCountUtsToAreasByUtsId.class)
    public JAXBElement<java.lang.String> createGetCountUtsToAreasByUtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetCountUtsToAreasByUtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "login-name", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMLoginName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMLoginName_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password-source", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMPasswordSource(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMPasswordSource_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "compression", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMCompression(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMCompression_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "nav-systems", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMNavSystems(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamNavSystems_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "tcp-addr", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMTcpAddr(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERTcpAddr_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "generator", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMGenerator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamGenerator_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "format", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMFormat(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMFormat_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "network", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMNetwork(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_AddNetworkNetwork_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "tnonce", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMTnonce(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMTnonce_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "kennung", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMKennung(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERKennung_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "format-details", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMFormatDetails(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamFormatDetails_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "country", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMCountry(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamCountry_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "topaque", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMTopaque(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMTopaque_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mount-point", scope = GNCSTREAM.class)
    public JAXBElement<java.lang.String> createGNCSTREAMMountPoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCSTREAMMountPoint_QNAME, java.lang.String.class, GNCSTREAM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetGtsToAreasWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetGtsToAreasWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetGtsToAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGtsToAreasWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetGtsToAreasWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGtsToAreasWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster", scope = SetCaster.class)
    public JAXBElement<GnCaster> createSetCasterCaster(GnCaster value) {
        return new JAXBElement<GnCaster>(_GnuAddCasterCaster_QNAME, GnCaster.class, SetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casterId", scope = SetCaster.class)
    public JAXBElement<java.lang.String> createSetCasterCasterId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteCasterCasterId_QNAME, java.lang.String.class, SetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetCaster.class)
    public JAXBElement<java.lang.String> createSetCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "group", scope = AddGroupReturning.class)
    public JAXBElement<GnGroup> createAddGroupReturningGroup(GnGroup value) {
        return new JAXBElement<GnGroup>(_GnuAddGroupGroup_QNAME, GnGroup.class, AddGroupReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddGroupReturning.class)
    public JAXBElement<java.lang.String> createAddGroupReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddGroupReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuGetCaster.class)
    public JAXBElement<java.lang.String> createGnuGetCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuGetCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GnInfo.class)
    public JAXBElement<java.lang.String> createGnInfoName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GnInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetInfoPredefinesByInfoIdWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetInfoPredefinesByInfoIdWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetInfoPredefinesByInfoIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfoPredefinesByInfoIdWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetInfoPredefinesByInfoIdWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfoPredefinesByInfoIdWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceToInfo.class)
    public JAXBElement<java.lang.String> createGetServiceToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserToInfo.class)
    public JAXBElement<java.lang.String> createAddUserToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userToInfo", scope = AddUserToInfo.class)
    public JAXBElement<GnUserToInfo> createAddUserToInfoUserToInfo(GnUserToInfo value) {
        return new JAXBElement<GnUserToInfo>(_SetUserToInfoUserToInfo_QNAME, GnUserToInfo.class, AddUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBillingAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billingAttributeType", scope = AddBillingAttributeType.class)
    public JAXBElement<GnBillingAttributeType> createAddBillingAttributeTypeBillingAttributeType(GnBillingAttributeType value) {
        return new JAXBElement<GnBillingAttributeType>(_AddBillingAttributeTypeBillingAttributeType_QNAME, GnBillingAttributeType.class, AddBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddBillingAttributeType.class)
    public JAXBElement<java.lang.String> createAddBillingAttributeTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsByUserId.class)
    public JAXBElement<java.lang.String> createGetBillingsByUserIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsByUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserToInfo.class)
    public JAXBElement<java.lang.String> createGetUserToInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "operator", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKOperator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTEROperator_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-net", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKWebNet(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebNet_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "kennung", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKKennung(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTERKennung_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-str", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKWebStr(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebStr_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-reg", scope = GNCNETWORK.class)
    public JAXBElement<java.lang.String> createGNCNETWORKWebReg(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebReg_QNAME, java.lang.String.class, GNCNETWORK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = StopService.class)
    public JAXBElement<java.lang.String> createStopServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, StopService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncCheckUserNamePassword.class)
    public JAXBElement<java.lang.String> createGncCheckUserNamePasswordUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncCheckUserNamePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = GncCheckUserNamePassword.class)
    public JAXBElement<java.lang.String> createGncCheckUserNamePasswordPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, GncCheckUserNamePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncCheckUserNamePassword.class)
    public JAXBElement<java.lang.String> createGncCheckUserNamePasswordSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncCheckUserNamePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserTypesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserTypesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserTypesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserTypesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserTypesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserTypesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUtsToAreaByUtsIdAndAreaId.class)
    public JAXBElement<java.lang.String> createGetUtsToAreaByUtsIdAndAreaIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUtsToAreaByUtsIdAndAreaId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "filter", scope = GetBillingsUsersOrgsAndManagers.class)
    public JAXBElement<java.lang.String> createGetBillingsUsersOrgsAndManagersFilter(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationFilter_QNAME, java.lang.String.class, GetBillingsUsersOrgsAndManagers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsUsersOrgsAndManagers.class)
    public JAXBElement<java.lang.String> createGetBillingsUsersOrgsAndManagersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsUsersOrgsAndManagers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServiceById.class)
    public JAXBElement<java.lang.String> createGetUserServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetServiceChildrenById.class)
    public JAXBElement<java.lang.String> createGetServiceChildrenByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetServiceChildrenById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "networkId", scope = DeleteNetwork.class)
    public JAXBElement<java.lang.String> createDeleteNetworkNetworkId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SetNetworkNetworkId_QNAME, java.lang.String.class, DeleteNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteNetwork.class)
    public JAXBElement<java.lang.String> createDeleteNetworkSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncStartUserBilling.class)
    public JAXBElement<java.lang.String> createGncStartUserBillingUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncStartUserBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncStartUserBilling.class)
    public JAXBElement<java.lang.String> createGncStartUserBillingSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncStartUserBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetSourceTableByUserName.class)
    public JAXBElement<java.lang.String> createGncGetSourceTableByUserNameUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetSourceTableByUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetSourceTableByUserName.class)
    public JAXBElement<java.lang.String> createGncGetSourceTableByUserNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetSourceTableByUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnCaster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster", scope = AddCaster.class)
    public JAXBElement<GnCaster> createAddCasterCaster(GnCaster value) {
        return new JAXBElement<GnCaster>(_GnuAddCasterCaster_QNAME, GnCaster.class, AddCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddCaster.class)
    public JAXBElement<java.lang.String> createAddCasterSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserByServiceId.class)
    public JAXBElement<java.lang.String> createGetUserByServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserByServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBilling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billing", scope = AddBilling.class)
    public JAXBElement<GnBilling> createAddBillingBilling(GnBilling value) {
        return new JAXBElement<GnBilling>(_SetBillingByIdBilling_QNAME, GnBilling.class, AddBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddBilling.class)
    public JAXBElement<java.lang.String> createAddBillingSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingsBySetWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingsBySetWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingsBySetWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsBySetWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingsBySetWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsBySetWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserAncestorsById.class)
    public JAXBElement<java.lang.String> createGetUserAncestorsByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserAncestorsById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserServiceById.class)
    public JAXBElement<java.lang.String> createDeleteUserServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingAttributeTypesWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingAttributeTypesWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingAttributeTypesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingAttributeTypesWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingAttributeTypesWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingAttributeTypesWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = DeleteInfoByName.class)
    public JAXBElement<java.lang.String> createDeleteInfoByNameName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, DeleteInfoByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteInfoByName.class)
    public JAXBElement<java.lang.String> createDeleteInfoByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteInfoByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetAllPermissionsByUserId.class)
    public JAXBElement<java.lang.String> createGetAllPermissionsByUserIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetAllPermissionsByUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingAttributes.class)
    public JAXBElement<java.lang.String> createGetBillingAttributesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingAttributes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteGroupById.class)
    public JAXBElement<java.lang.String> createDeleteGroupByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteGroupById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserToInfos.class)
    public JAXBElement<java.lang.String> createGetUserToInfosSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserToInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GnService.class)
    public JAXBElement<java.lang.String> createGnServiceName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GnService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "root", scope = GnService.class)
    public JAXBElement<java.lang.String> createGnServiceRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetServiceByRootRoot_QNAME, java.lang.String.class, GnService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = SetUserByName.class)
    public JAXBElement<GnUser> createSetUserByNameUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, SetUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = SetUserByName.class)
    public JAXBElement<java.lang.String> createSetUserByNameUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, SetUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserByName.class)
    public JAXBElement<java.lang.String> createSetUserByNameSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = DeleteStream.class)
    public JAXBElement<java.lang.String> createDeleteStreamMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, DeleteStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteStream.class)
    public JAXBElement<java.lang.String> createDeleteStreamSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "permission", scope = CheckPermission.class)
    public JAXBElement<GnPermission> createCheckPermissionPermission(GnPermission value) {
        return new JAXBElement<GnPermission>(_CheckPermissionPermission_QNAME, GnPermission.class, CheckPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = CheckPermission.class)
    public JAXBElement<java.lang.String> createCheckPermissionSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, CheckPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfoPredefinesByInfoId.class)
    public JAXBElement<java.lang.String> createGetInfoPredefinesByInfoIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfoPredefinesByInfoId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = SetBillingAttributeType.class)
    public JAXBElement<java.lang.String> createSetBillingAttributeTypeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, SetBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnBillingAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "billingAttributeType", scope = SetBillingAttributeType.class)
    public JAXBElement<GnBillingAttributeType> createSetBillingAttributeTypeBillingAttributeType(GnBillingAttributeType value) {
        return new JAXBElement<GnBillingAttributeType>(_AddBillingAttributeTypeBillingAttributeType_QNAME, GnBillingAttributeType.class, SetBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetBillingAttributeType.class)
    public JAXBElement<java.lang.String> createSetBillingAttributeTypeSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetBillingAttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGroupById.class)
    public JAXBElement<java.lang.String> createGetGroupByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGroupById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "user", scope = SetUserById.class)
    public JAXBElement<GnUser> createSetUserByIdUser(GnUser value) {
        return new JAXBElement<GnUser>(_GnuDeleteUserUser_QNAME, GnUser.class, SetUserById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserById.class)
    public JAXBElement<java.lang.String> createSetUserByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetUserGlonassBiasClass.class)
    public JAXBElement<java.lang.String> createGncGetUserGlonassBiasClassUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetUserGlonassBiasClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetUserGlonassBiasClass.class)
    public JAXBElement<java.lang.String> createGncGetUserGlonassBiasClassSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetUserGlonassBiasClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteUserServiceByUserIdAndServiceId.class)
    public JAXBElement<java.lang.String> createDeleteUserServiceByUserIdAndServiceIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteUserServiceByUserIdAndServiceId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "comment", scope = GnVersion.class)
    public JAXBElement<java.lang.String> createGnVersionComment(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnVersionComment_QNAME, java.lang.String.class, GnVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "version", scope = GnVersion.class)
    public JAXBElement<java.lang.String> createGnVersionVersion(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnVersionVersion_QNAME, java.lang.String.class, GnVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = Logout.class)
    public JAXBElement<java.lang.String> createLogoutSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserChildrenWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserChildrenWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserChildrenWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserChildrenWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserChildrenWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserChildrenWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingAttributeTypes.class)
    public JAXBElement<java.lang.String> createGetBillingAttributeTypesSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingAttributeTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = BuildServiceStructure.class)
    public JAXBElement<java.lang.String> createBuildServiceStructureSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, BuildServiceStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "processiongType", scope = GetProcessedList.class)
    public JAXBElement<java.lang.String> createGetProcessedListProcessiongType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetProcessedListProcessiongType_QNAME, java.lang.String.class, GetProcessedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetProcessedList.class)
    public JAXBElement<java.lang.String> createGetProcessedListSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetProcessedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGtsToAreasByGtsId.class)
    public JAXBElement<java.lang.String> createGetGtsToAreasByGtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGtsToAreasByGtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "authentication", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkAuthentication(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamAuthentication_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "operator", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkOperator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTEROperator_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-net", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkWebNet(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebNet_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-str", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkWebStr(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebStr_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "web-reg", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkWebReg(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCNETWORKWebReg_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "fee", scope = GnNetwork.class)
    public JAXBElement<java.lang.String> createGnNetworkFee(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamFee_QNAME, java.lang.String.class, GnNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetUserServicesByLicenceWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetUserServicesByLicenceWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetUserServicesByLicenceWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "licence", scope = GetUserServicesByLicenceWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesByLicenceWithOptionsAdditionalLicence(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupToServiceLicence_QNAME, java.lang.String.class, GetUserServicesByLicenceWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserServicesByLicenceWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetUserServicesByLicenceWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserServicesByLicenceWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingsByUserIdAndChildrenWithOptionAdditional.class)
    public JAXBElement<GetOptions> createGetBillingsByUserIdAndChildrenWithOptionAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingsByUserIdAndChildrenWithOptionAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsByUserIdAndChildrenWithOptionAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingsByUserIdAndChildrenWithOptionAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsByUserIdAndChildrenWithOptionAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetAreasByGtsId.class)
    public JAXBElement<java.lang.String> createGetAreasByGtsIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetAreasByGtsId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserToInfoReturning.class)
    public JAXBElement<java.lang.String> createAddUserToInfoReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserToInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userToInfo", scope = AddUserToInfoReturning.class)
    public JAXBElement<GnUserToInfo> createAddUserToInfoReturningUserToInfo(GnUserToInfo value) {
        return new JAXBElement<GnUserToInfo>(_SetUserToInfoUserToInfo_QNAME, GnUserToInfo.class, AddUserToInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "fallback-host", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterFallbackHost(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterFallbackHost_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "host", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterHost(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterHost_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "misc", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterMisc(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamMisc_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster-instance", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterCasterInstance(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterCasterInstance_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "protocol", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterProtocol(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterProtocol_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "caster-id", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterCasterId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterCasterId_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "server-ip", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterServerIp(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamServerIp_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "server-password", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterServerPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamServerPassword_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "client-user", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterClientUser(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamClientUser_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "operator", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterOperator(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GNCCASTEROperator_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "identifier", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterIdentifier(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamIdentifier_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "country", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterCountry(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamCountry_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "client-password", scope = GnCaster.class)
    public JAXBElement<java.lang.String> createGnCasterClientPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamClientPassword_QNAME, java.lang.String.class, GnCaster.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUtsToArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "utsToArea", scope = AddUtsToArea.class)
    public JAXBElement<GnUtsToArea> createAddUtsToAreaUtsToArea(GnUtsToArea value) {
        return new JAXBElement<GnUtsToArea>(_AddUtsToAreaUtsToArea_QNAME, GnUtsToArea.class, AddUtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUtsToArea.class)
    public JAXBElement<java.lang.String> createAddUtsToAreaSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUtsToArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = CasterInstance.class)
    public JAXBElement<java.lang.String> createCasterInstanceMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, CasterInstance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "ip-adress", scope = CasterInstance.class)
    public JAXBElement<java.lang.String> createCasterInstanceIpAdress(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_CasterInstanceIpAdress_QNAME, java.lang.String.class, CasterInstance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "mountpoint", scope = GnCasterData.class)
    public JAXBElement<java.lang.String> createGnCasterDataMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsUserInsideByChzIdMountpoint_QNAME, java.lang.String.class, GnCasterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casterInstance", scope = GnCasterData.class)
    public JAXBElement<java.lang.String> createGnCasterDataCasterInstance(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterDataCasterInstance_QNAME, java.lang.String.class, GnCasterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "gnCasterRoot", scope = GnCasterData.class)
    public JAXBElement<java.lang.String> createGnCasterDataGnCasterRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnCasterDataGnCasterRoot_QNAME, java.lang.String.class, GnCasterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "casterId", scope = GnCasterData.class)
    public JAXBElement<java.lang.String> createGnCasterDataCasterId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteCasterCasterId_QNAME, java.lang.String.class, GnCasterData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "info", scope = AddInfo.class)
    public JAXBElement<GnInfo> createAddInfoInfo(GnInfo value) {
        return new JAXBElement<GnInfo>(_GnuSetInfoInfo_QNAME, GnInfo.class, AddInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddInfo.class)
    public JAXBElement<java.lang.String> createAddInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetBillingsWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetBillingsWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetBillingsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetBillingsWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetBillingsWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetBillingsWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "root", scope = DeleteServiceByRoot.class)
    public JAXBElement<java.lang.String> createDeleteServiceByRootRoot(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetServiceByRootRoot_QNAME, java.lang.String.class, DeleteServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteServiceByRoot.class)
    public JAXBElement<java.lang.String> createDeleteServiceByRootSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteServiceByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "filter", scope = GetUsersOrgsAndManagers.class)
    public JAXBElement<java.lang.String> createGetUsersOrgsAndManagersFilter(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnExportConfigurationFilter_QNAME, java.lang.String.class, GetUsersOrgsAndManagers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUsersOrgsAndManagers.class)
    public JAXBElement<java.lang.String> createGetUsersOrgsAndManagersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUsersOrgsAndManagers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = DeleteServiceById.class)
    public JAXBElement<java.lang.String> createDeleteServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, DeleteServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userToService", scope = AddUserServiceReturning.class)
    public JAXBElement<GnUserToService> createAddUserServiceReturningUserToService(GnUserToService value) {
        return new JAXBElement<GnUserToService>(_AddUserServiceReturningUserToService_QNAME, GnUserToService.class, AddUserServiceReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserServiceReturning.class)
    public JAXBElement<java.lang.String> createAddUserServiceReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserServiceReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = EventGetExpiredGroups.class)
    public JAXBElement<java.lang.String> createEventGetExpiredGroupsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, EventGetExpiredGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserGroup.class)
    public JAXBElement<java.lang.String> createAddUserGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userTogroup", scope = AddUserGroup.class)
    public JAXBElement<GnUserToGroup> createAddUserGroupUserTogroup(GnUserToGroup value) {
        return new JAXBElement<GnUserToGroup>(_AddUserGroupUserTogroup_QNAME, GnUserToGroup.class, AddUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuDeleteGroup.class)
    public JAXBElement<java.lang.String> createGnuDeleteGroupSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuDeleteGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "Mountpoint", scope = GncGetServiceTimeToDisconn.class)
    public JAXBElement<java.lang.String> createGncGetServiceTimeToDisconnMountpoint(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncGetServiceTimeToDisconnMountpoint_QNAME, java.lang.String.class, GncGetServiceTimeToDisconn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetServiceTimeToDisconn.class)
    public JAXBElement<java.lang.String> createGncGetServiceTimeToDisconnSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetServiceTimeToDisconn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "content", scope = GnUserToInfo.class)
    public JAXBElement<java.lang.String> createGnUserToInfoContent(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnServiceToInfoContent_QNAME, java.lang.String.class, GnUserToInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session-id", scope = GnLogin.class)
    public JAXBElement<java.lang.String> createGnLoginSessionId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnLoginSessionId_QNAME, java.lang.String.class, GnLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetUserServiceById.class)
    public JAXBElement<java.lang.String> createSetUserServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetUserServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "data", scope = SetUserServiceById.class)
    public JAXBElement<GnUserToService> createSetUserServiceByIdData(GnUserToService value) {
        return new JAXBElement<GnUserToService>(_SetUserServiceByIdData_QNAME, GnUserToService.class, SetUserServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnUserToService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userToService", scope = AddUserService.class)
    public JAXBElement<GnUserToService> createAddUserServiceUserToService(GnUserToService value) {
        return new JAXBElement<GnUserToService>(_AddUserServiceReturningUserToService_QNAME, GnUserToService.class, AddUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddUserService.class)
    public JAXBElement<java.lang.String> createAddUserServiceSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "info", scope = AddInfoReturning.class)
    public JAXBElement<GnInfo> createAddInfoReturningInfo(GnInfo value) {
        return new JAXBElement<GnInfo>(_GnuSetInfoInfo_QNAME, GnInfo.class, AddInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddInfoReturning.class)
    public JAXBElement<java.lang.String> createAddInfoReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = SetServiceById.class)
    public JAXBElement<java.lang.String> createSetServiceByIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, SetServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "service", scope = SetServiceById.class)
    public JAXBElement<GnService> createSetServiceByIdService(GnService value) {
        return new JAXBElement<GnService>(_AddServiceService_QNAME, GnService.class, SetServiceById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "options", scope = GetInfosWithOptionsAdditional.class)
    public JAXBElement<GetOptions> createGetInfosWithOptionsAdditionalOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetBillingsByServiceIdWithOptionsAdditionalOptions_QNAME, GetOptions.class, GetInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetInfosWithOptionsAdditional.class)
    public JAXBElement<java.lang.String> createGetInfosWithOptionsAdditionalSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetInfosWithOptionsAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "name", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupName_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "last-name", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserLastName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserLastName_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "email", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserEmail(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_LoginByEmailEmail_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "zip-code", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserZipCode(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserZipCode_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "fax", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserFax(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserFax_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "password", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedPassword_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "street", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserStreet(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserStreet_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "phone", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserPhone(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncGetUsernameByPhoneNumberPhone_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "description", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnGroupDescription_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "first-name", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserFirstName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserFirstName_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "title", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserTitle(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserTitle_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "country", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserCountry(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnStreamCountry_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "city", scope = GnUser.class)
    public JAXBElement<java.lang.String> createGnUserCity(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnUserCity_QNAME, java.lang.String.class, GnUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetVersionDLL.class)
    public JAXBElement<java.lang.String> createGetVersionDLLSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetVersionDLL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "userName", scope = GncGetUserOrganisationMembers.class)
    public JAXBElement<java.lang.String> createGncGetUserOrganisationMembersUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GncIsMountpointPermittedUserName_QNAME, java.lang.String.class, GncGetUserOrganisationMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GncGetUserOrganisationMembers.class)
    public JAXBElement<java.lang.String> createGncGetUserOrganisationMembersSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GncGetUserOrganisationMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GnuGetInfo.class)
    public JAXBElement<java.lang.String> createGnuGetInfoSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GnuGetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetExportBillings.class)
    public JAXBElement<java.lang.String> createGetExportBillingsSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetExportBillings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "attribute", scope = GnBillingAttribute.class)
    public JAXBElement<java.lang.String> createGnBillingAttributeAttribute(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingAttributeTypeAttribute_QNAME, java.lang.String.class, GnBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "value", scope = GnBillingAttribute.class)
    public JAXBElement<java.lang.String> createGnBillingAttributeValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_DeleteInfoPredefineValue_QNAME, java.lang.String.class, GnBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "datatype", scope = GnBillingAttribute.class)
    public JAXBElement<java.lang.String> createGnBillingAttributeDatatype(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GnBillingAttributeDatatype_QNAME, java.lang.String.class, GnBillingAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetGtsToAreaByGtsIdAndAreaId.class)
    public JAXBElement<java.lang.String> createGetGtsToAreaByGtsIdAndAreaIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetGtsToAreaByGtsIdAndAreaId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnServiceToInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "serviceToInfo", scope = AddServiceToInfoReturning.class)
    public JAXBElement<GnServiceToInfo> createAddServiceToInfoReturningServiceToInfo(GnServiceToInfo value) {
        return new JAXBElement<GnServiceToInfo>(_SetServiceToInfoServiceToInfo_QNAME, GnServiceToInfo.class, AddServiceToInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = AddServiceToInfoReturning.class)
    public JAXBElement<java.lang.String> createAddServiceToInfoReturningSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, AddServiceToInfoReturning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gndbss", name = "session", scope = GetUserByBillingId.class)
    public JAXBElement<java.lang.String> createGetUserByBillingIdSession(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetBillingsByServiceIdWithOptionsAdditionalSession_QNAME, java.lang.String.class, GetUserByBillingId.class, value);
    }

}
