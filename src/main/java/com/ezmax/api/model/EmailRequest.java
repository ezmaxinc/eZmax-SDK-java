/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.35
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T18:07:05.174Z[GMT]")
public class EmailRequest {
  public static final String SERIALIZED_NAME_FKI_EMAILTYPE_I_D = "fkiEmailtypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EMAILTYPE_I_D)
  private Integer fkiEmailtypeID;

  public static final String SERIALIZED_NAME_S_EMAIL_ADDRESS = "sEmailAddress";
  @SerializedName(SERIALIZED_NAME_S_EMAIL_ADDRESS)
  private String sEmailAddress;


  public EmailRequest fkiEmailtypeID(Integer fkiEmailtypeID) {
    
    this.fkiEmailtypeID = fkiEmailtypeID;
    return this;
  }

   /**
   * The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
   * @return fkiEmailtypeID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|")

  public Integer getFkiEmailtypeID() {
    return fkiEmailtypeID;
  }


  public void setFkiEmailtypeID(Integer fkiEmailtypeID) {
    this.fkiEmailtypeID = fkiEmailtypeID;
  }


  public EmailRequest sEmailAddress(String sEmailAddress) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRequest emailRequest = (EmailRequest) o;
    return Objects.equals(this.fkiEmailtypeID, emailRequest.fkiEmailtypeID) &&
        Objects.equals(this.sEmailAddress, emailRequest.sEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEmailtypeID, sEmailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRequest {\n");
    sb.append("    fkiEmailtypeID: ").append(toIndentedString(fkiEmailtypeID)).append("\n");
    sb.append("    sEmailAddress: ").append(toIndentedString(sEmailAddress)).append("\n");
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

