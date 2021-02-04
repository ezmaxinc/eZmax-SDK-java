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
import com.ezmax.api.model.FieldEPhoneType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Phone Object
 */
@ApiModel(description = "A Phone Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class PhoneRequest {
  public static final String SERIALIZED_NAME_FKI_PHONETYPE_I_D = "fkiPhonetypeID";
  @SerializedName(SERIALIZED_NAME_FKI_PHONETYPE_I_D)
  private Integer fkiPhonetypeID;

  public static final String SERIALIZED_NAME_E_PHONE_TYPE = "ePhoneType";
  @SerializedName(SERIALIZED_NAME_E_PHONE_TYPE)
  private FieldEPhoneType ePhoneType;

  public static final String SERIALIZED_NAME_S_PHONE_REGION = "sPhoneRegion";
  @SerializedName(SERIALIZED_NAME_S_PHONE_REGION)
  private String sPhoneRegion;

  public static final String SERIALIZED_NAME_S_PHONE_EXCHANGE = "sPhoneExchange";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXCHANGE)
  private String sPhoneExchange;

  public static final String SERIALIZED_NAME_S_PHONE_NUMBER = "sPhoneNumber";
  @SerializedName(SERIALIZED_NAME_S_PHONE_NUMBER)
  private String sPhoneNumber;

  public static final String SERIALIZED_NAME_S_PHONE_INTERNATIONAL = "sPhoneInternational";
  @SerializedName(SERIALIZED_NAME_S_PHONE_INTERNATIONAL)
  private String sPhoneInternational;

  public static final String SERIALIZED_NAME_S_PHONE_EXTENSION = "sPhoneExtension";
  @SerializedName(SERIALIZED_NAME_S_PHONE_EXTENSION)
  private String sPhoneExtension;


  public PhoneRequest fkiPhonetypeID(Integer fkiPhonetypeID) {
    
    this.fkiPhonetypeID = fkiPhonetypeID;
    return this;
  }

   /**
   * The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
   * @return fkiPhonetypeID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|")

  public Integer getFkiPhonetypeID() {
    return fkiPhonetypeID;
  }


  public void setFkiPhonetypeID(Integer fkiPhonetypeID) {
    this.fkiPhonetypeID = fkiPhonetypeID;
  }


  public PhoneRequest ePhoneType(FieldEPhoneType ePhoneType) {
    
    this.ePhoneType = ePhoneType;
    return this;
  }

   /**
   * Get ePhoneType
   * @return ePhoneType
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEPhoneType getePhoneType() {
    return ePhoneType;
  }


  public void setePhoneType(FieldEPhoneType ePhoneType) {
    this.ePhoneType = ePhoneType;
  }


  public PhoneRequest sPhoneRegion(String sPhoneRegion) {
    
    this.sPhoneRegion = sPhoneRegion;
    return this;
  }

   /**
   * The region of the phone number. (For a North America Number only)  The region is the \&quot;514\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "514", value = "The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneRegion() {
    return sPhoneRegion;
  }


  public void setsPhoneRegion(String sPhoneRegion) {
    this.sPhoneRegion = sPhoneRegion;
  }


  public PhoneRequest sPhoneExchange(String sPhoneExchange) {
    
    this.sPhoneExchange = sPhoneExchange;
    return this;
  }

   /**
   * The exchange of the phone number. (For a North America Number only)  The exchange is the \&quot;990\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "990", value = "The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneExchange() {
    return sPhoneExchange;
  }


  public void setsPhoneExchange(String sPhoneExchange) {
    this.sPhoneExchange = sPhoneExchange;
  }


  public PhoneRequest sPhoneNumber(String sPhoneNumber) {
    
    this.sPhoneNumber = sPhoneNumber;
    return this;
  }

   /**
   * The number of the phone number. (For a North America Number only)  The number is the \&quot;1516\&quot; section in this sample phone number: (514) 990-1516 x123
   * @return sPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1516", value = "The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123")

  public String getsPhoneNumber() {
    return sPhoneNumber;
  }


  public void setsPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }


  public PhoneRequest sPhoneInternational(String sPhoneInternational) {
    
    this.sPhoneInternational = sPhoneInternational;
    return this;
  }

   /**
   * The international phone number. (For phone numbers outside of North)  Do not specify the \&quot;011\&quot; part of the phone number used to dial an international phone number from North America.  For example for this sample phone number \&quot;+442071838750\&quot;, you would send \&quot;442071838750\&quot; without the \&quot;+\&quot; sign.
   * @return sPhoneInternational
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "442071838750", value = "The international phone number. (For phone numbers outside of North)  Do not specify the \"011\" part of the phone number used to dial an international phone number from North America.  For example for this sample phone number \"+442071838750\", you would send \"442071838750\" without the \"+\" sign.")

  public String getsPhoneInternational() {
    return sPhoneInternational;
  }


  public void setsPhoneInternational(String sPhoneInternational) {
    this.sPhoneInternational = sPhoneInternational;
  }


  public PhoneRequest sPhoneExtension(String sPhoneExtension) {
    
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
    PhoneRequest phoneRequest = (PhoneRequest) o;
    return Objects.equals(this.fkiPhonetypeID, phoneRequest.fkiPhonetypeID) &&
        Objects.equals(this.ePhoneType, phoneRequest.ePhoneType) &&
        Objects.equals(this.sPhoneRegion, phoneRequest.sPhoneRegion) &&
        Objects.equals(this.sPhoneExchange, phoneRequest.sPhoneExchange) &&
        Objects.equals(this.sPhoneNumber, phoneRequest.sPhoneNumber) &&
        Objects.equals(this.sPhoneInternational, phoneRequest.sPhoneInternational) &&
        Objects.equals(this.sPhoneExtension, phoneRequest.sPhoneExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiPhonetypeID, ePhoneType, sPhoneRegion, sPhoneExchange, sPhoneNumber, sPhoneInternational, sPhoneExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRequest {\n");
    sb.append("    fkiPhonetypeID: ").append(toIndentedString(fkiPhonetypeID)).append("\n");
    sb.append("    ePhoneType: ").append(toIndentedString(ePhoneType)).append("\n");
    sb.append("    sPhoneRegion: ").append(toIndentedString(sPhoneRegion)).append("\n");
    sb.append("    sPhoneExchange: ").append(toIndentedString(sPhoneExchange)).append("\n");
    sb.append("    sPhoneNumber: ").append(toIndentedString(sPhoneNumber)).append("\n");
    sb.append("    sPhoneInternational: ").append(toIndentedString(sPhoneInternational)).append("\n");
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

