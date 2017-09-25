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

import de.inventoris.eve.esi.invoke.ApiCallback;
import de.inventoris.eve.esi.invoke.ApiClient;
import de.inventoris.eve.esi.invoke.ApiException;
import de.inventoris.eve.esi.invoke.ApiResponse;
import de.inventoris.eve.esi.invoke.Configuration;
import de.inventoris.eve.esi.invoke.Pair;
import de.inventoris.eve.esi.invoke.ProgressRequestBody;
import de.inventoris.eve.esi.invoke.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import de.inventoris.eve.esi.model.Forbidden;
import de.inventoris.eve.esi.model.GetCharactersCharacterIdContracts200Ok;
import de.inventoris.eve.esi.model.GetCharactersCharacterIdContractsContractIdBids200Ok;
import de.inventoris.eve.esi.model.GetCharactersCharacterIdContractsContractIdItems200Ok;
import de.inventoris.eve.esi.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractsApi {
    private ApiClient apiClient;

    public ContractsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdContracts
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/contracts/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdContractsValidateBeforeCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdContracts(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contracts
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdContracts200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdContracts200Ok> getCharactersCharacterIdContracts(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdContracts200Ok>> resp = getCharactersCharacterIdContractsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get contracts
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdContracts200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdContracts200Ok>> getCharactersCharacterIdContractsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsValidateBeforeCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContracts200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contracts (asynchronously)
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdContracts200Ok>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsValidateBeforeCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContracts200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCharactersCharacterIdContractsContractIdBids
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdBidsCall(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/contracts/{contract_id}/bids/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
            .replaceAll("\\{" + "contract_id" + "\\}", apiClient.escapeString(contractId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdBidsValidateBeforeCall(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdContractsContractIdBids(Async)");
        }
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException("Missing the required parameter 'contractId' when calling getCharactersCharacterIdContractsContractIdBids(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdBidsCall(characterId, contractId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contract bids
     * Lists bids on a particular auction contract  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdContractsContractIdBids200Ok> getCharactersCharacterIdContractsContractIdBids(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdContractsContractIdBids200Ok>> resp = getCharactersCharacterIdContractsContractIdBidsWithHttpInfo(characterId, contractId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get contract bids
     * Lists bids on a particular auction contract  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdContractsContractIdBids200Ok>> getCharactersCharacterIdContractsContractIdBidsWithHttpInfo(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdBidsValidateBeforeCall(characterId, contractId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContractsContractIdBids200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contract bids (asynchronously)
     * Lists bids on a particular auction contract  ---  This route is cached for up to 300 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdBidsAsync(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdContractsContractIdBids200Ok>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdBidsValidateBeforeCall(characterId, contractId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContractsContractIdBids200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCharactersCharacterIdContractsContractIdItems
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdItemsCall(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/contracts/{contract_id}/items/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
            .replaceAll("\\{" + "contract_id" + "\\}", apiClient.escapeString(contractId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdItemsValidateBeforeCall(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdContractsContractIdItems(Async)");
        }
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException("Missing the required parameter 'contractId' when calling getCharactersCharacterIdContractsContractIdItems(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdItemsCall(characterId, contractId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contract items
     * Lists Items and details of a particular contract  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdContractsContractIdItems200Ok> getCharactersCharacterIdContractsContractIdItems(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdContractsContractIdItems200Ok>> resp = getCharactersCharacterIdContractsContractIdItemsWithHttpInfo(characterId, contractId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get contract items
     * Lists Items and details of a particular contract  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdContractsContractIdItems200Ok>> getCharactersCharacterIdContractsContractIdItemsWithHttpInfo(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdItemsValidateBeforeCall(characterId, contractId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContractsContractIdItems200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contract items (asynchronously)
     * Lists Items and details of a particular contract  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param contractId ID of a contract (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContractsContractIdItemsAsync(Integer characterId, Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdContractsContractIdItems200Ok>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdContractsContractIdItemsValidateBeforeCall(characterId, contractId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContractsContractIdItems200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
