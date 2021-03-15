/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.35
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
 * Request for the /1/module/sspr/sendUsernames API Request
 */
@ApiModel(description = "Request for the /1/module/sspr/sendUsernames API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T18:07:05.174Z[GMT]")
public class SsprSendUsernamesV1Request {
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


  public SsprSendUsernamesV1Request pksCustomerCode(String pksCustomerCode) {
    
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


  public SsprSendUsernamesV1Request fkiLanguageID(Integer fkiLanguageID) {
    
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


  public SsprSendUsernamesV1Request eUserTypeSSPR(FieldEUserTypeSSPR eUserTypeSSPR) {
    
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


  public SsprSendUsernamesV1Request sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @ApiModelProperty(example = "example@domain.com", required = true, value = "The email address.")

  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsprSendUsernamesV1Request ssprSendUsernamesV1Request = (SsprSendUsernamesV1Request) o;
    return Objects.equals(this.pksCustomerCode, ssprSendUsernamesV1Request.pksCustomerCode) &&
        Objects.equals(this.fkiLanguageID, ssprSendUsernamesV1Request.fkiLanguageID) &&
        Objects.equals(this.eUserTypeSSPR, ssprSendUsernamesV1Request.eUserTypeSSPR) &&
        Objects.equals(this.sEmailAddress, ssprSendUsernamesV1Request.sEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pksCustomerCode, fkiLanguageID, eUserTypeSSPR, sEmailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsprSendUsernamesV1Request {\n");
    sb.append("    pksCustomerCode: ").append(toIndentedString(pksCustomerCode)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    eUserTypeSSPR: ").append(toIndentedString(eUserTypeSSPR)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
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

