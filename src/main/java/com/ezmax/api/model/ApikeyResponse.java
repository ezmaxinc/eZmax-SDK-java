/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.39
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonAudit;
import com.ezmax.api.model.MultilingualApikeyDescription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Apikey Object
 */
@ApiModel(description = "An Apikey Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T19:33:12.356Z[GMT]")
public class ApikeyResponse {
  public static final String SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION = "objApikeyDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION)
  private MultilingualApikeyDescription objApikeyDescription;

  public static final String SERIALIZED_NAME_S_COMPUTED_TOKEN = "sComputedToken";
  @SerializedName(SERIALIZED_NAME_S_COMPUTED_TOKEN)
  private String sComputedToken;

  public static final String SERIALIZED_NAME_PKI_APIKEY_I_D = "pkiApikeyID";
  @SerializedName(SERIALIZED_NAME_PKI_APIKEY_I_D)
  private Integer pkiApikeyID;

  public static final String SERIALIZED_NAME_OBJ_AUDIT = "objAudit";
  @SerializedName(SERIALIZED_NAME_OBJ_AUDIT)
  private CommonAudit objAudit;


  public ApikeyResponse objApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    
    this.objApikeyDescription = objApikeyDescription;
    return this;
  }

   /**
   * Get objApikeyDescription
   * @return objApikeyDescription
  **/
  @ApiModelProperty(required = true, value = "")

  public MultilingualApikeyDescription getObjApikeyDescription() {
    return objApikeyDescription;
  }


  public void setObjApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    this.objApikeyDescription = objApikeyDescription;
  }


  public ApikeyResponse sComputedToken(String sComputedToken) {
    
    this.sComputedToken = sComputedToken;
    return this;
  }

   /**
   * The secret token for the API key.  This will be returned only on creation.
   * @return sComputedToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secret token for the API key.  This will be returned only on creation.")

  public String getsComputedToken() {
    return sComputedToken;
  }


  public void setsComputedToken(String sComputedToken) {
    this.sComputedToken = sComputedToken;
  }


  public ApikeyResponse pkiApikeyID(Integer pkiApikeyID) {
    
    this.pkiApikeyID = pkiApikeyID;
    return this;
  }

   /**
   * The unique ID of the Apikey
   * @return pkiApikeyID
  **/
  @ApiModelProperty(example = "99", required = true, value = "The unique ID of the Apikey")

  public Integer getPkiApikeyID() {
    return pkiApikeyID;
  }


  public void setPkiApikeyID(Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
  }


  public ApikeyResponse objAudit(CommonAudit objAudit) {
    
    this.objAudit = objAudit;
    return this;
  }

   /**
   * Get objAudit
   * @return objAudit
  **/
  @ApiModelProperty(required = true, value = "")

  public CommonAudit getObjAudit() {
    return objAudit;
  }


  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyResponse apikeyResponse = (ApikeyResponse) o;
    return Objects.equals(this.objApikeyDescription, apikeyResponse.objApikeyDescription) &&
        Objects.equals(this.sComputedToken, apikeyResponse.sComputedToken) &&
        Objects.equals(this.pkiApikeyID, apikeyResponse.pkiApikeyID) &&
        Objects.equals(this.objAudit, apikeyResponse.objAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objApikeyDescription, sComputedToken, pkiApikeyID, objAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyResponse {\n");
    sb.append("    objApikeyDescription: ").append(toIndentedString(objApikeyDescription)).append("\n");
    sb.append("    sComputedToken: ").append(toIndentedString(sComputedToken)).append("\n");
    sb.append("    pkiApikeyID: ").append(toIndentedString(pkiApikeyID)).append("\n");
    sb.append("    objAudit: ").append(toIndentedString(objAudit)).append("\n");
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

