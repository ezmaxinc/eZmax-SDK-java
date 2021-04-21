/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.42
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
 * A Contactinformations Object
 */
@ApiModel(description = "A Contactinformations Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T19:39:31.793073Z[Etc/UTC]")
public class ContactinformationsRequest {
  public static final String SERIALIZED_NAME_I_ADDRESS_DEFAULT = "iAddressDefault";
  @SerializedName(SERIALIZED_NAME_I_ADDRESS_DEFAULT)
  private Integer iAddressDefault;

  public static final String SERIALIZED_NAME_I_PHONE_DEFAULT = "iPhoneDefault";
  @SerializedName(SERIALIZED_NAME_I_PHONE_DEFAULT)
  private Integer iPhoneDefault;

  public static final String SERIALIZED_NAME_I_EMAIL_DEFAULT = "iEmailDefault";
  @SerializedName(SERIALIZED_NAME_I_EMAIL_DEFAULT)
  private Integer iEmailDefault;

  public static final String SERIALIZED_NAME_I_WEBSITE_DEFAULT = "iWebsiteDefault";
  @SerializedName(SERIALIZED_NAME_I_WEBSITE_DEFAULT)
  private Integer iWebsiteDefault;


  public ContactinformationsRequest iAddressDefault(Integer iAddressDefault) {
    
    this.iAddressDefault = iAddressDefault;
    return this;
  }

   /**
   * The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iAddressDefault
  **/
  @ApiModelProperty(required = true, value = "The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.")

  public Integer getiAddressDefault() {
    return iAddressDefault;
  }


  public void setiAddressDefault(Integer iAddressDefault) {
    this.iAddressDefault = iAddressDefault;
  }


  public ContactinformationsRequest iPhoneDefault(Integer iPhoneDefault) {
    
    this.iPhoneDefault = iPhoneDefault;
    return this;
  }

   /**
   * The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iPhoneDefault
  **/
  @ApiModelProperty(required = true, value = "The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.")

  public Integer getiPhoneDefault() {
    return iPhoneDefault;
  }


  public void setiPhoneDefault(Integer iPhoneDefault) {
    this.iPhoneDefault = iPhoneDefault;
  }


  public ContactinformationsRequest iEmailDefault(Integer iEmailDefault) {
    
    this.iEmailDefault = iEmailDefault;
    return this;
  }

   /**
   * The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iEmailDefault
  **/
  @ApiModelProperty(required = true, value = "The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.")

  public Integer getiEmailDefault() {
    return iEmailDefault;
  }


  public void setiEmailDefault(Integer iEmailDefault) {
    this.iEmailDefault = iEmailDefault;
  }


  public ContactinformationsRequest iWebsiteDefault(Integer iWebsiteDefault) {
    
    this.iWebsiteDefault = iWebsiteDefault;
    return this;
  }

   /**
   * The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.
   * @return iWebsiteDefault
  **/
  @ApiModelProperty(required = true, value = "The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.")

  public Integer getiWebsiteDefault() {
    return iWebsiteDefault;
  }


  public void setiWebsiteDefault(Integer iWebsiteDefault) {
    this.iWebsiteDefault = iWebsiteDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationsRequest contactinformationsRequest = (ContactinformationsRequest) o;
    return Objects.equals(this.iAddressDefault, contactinformationsRequest.iAddressDefault) &&
        Objects.equals(this.iPhoneDefault, contactinformationsRequest.iPhoneDefault) &&
        Objects.equals(this.iEmailDefault, contactinformationsRequest.iEmailDefault) &&
        Objects.equals(this.iWebsiteDefault, contactinformationsRequest.iWebsiteDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iAddressDefault, iPhoneDefault, iEmailDefault, iWebsiteDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequest {\n");
    sb.append("    iAddressDefault: ").append(toIndentedString(iAddressDefault)).append("\n");
    sb.append("    iPhoneDefault: ").append(toIndentedString(iPhoneDefault)).append("\n");
    sb.append("    iEmailDefault: ").append(toIndentedString(iEmailDefault)).append("\n");
    sb.append("    iWebsiteDefault: ").append(toIndentedString(iWebsiteDefault)).append("\n");
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

