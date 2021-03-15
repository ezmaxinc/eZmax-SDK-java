/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.33
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonGetAutocompleteV1ResponseMPayload;
import com.ezmax.api.model.CommonResponse;
import com.ezmax.api.model.CommonResponseObjDebug;
import com.ezmax.api.model.CommonResponseObjDebugPayload;
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
 * Response for the /1/object/xxx/getAutocomplete API Request
 */
@ApiModel(description = "Response for the /1/object/xxx/getAutocomplete API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T16:46:52.954Z[GMT]")
public class CommonGetAutocompleteV1Response {
  public static final String SERIALIZED_NAME_M_PAYLOAD = "mPayload";
  @SerializedName(SERIALIZED_NAME_M_PAYLOAD)
  private List<CommonGetAutocompleteV1ResponseMPayload> mPayload = new ArrayList<CommonGetAutocompleteV1ResponseMPayload>();

  public static final String SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD = "objDebugPayload";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD)
  private CommonResponseObjDebugPayload objDebugPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG = "objDebug";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG)
  private CommonResponseObjDebug objDebug;


  public CommonGetAutocompleteV1Response mPayload(List<CommonGetAutocompleteV1ResponseMPayload> mPayload) {
    
    this.mPayload = mPayload;
    return this;
  }

  public CommonGetAutocompleteV1Response addMPayloadItem(CommonGetAutocompleteV1ResponseMPayload mPayloadItem) {
    this.mPayload.add(mPayloadItem);
    return this;
  }

   /**
   * Get mPayload
   * @return mPayload
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CommonGetAutocompleteV1ResponseMPayload> getmPayload() {
    return mPayload;
  }


  public void setmPayload(List<CommonGetAutocompleteV1ResponseMPayload> mPayload) {
    this.mPayload = mPayload;
  }


  public CommonGetAutocompleteV1Response objDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    
    this.objDebugPayload = objDebugPayload;
    return this;
  }

   /**
   * Get objDebugPayload
   * @return objDebugPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonResponseObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }


  public void setObjDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }


  public CommonGetAutocompleteV1Response objDebug(CommonResponseObjDebug objDebug) {
    
    this.objDebug = objDebug;
    return this;
  }

   /**
   * Get objDebug
   * @return objDebug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonResponseObjDebug getObjDebug() {
    return objDebug;
  }


  public void setObjDebug(CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGetAutocompleteV1Response commonGetAutocompleteV1Response = (CommonGetAutocompleteV1Response) o;
    return Objects.equals(this.mPayload, commonGetAutocompleteV1Response.mPayload) &&
        Objects.equals(this.objDebugPayload, commonGetAutocompleteV1Response.objDebugPayload) &&
        Objects.equals(this.objDebug, commonGetAutocompleteV1Response.objDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mPayload, objDebugPayload, objDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGetAutocompleteV1Response {\n");
    sb.append("    mPayload: ").append(toIndentedString(mPayload)).append("\n");
    sb.append("    objDebugPayload: ").append(toIndentedString(objDebugPayload)).append("\n");
    sb.append("    objDebug: ").append(toIndentedString(objDebug)).append("\n");
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

