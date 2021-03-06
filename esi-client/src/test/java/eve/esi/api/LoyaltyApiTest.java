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


package eve.esi.api;

import eve.esi.invoke.ApiException;
import eve.esi.model.Forbidden;
import eve.esi.model.GetCharactersCharacterIdLoyaltyPoints200Ok;
import eve.esi.model.GetLoyaltyStoresCorporationIdOffers200Ok;
import eve.esi.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoyaltyApi
 */
@Ignore
public class LoyaltyApiTest {

    private final LoyaltyApi api = new LoyaltyApi();

    
    /**
     * Get loyalty points
     *
     * Return a list of loyalty points for all corporations the character has worked for  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdLoyaltyPointsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdLoyaltyPoints200Ok> response = api.getCharactersCharacterIdLoyaltyPoints(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List loyalty store offers
     *
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyStoresCorporationIdOffersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetLoyaltyStoresCorporationIdOffers200Ok> response = api.getLoyaltyStoresCorporationIdOffers(corporationId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
