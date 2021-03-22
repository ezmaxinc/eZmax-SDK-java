/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
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
 * Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  
 */
@ApiModel(description = "Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T12:18:06.150Z[GMT]")
public class CommonAudit {
  public static final String SERIALIZED_NAME_FKI_USER_I_D_CREATED = "fkiUserIDCreated";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D_CREATED)
  private Integer fkiUserIDCreated;

  public static final String SERIALIZED_NAME_FKI_USER_I_D_MODIFIED = "fkiUserIDModified";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D_MODIFIED)
  private Integer fkiUserIDModified;

  public static final String SERIALIZED_NAME_FKI_APIKEY_I_D_CREATED = "fkiApikeyIDCreated";
  @SerializedName(SERIALIZED_NAME_FKI_APIKEY_I_D_CREATED)
  private Integer fkiApikeyIDCreated;

  public static final String SERIALIZED_NAME_FKI_APIKEY_I_D_MODIFIED = "fkiApikeyIDModified";
  @SerializedName(SERIALIZED_NAME_FKI_APIKEY_I_D_MODIFIED)
  private Integer fkiApikeyIDModified;

  public static final String SERIALIZED_NAME_DT_CREATED_DATE = "dtCreatedDate";
  @SerializedName(SERIALIZED_NAME_DT_CREATED_DATE)
  private String dtCreatedDate;

  public static final String SERIALIZED_NAME_DT_MODIFIED_DATE = "dtModifiedDate";
  @SerializedName(SERIALIZED_NAME_DT_MODIFIED_DATE)
  private String dtModifiedDate;


  public CommonAudit fkiUserIDCreated(Integer fkiUserIDCreated) {
    
    this.fkiUserIDCreated = fkiUserIDCreated;
    return this;
  }

   /**
   * The unique ID of the User
   * @return fkiUserIDCreated
  **/
  @ApiModelProperty(example = "70", required = true, value = "The unique ID of the User")

  public Integer getFkiUserIDCreated() {
    return fkiUserIDCreated;
  }


  public void setFkiUserIDCreated(Integer fkiUserIDCreated) {
    this.fkiUserIDCreated = fkiUserIDCreated;
  }


  public CommonAudit fkiUserIDModified(Integer fkiUserIDModified) {
    
    this.fkiUserIDModified = fkiUserIDModified;
    return this;
  }

   /**
   * The unique ID of the User
   * @return fkiUserIDModified
  **/
  @ApiModelProperty(example = "70", required = true, value = "The unique ID of the User")

  public Integer getFkiUserIDModified() {
    return fkiUserIDModified;
  }


  public void setFkiUserIDModified(Integer fkiUserIDModified) {
    this.fkiUserIDModified = fkiUserIDModified;
  }


  public CommonAudit fkiApikeyIDCreated(Integer fkiApikeyIDCreated) {
    
    this.fkiApikeyIDCreated = fkiApikeyIDCreated;
    return this;
  }

   /**
   * The unique ID of the Apikey
   * @return fkiApikeyIDCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "The unique ID of the Apikey")

  public Integer getFkiApikeyIDCreated() {
    return fkiApikeyIDCreated;
  }


  public void setFkiApikeyIDCreated(Integer fkiApikeyIDCreated) {
    this.fkiApikeyIDCreated = fkiApikeyIDCreated;
  }


  public CommonAudit fkiApikeyIDModified(Integer fkiApikeyIDModified) {
    
    this.fkiApikeyIDModified = fkiApikeyIDModified;
    return this;
  }

   /**
   * The unique ID of the Apikey
   * @return fkiApikeyIDModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "The unique ID of the Apikey")

  public Integer getFkiApikeyIDModified() {
    return fkiApikeyIDModified;
  }


  public void setFkiApikeyIDModified(Integer fkiApikeyIDModified) {
    this.fkiApikeyIDModified = fkiApikeyIDModified;
  }


  public CommonAudit dtCreatedDate(String dtCreatedDate) {
    
    this.dtCreatedDate = dtCreatedDate;
    return this;
  }

   /**
   * Represent a Date Time. The timezone is the one configured in the User&#39;s profile.
   * @return dtCreatedDate
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")

  public String getDtCreatedDate() {
    return dtCreatedDate;
  }


  public void setDtCreatedDate(String dtCreatedDate) {
    this.dtCreatedDate = dtCreatedDate;
  }


  public CommonAudit dtModifiedDate(String dtModifiedDate) {
    
    this.dtModifiedDate = dtModifiedDate;
    return this;
  }

   /**
   * Represent a Date Time. The timezone is the one configured in the User&#39;s profile.
   * @return dtModifiedDate
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")

  public String getDtModifiedDate() {
    return dtModifiedDate;
  }


  public void setDtModifiedDate(String dtModifiedDate) {
    this.dtModifiedDate = dtModifiedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonAudit commonAudit = (CommonAudit) o;
    return Objects.equals(this.fkiUserIDCreated, commonAudit.fkiUserIDCreated) &&
        Objects.equals(this.fkiUserIDModified, commonAudit.fkiUserIDModified) &&
        Objects.equals(this.fkiApikeyIDCreated, commonAudit.fkiApikeyIDCreated) &&
        Objects.equals(this.fkiApikeyIDModified, commonAudit.fkiApikeyIDModified) &&
        Objects.equals(this.dtCreatedDate, commonAudit.dtCreatedDate) &&
        Objects.equals(this.dtModifiedDate, commonAudit.dtModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserIDCreated, fkiUserIDModified, fkiApikeyIDCreated, fkiApikeyIDModified, dtCreatedDate, dtModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAudit {\n");
    sb.append("    fkiUserIDCreated: ").append(toIndentedString(fkiUserIDCreated)).append("\n");
    sb.append("    fkiUserIDModified: ").append(toIndentedString(fkiUserIDModified)).append("\n");
    sb.append("    fkiApikeyIDCreated: ").append(toIndentedString(fkiApikeyIDCreated)).append("\n");
    sb.append("    fkiApikeyIDModified: ").append(toIndentedString(fkiApikeyIDModified)).append("\n");
    sb.append("    dtCreatedDate: ").append(toIndentedString(dtCreatedDate)).append("\n");
    sb.append("    dtModifiedDate: ").append(toIndentedString(dtModifiedDate)).append("\n");
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

