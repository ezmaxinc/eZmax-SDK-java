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
import com.ezmax.api.model.ApikeyResponse;
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
 * Payload for the /1/object/apikey/createObject API Request
 */
@ApiModel(description = "Payload for the /1/object/apikey/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class ApikeyCreateObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_OBJ_APIKEY = "a_objApikey";
  @SerializedName(SERIALIZED_NAME_A_OBJ_APIKEY)
  private List<ApikeyResponse> aObjApikey = new ArrayList<ApikeyResponse>();


  public ApikeyCreateObjectV1ResponseMPayload aObjApikey(List<ApikeyResponse> aObjApikey) {
    
    this.aObjApikey = aObjApikey;
    return this;
  }

  public ApikeyCreateObjectV1ResponseMPayload addAObjApikeyItem(ApikeyResponse aObjApikeyItem) {
    this.aObjApikey.add(aObjApikeyItem);
    return this;
  }

   /**
   * Get aObjApikey
   * @return aObjApikey
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ApikeyResponse> getaObjApikey() {
    return aObjApikey;
  }


  public void setaObjApikey(List<ApikeyResponse> aObjApikey) {
    this.aObjApikey = aObjApikey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyCreateObjectV1ResponseMPayload apikeyCreateObjectV1ResponseMPayload = (ApikeyCreateObjectV1ResponseMPayload) o;
    return Objects.equals(this.aObjApikey, apikeyCreateObjectV1ResponseMPayload.aObjApikey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjApikey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyCreateObjectV1ResponseMPayload {\n");
    sb.append("    aObjApikey: ").append(toIndentedString(aObjApikey)).append("\n");
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

