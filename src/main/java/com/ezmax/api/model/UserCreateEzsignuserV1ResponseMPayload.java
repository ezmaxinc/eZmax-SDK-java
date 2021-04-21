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
import java.util.ArrayList;
import java.util.List;

/**
 * Payload for the /1/module/user/createEzsignuser API Request
 */
@ApiModel(description = "Payload for the /1/module/user/createEzsignuser API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class UserCreateEzsignuserV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_S_EMAIL_ADDRESS_SUCCESS = "a_sEmailAddressSuccess";
  @SerializedName(SERIALIZED_NAME_A_S_EMAIL_ADDRESS_SUCCESS)
  private List<String> aSEmailAddressSuccess = new ArrayList<String>();

  public static final String SERIALIZED_NAME_A_S_EMAIL_ADDRESS_FAILURE = "a_sEmailAddressFailure";
  @SerializedName(SERIALIZED_NAME_A_S_EMAIL_ADDRESS_FAILURE)
  private List<String> aSEmailAddressFailure = new ArrayList<String>();


  public UserCreateEzsignuserV1ResponseMPayload aSEmailAddressSuccess(List<String> aSEmailAddressSuccess) {
    
    this.aSEmailAddressSuccess = aSEmailAddressSuccess;
    return this;
  }

  public UserCreateEzsignuserV1ResponseMPayload addASEmailAddressSuccessItem(String aSEmailAddressSuccessItem) {
    this.aSEmailAddressSuccess.add(aSEmailAddressSuccessItem);
    return this;
  }

   /**
   * An array of email addresses that succeeded.
   * @return aSEmailAddressSuccess
  **/
  @ApiModelProperty(required = true, value = "An array of email addresses that succeeded.")

  public List<String> getaSEmailAddressSuccess() {
    return aSEmailAddressSuccess;
  }


  public void setaSEmailAddressSuccess(List<String> aSEmailAddressSuccess) {
    this.aSEmailAddressSuccess = aSEmailAddressSuccess;
  }


  public UserCreateEzsignuserV1ResponseMPayload aSEmailAddressFailure(List<String> aSEmailAddressFailure) {
    
    this.aSEmailAddressFailure = aSEmailAddressFailure;
    return this;
  }

  public UserCreateEzsignuserV1ResponseMPayload addASEmailAddressFailureItem(String aSEmailAddressFailureItem) {
    this.aSEmailAddressFailure.add(aSEmailAddressFailureItem);
    return this;
  }

   /**
   * An array of email addresses that failed.
   * @return aSEmailAddressFailure
  **/
  @ApiModelProperty(required = true, value = "An array of email addresses that failed.")

  public List<String> getaSEmailAddressFailure() {
    return aSEmailAddressFailure;
  }


  public void setaSEmailAddressFailure(List<String> aSEmailAddressFailure) {
    this.aSEmailAddressFailure = aSEmailAddressFailure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateEzsignuserV1ResponseMPayload userCreateEzsignuserV1ResponseMPayload = (UserCreateEzsignuserV1ResponseMPayload) o;
    return Objects.equals(this.aSEmailAddressSuccess, userCreateEzsignuserV1ResponseMPayload.aSEmailAddressSuccess) &&
        Objects.equals(this.aSEmailAddressFailure, userCreateEzsignuserV1ResponseMPayload.aSEmailAddressFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aSEmailAddressSuccess, aSEmailAddressFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateEzsignuserV1ResponseMPayload {\n");
    sb.append("    aSEmailAddressSuccess: ").append(toIndentedString(aSEmailAddressSuccess)).append("\n");
    sb.append("    aSEmailAddressFailure: ").append(toIndentedString(aSEmailAddressFailure)).append("\n");
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

