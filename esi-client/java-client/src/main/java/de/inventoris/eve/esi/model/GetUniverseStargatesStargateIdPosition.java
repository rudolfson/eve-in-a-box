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
 * position object
 */
@ApiModel(description = "position object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T13:09:34.400Z")
public class GetUniverseStargatesStargateIdPosition {
  @SerializedName("x")
  private Float x = null;

  @SerializedName("y")
  private Float y = null;

  @SerializedName("z")
  private Float z = null;

  public GetUniverseStargatesStargateIdPosition x(Float x) {
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(required = true, value = "x number")
  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public GetUniverseStargatesStargateIdPosition y(Float y) {
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(required = true, value = "y number")
  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public GetUniverseStargatesStargateIdPosition z(Float z) {
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(required = true, value = "z number")
  public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStargatesStargateIdPosition getUniverseStargatesStargateIdPosition = (GetUniverseStargatesStargateIdPosition) o;
    return Objects.equals(this.x, getUniverseStargatesStargateIdPosition.x) &&
        Objects.equals(this.y, getUniverseStargatesStargateIdPosition.y) &&
        Objects.equals(this.z, getUniverseStargatesStargateIdPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStargatesStargateIdPosition {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

