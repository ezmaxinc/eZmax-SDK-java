/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
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
 * Response for the /1/customer/{pksCustomerCode}/endpoint API Request
 */
@ApiModel(description = "Response for the /1/customer/{pksCustomerCode}/endpoint API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T22:48:03.557Z[GMT]")
public class GlobalCustomerGetEndpointV1Response {
  public static final String SERIALIZED_NAME_S_ENDPOINT_U_R_L = "sEndpointURL";
  @SerializedName(SERIALIZED_NAME_S_ENDPOINT_U_R_L)
  private String sEndpointURL;


  public GlobalCustomerGetEndpointV1Response sEndpointURL(String sEndpointURL) {
    
    this.sEndpointURL = sEndpointURL;
    return this;
  }

   /**
   * The endpoint&#39;s URL
   * @return sEndpointURL
  **/
  @ApiModelProperty(required = true, value = "The endpoint's URL")

  public String getsEndpointURL() {
    return sEndpointURL;
  }


  public void setsEndpointURL(String sEndpointURL) {
    this.sEndpointURL = sEndpointURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1Response = (GlobalCustomerGetEndpointV1Response) o;
    return Objects.equals(this.sEndpointURL, globalCustomerGetEndpointV1Response.sEndpointURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sEndpointURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCustomerGetEndpointV1Response {\n");
    sb.append("    sEndpointURL: ").append(toIndentedString(sEndpointURL)).append("\n");
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

