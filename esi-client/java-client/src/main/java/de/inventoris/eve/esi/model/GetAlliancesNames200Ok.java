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
public class GetAlliancesNames200Ok {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("alliance_name")
  private String allianceName = null;

  public GetAlliancesNames200Ok allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * alliance_id integer
   * @return allianceId
  **/
  @ApiModelProperty(required = true, value = "alliance_id integer")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetAlliancesNames200Ok allianceName(String allianceName) {
    this.allianceName = allianceName;
    return this;
  }

   /**
   * alliance_name string
   * @return allianceName
  **/
  @ApiModelProperty(required = true, value = "alliance_name string")
  public String getAllianceName() {
    return allianceName;
  }

  public void setAllianceName(String allianceName) {
    this.allianceName = allianceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesNames200Ok getAlliancesNames200Ok = (GetAlliancesNames200Ok) o;
    return Objects.equals(this.allianceId, getAlliancesNames200Ok.allianceId) &&
        Objects.equals(this.allianceName, getAlliancesNames200Ok.allianceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, allianceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesNames200Ok {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
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

