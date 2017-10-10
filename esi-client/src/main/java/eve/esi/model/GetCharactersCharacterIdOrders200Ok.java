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
import java.time.OffsetDateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetCharactersCharacterIdOrders200Ok {
  @SerializedName("account_id")
  private Integer accountId = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("escrow")
  private Float escrow = null;

  @SerializedName("is_buy_order")
  private Boolean isBuyOrder = null;

  @SerializedName("is_corp")
  private Boolean isCorp = null;

  @SerializedName("issued")
  private OffsetDateTime issued = null;

  @SerializedName("location_id")
  private Long locationId = null;

  @SerializedName("min_volume")
  private Integer minVolume = null;

  @SerializedName("order_id")
  private Long orderId = null;

  @SerializedName("price")
  private Float price = null;

  /**
   * Valid order range, numbers are ranges in jumps
   */
  @JsonAdapter(RangeEnum.Adapter.class)
  public enum RangeEnum {
    _1("1"),
    
    _10("10"),
    
    _2("2"),
    
    _20("20"),
    
    _3("3"),
    
    _30("30"),
    
    _4("4"),
    
    _40("40"),
    
    _5("5"),
    
    REGION("region"),
    
    SOLARSYSTEM("solarsystem"),
    
    STATION("station");

    private String value;

    RangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RangeEnum fromValue(String text) {
      for (RangeEnum b : RangeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RangeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RangeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("range")
  private RangeEnum range = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  /**
   * Current order state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CANCELLED("cancelled"),
    
    CHARACTER_DELETED("character_deleted"),
    
    CLOSED("closed"),
    
    EXPIRED("expired"),
    
    OPEN("open"),
    
    PENDING("pending");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("volume_remain")
  private Integer volumeRemain = null;

  @SerializedName("volume_total")
  private Integer volumeTotal = null;

  public GetCharactersCharacterIdOrders200Ok accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Wallet division for the buyer or seller of this order. Always 1000 for characters. Currently 1000 through 1006 for corporations
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Wallet division for the buyer or seller of this order. Always 1000 for characters. Currently 1000 through 1006 for corporations")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public GetCharactersCharacterIdOrders200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Numer of days for which order is valid (starting from the issued date). An order expires at time issued + duration
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Numer of days for which order is valid (starting from the issued date). An order expires at time issued + duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCharactersCharacterIdOrders200Ok escrow(Float escrow) {
    this.escrow = escrow;
    return this;
  }

   /**
   * For buy orders, the amount of ISK in escrow
   * @return escrow
  **/
  @ApiModelProperty(required = true, value = "For buy orders, the amount of ISK in escrow")
  public Float getEscrow() {
    return escrow;
  }

  public void setEscrow(Float escrow) {
    this.escrow = escrow;
  }

  public GetCharactersCharacterIdOrders200Ok isBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
    return this;
  }

   /**
   * True for a bid (buy) order. False for an offer (sell) order
   * @return isBuyOrder
  **/
  @ApiModelProperty(required = true, value = "True for a bid (buy) order. False for an offer (sell) order")
  public Boolean isIsBuyOrder() {
    return isBuyOrder;
  }

  public void setIsBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
  }

  public GetCharactersCharacterIdOrders200Ok isCorp(Boolean isCorp) {
    this.isCorp = isCorp;
    return this;
  }

   /**
   * is_corp boolean
   * @return isCorp
  **/
  @ApiModelProperty(required = true, value = "is_corp boolean")
  public Boolean isIsCorp() {
    return isCorp;
  }

  public void setIsCorp(Boolean isCorp) {
    this.isCorp = isCorp;
  }

  public GetCharactersCharacterIdOrders200Ok issued(OffsetDateTime issued) {
    this.issued = issued;
    return this;
  }

   /**
   * Date and time when this order was issued
   * @return issued
  **/
  @ApiModelProperty(required = true, value = "Date and time when this order was issued")
  public OffsetDateTime getIssued() {
    return issued;
  }

  public void setIssued(OffsetDateTime issued) {
    this.issued = issued;
  }

  public GetCharactersCharacterIdOrders200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * ID of the location where order was placed
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "ID of the location where order was placed")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdOrders200Ok minVolume(Integer minVolume) {
    this.minVolume = minVolume;
    return this;
  }

   /**
   * For bids (buy orders), the minimum quantity that will be accepted in a matching offer (sell order)
   * @return minVolume
  **/
  @ApiModelProperty(required = true, value = "For bids (buy orders), the minimum quantity that will be accepted in a matching offer (sell order)")
  public Integer getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Integer minVolume) {
    this.minVolume = minVolume;
  }

  public GetCharactersCharacterIdOrders200Ok orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique order ID
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "Unique order ID")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetCharactersCharacterIdOrders200Ok price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Cost per unit for this order
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Cost per unit for this order")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public GetCharactersCharacterIdOrders200Ok range(RangeEnum range) {
    this.range = range;
    return this;
  }

   /**
   * Valid order range, numbers are ranges in jumps
   * @return range
  **/
  @ApiModelProperty(required = true, value = "Valid order range, numbers are ranges in jumps")
  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public GetCharactersCharacterIdOrders200Ok regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * ID of the region where order was placed
   * @return regionId
  **/
  @ApiModelProperty(required = true, value = "ID of the region where order was placed")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetCharactersCharacterIdOrders200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current order state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Current order state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetCharactersCharacterIdOrders200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * The type ID of the item transacted in this order
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "The type ID of the item transacted in this order")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCharactersCharacterIdOrders200Ok volumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
    return this;
  }

   /**
   * Quantity of items still required or offered
   * @return volumeRemain
  **/
  @ApiModelProperty(required = true, value = "Quantity of items still required or offered")
  public Integer getVolumeRemain() {
    return volumeRemain;
  }

  public void setVolumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
  }

  public GetCharactersCharacterIdOrders200Ok volumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
    return this;
  }

   /**
   * Quantity of items required or offered at time order was placed
   * @return volumeTotal
  **/
  @ApiModelProperty(required = true, value = "Quantity of items required or offered at time order was placed")
  public Integer getVolumeTotal() {
    return volumeTotal;
  }

  public void setVolumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOrders200Ok getCharactersCharacterIdOrders200Ok = (GetCharactersCharacterIdOrders200Ok) o;
    return Objects.equals(this.accountId, getCharactersCharacterIdOrders200Ok.accountId) &&
        Objects.equals(this.duration, getCharactersCharacterIdOrders200Ok.duration) &&
        Objects.equals(this.escrow, getCharactersCharacterIdOrders200Ok.escrow) &&
        Objects.equals(this.isBuyOrder, getCharactersCharacterIdOrders200Ok.isBuyOrder) &&
        Objects.equals(this.isCorp, getCharactersCharacterIdOrders200Ok.isCorp) &&
        Objects.equals(this.issued, getCharactersCharacterIdOrders200Ok.issued) &&
        Objects.equals(this.locationId, getCharactersCharacterIdOrders200Ok.locationId) &&
        Objects.equals(this.minVolume, getCharactersCharacterIdOrders200Ok.minVolume) &&
        Objects.equals(this.orderId, getCharactersCharacterIdOrders200Ok.orderId) &&
        Objects.equals(this.price, getCharactersCharacterIdOrders200Ok.price) &&
        Objects.equals(this.range, getCharactersCharacterIdOrders200Ok.range) &&
        Objects.equals(this.regionId, getCharactersCharacterIdOrders200Ok.regionId) &&
        Objects.equals(this.state, getCharactersCharacterIdOrders200Ok.state) &&
        Objects.equals(this.typeId, getCharactersCharacterIdOrders200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getCharactersCharacterIdOrders200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getCharactersCharacterIdOrders200Ok.volumeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, duration, escrow, isBuyOrder, isCorp, issued, locationId, minVolume, orderId, price, range, regionId, state, typeId, volumeRemain, volumeTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOrders200Ok {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
    sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
    sb.append("    isCorp: ").append(toIndentedString(isCorp)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
    sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
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

