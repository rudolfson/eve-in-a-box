/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.5.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.inventoris.eve.esi.model;

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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T13:09:34.400Z")
public class GetDogmaAttributesAttributeIdOk {
  @SerializedName("attribute_id")
  private Integer attributeId = null;

  @SerializedName("default_value")
  private Float defaultValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("high_is_good")
  private Boolean highIsGood = null;

  @SerializedName("icon_id")
  private Integer iconId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("stackable")
  private Boolean stackable = null;

  @SerializedName("unit_id")
  private Integer unitId = null;

  public GetDogmaAttributesAttributeIdOk attributeId(Integer attributeId) {
    this.attributeId = attributeId;
    return this;
  }

   /**
   * attribute_id integer
   * @return attributeId
  **/
  @ApiModelProperty(required = true, value = "attribute_id integer")
  public Integer getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

  public GetDogmaAttributesAttributeIdOk defaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * default_value number
   * @return defaultValue
  **/
  @ApiModelProperty(value = "default_value number")
  public Float getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
  }

  public GetDogmaAttributesAttributeIdOk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetDogmaAttributesAttributeIdOk displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display_name string
   * @return displayName
  **/
  @ApiModelProperty(value = "display_name string")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GetDogmaAttributesAttributeIdOk highIsGood(Boolean highIsGood) {
    this.highIsGood = highIsGood;
    return this;
  }

   /**
   * high_is_good boolean
   * @return highIsGood
  **/
  @ApiModelProperty(value = "high_is_good boolean")
  public Boolean isHighIsGood() {
    return highIsGood;
  }

  public void setHighIsGood(Boolean highIsGood) {
    this.highIsGood = highIsGood;
  }

  public GetDogmaAttributesAttributeIdOk iconId(Integer iconId) {
    this.iconId = iconId;
    return this;
  }

   /**
   * icon_id integer
   * @return iconId
  **/
  @ApiModelProperty(value = "icon_id integer")
  public Integer getIconId() {
    return iconId;
  }

  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }

  public GetDogmaAttributesAttributeIdOk name(String name) {
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

  public GetDogmaAttributesAttributeIdOk published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * published boolean
   * @return published
  **/
  @ApiModelProperty(value = "published boolean")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GetDogmaAttributesAttributeIdOk stackable(Boolean stackable) {
    this.stackable = stackable;
    return this;
  }

   /**
   * stackable boolean
   * @return stackable
  **/
  @ApiModelProperty(value = "stackable boolean")
  public Boolean isStackable() {
    return stackable;
  }

  public void setStackable(Boolean stackable) {
    this.stackable = stackable;
  }

  public GetDogmaAttributesAttributeIdOk unitId(Integer unitId) {
    this.unitId = unitId;
    return this;
  }

   /**
   * unit_id integer
   * @return unitId
  **/
  @ApiModelProperty(value = "unit_id integer")
  public Integer getUnitId() {
    return unitId;
  }

  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaAttributesAttributeIdOk getDogmaAttributesAttributeIdOk = (GetDogmaAttributesAttributeIdOk) o;
    return Objects.equals(this.attributeId, getDogmaAttributesAttributeIdOk.attributeId) &&
        Objects.equals(this.defaultValue, getDogmaAttributesAttributeIdOk.defaultValue) &&
        Objects.equals(this.description, getDogmaAttributesAttributeIdOk.description) &&
        Objects.equals(this.displayName, getDogmaAttributesAttributeIdOk.displayName) &&
        Objects.equals(this.highIsGood, getDogmaAttributesAttributeIdOk.highIsGood) &&
        Objects.equals(this.iconId, getDogmaAttributesAttributeIdOk.iconId) &&
        Objects.equals(this.name, getDogmaAttributesAttributeIdOk.name) &&
        Objects.equals(this.published, getDogmaAttributesAttributeIdOk.published) &&
        Objects.equals(this.stackable, getDogmaAttributesAttributeIdOk.stackable) &&
        Objects.equals(this.unitId, getDogmaAttributesAttributeIdOk.unitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, defaultValue, description, displayName, highIsGood, iconId, name, published, stackable, unitId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaAttributesAttributeIdOk {\n");
    
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    highIsGood: ").append(toIndentedString(highIsGood)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    stackable: ").append(toIndentedString(stackable)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

