/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
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
 * A webhook object
 */
@ApiModel(description = "A webhook object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class WebhookResponse {
  public static final String SERIALIZED_NAME_PKI_WEBHOOK_I_D = "pkiWebhookID";
  @SerializedName(SERIALIZED_NAME_PKI_WEBHOOK_I_D)
  private Integer pkiWebhookID;

  /**
   * The Module generating the Event.
   */
  @JsonAdapter(EWebhookModuleEnum.Adapter.class)
  public enum EWebhookModuleEnum {
    EZSIGN("Ezsign"),
    
    MANAGEMENT("Management");

    private String value;

    EWebhookModuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EWebhookModuleEnum fromValue(String value) {
      for (EWebhookModuleEnum b : EWebhookModuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EWebhookModuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EWebhookModuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EWebhookModuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EWebhookModuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_WEBHOOK_MODULE = "eWebhookModule";
  @SerializedName(SERIALIZED_NAME_E_WEBHOOK_MODULE)
  private EWebhookModuleEnum eWebhookModule;

  /**
   * This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;.
   */
  @JsonAdapter(EWebhookEzsigneventEnum.Adapter.class)
  public enum EWebhookEzsigneventEnum {
    DOCUMENTCOMPLETED("DocumentCompleted"),
    
    FOLDERCOMPLETED("FolderCompleted");

    private String value;

    EWebhookEzsigneventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EWebhookEzsigneventEnum fromValue(String value) {
      for (EWebhookEzsigneventEnum b : EWebhookEzsigneventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EWebhookEzsigneventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EWebhookEzsigneventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EWebhookEzsigneventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EWebhookEzsigneventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_WEBHOOK_EZSIGNEVENT = "eWebhookEzsignevent";
  @SerializedName(SERIALIZED_NAME_E_WEBHOOK_EZSIGNEVENT)
  private EWebhookEzsigneventEnum eWebhookEzsignevent;

  public static final String SERIALIZED_NAME_PKS_CUSTOMER_CODE = "pksCustomerCode";
  @SerializedName(SERIALIZED_NAME_PKS_CUSTOMER_CODE)
  private String pksCustomerCode;

  public static final String SERIALIZED_NAME_S_WEBHOOK_URL = "sWebhookUrl";
  @SerializedName(SERIALIZED_NAME_S_WEBHOOK_URL)
  private String sWebhookUrl;

  public static final String SERIALIZED_NAME_S_WEBHOOK_EMAILFAILED = "sWebhookEmailfailed";
  @SerializedName(SERIALIZED_NAME_S_WEBHOOK_EMAILFAILED)
  private String sWebhookEmailfailed;

  /**
   * This Management Event. This property will be set only if the Module is \&quot;Management\&quot;.
   */
  @JsonAdapter(EWebhookManagementeventEnum.Adapter.class)
  public enum EWebhookManagementeventEnum {
    USERCREATED("UserCreated");

    private String value;

    EWebhookManagementeventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EWebhookManagementeventEnum fromValue(String value) {
      for (EWebhookManagementeventEnum b : EWebhookManagementeventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EWebhookManagementeventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EWebhookManagementeventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EWebhookManagementeventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EWebhookManagementeventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_WEBHOOK_MANAGEMENTEVENT = "eWebhookManagementevent";
  @SerializedName(SERIALIZED_NAME_E_WEBHOOK_MANAGEMENTEVENT)
  private EWebhookManagementeventEnum eWebhookManagementevent;


  public WebhookResponse pkiWebhookID(Integer pkiWebhookID) {
    
    this.pkiWebhookID = pkiWebhookID;
    return this;
  }

   /**
   * The Webhook ID. This value is visible in the admin interface.
   * @return pkiWebhookID
  **/
  @ApiModelProperty(required = true, value = "The Webhook ID. This value is visible in the admin interface.")

  public Integer getPkiWebhookID() {
    return pkiWebhookID;
  }


  public void setPkiWebhookID(Integer pkiWebhookID) {
    this.pkiWebhookID = pkiWebhookID;
  }


  public WebhookResponse eWebhookModule(EWebhookModuleEnum eWebhookModule) {
    
    this.eWebhookModule = eWebhookModule;
    return this;
  }

   /**
   * The Module generating the Event.
   * @return eWebhookModule
  **/
  @ApiModelProperty(required = true, value = "The Module generating the Event.")

  public EWebhookModuleEnum geteWebhookModule() {
    return eWebhookModule;
  }


  public void seteWebhookModule(EWebhookModuleEnum eWebhookModule) {
    this.eWebhookModule = eWebhookModule;
  }


  public WebhookResponse eWebhookEzsignevent(EWebhookEzsigneventEnum eWebhookEzsignevent) {
    
    this.eWebhookEzsignevent = eWebhookEzsignevent;
    return this;
  }

   /**
   * This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;.
   * @return eWebhookEzsignevent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Ezsign Event. This property will be set only if the Module is \"Ezsign\".")

  public EWebhookEzsigneventEnum geteWebhookEzsignevent() {
    return eWebhookEzsignevent;
  }


  public void seteWebhookEzsignevent(EWebhookEzsigneventEnum eWebhookEzsignevent) {
    this.eWebhookEzsignevent = eWebhookEzsignevent;
  }


  public WebhookResponse pksCustomerCode(String pksCustomerCode) {
    
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


  public WebhookResponse sWebhookUrl(String sWebhookUrl) {
    
    this.sWebhookUrl = sWebhookUrl;
    return this;
  }

   /**
   * The url being called
   * @return sWebhookUrl
  **/
  @ApiModelProperty(required = true, value = "The url being called")

  public String getsWebhookUrl() {
    return sWebhookUrl;
  }


  public void setsWebhookUrl(String sWebhookUrl) {
    this.sWebhookUrl = sWebhookUrl;
  }


  public WebhookResponse sWebhookEmailfailed(String sWebhookEmailfailed) {
    
    this.sWebhookEmailfailed = sWebhookEmailfailed;
    return this;
  }

   /**
   * The email that will receive the webhook in case all attempts fail.
   * @return sWebhookEmailfailed
  **/
  @ApiModelProperty(required = true, value = "The email that will receive the webhook in case all attempts fail.")

  public String getsWebhookEmailfailed() {
    return sWebhookEmailfailed;
  }


  public void setsWebhookEmailfailed(String sWebhookEmailfailed) {
    this.sWebhookEmailfailed = sWebhookEmailfailed;
  }


  public WebhookResponse eWebhookManagementevent(EWebhookManagementeventEnum eWebhookManagementevent) {
    
    this.eWebhookManagementevent = eWebhookManagementevent;
    return this;
  }

   /**
   * This Management Event. This property will be set only if the Module is \&quot;Management\&quot;.
   * @return eWebhookManagementevent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Management Event. This property will be set only if the Module is \"Management\".")

  public EWebhookManagementeventEnum geteWebhookManagementevent() {
    return eWebhookManagementevent;
  }


  public void seteWebhookManagementevent(EWebhookManagementeventEnum eWebhookManagementevent) {
    this.eWebhookManagementevent = eWebhookManagementevent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.pkiWebhookID, webhookResponse.pkiWebhookID) &&
        Objects.equals(this.eWebhookModule, webhookResponse.eWebhookModule) &&
        Objects.equals(this.eWebhookEzsignevent, webhookResponse.eWebhookEzsignevent) &&
        Objects.equals(this.pksCustomerCode, webhookResponse.pksCustomerCode) &&
        Objects.equals(this.sWebhookUrl, webhookResponse.sWebhookUrl) &&
        Objects.equals(this.sWebhookEmailfailed, webhookResponse.sWebhookEmailfailed) &&
        Objects.equals(this.eWebhookManagementevent, webhookResponse.eWebhookManagementevent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiWebhookID, eWebhookModule, eWebhookEzsignevent, pksCustomerCode, sWebhookUrl, sWebhookEmailfailed, eWebhookManagementevent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    pkiWebhookID: ").append(toIndentedString(pkiWebhookID)).append("\n");
    sb.append("    eWebhookModule: ").append(toIndentedString(eWebhookModule)).append("\n");
    sb.append("    eWebhookEzsignevent: ").append(toIndentedString(eWebhookEzsignevent)).append("\n");
    sb.append("    pksCustomerCode: ").append(toIndentedString(pksCustomerCode)).append("\n");
    sb.append("    sWebhookUrl: ").append(toIndentedString(sWebhookUrl)).append("\n");
    sb.append("    sWebhookEmailfailed: ").append(toIndentedString(sWebhookEmailfailed)).append("\n");
    sb.append("    eWebhookManagementevent: ").append(toIndentedString(eWebhookManagementevent)).append("\n");
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

