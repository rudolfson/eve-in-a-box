/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.6.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eve.esi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * jump_clone object
 */
@ApiModel(description = "jump_clone object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetCharactersCharacterIdClonesJumpClone {
  @SerializedName("implants")
  private List<Integer> implants = null;

  @SerializedName("location_id")
  private Long locationId = null;

  /**
   * location_type string
   */
  @JsonAdapter(LocationTypeEnum.Adapter.class)
  public enum LocationTypeEnum {
    STATION("station"),
    
    STRUCTURE("structure");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationTypeEnum fromValue(String text) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LocationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LocationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("location_type")
  private LocationTypeEnum locationType = null;

  public GetCharactersCharacterIdClonesJumpClone implants(List<Integer> implants) {
    this.implants = implants;
    return this;
  }

  public GetCharactersCharacterIdClonesJumpClone addImplantsItem(Integer implantsItem) {
    if (this.implants == null) {
      this.implants = new ArrayList<Integer>();
    }
    this.implants.add(implantsItem);
    return this;
  }

   /**
   * implants array
   * @return implants
  **/
  @ApiModelProperty(value = "implants array")
  public List<Integer> getImplants() {
    return implants;
  }

  public void setImplants(List<Integer> implants) {
    this.implants = implants;
  }

  public GetCharactersCharacterIdClonesJumpClone locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdClonesJumpClone locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * location_type string
   * @return locationType
  **/
  @ApiModelProperty(value = "location_type string")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClonesJumpClone getCharactersCharacterIdClonesJumpClone = (GetCharactersCharacterIdClonesJumpClone) o;
    return Objects.equals(this.implants, getCharactersCharacterIdClonesJumpClone.implants) &&
        Objects.equals(this.locationId, getCharactersCharacterIdClonesJumpClone.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdClonesJumpClone.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implants, locationId, locationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClonesJumpClone {\n");
    
    sb.append("    implants: ").append(toIndentedString(implants)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

