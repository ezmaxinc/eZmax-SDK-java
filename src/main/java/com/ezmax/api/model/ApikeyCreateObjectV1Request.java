/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.28
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
import com.ezmax.api.model.ApikeyRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/apikey/createObject API Request
 */
@ApiModel(description = "Request for the /1/object/apikey/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class ApikeyCreateObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_APIKEY = "objApikey";
  @SerializedName(SERIALIZED_NAME_OBJ_APIKEY)
  private ApikeyRequest objApikey;

  public static final String SERIALIZED_NAME_OBJ_APIKEY_COMPOUND = "objApikeyCompound";
  @SerializedName(SERIALIZED_NAME_OBJ_APIKEY_COMPOUND)
  private ApikeyRequestCompound objApikeyCompound;


  public ApikeyCreateObjectV1Request objApikey(ApikeyRequest objApikey) {
    
    this.objApikey = objApikey;
    return this;
  }

   /**
   * Get objApikey
   * @return objApikey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApikeyRequest getObjApikey() {
    return objApikey;
  }


  public void setObjApikey(ApikeyRequest objApikey) {
    this.objApikey = objApikey;
  }


  public ApikeyCreateObjectV1Request objApikeyCompound(ApikeyRequestCompound objApikeyCompound) {
    
    this.objApikeyCompound = objApikeyCompound;
    return this;
  }

   /**
   * Get objApikeyCompound
   * @return objApikeyCompound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApikeyRequestCompound getObjApikeyCompound() {
    return objApikeyCompound;
  }


  public void setObjApikeyCompound(ApikeyRequestCompound objApikeyCompound) {
    this.objApikeyCompound = objApikeyCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyCreateObjectV1Request apikeyCreateObjectV1Request = (ApikeyCreateObjectV1Request) o;
    return Objects.equals(this.objApikey, apikeyCreateObjectV1Request.objApikey) &&
        Objects.equals(this.objApikeyCompound, apikeyCreateObjectV1Request.objApikeyCompound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objApikey, objApikeyCompound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyCreateObjectV1Request {\n");
    sb.append("    objApikey: ").append(toIndentedString(objApikey)).append("\n");
    sb.append("    objApikeyCompound: ").append(toIndentedString(objApikeyCompound)).append("\n");
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
