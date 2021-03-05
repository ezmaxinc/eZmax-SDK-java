/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.32
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignsignatureRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignsignature Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignsignature Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-05T19:15:36.415Z[GMT]")
public class EzsignsignatureRequestCompound {
  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D = "fkiEzsignfoldersignerassociationID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D)
  private Integer fkiEzsignfoldersignerassociationID;

  public static final String SERIALIZED_NAME_I_EZSIGNPAGE_PAGENUMBER = "iEzsignpagePagenumber";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNPAGE_PAGENUMBER)
  private Integer iEzsignpagePagenumber;

  public static final String SERIALIZED_NAME_I_EZSIGNSIGNATURE_X = "iEzsignsignatureX";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNSIGNATURE_X)
  private Integer iEzsignsignatureX;

  public static final String SERIALIZED_NAME_I_EZSIGNSIGNATURE_Y = "iEzsignsignatureY";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNSIGNATURE_Y)
  private Integer iEzsignsignatureY;

  public static final String SERIALIZED_NAME_I_EZSIGNSIGNATURE_STEP = "iEzsignsignatureStep";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNSIGNATURE_STEP)
  private Integer iEzsignsignatureStep;

  /**
   * The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \&quot;draw\&quot; their signature on screen. 3. **Initials** is a simple \&quot;click to add initials\&quot; block. 4. **Name** is a simple \&quot;Click to sign\&quot; block. This is the most common block of signature.
   */
  @JsonAdapter(EEzsignsignatureTypeEnum.Adapter.class)
  public enum EEzsignsignatureTypeEnum {
    ACKNOWLEDGEMENT("Acknowledgement"),
    
    HANDWRITTEN("Handwritten"),
    
    INITIALS("Initials"),
    
    NAME("Name");

    private String value;

    EEzsignsignatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EEzsignsignatureTypeEnum fromValue(String value) {
      for (EEzsignsignatureTypeEnum b : EEzsignsignatureTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EEzsignsignatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EEzsignsignatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EEzsignsignatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EEzsignsignatureTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_E_EZSIGNSIGNATURE_TYPE = "eEzsignsignatureType";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNSIGNATURE_TYPE)
  private EEzsignsignatureTypeEnum eEzsignsignatureType;

  public static final String SERIALIZED_NAME_FKI_EZSIGNDOCUMENT_I_D = "fkiEzsigndocumentID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNDOCUMENT_I_D)
  private Integer fkiEzsigndocumentID;


  public EzsignsignatureRequestCompound fkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
    return this;
  }

   /**
   * A reference to a valid Ezsignfoldersignerassociation.  That value is returned after a successful Ezsignfoldersignerassociation Creation. 
   * @return fkiEzsignfoldersignerassociationID
  **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsignfoldersignerassociation.  That value is returned after a successful Ezsignfoldersignerassociation Creation. ")

  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }


  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }


  public EzsignsignatureRequestCompound iEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
    return this;
  }

   /**
   * The page number in the document where to apply the signature
   * @return iEzsignpagePagenumber
  **/
  @ApiModelProperty(required = true, value = "The page number in the document where to apply the signature")

  public Integer getiEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }


  public void setiEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }


  public EzsignsignatureRequestCompound iEzsignsignatureX(Integer iEzsignsignatureX) {
    
    this.iEzsignsignatureX = iEzsignsignatureX;
    return this;
  }

   /**
   * The X coordinate (Horizontal) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate.
   * @return iEzsignsignatureX
  **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")

  public Integer getiEzsignsignatureX() {
    return iEzsignsignatureX;
  }


  public void setiEzsignsignatureX(Integer iEzsignsignatureX) {
    this.iEzsignsignatureX = iEzsignsignatureX;
  }


  public EzsignsignatureRequestCompound iEzsignsignatureY(Integer iEzsignsignatureY) {
    
    this.iEzsignsignatureY = iEzsignsignatureY;
    return this;
  }

   /**
   * The Y coordinate (Vertical) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate.
   * @return iEzsignsignatureY
  **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")

  public Integer getiEzsignsignatureY() {
    return iEzsignsignatureY;
  }


  public void setiEzsignsignatureY(Integer iEzsignsignatureY) {
    this.iEzsignsignatureY = iEzsignsignatureY;
  }


  public EzsignsignatureRequestCompound iEzsignsignatureStep(Integer iEzsignsignatureStep) {
    
    this.iEzsignsignatureStep = iEzsignsignatureStep;
    return this;
  }

   /**
   * The step when the Ezsignsigner will be invited to sign.  For example, if you say iEzsignsignatureStep&#x3D;2, that block of signature will be available for signature only after ALL the signatures in step 1 are completed.
   * @return iEzsignsignatureStep
  **/
  @ApiModelProperty(required = true, value = "The step when the Ezsignsigner will be invited to sign.  For example, if you say iEzsignsignatureStep=2, that block of signature will be available for signature only after ALL the signatures in step 1 are completed.")

  public Integer getiEzsignsignatureStep() {
    return iEzsignsignatureStep;
  }


  public void setiEzsignsignatureStep(Integer iEzsignsignatureStep) {
    this.iEzsignsignatureStep = iEzsignsignatureStep;
  }


  public EzsignsignatureRequestCompound eEzsignsignatureType(EEzsignsignatureTypeEnum eEzsignsignatureType) {
    
    this.eEzsignsignatureType = eEzsignsignatureType;
    return this;
  }

   /**
   * The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \&quot;draw\&quot; their signature on screen. 3. **Initials** is a simple \&quot;click to add initials\&quot; block. 4. **Name** is a simple \&quot;Click to sign\&quot; block. This is the most common block of signature.
   * @return eEzsignsignatureType
  **/
  @ApiModelProperty(required = true, value = "The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature.")

  public EEzsignsignatureTypeEnum geteEzsignsignatureType() {
    return eEzsignsignatureType;
  }


  public void seteEzsignsignatureType(EEzsignsignatureTypeEnum eEzsignsignatureType) {
    this.eEzsignsignatureType = eEzsignsignatureType;
  }


  public EzsignsignatureRequestCompound fkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
    return this;
  }

   /**
   * A reference to a valid Ezsigndocument.  That value is returned after a successful Ezsigndocumentation Creation.
   * @return fkiEzsigndocumentID
  **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsigndocument.  That value is returned after a successful Ezsigndocumentation Creation.")

  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }


  public void setFkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureRequestCompound ezsignsignatureRequestCompound = (EzsignsignatureRequestCompound) o;
    return Objects.equals(this.fkiEzsignfoldersignerassociationID, ezsignsignatureRequestCompound.fkiEzsignfoldersignerassociationID) &&
        Objects.equals(this.iEzsignpagePagenumber, ezsignsignatureRequestCompound.iEzsignpagePagenumber) &&
        Objects.equals(this.iEzsignsignatureX, ezsignsignatureRequestCompound.iEzsignsignatureX) &&
        Objects.equals(this.iEzsignsignatureY, ezsignsignatureRequestCompound.iEzsignsignatureY) &&
        Objects.equals(this.iEzsignsignatureStep, ezsignsignatureRequestCompound.iEzsignsignatureStep) &&
        Objects.equals(this.eEzsignsignatureType, ezsignsignatureRequestCompound.eEzsignsignatureType) &&
        Objects.equals(this.fkiEzsigndocumentID, ezsignsignatureRequestCompound.fkiEzsigndocumentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsignfoldersignerassociationID, iEzsignpagePagenumber, iEzsignsignatureX, iEzsignsignatureY, iEzsignsignatureStep, eEzsignsignatureType, fkiEzsigndocumentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureRequestCompound {\n");
    sb.append("    fkiEzsignfoldersignerassociationID: ").append(toIndentedString(fkiEzsignfoldersignerassociationID)).append("\n");
    sb.append("    iEzsignpagePagenumber: ").append(toIndentedString(iEzsignpagePagenumber)).append("\n");
    sb.append("    iEzsignsignatureX: ").append(toIndentedString(iEzsignsignatureX)).append("\n");
    sb.append("    iEzsignsignatureY: ").append(toIndentedString(iEzsignsignatureY)).append("\n");
    sb.append("    iEzsignsignatureStep: ").append(toIndentedString(iEzsignsignatureStep)).append("\n");
    sb.append("    eEzsignsignatureType: ").append(toIndentedString(eEzsignsignatureType)).append("\n");
    sb.append("    fkiEzsigndocumentID: ").append(toIndentedString(fkiEzsigndocumentID)).append("\n");
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

