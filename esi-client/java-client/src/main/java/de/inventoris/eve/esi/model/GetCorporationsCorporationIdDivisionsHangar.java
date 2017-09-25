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
 * hangar object
 */
@ApiModel(description = "hangar object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T13:09:34.400Z")
public class GetCorporationsCorporationIdDivisionsHangar {
  @SerializedName("division")
  private Integer division = null;

  @SerializedName("name")
  private String name = null;

  public GetCorporationsCorporationIdDivisionsHangar division(Integer division) {
    this.division = division;
    return this;
  }

   /**
   * division integer
   * minimum: 1
   * maximum: 7
   * @return division
  **/
  @ApiModelProperty(value = "division integer")
  public Integer getDivision() {
    return division;
  }

  public void setDivision(Integer division) {
    this.division = division;
  }

  public GetCorporationsCorporationIdDivisionsHangar name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdDivisionsHangar getCorporationsCorporationIdDivisionsHangar = (GetCorporationsCorporationIdDivisionsHangar) o;
    return Objects.equals(this.division, getCorporationsCorporationIdDivisionsHangar.division) &&
        Objects.equals(this.name, getCorporationsCorporationIdDivisionsHangar.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsHangar {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

