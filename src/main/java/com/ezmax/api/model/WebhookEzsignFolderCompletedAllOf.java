/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignfolderResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookEzsignFolderCompletedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-31T17:14:26.574336Z[Etc/UTC]")
public class WebhookEzsignFolderCompletedAllOf {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDER = "objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDER)
  private EzsignfolderResponse objEzsignfolder;


  public WebhookEzsignFolderCompletedAllOf objEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    
    this.objEzsignfolder = objEzsignfolder;
    return this;
  }

   /**
   * Get objEzsignfolder
   * @return objEzsignfolder
  **/
  @ApiModelProperty(required = true, value = "")

  public EzsignfolderResponse getObjEzsignfolder() {
    return objEzsignfolder;
  }


  public void setObjEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignFolderCompletedAllOf webhookEzsignFolderCompletedAllOf = (WebhookEzsignFolderCompletedAllOf) o;
    return Objects.equals(this.objEzsignfolder, webhookEzsignFolderCompletedAllOf.objEzsignfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignFolderCompletedAllOf {\n");
    sb.append("    objEzsignfolder: ").append(toIndentedString(objEzsignfolder)).append("\n");
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

