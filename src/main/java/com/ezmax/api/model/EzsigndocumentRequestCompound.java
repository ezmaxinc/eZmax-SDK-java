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
import com.ezmax.api.model.EzsigndocumentRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsigndocument Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsigndocument Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T20:48:09.039253Z[Etc/UTC]")
public class EzsigndocumentRequestCompound {
  /**
   * Indicates where to look for the document binary content.
   */
  @JsonAdapter(EEzsigndocumentSourceEnum.Adapter.class)
  public enum EEzsigndocumentSourceEnum {
    BASE64("Base64");

    private String value;

    EEzsigndocumentSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EEzsigndocumentSourceEnum fromValue(String value) {
      for (EEzsigndocumentSourceEnum b : EEzsigndocumentSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EEzsigndocumentSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EEzsigndocumentSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EEzsigndocumentSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EEzsigndocumentSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_EZSIGNDOCUMENT_SOURCE = "eEzsigndocumentSource";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNDOCUMENT_SOURCE)
  private EEzsigndocumentSourceEnum eEzsigndocumentSource;

  /**
   * Indicates the format of the document.
   */
  @JsonAdapter(EEzsigndocumentFormatEnum.Adapter.class)
  public enum EEzsigndocumentFormatEnum {
    PDF("Pdf");

    private String value;

    EEzsigndocumentFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EEzsigndocumentFormatEnum fromValue(String value) {
      for (EEzsigndocumentFormatEnum b : EEzsigndocumentFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EEzsigndocumentFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EEzsigndocumentFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EEzsigndocumentFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EEzsigndocumentFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_EZSIGNDOCUMENT_FORMAT = "eEzsigndocumentFormat";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNDOCUMENT_FORMAT)
  private EEzsigndocumentFormatEnum eEzsigndocumentFormat;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_BASE64 = "sEzsigndocumentBase64";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_BASE64)
  private byte[] sEzsigndocumentBase64;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D = "fkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D)
  private Integer fkiEzsignfolderID;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE = "dtEzsigndocumentDuedate";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE)
  private String dtEzsigndocumentDuedate;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME = "sEzsigndocumentName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME)
  private String sEzsigndocumentName;


  public EzsigndocumentRequestCompound eEzsigndocumentSource(EEzsigndocumentSourceEnum eEzsigndocumentSource) {
    
    this.eEzsigndocumentSource = eEzsigndocumentSource;
    return this;
  }

   /**
   * Indicates where to look for the document binary content.
   * @return eEzsigndocumentSource
  **/
  @ApiModelProperty(required = true, value = "Indicates where to look for the document binary content.")

  public EEzsigndocumentSourceEnum geteEzsigndocumentSource() {
    return eEzsigndocumentSource;
  }


  public void seteEzsigndocumentSource(EEzsigndocumentSourceEnum eEzsigndocumentSource) {
    this.eEzsigndocumentSource = eEzsigndocumentSource;
  }


  public EzsigndocumentRequestCompound eEzsigndocumentFormat(EEzsigndocumentFormatEnum eEzsigndocumentFormat) {
    
    this.eEzsigndocumentFormat = eEzsigndocumentFormat;
    return this;
  }

   /**
   * Indicates the format of the document.
   * @return eEzsigndocumentFormat
  **/
  @ApiModelProperty(required = true, value = "Indicates the format of the document.")

  public EEzsigndocumentFormatEnum geteEzsigndocumentFormat() {
    return eEzsigndocumentFormat;
  }


  public void seteEzsigndocumentFormat(EEzsigndocumentFormatEnum eEzsigndocumentFormat) {
    this.eEzsigndocumentFormat = eEzsigndocumentFormat;
  }


  public EzsigndocumentRequestCompound sEzsigndocumentBase64(byte[] sEzsigndocumentBase64) {
    
    this.sEzsigndocumentBase64 = sEzsigndocumentBase64;
    return this;
  }

   /**
   * The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64.
   * @return sEzsigndocumentBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.")

  public byte[] getsEzsigndocumentBase64() {
    return sEzsigndocumentBase64;
  }


  public void setsEzsigndocumentBase64(byte[] sEzsigndocumentBase64) {
    this.sEzsigndocumentBase64 = sEzsigndocumentBase64;
  }


  public EzsigndocumentRequestCompound fkiEzsignfolderID(Integer fkiEzsignfolderID) {
    
    this.fkiEzsignfolderID = fkiEzsignfolderID;
    return this;
  }

   /**
   * A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.
   * minimum: 1
   * @return fkiEzsignfolderID
  **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.")

  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }


  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }


  public EzsigndocumentRequestCompound dtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
    return this;
  }

   /**
   * Represent a Date Time. The timezone is the one configured in the User&#39;s profile.
   * @return dtEzsigndocumentDuedate
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")

  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }


  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }


  public EzsigndocumentRequestCompound fkiLanguageID(Integer fkiLanguageID) {
    
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


  public EzsigndocumentRequestCompound sEzsigndocumentName(String sEzsigndocumentName) {
    
    this.sEzsigndocumentName = sEzsigndocumentName;
    return this;
  }

   /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   * @return sEzsigndocumentName
  **/
  @ApiModelProperty(required = true, value = "The name of the document that will be presented to Ezsignfoldersignerassociations")

  public String getsEzsigndocumentName() {
    return sEzsigndocumentName;
  }


  public void setsEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentRequestCompound ezsigndocumentRequestCompound = (EzsigndocumentRequestCompound) o;
    return Objects.equals(this.eEzsigndocumentSource, ezsigndocumentRequestCompound.eEzsigndocumentSource) &&
        Objects.equals(this.eEzsigndocumentFormat, ezsigndocumentRequestCompound.eEzsigndocumentFormat) &&
        Arrays.equals(this.sEzsigndocumentBase64, ezsigndocumentRequestCompound.sEzsigndocumentBase64) &&
        Objects.equals(this.fkiEzsignfolderID, ezsigndocumentRequestCompound.fkiEzsignfolderID) &&
        Objects.equals(this.dtEzsigndocumentDuedate, ezsigndocumentRequestCompound.dtEzsigndocumentDuedate) &&
        Objects.equals(this.fkiLanguageID, ezsigndocumentRequestCompound.fkiLanguageID) &&
        Objects.equals(this.sEzsigndocumentName, ezsigndocumentRequestCompound.sEzsigndocumentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eEzsigndocumentSource, eEzsigndocumentFormat, Arrays.hashCode(sEzsigndocumentBase64), fkiEzsignfolderID, dtEzsigndocumentDuedate, fkiLanguageID, sEzsigndocumentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentRequestCompound {\n");
    sb.append("    eEzsigndocumentSource: ").append(toIndentedString(eEzsigndocumentSource)).append("\n");
    sb.append("    eEzsigndocumentFormat: ").append(toIndentedString(eEzsigndocumentFormat)).append("\n");
    sb.append("    sEzsigndocumentBase64: ").append(toIndentedString(sEzsigndocumentBase64)).append("\n");
    sb.append("    fkiEzsignfolderID: ").append(toIndentedString(fkiEzsignfolderID)).append("\n");
    sb.append("    dtEzsigndocumentDuedate: ").append(toIndentedString(dtEzsigndocumentDuedate)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sEzsigndocumentName: ").append(toIndentedString(sEzsigndocumentName)).append("\n");
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

