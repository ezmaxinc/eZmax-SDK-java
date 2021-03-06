/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.FieldEUserTypeSSPR;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/module/sspr/validateToken API Request
 */
@ApiModel(description = "Request for the /1/module/sspr/validateToken API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class SsprValidateTokenV1Request {
  public static final String SERIALIZED_NAME_PKS_CUSTOMER_CODE = "pksCustomerCode";
  @SerializedName(SERIALIZED_NAME_PKS_CUSTOMER_CODE)
  private String pksCustomerCode;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_E_USER_TYPE_S_S_P_R = "eUserTypeSSPR";
  @SerializedName(SERIALIZED_NAME_E_USER_TYPE_S_S_P_R)
  private FieldEUserTypeSSPR eUserTypeSSPR;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_USER_LOGINNAME = "sUserLoginname";
  @SerializedName(SERIALIZED_NAME_S_USER_LOGINNAME)
  private String sUserLoginname;

  public static final String SERIALIZED_NAME_BIN_USER_S_S_P_RTOKEN = "binUserSSPRtoken";
  @SerializedName(SERIALIZED_NAME_BIN_USER_S_S_P_RTOKEN)
  private String binUserSSPRtoken;


  public SsprValidateTokenV1Request pksCustomerCode(String pksCustomerCode) {
    
    this.pksCustomerCode = pksCustomerCode;
    return this;
  }

   /**
   * The customer code assigned to your account
   * @return pksCustomerCode
  **/
  @ApiModelProperty(example = "demo", required = true, value = "The customer code assigned to your account")

  public String getPksCustomerCode() {
    return pksCustomerCode;
  }


  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
  }


  public SsprValidateTokenV1Request fkiLanguageID(Integer fkiLanguageID) {
    
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


  public SsprValidateTokenV1Request eUserTypeSSPR(FieldEUserTypeSSPR eUserTypeSSPR) {
    
    this.eUserTypeSSPR = eUserTypeSSPR;
    return this;
  }

   /**
   * Get eUserTypeSSPR
   * @return eUserTypeSSPR
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEUserTypeSSPR geteUserTypeSSPR() {
    return eUserTypeSSPR;
  }


  public void seteUserTypeSSPR(FieldEUserTypeSSPR eUserTypeSSPR) {
    this.eUserTypeSSPR = eUserTypeSSPR;
  }


  public SsprValidateTokenV1Request sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@domain.com", value = "The email address.")

  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public SsprValidateTokenV1Request sUserLoginname(String sUserLoginname) {
    
    this.sUserLoginname = sUserLoginname;
    return this;
  }

   /**
   * The Login name of the User.
   * @return sUserLoginname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JohnDoe", value = "The Login name of the User.")

  public String getsUserLoginname() {
    return sUserLoginname;
  }


  public void setsUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }


  public SsprValidateTokenV1Request binUserSSPRtoken(String binUserSSPRtoken) {
    
    this.binUserSSPRtoken = binUserSSPRtoken;
    return this;
  }

   /**
   * Hex Encoded Secret SSPR token
   * @return binUserSSPRtoken
  **/
  @ApiModelProperty(example = "012345678901234567890123456789012345678901234567890123456789abcd", required = true, value = "Hex Encoded Secret SSPR token")

  public String getBinUserSSPRtoken() {
    return binUserSSPRtoken;
  }


  public void setBinUserSSPRtoken(String binUserSSPRtoken) {
    this.binUserSSPRtoken = binUserSSPRtoken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsprValidateTokenV1Request ssprValidateTokenV1Request = (SsprValidateTokenV1Request) o;
    return Objects.equals(this.pksCustomerCode, ssprValidateTokenV1Request.pksCustomerCode) &&
        Objects.equals(this.fkiLanguageID, ssprValidateTokenV1Request.fkiLanguageID) &&
        Objects.equals(this.eUserTypeSSPR, ssprValidateTokenV1Request.eUserTypeSSPR) &&
        Objects.equals(this.sEmailAddress, ssprValidateTokenV1Request.sEmailAddress) &&
        Objects.equals(this.sUserLoginname, ssprValidateTokenV1Request.sUserLoginname) &&
        Objects.equals(this.binUserSSPRtoken, ssprValidateTokenV1Request.binUserSSPRtoken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pksCustomerCode, fkiLanguageID, eUserTypeSSPR, sEmailAddress, sUserLoginname, binUserSSPRtoken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsprValidateTokenV1Request {\n");
    sb.append("    pksCustomerCode: ").append(toIndentedString(pksCustomerCode)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    eUserTypeSSPR: ").append(toIndentedString(eUserTypeSSPR)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sUserLoginname: ").append(toIndentedString(sUserLoginname)).append("\n");
    sb.append("    binUserSSPRtoken: ").append(toIndentedString(binUserSSPRtoken)).append("\n");
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

