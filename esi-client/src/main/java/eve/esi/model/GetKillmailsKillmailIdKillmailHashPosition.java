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
 * Coordinates of the victim in Cartesian space relative to the Sun 
 */
@ApiModel(description = "Coordinates of the victim in Cartesian space relative to the Sun ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetKillmailsKillmailIdKillmailHashPosition {
  @SerializedName("x")
  private Float x = null;

  @SerializedName("y")
  private Float y = null;

  @SerializedName("z")
  private Float z = null;

  public GetKillmailsKillmailIdKillmailHashPosition x(Float x) {
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

  public GetKillmailsKillmailIdKillmailHashPosition y(Float y) {
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

  public GetKillmailsKillmailIdKillmailHashPosition z(Float z) {
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
    GetKillmailsKillmailIdKillmailHashPosition getKillmailsKillmailIdKillmailHashPosition = (GetKillmailsKillmailIdKillmailHashPosition) o;
    return Objects.equals(this.x, getKillmailsKillmailIdKillmailHashPosition.x) &&
        Objects.equals(this.y, getKillmailsKillmailIdKillmailHashPosition.y) &&
        Objects.equals(this.z, getKillmailsKillmailIdKillmailHashPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashPosition {\n");
    
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

