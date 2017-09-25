# AssetsApi

All URIs are relative to *https://esi.tech.ccp.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdAssets**](AssetsApi.md#getCharactersCharacterIdAssets) | **GET** /v1/characters/{character_id}/assets/ | Get character assets
[**getCorporationsCorporationIdAssets**](AssetsApi.md#getCorporationsCorporationIdAssets) | **GET** /v1/corporations/{corporation_id}/assets/ | Get corporation assets


<a name="getCharactersCharacterIdAssets"></a>
# **getCharactersCharacterIdAssets**
> List&lt;GetCharactersCharacterIdAssets200Ok&gt; getCharactersCharacterIdAssets(characterId, datasource, page, token, userAgent, xUserAgent)

Get character assets

Return a list of the characters assets  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiClient;
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.invoke.Configuration;
//import de.inventoris.eve.esi.invoke.auth.*;
//import de.inventoris.eve.esi.api.AssetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

AssetsApi apiInstance = new AssetsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdAssets200Ok> result = apiInstance.getCharactersCharacterIdAssets(characterId, datasource, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getCharactersCharacterIdAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdAssets200Ok&gt;**](GetCharactersCharacterIdAssets200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdAssets"></a>
# **getCorporationsCorporationIdAssets**
> List&lt;GetCorporationsCorporationIdAssets200Ok&gt; getCorporationsCorporationIdAssets(corporationId, datasource, page, token, userAgent, xUserAgent)

Get corporation assets

Return a list of the corporation assets  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiClient;
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.invoke.Configuration;
//import de.inventoris.eve.esi.invoke.auth.*;
//import de.inventoris.eve.esi.api.AssetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

AssetsApi apiInstance = new AssetsApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdAssets200Ok> result = apiInstance.getCorporationsCorporationIdAssets(corporationId, datasource, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getCorporationsCorporationIdAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdAssets200Ok&gt;**](GetCorporationsCorporationIdAssets200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

