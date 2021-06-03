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
import com.ezmax.api.model.AddressRequest;
import com.ezmax.api.model.ContactinformationsRequest;
import com.ezmax.api.model.EmailRequest;
import com.ezmax.api.model.PhoneRequest;
import com.ezmax.api.model.WebsiteRequest;
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
 * A Contactinformations Object and children to create a complete structure
 */
@ApiModel(description = "A Contactinformations Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class ContactinformationsRequestCompound {
  public static final String SERIALIZED_NAME_A_OBJ_ADDRESS = "a_objAddress";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ADDRESS)
  private List<AddressRequest> aObjAddress = new ArrayList<AddressRequest>();

  public static final String SERIALIZED_NAME_A_OBJ_PHONE = "a_objPhone";
  @SerializedName(SERIALIZED_NAME_A_OBJ_PHONE)
  private List<PhoneRequest> aObjPhone = new ArrayList<PhoneRequest>();

  public static final String SERIALIZED_NAME_A_OBJ_EMAIL = "a_objEmail";
  @SerializedName(SERIALIZED_NAME_A_OBJ_EMAIL)
  private List<EmailRequest> aObjEmail = new ArrayList<EmailRequest>();

  public static final String SERIALIZED_NAME_A_OBJ_WEBSITE = "a_objWebsite";
  @SerializedName(SERIALIZED_NAME_A_OBJ_WEBSITE)
  private List<WebsiteRequest> aObjWebsite = new ArrayList<WebsiteRequest>();

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


  public ContactinformationsRequestCompound aObjAddress(List<AddressRequest> aObjAddress) {
    
    this.aObjAddress = aObjAddress;
    return this;
  }

  public ContactinformationsRequestCompound addAObjAddressItem(AddressRequest aObjAddressItem) {
    this.aObjAddress.add(aObjAddressItem);
    return this;
  }

   /**
   * Get aObjAddress
   * @return aObjAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public List<AddressRequest> getaObjAddress() {
    return aObjAddress;
  }


  public void setaObjAddress(List<AddressRequest> aObjAddress) {
    this.aObjAddress = aObjAddress;
  }


  public ContactinformationsRequestCompound aObjPhone(List<PhoneRequest> aObjPhone) {
    
    this.aObjPhone = aObjPhone;
    return this;
  }

  public ContactinformationsRequestCompound addAObjPhoneItem(PhoneRequest aObjPhoneItem) {
    this.aObjPhone.add(aObjPhoneItem);
    return this;
  }

   /**
   * Get aObjPhone
   * @return aObjPhone
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PhoneRequest> getaObjPhone() {
    return aObjPhone;
  }


  public void setaObjPhone(List<PhoneRequest> aObjPhone) {
    this.aObjPhone = aObjPhone;
  }


  public ContactinformationsRequestCompound aObjEmail(List<EmailRequest> aObjEmail) {
    
    this.aObjEmail = aObjEmail;
    return this;
  }

  public ContactinformationsRequestCompound addAObjEmailItem(EmailRequest aObjEmailItem) {
    this.aObjEmail.add(aObjEmailItem);
    return this;
  }

   /**
   * Get aObjEmail
   * @return aObjEmail
  **/
  @ApiModelProperty(required = true, value = "")

  public List<EmailRequest> getaObjEmail() {
    return aObjEmail;
  }


  public void setaObjEmail(List<EmailRequest> aObjEmail) {
    this.aObjEmail = aObjEmail;
  }


  public ContactinformationsRequestCompound aObjWebsite(List<WebsiteRequest> aObjWebsite) {
    
    this.aObjWebsite = aObjWebsite;
    return this;
  }

  public ContactinformationsRequestCompound addAObjWebsiteItem(WebsiteRequest aObjWebsiteItem) {
    this.aObjWebsite.add(aObjWebsiteItem);
    return this;
  }

   /**
   * Get aObjWebsite
   * @return aObjWebsite
  **/
  @ApiModelProperty(required = true, value = "")

  public List<WebsiteRequest> getaObjWebsite() {
    return aObjWebsite;
  }


  public void setaObjWebsite(List<WebsiteRequest> aObjWebsite) {
    this.aObjWebsite = aObjWebsite;
  }


  public ContactinformationsRequestCompound iAddressDefault(Integer iAddressDefault) {
    
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


  public ContactinformationsRequestCompound iPhoneDefault(Integer iPhoneDefault) {
    
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


  public ContactinformationsRequestCompound iEmailDefault(Integer iEmailDefault) {
    
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


  public ContactinformationsRequestCompound iWebsiteDefault(Integer iWebsiteDefault) {
    
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
    ContactinformationsRequestCompound contactinformationsRequestCompound = (ContactinformationsRequestCompound) o;
    return Objects.equals(this.aObjAddress, contactinformationsRequestCompound.aObjAddress) &&
        Objects.equals(this.aObjPhone, contactinformationsRequestCompound.aObjPhone) &&
        Objects.equals(this.aObjEmail, contactinformationsRequestCompound.aObjEmail) &&
        Objects.equals(this.aObjWebsite, contactinformationsRequestCompound.aObjWebsite) &&
        Objects.equals(this.iAddressDefault, contactinformationsRequestCompound.iAddressDefault) &&
        Objects.equals(this.iPhoneDefault, contactinformationsRequestCompound.iPhoneDefault) &&
        Objects.equals(this.iEmailDefault, contactinformationsRequestCompound.iEmailDefault) &&
        Objects.equals(this.iWebsiteDefault, contactinformationsRequestCompound.iWebsiteDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aObjAddress, aObjPhone, aObjEmail, aObjWebsite, iAddressDefault, iPhoneDefault, iEmailDefault, iWebsiteDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequestCompound {\n");
    sb.append("    aObjAddress: ").append(toIndentedString(aObjAddress)).append("\n");
    sb.append("    aObjPhone: ").append(toIndentedString(aObjPhone)).append("\n");
    sb.append("    aObjEmail: ").append(toIndentedString(aObjEmail)).append("\n");
    sb.append("    aObjWebsite: ").append(toIndentedString(aObjWebsite)).append("\n");
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

