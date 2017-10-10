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
import eve.esi.model.GetFwLeaderboardsCharactersOk;
import eve.esi.model.GetFwLeaderboardsCorporationsOk;
import eve.esi.model.GetFwLeaderboardsOk;
import eve.esi.model.GetFwStats200Ok;
import eve.esi.model.GetFwSystems200Ok;
import eve.esi.model.GetFwWars200Ok;
import eve.esi.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FactionWarfareApi
 */
@Ignore
public class FactionWarfareApiTest {

    private final FactionWarfareApi api = new FactionWarfareApi();

    
    /**
     * List of the top factions in faction warfare
     *
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsOk response = api.getFwLeaderboards(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List of the top pilots in faction warfare
     *
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCharactersTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsCharactersOk response = api.getFwLeaderboardsCharacters(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List of the top corporations in faction warfare
     *
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCorporationsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsCorporationsOk response = api.getFwLeaderboardsCorporations(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * An overview of statistics about factions involved in faction warfare
     *
     * Statistical overviews of factions involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwStatsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwStats200Ok> response = api.getFwStats(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Ownership of faction warfare systems
     *
     * An overview of the current ownership of faction warfare solar systems  ---  This route is cached for up to 1800 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwSystemsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwSystems200Ok> response = api.getFwSystems(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Data about which NPC factions are at war
     *
     * Data about which NPC factions are at war  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwWarsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwWars200Ok> response = api.getFwWars(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
