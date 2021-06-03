/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignsignerRequest;
import com.ezmax.api.model.EzsignsignerRequestCompoundContact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignsigner Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignsigner Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class EzsignsignerRequestCompound {
  public static final String SERIALIZED_NAME_OBJ_CONTACT = "objContact";
  @SerializedName(SERIALIZED_NAME_OBJ_CONTACT)
  private EzsignsignerRequestCompoundContact objContact;

  public static final String SERIALIZED_NAME_FKI_TAXASSIGNMENT_I_D = "fkiTaxassignmentID";
  @SerializedName(SERIALIZED_NAME_FKI_TAXASSIGNMENT_I_D)
  private Integer fkiTaxassignmentID;

  public static final String SERIALIZED_NAME_FKI_SECRETQUESTION_I_D = "fkiSecretquestionID";
  @SerializedName(SERIALIZED_NAME_FKI_SECRETQUESTION_I_D)
  private Integer fkiSecretquestionID;

  /**
   * The method the Ezsignsigner will authenticate to the signing platform.  1. **Password** means the Ezsignsigner will receive a secure link by email. 2. **PasswordPhone** means the Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**. 3. **PasswordQuestion** means the Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer. 4. **InPersonPhone** means the Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**. 5. **InPerson** means the Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and there won&#39;t be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type.
   */
  @JsonAdapter(EEzsignsignerLogintypeEnum.Adapter.class)
  public enum EEzsignsignerLogintypeEnum {
    PASSWORD("Password"),
    
    PASSWORDPHONE("PasswordPhone"),
    
    PASSWORDQUESTION("PasswordQuestion"),
    
    INPERSONPHONE("InPersonPhone"),
    
    INPERSON("InPerson");

    private String value;

    EEzsignsignerLogintypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EEzsignsignerLogintypeEnum fromValue(String value) {
      for (EEzsignsignerLogintypeEnum b : EEzsignsignerLogintypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EEzsignsignerLogintypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EEzsignsignerLogintypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EEzsignsignerLogintypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EEzsignsignerLogintypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_EZSIGNSIGNER_LOGINTYPE = "eEzsignsignerLogintype";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNSIGNER_LOGINTYPE)
  private EEzsignsignerLogintypeEnum eEzsignsignerLogintype;

  public static final String SERIALIZED_NAME_S_EZSIGNSIGNER_SECRETANSWER = "sEzsignsignerSecretanswer";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNSIGNER_SECRETANSWER)
  private String sEzsignsignerSecretanswer;


  public EzsignsignerRequestCompound objContact(EzsignsignerRequestCompoundContact objContact) {
    
    this.objContact = objContact;
    return this;
  }

   /**
   * Get objContact
   * @return objContact
  **/
  @ApiModelProperty(required = true, value = "")

  public EzsignsignerRequestCompoundContact getObjContact() {
    return objContact;
  }


  public void setObjContact(EzsignsignerRequestCompoundContact objContact) {
    this.objContact = objContact;
  }


  public EzsignsignerRequestCompound fkiTaxassignmentID(Integer fkiTaxassignmentID) {
    
    this.fkiTaxassignmentID = fkiTaxassignmentID;
    return this;
  }

   /**
   * The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
   * minimum: 1
   * maximum: 15
   * @return fkiTaxassignmentID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|")

  public Integer getFkiTaxassignmentID() {
    return fkiTaxassignmentID;
  }


  public void setFkiTaxassignmentID(Integer fkiTaxassignmentID) {
    this.fkiTaxassignmentID = fkiTaxassignmentID;
  }


  public EzsignsignerRequestCompound fkiSecretquestionID(Integer fkiSecretquestionID) {
    
    this.fkiSecretquestionID = fkiSecretquestionID;
    return this;
  }

   /**
   * The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father&#39;s middle name| |15|Your mother&#39;s maiden name| |16|Name of your eldest child| |17|Your spouse&#39;s middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat&#39;s name| |22|Date of Birth (YYYY-MM-DD)|
   * @return fkiSecretquestionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|")

  public Integer getFkiSecretquestionID() {
    return fkiSecretquestionID;
  }


  public void setFkiSecretquestionID(Integer fkiSecretquestionID) {
    this.fkiSecretquestionID = fkiSecretquestionID;
  }


  public EzsignsignerRequestCompound eEzsignsignerLogintype(EEzsignsignerLogintypeEnum eEzsignsignerLogintype) {
    
    this.eEzsignsignerLogintype = eEzsignsignerLogintype;
    return this;
  }

   /**
   * The method the Ezsignsigner will authenticate to the signing platform.  1. **Password** means the Ezsignsigner will receive a secure link by email. 2. **PasswordPhone** means the Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**. 3. **PasswordQuestion** means the Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer. 4. **InPersonPhone** means the Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**. 5. **InPerson** means the Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and there won&#39;t be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type.
   * @return eEzsignsignerLogintype
  **/
  @ApiModelProperty(required = true, value = "The method the Ezsignsigner will authenticate to the signing platform.  1. **Password** means the Ezsignsigner will receive a secure link by email. 2. **PasswordPhone** means the Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**. 3. **PasswordQuestion** means the Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer. 4. **InPersonPhone** means the Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**. 5. **InPerson** means the Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type.")

  public EEzsignsignerLogintypeEnum geteEzsignsignerLogintype() {
    return eEzsignsignerLogintype;
  }


  public void seteEzsignsignerLogintype(EEzsignsignerLogintypeEnum eEzsignsignerLogintype) {
    this.eEzsignsignerLogintype = eEzsignsignerLogintype;
  }


  public EzsignsignerRequestCompound sEzsignsignerSecretanswer(String sEzsignsignerSecretanswer) {
    
    this.sEzsignsignerSecretanswer = sEzsignsignerSecretanswer;
    return this;
  }

   /**
   * The predefined answer to the secret question the Ezsignsigner will need to provide to successfully authenticate.
   * @return sEzsignsignerSecretanswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The predefined answer to the secret question the Ezsignsigner will need to provide to successfully authenticate.")

  public String getsEzsignsignerSecretanswer() {
    return sEzsignsignerSecretanswer;
  }


  public void setsEzsignsignerSecretanswer(String sEzsignsignerSecretanswer) {
    this.sEzsignsignerSecretanswer = sEzsignsignerSecretanswer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerRequestCompound ezsignsignerRequestCompound = (EzsignsignerRequestCompound) o;
    return Objects.equals(this.objContact, ezsignsignerRequestCompound.objContact) &&
        Objects.equals(this.fkiTaxassignmentID, ezsignsignerRequestCompound.fkiTaxassignmentID) &&
        Objects.equals(this.fkiSecretquestionID, ezsignsignerRequestCompound.fkiSecretquestionID) &&
        Objects.equals(this.eEzsignsignerLogintype, ezsignsignerRequestCompound.eEzsignsignerLogintype) &&
        Objects.equals(this.sEzsignsignerSecretanswer, ezsignsignerRequestCompound.sEzsignsignerSecretanswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objContact, fkiTaxassignmentID, fkiSecretquestionID, eEzsignsignerLogintype, sEzsignsignerSecretanswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerRequestCompound {\n");
    sb.append("    objContact: ").append(toIndentedString(objContact)).append("\n");
    sb.append("    fkiTaxassignmentID: ").append(toIndentedString(fkiTaxassignmentID)).append("\n");
    sb.append("    fkiSecretquestionID: ").append(toIndentedString(fkiSecretquestionID)).append("\n");
    sb.append("    eEzsignsignerLogintype: ").append(toIndentedString(eEzsignsignerLogintype)).append("\n");
    sb.append("    sEzsignsignerSecretanswer: ").append(toIndentedString(sEzsignsignerSecretanswer)).append("\n");
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

