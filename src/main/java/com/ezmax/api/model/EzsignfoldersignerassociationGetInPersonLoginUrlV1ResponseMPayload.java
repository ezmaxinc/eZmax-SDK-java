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
 * Payload for the /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T12:18:06.150Z[GMT]")
public class EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload {
  public static final String SERIALIZED_NAME_S_LOGIN_URL = "sLoginUrl";
  @SerializedName(SERIALIZED_NAME_S_LOGIN_URL)
  private String sLoginUrl;


  public EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload sLoginUrl(String sLoginUrl) {
    
    this.sLoginUrl = sLoginUrl;
    return this;
  }

   /**
   * The Url to login to the signing application.    Url will expire after 30 minutes.  
   * @return sLoginUrl
  **/
  @ApiModelProperty(required = true, value = "The Url to login to the signing application.    Url will expire after 30 minutes.  ")

  public String getsLoginUrl() {
    return sLoginUrl;
  }


  public void setsLoginUrl(String sLoginUrl) {
    this.sLoginUrl = sLoginUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload ezsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload = (EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload) o;
    return Objects.equals(this.sLoginUrl, ezsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.sLoginUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sLoginUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload {\n");
    sb.append("    sLoginUrl: ").append(toIndentedString(sLoginUrl)).append("\n");
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

