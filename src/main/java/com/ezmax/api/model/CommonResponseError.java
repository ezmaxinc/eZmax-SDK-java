/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
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

/**
 * Generic Error Message
 */
@ApiModel(description = "Generic Error Message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-31T17:14:26.574336Z[Etc/UTC]")
public class CommonResponseError {
  public static final String SERIALIZED_NAME_S_ERROR_MESSAGE = "sErrorMessage";
  @SerializedName(SERIALIZED_NAME_S_ERROR_MESSAGE)
  private String sErrorMessage;

  public static final String SERIALIZED_NAME_E_ERROR_CODE = "eErrorCode";
  @SerializedName(SERIALIZED_NAME_E_ERROR_CODE)
  private String eErrorCode;


  public CommonResponseError sErrorMessage(String sErrorMessage) {
    
    this.sErrorMessage = sErrorMessage;
    return this;
  }

   /**
   * More detail about the error
   * @return sErrorMessage
  **/
  @ApiModelProperty(required = true, value = "More detail about the error")

  public String getsErrorMessage() {
    return sErrorMessage;
  }


  public void setsErrorMessage(String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
  }


  public CommonResponseError eErrorCode(String eErrorCode) {
    
    this.eErrorCode = eErrorCode;
    return this;
  }

   /**
   * The error code. See documentation for valid values
   * @return eErrorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error code. See documentation for valid values")

  public String geteErrorCode() {
    return eErrorCode;
  }


  public void seteErrorCode(String eErrorCode) {
    this.eErrorCode = eErrorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseError commonResponseError = (CommonResponseError) o;
    return Objects.equals(this.sErrorMessage, commonResponseError.sErrorMessage) &&
        Objects.equals(this.eErrorCode, commonResponseError.eErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sErrorMessage, eErrorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseError {\n");
    sb.append("    sErrorMessage: ").append(toIndentedString(sErrorMessage)).append("\n");
    sb.append("    eErrorCode: ").append(toIndentedString(eErrorCode)).append("\n");
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

