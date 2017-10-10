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
import java.time.OffsetDateTime;

/**
 * muted object
 */
@ApiModel(description = "muted object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetCharactersCharacterIdChatChannelsMuted {
  @SerializedName("accessor_id")
  private Integer accessorId = null;

  /**
   * accessor_type string
   */
  @JsonAdapter(AccessorTypeEnum.Adapter.class)
  public enum AccessorTypeEnum {
    CHARACTER("character"),
    
    CORPORATION("corporation"),
    
    ALLIANCE("alliance");

    private String value;

    AccessorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessorTypeEnum fromValue(String text) {
      for (AccessorTypeEnum b : AccessorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessor_type")
  private AccessorTypeEnum accessorType = null;

  @SerializedName("end_at")
  private OffsetDateTime endAt = null;

  @SerializedName("reason")
  private String reason = null;

  public GetCharactersCharacterIdChatChannelsMuted accessorId(Integer accessorId) {
    this.accessorId = accessorId;
    return this;
  }

   /**
   * ID of a muted channel member
   * @return accessorId
  **/
  @ApiModelProperty(required = true, value = "ID of a muted channel member")
  public Integer getAccessorId() {
    return accessorId;
  }

  public void setAccessorId(Integer accessorId) {
    this.accessorId = accessorId;
  }

  public GetCharactersCharacterIdChatChannelsMuted accessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
    return this;
  }

   /**
   * accessor_type string
   * @return accessorType
  **/
  @ApiModelProperty(required = true, value = "accessor_type string")
  public AccessorTypeEnum getAccessorType() {
    return accessorType;
  }

  public void setAccessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
  }

  public GetCharactersCharacterIdChatChannelsMuted endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Time at which this accessor will no longer be muted
   * @return endAt
  **/
  @ApiModelProperty(value = "Time at which this accessor will no longer be muted")
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }

  public GetCharactersCharacterIdChatChannelsMuted reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason this accessor is muted
   * @return reason
  **/
  @ApiModelProperty(value = "Reason this accessor is muted")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdChatChannelsMuted getCharactersCharacterIdChatChannelsMuted = (GetCharactersCharacterIdChatChannelsMuted) o;
    return Objects.equals(this.accessorId, getCharactersCharacterIdChatChannelsMuted.accessorId) &&
        Objects.equals(this.accessorType, getCharactersCharacterIdChatChannelsMuted.accessorType) &&
        Objects.equals(this.endAt, getCharactersCharacterIdChatChannelsMuted.endAt) &&
        Objects.equals(this.reason, getCharactersCharacterIdChatChannelsMuted.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorId, accessorType, endAt, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdChatChannelsMuted {\n");
    
    sb.append("    accessorId: ").append(toIndentedString(accessorId)).append("\n");
    sb.append("    accessorType: ").append(toIndentedString(accessorType)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

