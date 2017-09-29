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


package de.inventoris.eve.esi.api;

import de.inventoris.eve.esi.invoke.ApiException;
import de.inventoris.eve.esi.model.GetIncursions200Ok;
import de.inventoris.eve.esi.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncursionsApi
 */
@Ignore
public class IncursionsApiTest {

    private final IncursionsApi api = new IncursionsApi();

    
    /**
     * List incursions
     *
     * Return a list of current incursions  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncursionsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetIncursions200Ok> response = api.getIncursions(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}