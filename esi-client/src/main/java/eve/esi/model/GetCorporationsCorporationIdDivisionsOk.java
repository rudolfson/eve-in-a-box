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
import eve.esi.model.GetCorporationsCorporationIdDivisionsHangar;
import eve.esi.model.GetCorporationsCorporationIdDivisionsWallet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:23:53.613Z")
public class GetCorporationsCorporationIdDivisionsOk {
  @SerializedName("hangar")
  private List<GetCorporationsCorporationIdDivisionsHangar> hangar = null;

  @SerializedName("wallet")
  private List<GetCorporationsCorporationIdDivisionsWallet> wallet = null;

  public GetCorporationsCorporationIdDivisionsOk hangar(List<GetCorporationsCorporationIdDivisionsHangar> hangar) {
    this.hangar = hangar;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addHangarItem(GetCorporationsCorporationIdDivisionsHangar hangarItem) {
    if (this.hangar == null) {
      this.hangar = new ArrayList<GetCorporationsCorporationIdDivisionsHangar>();
    }
    this.hangar.add(hangarItem);
    return this;
  }

   /**
   * hangar array
   * @return hangar
  **/
  @ApiModelProperty(value = "hangar array")
  public List<GetCorporationsCorporationIdDivisionsHangar> getHangar() {
    return hangar;
  }

  public void setHangar(List<GetCorporationsCorporationIdDivisionsHangar> hangar) {
    this.hangar = hangar;
  }

  public GetCorporationsCorporationIdDivisionsOk wallet(List<GetCorporationsCorporationIdDivisionsWallet> wallet) {
    this.wallet = wallet;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addWalletItem(GetCorporationsCorporationIdDivisionsWallet walletItem) {
    if (this.wallet == null) {
      this.wallet = new ArrayList<GetCorporationsCorporationIdDivisionsWallet>();
    }
    this.wallet.add(walletItem);
    return this;
  }

   /**
   * wallet array
   * @return wallet
  **/
  @ApiModelProperty(value = "wallet array")
  public List<GetCorporationsCorporationIdDivisionsWallet> getWallet() {
    return wallet;
  }

  public void setWallet(List<GetCorporationsCorporationIdDivisionsWallet> wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisionsOk = (GetCorporationsCorporationIdDivisionsOk) o;
    return Objects.equals(this.hangar, getCorporationsCorporationIdDivisionsOk.hangar) &&
        Objects.equals(this.wallet, getCorporationsCorporationIdDivisionsOk.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hangar, wallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsOk {\n");
    
    sb.append("    hangar: ").append(toIndentedString(hangar)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

