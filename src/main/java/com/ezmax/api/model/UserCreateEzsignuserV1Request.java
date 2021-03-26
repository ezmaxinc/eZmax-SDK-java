/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.39
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
 * Request for the /1/module/user/createEzsignuser API Request
 */
@ApiModel(description = "Request for the /1/module/user/createEzsignuser API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T19:33:12.356Z[GMT]")
public class UserCreateEzsignuserV1Request {
  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_USER_FIRSTNAME = "sUserFirstname";
  @SerializedName(SERIALIZED_NAME_S_USER_FIRSTNAME)
  private String sUserFirstname;

  public static final String SERIALIZED_NAME_S_USER_LASTNAME = "sUserLastname";
  @SerializedName(SERIALIZED_NAME_S_USER_LASTNAME)
  private String sUserLastname;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_PHONE_REGION = "sPhoneRegion";
  @SerializedName(SERIALIZED_NAME_S_PHONE_REGION)
  private String sPhoneRegion;

  public static final String SERIALIZED_NAME_S_PHONE_EXCHANGE = "sPhoneExchange";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXCHANGE)
  private String sPhoneExchange;

  public static final String SERIALIZED_NAME_S_PHONE_NUMBER = "sPhoneNumber";
  @SerializedName(SERIALIZED_NAME_S_PHONE_NUMBER)
  private String sPhoneNumber;

  public static final String SERIALIZED_NAME_S_PHONE_EXTENSION = "sPhoneExtension";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXTENSION)
  private String sPhoneExtension;


  public UserCreateEzsignuserV1Request fkiLanguageID(Integer fkiLanguageID) {
    
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

   /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
  **/
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")

  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public UserCreateEzsignuserV1Request sUserFirstname(String sUserFirstname) {
    
    this.sUserFirstname = sUserFirstname;
    return this;
  }

   /**
   * The First name of the user
   * @return sUserFirstname
  **/
  @ApiModelProperty(example = "John", required = true, value = "The First name of the user")

  public String getsUserFirstname() {
    return sUserFirstname;
  }


  public void setsUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }


  public UserCreateEzsignuserV1Request sUserLastname(String sUserLastname) {
    
    this.sUserLastname = sUserLastname;
    return this;
  }

   /**
   * The Last name of the user
   * @return sUserLastname
  **/
  @ApiModelProperty(example = "Doe", required = true, value = "The Last name of the user")

  public String getsUserLastname() {
    return sUserLastname;
  }


  public void setsUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }


  public UserCreateEzsignuserV1Request sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address.
   * @return sEmailAddress
  **/
  @ApiModelProperty(example = "example@domain.com", required = true, value = "The email address.")

  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public UserCreateEzsignuserV1Request sPhoneRegion(String sPhoneRegion) {
    
    this.sPhoneRegion = sPhoneRegion;
    return this;
  }

   /**
   * The region of the phone number. (For a North America Number only)  The region is the \&quot;514\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneRegion
  **/
  @ApiModelProperty(example = "514", required = true, value = "The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneRegion() {
    return sPhoneRegion;
  }


  public void setsPhoneRegion(String sPhoneRegion) {
    this.sPhoneRegion = sPhoneRegion;
  }


  public UserCreateEzsignuserV1Request sPhoneExchange(String sPhoneExchange) {
    
    this.sPhoneExchange = sPhoneExchange;
    return this;
  }

   /**
   * The exchange of the phone number. (For a North America Number only)  The exchange is the \&quot;990\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneExchange
  **/
  @ApiModelProperty(example = "990", required = true, value = "The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneExchange() {
    return sPhoneExchange;
  }


  public void setsPhoneExchange(String sPhoneExchange) {
    this.sPhoneExchange = sPhoneExchange;
  }


  public UserCreateEzsignuserV1Request sPhoneNumber(String sPhoneNumber) {
    
    this.sPhoneNumber = sPhoneNumber;
    return this;
  }

   /**
   * The number of the phone number. (For a North America Number only)  The number is the \&quot;1516\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneNumber
  **/
  @ApiModelProperty(example = "1516", required = true, value = "The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneNumber() {
    return sPhoneNumber;
  }


  public void setsPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }


  public UserCreateEzsignuserV1Request sPhoneExtension(String sPhoneExtension) {
    
    this.sPhoneExtension = sPhoneExtension;
    return this;
  }

   /**
   * The extension of the phone number.  The extension is the \&quot;123\&quot; section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   * @return sPhoneExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers")

  public String getsPhoneExtension() {
    return sPhoneExtension;
  }


  public void setsPhoneExtension(String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateEzsignuserV1Request userCreateEzsignuserV1Request = (UserCreateEzsignuserV1Request) o;
    return Objects.equals(this.fkiLanguageID, userCreateEzsignuserV1Request.fkiLanguageID) &&
        Objects.equals(this.sUserFirstname, userCreateEzsignuserV1Request.sUserFirstname) &&
        Objects.equals(this.sUserLastname, userCreateEzsignuserV1Request.sUserLastname) &&
        Objects.equals(this.sEmailAddress, userCreateEzsignuserV1Request.sEmailAddress) &&
        Objects.equals(this.sPhoneRegion, userCreateEzsignuserV1Request.sPhoneRegion) &&
        Objects.equals(this.sPhoneExchange, userCreateEzsignuserV1Request.sPhoneExchange) &&
        Objects.equals(this.sPhoneNumber, userCreateEzsignuserV1Request.sPhoneNumber) &&
        Objects.equals(this.sPhoneExtension, userCreateEzsignuserV1Request.sPhoneExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiLanguageID, sUserFirstname, sUserLastname, sEmailAddress, sPhoneRegion, sPhoneExchange, sPhoneNumber, sPhoneExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateEzsignuserV1Request {\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sUserFirstname: ").append(toIndentedString(sUserFirstname)).append("\n");
    sb.append("    sUserLastname: ").append(toIndentedString(sUserLastname)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sPhoneRegion: ").append(toIndentedString(sPhoneRegion)).append("\n");
    sb.append("    sPhoneExchange: ").append(toIndentedString(sPhoneExchange)).append("\n");
    sb.append("    sPhoneNumber: ").append(toIndentedString(sPhoneNumber)).append("\n");
    sb.append("    sPhoneExtension: ").append(toIndentedString(sPhoneExtension)).append("\n");
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

