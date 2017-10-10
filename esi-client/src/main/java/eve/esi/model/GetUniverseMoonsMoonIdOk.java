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
import eve.esi.model.GetUniverseMoonsMoonIdPosition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetUniverseMoonsMoonIdOk {
  @SerializedName("moon_id")
  private Integer moonId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private GetUniverseMoonsMoonIdPosition position = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  public GetUniverseMoonsMoonIdOk moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

   /**
   * moon_id integer
   * @return moonId
  **/
  @ApiModelProperty(required = true, value = "moon_id integer")
  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetUniverseMoonsMoonIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetUniverseMoonsMoonIdOk position(GetUniverseMoonsMoonIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public GetUniverseMoonsMoonIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseMoonsMoonIdPosition position) {
    this.position = position;
  }

  public GetUniverseMoonsMoonIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this moon is in
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The solar system this moon is in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseMoonsMoonIdOk getUniverseMoonsMoonIdOk = (GetUniverseMoonsMoonIdOk) o;
    return Objects.equals(this.moonId, getUniverseMoonsMoonIdOk.moonId) &&
        Objects.equals(this.name, getUniverseMoonsMoonIdOk.name) &&
        Objects.equals(this.position, getUniverseMoonsMoonIdOk.position) &&
        Objects.equals(this.systemId, getUniverseMoonsMoonIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moonId, name, position, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseMoonsMoonIdOk {\n");
    
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

