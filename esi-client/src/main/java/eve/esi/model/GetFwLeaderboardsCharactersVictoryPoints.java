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
import eve.esi.model.GetFwLeaderboardsCharactersActiveTotal1;
import eve.esi.model.GetFwLeaderboardsCharactersLastWeek1;
import eve.esi.model.GetFwLeaderboardsCharactersYesterday1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Top 100 rankings of pilots by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 100 rankings of pilots by victory points from yesterday, last week and in total")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetFwLeaderboardsCharactersVictoryPoints {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsCharactersActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCharactersActiveTotal1>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCharactersLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCharactersLastWeek1>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCharactersYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCharactersYesterday1>();

  public GetFwLeaderboardsCharactersVictoryPoints activeTotal(List<GetFwLeaderboardsCharactersActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addActiveTotalItem(GetFwLeaderboardsCharactersActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \&quot;active\&quot; if they have participated in faction warfare in the past 14 days.
   * @return activeTotal
  **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days.")
  public List<GetFwLeaderboardsCharactersActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCharactersActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCharactersVictoryPoints lastWeek(List<GetFwLeaderboardsCharactersLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addLastWeekItem(GetFwLeaderboardsCharactersLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by victory points in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past week")
  public List<GetFwLeaderboardsCharactersLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCharactersLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCharactersVictoryPoints yesterday(List<GetFwLeaderboardsCharactersYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addYesterdayItem(GetFwLeaderboardsCharactersYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by victory points in the past day
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past day")
  public List<GetFwLeaderboardsCharactersYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCharactersYesterday1> yesterday) {
    this.yesterday = yesterday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCharactersVictoryPoints getFwLeaderboardsCharactersVictoryPoints = (GetFwLeaderboardsCharactersVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCharactersVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCharactersVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCharactersVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersVictoryPoints {\n");
    
    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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

