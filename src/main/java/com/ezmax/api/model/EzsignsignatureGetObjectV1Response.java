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

/**
 * Response for the /1/object/ezsignsignature/getObject API Request
 */
@ApiModel(description = "Response for the /1/object/ezsignsignature/getObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class EzsignsignatureGetObjectV1Response {
  public static final String SERIALIZED_NAME_M_PAYLOAD = "mPayload";
  @SerializedName(SERIALIZED_NAME_M_PAYLOAD)
  private Object mPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD = "objDebugPayload";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD)
  private CommonResponseObjDebugPayload objDebugPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG = "objDebug";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG)
  private CommonResponseObjDebug objDebug;


  public EzsignsignatureGetObjectV1Response mPayload(Object mPayload) {
    
    this.mPayload = mPayload;
    return this;
  }

   /**
   * Payload for the /1/object/ezsignsignature/getObject API Request
   * @return mPayload
  **/
  @ApiModelProperty(required = true, value = "Payload for the /1/object/ezsignsignature/getObject API Request")

  public Object getmPayload() {
    return mPayload;
  }


  public void setmPayload(Object mPayload) {
    this.mPayload = mPayload;
  }


  public EzsignsignatureGetObjectV1Response objDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    
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


  public EzsignsignatureGetObjectV1Response objDebug(CommonResponseObjDebug objDebug) {
    
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
    EzsignsignatureGetObjectV1Response ezsignsignatureGetObjectV1Response = (EzsignsignatureGetObjectV1Response) o;
    return Objects.equals(this.mPayload, ezsignsignatureGetObjectV1Response.mPayload) &&
        Objects.equals(this.objDebugPayload, ezsignsignatureGetObjectV1Response.objDebugPayload) &&
        Objects.equals(this.objDebug, ezsignsignatureGetObjectV1Response.objDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mPayload, objDebugPayload, objDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureGetObjectV1Response {\n");
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

