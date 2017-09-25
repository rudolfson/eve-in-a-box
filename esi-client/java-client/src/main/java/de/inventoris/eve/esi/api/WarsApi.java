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


import de.inventoris.eve.esi.model.GetWarsWarIdKillmails200Ok;
import de.inventoris.eve.esi.model.GetWarsWarIdKillmailsUnprocessableEntity;
import de.inventoris.eve.esi.model.GetWarsWarIdOk;
import de.inventoris.eve.esi.model.GetWarsWarIdUnprocessableEntity;
import de.inventoris.eve.esi.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarsApi {
    private ApiClient apiClient;

    public WarsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WarsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getWars
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxWarId Only return wars with ID smaller than this. (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWarsCall(String datasource, Integer maxWarId, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/wars/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (maxWarId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max_war_id", maxWarId));
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWarsValidateBeforeCall(String datasource, Integer maxWarId, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getWarsCall(datasource, maxWarId, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List wars
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxWarId Only return wars with ID smaller than this. (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getWars(String datasource, Integer maxWarId, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getWarsWithHttpInfo(datasource, maxWarId, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List wars
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxWarId Only return wars with ID smaller than this. (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getWarsWithHttpInfo(String datasource, Integer maxWarId, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getWarsValidateBeforeCall(datasource, maxWarId, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List wars (asynchronously)
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxWarId Only return wars with ID smaller than this. (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWarsAsync(String datasource, Integer maxWarId, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWarsValidateBeforeCall(datasource, maxWarId, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWarsWarId
     * @param warId ID for a war (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWarsWarIdCall(Integer warId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/wars/{war_id}/"
            .replaceAll("\\{" + "war_id" + "\\}", apiClient.escapeString(warId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWarsWarIdValidateBeforeCall(Integer warId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'warId' is set
        if (warId == null) {
            throw new ApiException("Missing the required parameter 'warId' when calling getWarsWarId(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getWarsWarIdCall(warId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get war information
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     * @param warId ID for a war (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetWarsWarIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetWarsWarIdOk getWarsWarId(Integer warId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetWarsWarIdOk> resp = getWarsWarIdWithHttpInfo(warId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get war information
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     * @param warId ID for a war (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetWarsWarIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetWarsWarIdOk> getWarsWarIdWithHttpInfo(Integer warId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getWarsWarIdValidateBeforeCall(warId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetWarsWarIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get war information (asynchronously)
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     * @param warId ID for a war (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWarsWarIdAsync(Integer warId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetWarsWarIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWarsWarIdValidateBeforeCall(warId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetWarsWarIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWarsWarIdKillmails
     * @param warId A valid war ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page of results to return (optional, default to 1)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWarsWarIdKillmailsCall(Integer warId, String datasource, Integer page, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/wars/{war_id}/killmails/"
            .replaceAll("\\{" + "war_id" + "\\}", apiClient.escapeString(warId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWarsWarIdKillmailsValidateBeforeCall(Integer warId, String datasource, Integer page, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'warId' is set
        if (warId == null) {
            throw new ApiException("Missing the required parameter 'warId' when calling getWarsWarIdKillmails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getWarsWarIdKillmailsCall(warId, datasource, page, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List kills for a war
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     * @param warId A valid war ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page of results to return (optional, default to 1)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetWarsWarIdKillmails200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetWarsWarIdKillmails200Ok> getWarsWarIdKillmails(Integer warId, String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetWarsWarIdKillmails200Ok>> resp = getWarsWarIdKillmailsWithHttpInfo(warId, datasource, page, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List kills for a war
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     * @param warId A valid war ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page of results to return (optional, default to 1)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetWarsWarIdKillmails200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetWarsWarIdKillmails200Ok>> getWarsWarIdKillmailsWithHttpInfo(Integer warId, String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getWarsWarIdKillmailsValidateBeforeCall(warId, datasource, page, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetWarsWarIdKillmails200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List kills for a war (asynchronously)
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     * @param warId A valid war ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page of results to return (optional, default to 1)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWarsWarIdKillmailsAsync(Integer warId, String datasource, Integer page, String userAgent, String xUserAgent, final ApiCallback<List<GetWarsWarIdKillmails200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWarsWarIdKillmailsValidateBeforeCall(warId, datasource, page, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetWarsWarIdKillmails200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
