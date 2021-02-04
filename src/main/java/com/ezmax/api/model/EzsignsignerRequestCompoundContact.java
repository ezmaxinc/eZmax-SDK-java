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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Ezsignsigner-&gt;Contact Object and children to create a complete structure
 */
@ApiModel(description = "A Ezsignsigner->Contact Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class EzsignsignerRequestCompoundContact {
  public static final String SERIALIZED_NAME_S_CONTACT_FIRSTNAME = "sContactFirstname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_FIRSTNAME)
  private String sContactFirstname;

  public static final String SERIALIZED_NAME_S_CONTACT_LASTNAME = "sContactLastname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_LASTNAME)
  private String sContactLastname;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;

  public static final String SERIALIZED_NAME_S_PHONE_NUMBER = "sPhoneNumber";
  @SerializedName(SERIALIZED_NAME_S_PHONE_NUMBER)
  private String sPhoneNumber;

  public static final String SERIALIZED_NAME_S_PHONE_NUMBER_CELL = "sPhoneNumberCell";
  @SerializedName(SERIALIZED_NAME_S_PHONE_NUMBER_CELL)
  private String sPhoneNumberCell;


  public EzsignsignerRequestCompoundContact sContactFirstname(String sContactFirstname) {
    
    this.sContactFirstname = sContactFirstname;
    return this;
  }

   /**
   * The first name of the Contact
   * @return sContactFirstname
  **/
  @ApiModelProperty(required = true, value = "The first name of the Contact")

  public String getsContactFirstname() {
    return sContactFirstname;
  }


  public void setsContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }


  public EzsignsignerRequestCompoundContact sContactLastname(String sContactLastname) {
    
    this.sContactLastname = sContactLastname;
    return this;
  }

   /**
   * The last name of the Contact
   * @return sContactLastname
  **/
  @ApiModelProperty(required = true, value = "The last name of the Contact")

  public String getsContactLastname() {
    return sContactLastname;
  }


  public void setsContactLastname(String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }


  public EzsignsignerRequestCompoundContact fkiLanguageID(Integer fkiLanguageID) {
    
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


  public EzsignsignerRequestCompoundContact sEmailAddress(String sEmailAddress) {
    
    this.sEmailAddress = sEmailAddress;
    return this;
  }

   /**
   * The email address of the contact. Must be filled if email authentification was requested
   * @return sEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the contact. Must be filled if email authentification was requested")

  public String getsEmailAddress() {
    return sEmailAddress;
  }


  public void setsEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  public EzsignsignerRequestCompoundContact sPhoneNumber(String sPhoneNumber) {
    
    this.sPhoneNumber = sPhoneNumber;
    return this;
  }

   /**
   * The Phone number of the contact. Use format \&quot;5149901516\&quot; for North American Numbers (Without \&quot;1\&quot; for long distance code) you would dial like this: 1-514-990-1516. Use format \&quot;498945233886\&quot; for international numbers (Without \&quot;011\&quot;) you would dial like this: +49 89 452 33 88-6. In this example \&quot;49\&quot; is the country code of Germany.
   * @return sPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.")

  public String getsPhoneNumber() {
    return sPhoneNumber;
  }


  public void setsPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }


  public EzsignsignerRequestCompoundContact sPhoneNumberCell(String sPhoneNumberCell) {
    
    this.sPhoneNumberCell = sPhoneNumberCell;
    return this;
  }

   /**
   * The Cell Phone number of the contact. Use format \&quot;5149901516\&quot; for North American Numbers (Without \&quot;1\&quot; for long distance code) you would dial like this: 1-514-990-1516. Use format \&quot;498945233886\&quot; for international numbers (Without \&quot;011\&quot;) you would dial like this: +49 89 452 33 88-6. In this example \&quot;49\&quot; is the country code of Germany.
   * @return sPhoneNumberCell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Cell Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.")

  public String getsPhoneNumberCell() {
    return sPhoneNumberCell;
  }


  public void setsPhoneNumberCell(String sPhoneNumberCell) {
    this.sPhoneNumberCell = sPhoneNumberCell;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerRequestCompoundContact ezsignsignerRequestCompoundContact = (EzsignsignerRequestCompoundContact) o;
    return Objects.equals(this.sContactFirstname, ezsignsignerRequestCompoundContact.sContactFirstname) &&
        Objects.equals(this.sContactLastname, ezsignsignerRequestCompoundContact.sContactLastname) &&
        Objects.equals(this.fkiLanguageID, ezsignsignerRequestCompoundContact.fkiLanguageID) &&
        Objects.equals(this.sEmailAddress, ezsignsignerRequestCompoundContact.sEmailAddress) &&
        Objects.equals(this.sPhoneNumber, ezsignsignerRequestCompoundContact.sPhoneNumber) &&
        Objects.equals(this.sPhoneNumberCell, ezsignsignerRequestCompoundContact.sPhoneNumberCell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sContactFirstname, sContactLastname, fkiLanguageID, sEmailAddress, sPhoneNumber, sPhoneNumberCell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerRequestCompoundContact {\n");
    sb.append("    sContactFirstname: ").append(toIndentedString(sContactFirstname)).append("\n");
    sb.append("    sContactLastname: ").append(toIndentedString(sContactLastname)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
    sb.append("    sPhoneNumber: ").append(toIndentedString(sPhoneNumber)).append("\n");
    sb.append("    sPhoneNumberCell: ").append(toIndentedString(sPhoneNumberCell)).append("\n");
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
