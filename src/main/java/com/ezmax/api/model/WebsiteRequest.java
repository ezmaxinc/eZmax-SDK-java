/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
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
 * A Website Object
 */
@ApiModel(description = "A Website Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T20:48:09.039253Z[Etc/UTC]")
public class WebsiteRequest {
  public static final String SERIALIZED_NAME_FKI_WEBSITETYPE_I_D = "fkiWebsitetypeID";
  @SerializedName(SERIALIZED_NAME_FKI_WEBSITETYPE_I_D)
  private Integer fkiWebsitetypeID;

  public static final String SERIALIZED_NAME_S_WEBSITE_ADDRESS = "sWebsiteAddress";
  @SerializedName(SERIALIZED_NAME_S_WEBSITE_ADDRESS)
  private String sWebsiteAddress;


  public WebsiteRequest fkiWebsitetypeID(Integer fkiWebsitetypeID) {
    
    this.fkiWebsitetypeID = fkiWebsitetypeID;
    return this;
  }

   /**
   * The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|
   * @return fkiWebsitetypeID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|")

  public Integer getFkiWebsitetypeID() {
    return fkiWebsitetypeID;
  }


  public void setFkiWebsitetypeID(Integer fkiWebsitetypeID) {
    this.fkiWebsitetypeID = fkiWebsitetypeID;
  }


  public WebsiteRequest sWebsiteAddress(String sWebsiteAddress) {
    
    this.sWebsiteAddress = sWebsiteAddress;
    return this;
  }

   /**
   * The URL of the website.
   * @return sWebsiteAddress
  **/
  @ApiModelProperty(example = "https://www.domain.com", required = true, value = "The URL of the website.")

  public String getsWebsiteAddress() {
    return sWebsiteAddress;
  }


  public void setsWebsiteAddress(String sWebsiteAddress) {
    this.sWebsiteAddress = sWebsiteAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteRequest websiteRequest = (WebsiteRequest) o;
    return Objects.equals(this.fkiWebsitetypeID, websiteRequest.fkiWebsitetypeID) &&
        Objects.equals(this.sWebsiteAddress, websiteRequest.sWebsiteAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiWebsitetypeID, sWebsiteAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteRequest {\n");
    sb.append("    fkiWebsitetypeID: ").append(toIndentedString(fkiWebsitetypeID)).append("\n");
    sb.append("    sWebsiteAddress: ").append(toIndentedString(sWebsiteAddress)).append("\n");
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

