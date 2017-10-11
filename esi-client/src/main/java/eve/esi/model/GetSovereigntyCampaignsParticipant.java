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
 * participant object
 */
@ApiModel(description = "participant object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetSovereigntyCampaignsParticipant {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("score")
  private Float score = null;

  public GetSovereigntyCampaignsParticipant allianceId(Integer allianceId) {
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

  public GetSovereigntyCampaignsParticipant score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * score number
   * @return score
  **/
  @ApiModelProperty(required = true, value = "score number")
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSovereigntyCampaignsParticipant getSovereigntyCampaignsParticipant = (GetSovereigntyCampaignsParticipant) o;
    return Objects.equals(this.allianceId, getSovereigntyCampaignsParticipant.allianceId) &&
        Objects.equals(this.score, getSovereigntyCampaignsParticipant.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSovereigntyCampaignsParticipant {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
