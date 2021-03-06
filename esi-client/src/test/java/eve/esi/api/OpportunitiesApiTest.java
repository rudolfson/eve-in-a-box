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
import eve.esi.model.GetCharactersCharacterIdOpportunities200Ok;
import eve.esi.model.GetOpportunitiesGroupsGroupIdOk;
import eve.esi.model.GetOpportunitiesTasksTaskIdOk;
import eve.esi.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunitiesApi
 */
@Ignore
public class OpportunitiesApiTest {

    private final OpportunitiesApi api = new OpportunitiesApi();

    
    /**
     * Get a character&#39;s completed tasks
     *
     * Return a list of tasks finished by a character  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOpportunitiesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdOpportunities200Ok> response = api.getCharactersCharacterIdOpportunities(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities groups
     *
     * Return a list of opportunities groups  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getOpportunitiesGroups(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities group
     *
     * Return information of an opportunities group  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsGroupIdTest() throws ApiException {
        Integer groupId = null;
        String datasource = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetOpportunitiesGroupsGroupIdOk response = api.getOpportunitiesGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities tasks
     *
     * Return a list of opportunities tasks  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getOpportunitiesTasks(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get opportunities task
     *
     * Return information of an opportunities task  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTaskIdTest() throws ApiException {
        Integer taskId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetOpportunitiesTasksTaskIdOk response = api.getOpportunitiesTasksTaskId(taskId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
