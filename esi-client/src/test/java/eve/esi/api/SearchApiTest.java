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
import eve.esi.model.GetCharactersCharacterIdSearchOk;
import eve.esi.model.GetSearchOk;
import eve.esi.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search on a string
     *
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdSearchTest() throws ApiException {
        List<String> categories = null;
        Integer characterId = null;
        String search = null;
        String datasource = null;
        String language = null;
        Boolean strict = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCharactersCharacterIdSearchOk response = api.getCharactersCharacterIdSearch(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Search on a string
     *
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchTest() throws ApiException {
        List<String> categories = null;
        String search = null;
        String datasource = null;
        String language = null;
        Boolean strict = null;
        String userAgent = null;
        String xUserAgent = null;
        GetSearchOk response = api.getSearch(categories, search, datasource, language, strict, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
