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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /2/module/authenticate/authenticate API Request
 */
@ApiModel(description = "Request for the /2/module/authenticate/authenticate API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class AuthenticateAuthenticateV2Request {
  public static final String SERIALIZED_NAME_PKS_CUSTOMER_CODE = "pksCustomerCode";
  @SerializedName(SERIALIZED_NAME_PKS_CUSTOMER_CODE)
  private String pksCustomerCode;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_USER_LOGINNAME = "sUserLoginname";
  @SerializedName(SERIALIZED_NAME_S_USER_LOGINNAME)
  private String sUserLoginname;

  public static final String SERIALIZED_NAME_S_PASSWORD = "sPassword";
  @SerializedName(SERIALIZED_NAME_S_PASSWORD)
  private String sPassword;

  public static final String SERIALIZED_NAME_S_PASSWORD_ENCRYPTED = "sPasswordEncrypted";
  @SerializedName(SERIALIZED_NAME_S_PASSWORD_ENCRYPTED)
  private String sPasswordEncrypted;


  public AuthenticateAuthenticateV2Request pksCustomerCode(String pksCustomerCode) {
    
    this.pksCustomerCode = pksCustomerCode;
    return this;
  }

   /**
   * The customer code assigned to your account
   * @return pksCustomerCode
  **/
  @ApiModelProperty(example = "demo", required = true, value = "The customer code assigned to your account")

  public String getPksCustomerCode() {
    return pksCustomerCode;
  }


  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
  }


  public AuthenticateAuthenticateV2Request sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@domain.com", value = "The email address.")

  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public AuthenticateAuthenticateV2Request sUserLoginname(String sUserLoginname) {
    
    this.sUserLoginname = sUserLoginname;
    return this;
  }

   /**
   * The Login name of the User.
   * @return sUserLoginname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JohnDoe", value = "The Login name of the User.")

  public String getsUserLoginname() {
    return sUserLoginname;
  }


  public void setsUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }


  public AuthenticateAuthenticateV2Request sPassword(String sPassword) {
    
    this.sPassword = sPassword;
    return this;
  }

   /**
   * A Password.  Must meet complexity requirements
   * @return sPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Qwerty1234!", value = "A Password.  Must meet complexity requirements")

  public String getsPassword() {
    return sPassword;
  }


  public void setsPassword(String sPassword) {
    this.sPassword = sPassword;
  }


  public AuthenticateAuthenticateV2Request sPasswordEncrypted(String sPasswordEncrypted) {
    
    this.sPasswordEncrypted = sPasswordEncrypted;
    return this;
  }

   /**
   * A Password encrypted and encoded in Base64  Must meet complexity requirements
   * @return sPasswordEncrypted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VGhpcyBpcyBhbiBlbmNyeXB0ZWQgcGFzc3dvcmQ=", value = "A Password encrypted and encoded in Base64  Must meet complexity requirements")

  public String getsPasswordEncrypted() {
    return sPasswordEncrypted;
  }


  public void setsPasswordEncrypted(String sPasswordEncrypted) {
    this.sPasswordEncrypted = sPasswordEncrypted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request = (AuthenticateAuthenticateV2Request) o;
    return Objects.equals(this.pksCustomerCode, authenticateAuthenticateV2Request.pksCustomerCode) &&
        Objects.equals(this.sEmailAddress, authenticateAuthenticateV2Request.sEmailAddress) &&
        Objects.equals(this.sUserLoginname, authenticateAuthenticateV2Request.sUserLoginname) &&
        Objects.equals(this.sPassword, authenticateAuthenticateV2Request.sPassword) &&
        Objects.equals(this.sPasswordEncrypted, authenticateAuthenticateV2Request.sPasswordEncrypted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pksCustomerCode, sEmailAddress, sUserLoginname, sPassword, sPasswordEncrypted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateAuthenticateV2Request {\n");
    sb.append("    pksCustomerCode: ").append(toIndentedString(pksCustomerCode)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sUserLoginname: ").append(toIndentedString(sUserLoginname)).append("\n");
    sb.append("    sPassword: ").append(toIndentedString(sPassword)).append("\n");
    sb.append("    sPasswordEncrypted: ").append(toIndentedString(sPasswordEncrypted)).append("\n");
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

