/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
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
 * An Attempt object
 */
@ApiModel(description = "An Attempt object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class AttemptResponse {
  public static final String SERIALIZED_NAME_DT_ATTEMPT_START = "dtAttemptStart";
  @SerializedName(SERIALIZED_NAME_DT_ATTEMPT_START)
  private String dtAttemptStart;

  public static final String SERIALIZED_NAME_S_ATTEMPT_RESULT = "sAttemptResult";
  @SerializedName(SERIALIZED_NAME_S_ATTEMPT_RESULT)
  private String sAttemptResult;

  public static final String SERIALIZED_NAME_I_ATTEMPT_DURATION = "iAttemptDuration";
  @SerializedName(SERIALIZED_NAME_I_ATTEMPT_DURATION)
  private Integer iAttemptDuration;


  public AttemptResponse dtAttemptStart(String dtAttemptStart) {
    
    this.dtAttemptStart = dtAttemptStart;
    return this;
  }

   /**
   * Represent a Date Time. The timezone is the one configured in the User&#39;s profile.
   * @return dtAttemptStart
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")

  public String getDtAttemptStart() {
    return dtAttemptStart;
  }


  public void setDtAttemptStart(String dtAttemptStart) {
    this.dtAttemptStart = dtAttemptStart;
  }


  public AttemptResponse sAttemptResult(String sAttemptResult) {
    
    this.sAttemptResult = sAttemptResult;
    return this;
  }

   /**
   * The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.
   * @return sAttemptResult
  **/
  @ApiModelProperty(required = true, value = "The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.")

  public String getsAttemptResult() {
    return sAttemptResult;
  }


  public void setsAttemptResult(String sAttemptResult) {
    this.sAttemptResult = sAttemptResult;
  }


  public AttemptResponse iAttemptDuration(Integer iAttemptDuration) {
    
    this.iAttemptDuration = iAttemptDuration;
    return this;
  }

   /**
   * The number of second it took to process the webhook or get an error
   * @return iAttemptDuration
  **/
  @ApiModelProperty(required = true, value = "The number of second it took to process the webhook or get an error")

  public Integer getiAttemptDuration() {
    return iAttemptDuration;
  }


  public void setiAttemptDuration(Integer iAttemptDuration) {
    this.iAttemptDuration = iAttemptDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptResponse attemptResponse = (AttemptResponse) o;
    return Objects.equals(this.dtAttemptStart, attemptResponse.dtAttemptStart) &&
        Objects.equals(this.sAttemptResult, attemptResponse.sAttemptResult) &&
        Objects.equals(this.iAttemptDuration, attemptResponse.iAttemptDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtAttemptStart, sAttemptResult, iAttemptDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptResponse {\n");
    sb.append("    dtAttemptStart: ").append(toIndentedString(dtAttemptStart)).append("\n");
    sb.append("    sAttemptResult: ").append(toIndentedString(sAttemptResult)).append("\n");
    sb.append("    iAttemptDuration: ").append(toIndentedString(iAttemptDuration)).append("\n");
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

