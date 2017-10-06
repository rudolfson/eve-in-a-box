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
 * movement object
 */
@ApiModel(description = "movement object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T13:09:34.400Z")
public class PutFleetsFleetIdMembersMemberIdMovement {
  /**
   * - If a character is moved to the &#x60;fleet_commander&#x60; role, neither &#x60;wing_id&#x60; or &#x60;squad_id&#x60; should be specified - If a character is moved to the &#x60;wing_commander&#x60; role, only &#x60;wing_id&#x60; should be specified - If a character is moved to the &#x60;squad_commander&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified - If a character is moved to the &#x60;squad_member&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified 
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    FLEET_COMMANDER("fleet_commander"),
    
    WING_COMMANDER("wing_commander"),
    
    SQUAD_COMMANDER("squad_commander"),
    
    SQUAD_MEMBER("squad_member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("squad_id")
  private Long squadId = null;

  @SerializedName("wing_id")
  private Long wingId = null;

  public PutFleetsFleetIdMembersMemberIdMovement role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * - If a character is moved to the &#x60;fleet_commander&#x60; role, neither &#x60;wing_id&#x60; or &#x60;squad_id&#x60; should be specified - If a character is moved to the &#x60;wing_commander&#x60; role, only &#x60;wing_id&#x60; should be specified - If a character is moved to the &#x60;squad_commander&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified - If a character is moved to the &#x60;squad_member&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified 
   * @return role
  **/
  @ApiModelProperty(required = true, value = "- If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified - If a character is moved to the `wing_commander` role, only `wing_id` should be specified - If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified - If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified ")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public PutFleetsFleetIdMembersMemberIdMovement squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

   /**
   * squad_id integer
   * minimum: 0
   * @return squadId
  **/
  @ApiModelProperty(value = "squad_id integer")
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public PutFleetsFleetIdMembersMemberIdMovement wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

   /**
   * wing_id integer
   * minimum: 0
   * @return wingId
  **/
  @ApiModelProperty(value = "wing_id integer")
  public Long getWingId() {
    return wingId;
  }

  public void setWingId(Long wingId) {
    this.wingId = wingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFleetsFleetIdMembersMemberIdMovement putFleetsFleetIdMembersMemberIdMovement = (PutFleetsFleetIdMembersMemberIdMovement) o;
    return Objects.equals(this.role, putFleetsFleetIdMembersMemberIdMovement.role) &&
        Objects.equals(this.squadId, putFleetsFleetIdMembersMemberIdMovement.squadId) &&
        Objects.equals(this.wingId, putFleetsFleetIdMembersMemberIdMovement.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, squadId, wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFleetsFleetIdMembersMemberIdMovement {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
    sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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
