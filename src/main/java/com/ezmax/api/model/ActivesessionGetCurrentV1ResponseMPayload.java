/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.43
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Payload for the /1/object/activesession/getCurrent API Request
 */
@ApiModel(description = "Payload for the /1/object/activesession/getCurrent API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T22:38:36.330572Z[Etc/UTC]")
public class ActivesessionGetCurrentV1ResponseMPayload {
  public static final String SERIALIZED_NAME_S_CUSTOMER_CODE = "sCustomerCode";
  @SerializedName(SERIALIZED_NAME_S_CUSTOMER_CODE)
  private String sCustomerCode;

  /**
   * The type of session used for the API request call
   */
  @JsonAdapter(EActivesessionSessiontypeEnum.Adapter.class)
  public enum EActivesessionSessiontypeEnum {
    NORMAL("Normal");

    private String value;

    EActivesessionSessiontypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EActivesessionSessiontypeEnum fromValue(String value) {
      for (EActivesessionSessiontypeEnum b : EActivesessionSessiontypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EActivesessionSessiontypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EActivesessionSessiontypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EActivesessionSessiontypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EActivesessionSessiontypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_ACTIVESESSION_SESSIONTYPE = "eActivesessionSessiontype";
  @SerializedName(SERIALIZED_NAME_E_ACTIVESESSION_SESSIONTYPE)
  private EActivesessionSessiontypeEnum eActivesessionSessiontype;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_COMPANY_NAME_X = "sCompanyNameX";
  @SerializedName(SERIALIZED_NAME_S_COMPANY_NAME_X)
  private String sCompanyNameX;

  public static final String SERIALIZED_NAME_S_DEPARTMENT_NAME_X = "sDepartmentNameX";
  @SerializedName(SERIALIZED_NAME_S_DEPARTMENT_NAME_X)
  private String sDepartmentNameX;

  public static final String SERIALIZED_NAME_A_REGISTERED_MODULES = "a_RegisteredModules";
  @SerializedName(SERIALIZED_NAME_A_REGISTERED_MODULES)
  private List<String> aRegisteredModules = new ArrayList<String>();

  public static final String SERIALIZED_NAME_A_PERMISSIONS = "a_Permissions";
  @SerializedName(SERIALIZED_NAME_A_PERMISSIONS)
  private List<Integer> aPermissions = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_APIKEY_I_D = "fkiApikeyID";
  @SerializedName(SERIALIZED_NAME_FKI_APIKEY_I_D)
  private Integer fkiApikeyID;


  public ActivesessionGetCurrentV1ResponseMPayload sCustomerCode(String sCustomerCode) {
    
    this.sCustomerCode = sCustomerCode;
    return this;
  }

   /**
   * The customer code specific to the client in which the API request is being made
   * @return sCustomerCode
  **/
  @ApiModelProperty(required = true, value = "The customer code specific to the client in which the API request is being made")

  public String getsCustomerCode() {
    return sCustomerCode;
  }


  public void setsCustomerCode(String sCustomerCode) {
    this.sCustomerCode = sCustomerCode;
  }


  public ActivesessionGetCurrentV1ResponseMPayload eActivesessionSessiontype(EActivesessionSessiontypeEnum eActivesessionSessiontype) {
    
    this.eActivesessionSessiontype = eActivesessionSessiontype;
    return this;
  }

   /**
   * The type of session used for the API request call
   * @return eActivesessionSessiontype
  **/
  @ApiModelProperty(required = true, value = "The type of session used for the API request call")

  public EActivesessionSessiontypeEnum geteActivesessionSessiontype() {
    return eActivesessionSessiontype;
  }


  public void seteActivesessionSessiontype(EActivesessionSessiontypeEnum eActivesessionSessiontype) {
    this.eActivesessionSessiontype = eActivesessionSessiontype;
  }


  public ActivesessionGetCurrentV1ResponseMPayload fkiLanguageID(Integer fkiLanguageID) {
    
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

   /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
  **/
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")

  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public ActivesessionGetCurrentV1ResponseMPayload sCompanyNameX(String sCompanyNameX) {
    
    this.sCompanyNameX = sCompanyNameX;
    return this;
  }

   /**
   * The name of the active Company in the current language
   * @return sCompanyNameX
  **/
  @ApiModelProperty(required = true, value = "The name of the active Company in the current language")

  public String getsCompanyNameX() {
    return sCompanyNameX;
  }


  public void setsCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }


  public ActivesessionGetCurrentV1ResponseMPayload sDepartmentNameX(String sDepartmentNameX) {
    
    this.sDepartmentNameX = sDepartmentNameX;
    return this;
  }

   /**
   * The name of the active Department in the current language
   * @return sDepartmentNameX
  **/
  @ApiModelProperty(required = true, value = "The name of the active Department in the current language")

  public String getsDepartmentNameX() {
    return sDepartmentNameX;
  }


  public void setsDepartmentNameX(String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }


  public ActivesessionGetCurrentV1ResponseMPayload aRegisteredModules(List<String> aRegisteredModules) {
    
    this.aRegisteredModules = aRegisteredModules;
    return this;
  }

  public ActivesessionGetCurrentV1ResponseMPayload addARegisteredModulesItem(String aRegisteredModulesItem) {
    this.aRegisteredModules.add(aRegisteredModulesItem);
    return this;
  }

   /**
   * An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
   * @return aRegisteredModules
  **/
  @ApiModelProperty(required = true, value = "An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.")

  public List<String> getaRegisteredModules() {
    return aRegisteredModules;
  }


  public void setaRegisteredModules(List<String> aRegisteredModules) {
    this.aRegisteredModules = aRegisteredModules;
  }


  public ActivesessionGetCurrentV1ResponseMPayload aPermissions(List<Integer> aPermissions) {
    
    this.aPermissions = aPermissions;
    return this;
  }

  public ActivesessionGetCurrentV1ResponseMPayload addAPermissionsItem(Integer aPermissionsItem) {
    this.aPermissions.add(aPermissionsItem);
    return this;
  }

   /**
   * An array of permissions granted to the user or api key
   * @return aPermissions
  **/
  @ApiModelProperty(required = true, value = "An array of permissions granted to the user or api key")

  public List<Integer> getaPermissions() {
    return aPermissions;
  }


  public void setaPermissions(List<Integer> aPermissions) {
    this.aPermissions = aPermissions;
  }


  public ActivesessionGetCurrentV1ResponseMPayload fkiUserID(Integer fkiUserID) {
    
    this.fkiUserID = fkiUserID;
    return this;
  }

   /**
   * The unique ID of the User
   * @return fkiUserID
  **/
  @ApiModelProperty(example = "70", required = true, value = "The unique ID of the User")

  public Integer getFkiUserID() {
    return fkiUserID;
  }


  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public ActivesessionGetCurrentV1ResponseMPayload fkiApikeyID(Integer fkiApikeyID) {
    
    this.fkiApikeyID = fkiApikeyID;
    return this;
  }

   /**
   * The unique ID of the Apikey
   * @return fkiApikeyID
  **/
  @ApiModelProperty(example = "99", required = true, value = "The unique ID of the Apikey")

  public Integer getFkiApikeyID() {
    return fkiApikeyID;
  }


  public void setFkiApikeyID(Integer fkiApikeyID) {
    this.fkiApikeyID = fkiApikeyID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionGetCurrentV1ResponseMPayload activesessionGetCurrentV1ResponseMPayload = (ActivesessionGetCurrentV1ResponseMPayload) o;
    return Objects.equals(this.sCustomerCode, activesessionGetCurrentV1ResponseMPayload.sCustomerCode) &&
        Objects.equals(this.eActivesessionSessiontype, activesessionGetCurrentV1ResponseMPayload.eActivesessionSessiontype) &&
        Objects.equals(this.fkiLanguageID, activesessionGetCurrentV1ResponseMPayload.fkiLanguageID) &&
        Objects.equals(this.sCompanyNameX, activesessionGetCurrentV1ResponseMPayload.sCompanyNameX) &&
        Objects.equals(this.sDepartmentNameX, activesessionGetCurrentV1ResponseMPayload.sDepartmentNameX) &&
        Objects.equals(this.aRegisteredModules, activesessionGetCurrentV1ResponseMPayload.aRegisteredModules) &&
        Objects.equals(this.aPermissions, activesessionGetCurrentV1ResponseMPayload.aPermissions) &&
        Objects.equals(this.fkiUserID, activesessionGetCurrentV1ResponseMPayload.fkiUserID) &&
        Objects.equals(this.fkiApikeyID, activesessionGetCurrentV1ResponseMPayload.fkiApikeyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sCustomerCode, eActivesessionSessiontype, fkiLanguageID, sCompanyNameX, sDepartmentNameX, aRegisteredModules, aPermissions, fkiUserID, fkiApikeyID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionGetCurrentV1ResponseMPayload {\n");
    sb.append("    sCustomerCode: ").append(toIndentedString(sCustomerCode)).append("\n");
    sb.append("    eActivesessionSessiontype: ").append(toIndentedString(eActivesessionSessiontype)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sCompanyNameX: ").append(toIndentedString(sCompanyNameX)).append("\n");
    sb.append("    sDepartmentNameX: ").append(toIndentedString(sDepartmentNameX)).append("\n");
    sb.append("    aRegisteredModules: ").append(toIndentedString(aRegisteredModules)).append("\n");
    sb.append("    aPermissions: ").append(toIndentedString(aPermissions)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    fkiApikeyID: ").append(toIndentedString(fkiApikeyID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

