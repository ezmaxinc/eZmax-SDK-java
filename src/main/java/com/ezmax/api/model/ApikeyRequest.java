/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T20:48:09.039253Z[Etc/UTC]")
public class ApikeyRequest {
  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION = "objApikeyDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION)
  private MultilingualApikeyDescription objApikeyDescription;


  public ApikeyRequest fkiUserID(Integer fkiUserID) {
    
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


  public ApikeyRequest objApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyRequest apikeyRequest = (ApikeyRequest) o;
    return Objects.equals(this.fkiUserID, apikeyRequest.fkiUserID) &&
        Objects.equals(this.objApikeyDescription, apikeyRequest.objApikeyDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserID, objApikeyDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRequest {\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    objApikeyDescription: ").append(toIndentedString(objApikeyDescription)).append("\n");
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

