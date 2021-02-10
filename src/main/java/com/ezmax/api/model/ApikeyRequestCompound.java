/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.ApikeyRequest;
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
 * An Apikey Object and children to create a complete structure
 */
@ApiModel(description = "An Apikey Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:51:01.665Z[GMT]")
public class ApikeyRequestCompound {
  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION = "objApikeyDescription";
  @SerializedName(SERIALIZED_NAME_OBJ_APIKEY_DESCRIPTION)
  private MultilingualApikeyDescription objApikeyDescription;


  public ApikeyRequestCompound fkiUserID(Integer fkiUserID) {
    
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


  public ApikeyRequestCompound objApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    
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
    ApikeyRequestCompound apikeyRequestCompound = (ApikeyRequestCompound) o;
    return Objects.equals(this.fkiUserID, apikeyRequestCompound.fkiUserID) &&
        Objects.equals(this.objApikeyDescription, apikeyRequestCompound.objApikeyDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserID, objApikeyDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRequestCompound {\n");
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

