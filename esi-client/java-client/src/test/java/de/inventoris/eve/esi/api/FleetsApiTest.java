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
import de.inventoris.eve.esi.model.DeleteFleetsFleetIdMembersMemberIdNotFound;
import de.inventoris.eve.esi.model.DeleteFleetsFleetIdSquadsSquadIdNotFound;
import de.inventoris.eve.esi.model.DeleteFleetsFleetIdWingsWingIdNotFound;
import de.inventoris.eve.esi.model.Forbidden;
import de.inventoris.eve.esi.model.GetFleetsFleetIdMembers200Ok;
import de.inventoris.eve.esi.model.GetFleetsFleetIdMembersNotFound;
import de.inventoris.eve.esi.model.GetFleetsFleetIdNotFound;
import de.inventoris.eve.esi.model.GetFleetsFleetIdOk;
import de.inventoris.eve.esi.model.GetFleetsFleetIdWings200Ok;
import de.inventoris.eve.esi.model.GetFleetsFleetIdWingsNotFound;
import de.inventoris.eve.esi.model.InternalServerError;
import de.inventoris.eve.esi.model.PostFleetsFleetIdMembersInvitation;
import de.inventoris.eve.esi.model.PostFleetsFleetIdMembersNotFound;
import de.inventoris.eve.esi.model.PostFleetsFleetIdMembersUnprocessableEntity;
import de.inventoris.eve.esi.model.PostFleetsFleetIdWingsCreated;
import de.inventoris.eve.esi.model.PostFleetsFleetIdWingsNotFound;
import de.inventoris.eve.esi.model.PostFleetsFleetIdWingsWingIdSquadsCreated;
import de.inventoris.eve.esi.model.PostFleetsFleetIdWingsWingIdSquadsNotFound;
import de.inventoris.eve.esi.model.PutFleetsFleetIdBadRequest;
import de.inventoris.eve.esi.model.PutFleetsFleetIdMembersMemberIdMovement;
import de.inventoris.eve.esi.model.PutFleetsFleetIdMembersMemberIdNotFound;
import de.inventoris.eve.esi.model.PutFleetsFleetIdMembersMemberIdUnprocessableEntity;
import de.inventoris.eve.esi.model.PutFleetsFleetIdNewSettings;
import de.inventoris.eve.esi.model.PutFleetsFleetIdNotFound;
import de.inventoris.eve.esi.model.PutFleetsFleetIdSquadsSquadIdNaming;
import de.inventoris.eve.esi.model.PutFleetsFleetIdSquadsSquadIdNotFound;
import de.inventoris.eve.esi.model.PutFleetsFleetIdWingsWingIdNaming;
import de.inventoris.eve.esi.model.PutFleetsFleetIdWingsWingIdNotFound;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FleetsApi
 */
@Ignore
public class FleetsApiTest {

    private final FleetsApi api = new FleetsApi();

    
    /**
     * Kick fleet member
     *
     * Kick a fleet member  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.deleteFleetsFleetIdMembersMemberId(fleetId, memberId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Delete fleet squad
     *
     * Delete a fleet squad, only empty squads can be deleted  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        Long squadId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.deleteFleetsFleetIdSquadsSquadId(fleetId, squadId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Delete fleet wing
     *
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.deleteFleetsFleetIdWingsWingId(fleetId, wingId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get fleet information
     *
     * Return details about a fleet  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFleetsFleetIdOk response = api.getFleetsFleetId(fleetId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get fleet members
     *
     * Return information about fleet members  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String language = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFleetsFleetIdMembers200Ok> response = api.getFleetsFleetIdMembers(fleetId, datasource, language, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get fleet wings
     *
     * Return information about wings in a fleet  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String language = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFleetsFleetIdWings200Ok> response = api.getFleetsFleetIdWings(fleetId, datasource, language, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Create fleet invitation
     *
     * Invite a character into the fleet, if a character has a CSPA charge set, it is not possible to invite them to the fleet using ESI  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        PostFleetsFleetIdMembersInvitation invitation = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.postFleetsFleetIdMembers(fleetId, invitation, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Create fleet wing
     *
     * Create a new wing in a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        PostFleetsFleetIdWingsCreated response = api.postFleetsFleetIdWings(fleetId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Create fleet squad
     *
     * Create a new squad in a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsWingIdSquadsTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        PostFleetsFleetIdWingsWingIdSquadsCreated response = api.postFleetsFleetIdWingsWingIdSquads(fleetId, wingId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Update fleet
     *
     * Update settings about a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdNewSettings newSettings = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.putFleetsFleetId(fleetId, newSettings, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Move fleet member
     *
     * Move a fleet member around  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        PutFleetsFleetIdMembersMemberIdMovement movement = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.putFleetsFleetIdMembersMemberId(fleetId, memberId, movement, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Rename fleet squad
     *
     * Rename a fleet squad  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdSquadsSquadIdNaming naming = null;
        Long squadId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.putFleetsFleetIdSquadsSquadId(fleetId, naming, squadId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Rename fleet wing
     *
     * Rename a fleet wing  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdWingsWingIdNaming naming = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.putFleetsFleetIdWingsWingId(fleetId, naming, wingId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
