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
 * A Contact Object
 */
@ApiModel(description = "A Contact Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class ContactRequest {
  public static final String SERIALIZED_NAME_FKI_CONTACTTITLE_I_D = "fkiContacttitleID";
  @SerializedName(SERIALIZED_NAME_FKI_CONTACTTITLE_I_D)
  private Integer fkiContacttitleID;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_CONTACT_FIRSTNAME = "sContactFirstname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_FIRSTNAME)
  private String sContactFirstname;

  public static final String SERIALIZED_NAME_S_CONTACT_LASTNAME = "sContactLastname";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_LASTNAME)
  private String sContactLastname;

  public static final String SERIALIZED_NAME_S_CONTACT_COMPANY = "sContactCompany";
  @SerializedName(SERIALIZED_NAME_S_CONTACT_COMPANY)
  private String sContactCompany;

  public static final String SERIALIZED_NAME_DT_CONTACT_BIRTHDATE = "dtContactBirthdate";
  @SerializedName(SERIALIZED_NAME_DT_CONTACT_BIRTHDATE)
  private String dtContactBirthdate;


  public ContactRequest fkiContacttitleID(Integer fkiContacttitleID) {
    
    this.fkiContacttitleID = fkiContacttitleID;
    return this;
  }

   /**
   * The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
   * @return fkiContacttitleID
  **/
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|")

  public Integer getFkiContacttitleID() {
    return fkiContacttitleID;
  }


  public void setFkiContacttitleID(Integer fkiContacttitleID) {
    this.fkiContacttitleID = fkiContacttitleID;
  }


  public ContactRequest fkiLanguageID(Integer fkiLanguageID) {
    
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


  public ContactRequest sContactFirstname(String sContactFirstname) {
    
    this.sContactFirstname = sContactFirstname;
    return this;
  }

   /**
   * The First name of the contact
   * @return sContactFirstname
  **/
  @ApiModelProperty(example = "John", required = true, value = "The First name of the contact")

  public String getsContactFirstname() {
    return sContactFirstname;
  }


  public void setsContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }


  public ContactRequest sContactLastname(String sContactLastname) {
    
    this.sContactLastname = sContactLastname;
    return this;
  }

   /**
   * The Last name of the contact
   * @return sContactLastname
  **/
  @ApiModelProperty(example = "Doe", required = true, value = "The Last name of the contact")

  public String getsContactLastname() {
    return sContactLastname;
  }


  public void setsContactLastname(String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }


  public ContactRequest sContactCompany(String sContactCompany) {
    
    this.sContactCompany = sContactCompany;
    return this;
  }

   /**
   * The Company name of the contact
   * @return sContactCompany
  **/
  @ApiModelProperty(example = "eZmax Solutions Inc.", required = true, value = "The Company name of the contact")

  public String getsContactCompany() {
    return sContactCompany;
  }


  public void setsContactCompany(String sContactCompany) {
    this.sContactCompany = sContactCompany;
  }


  public ContactRequest dtContactBirthdate(String dtContactBirthdate) {
    
    this.dtContactBirthdate = dtContactBirthdate;
    return this;
  }

   /**
   * The Birth Date of the contact
   * @return dtContactBirthdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1980-01-01", value = "The Birth Date of the contact")

  public String getDtContactBirthdate() {
    return dtContactBirthdate;
  }


  public void setDtContactBirthdate(String dtContactBirthdate) {
    this.dtContactBirthdate = dtContactBirthdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequest contactRequest = (ContactRequest) o;
    return Objects.equals(this.fkiContacttitleID, contactRequest.fkiContacttitleID) &&
        Objects.equals(this.fkiLanguageID, contactRequest.fkiLanguageID) &&
        Objects.equals(this.sContactFirstname, contactRequest.sContactFirstname) &&
        Objects.equals(this.sContactLastname, contactRequest.sContactLastname) &&
        Objects.equals(this.sContactCompany, contactRequest.sContactCompany) &&
        Objects.equals(this.dtContactBirthdate, contactRequest.dtContactBirthdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiContacttitleID, fkiLanguageID, sContactFirstname, sContactLastname, sContactCompany, dtContactBirthdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequest {\n");
    sb.append("    fkiContacttitleID: ").append(toIndentedString(fkiContacttitleID)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sContactFirstname: ").append(toIndentedString(sContactFirstname)).append("\n");
    sb.append("    sContactLastname: ").append(toIndentedString(sContactLastname)).append("\n");
    sb.append("    sContactCompany: ").append(toIndentedString(sContactCompany)).append("\n");
    sb.append("    dtContactBirthdate: ").append(toIndentedString(dtContactBirthdate)).append("\n");
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

