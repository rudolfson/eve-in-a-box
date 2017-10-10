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

/**
 * label object
 */
@ApiModel(description = "label object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetCharactersCharacterIdMailLabelsLabel {
  /**
   * color string
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    _0000FE("#0000fe"),
    
    _006634("#006634"),
    
    _0099FF("#0099ff"),
    
    _00FF33("#00ff33"),
    
    _01FFFF("#01ffff"),
    
    _349800("#349800"),
    
    _660066("#660066"),
    
    _666666("#666666"),
    
    _999999("#999999"),
    
    _99FFFF("#99ffff"),
    
    _9A0000("#9a0000"),
    
    CCFF9A("#ccff9a"),
    
    E6E6E6("#e6e6e6"),
    
    FE0000("#fe0000"),
    
    FF6600("#ff6600"),
    
    FFFF01("#ffff01"),
    
    FFFFCD("#ffffcd"),
    
    FFFFFF("#ffffff");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("color")
  private ColorEnum color = ColorEnum.FFFFFF;

  @SerializedName("label_id")
  private Integer labelId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("unread_count")
  private Integer unreadCount = null;

  public GetCharactersCharacterIdMailLabelsLabel color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * color string
   * @return color
  **/
  @ApiModelProperty(value = "color string")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public GetCharactersCharacterIdMailLabelsLabel labelId(Integer labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * label_id integer
   * minimum: 0
   * @return labelId
  **/
  @ApiModelProperty(value = "label_id integer")
  public Integer getLabelId() {
    return labelId;
  }

  public void setLabelId(Integer labelId) {
    this.labelId = labelId;
  }

  public GetCharactersCharacterIdMailLabelsLabel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdMailLabelsLabel unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }

   /**
   * unread_count integer
   * minimum: 0
   * @return unreadCount
  **/
  @ApiModelProperty(value = "unread_count integer")
  public Integer getUnreadCount() {
    return unreadCount;
  }

  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailLabelsLabel getCharactersCharacterIdMailLabelsLabel = (GetCharactersCharacterIdMailLabelsLabel) o;
    return Objects.equals(this.color, getCharactersCharacterIdMailLabelsLabel.color) &&
        Objects.equals(this.labelId, getCharactersCharacterIdMailLabelsLabel.labelId) &&
        Objects.equals(this.name, getCharactersCharacterIdMailLabelsLabel.name) &&
        Objects.equals(this.unreadCount, getCharactersCharacterIdMailLabelsLabel.unreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, labelId, name, unreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailLabelsLabel {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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

