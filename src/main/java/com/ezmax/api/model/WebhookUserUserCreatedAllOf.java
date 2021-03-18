/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.37
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.UserResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookUserUserCreatedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T16:50:08.207Z[GMT]")
public class WebhookUserUserCreatedAllOf {
  public static final String SERIALIZED_NAME_OBJ_USER = "objUser";
  @SerializedName(SERIALIZED_NAME_OBJ_USER)
  private UserResponse objUser;


  public WebhookUserUserCreatedAllOf objUser(UserResponse objUser) {
    
    this.objUser = objUser;
    return this;
  }

   /**
   * Get objUser
   * @return objUser
  **/
  @ApiModelProperty(required = true, value = "")

  public UserResponse getObjUser() {
    return objUser;
  }


  public void setObjUser(UserResponse objUser) {
    this.objUser = objUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUserUserCreatedAllOf webhookUserUserCreatedAllOf = (WebhookUserUserCreatedAllOf) o;
    return Objects.equals(this.objUser, webhookUserUserCreatedAllOf.objUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserUserCreatedAllOf {\n");
    sb.append("    objUser: ").append(toIndentedString(objUser)).append("\n");
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

