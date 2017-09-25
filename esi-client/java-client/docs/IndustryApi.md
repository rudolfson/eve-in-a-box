# IndustryApi

All URIs are relative to *https://esi.tech.ccp.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdIndustryJobs**](IndustryApi.md#getCharactersCharacterIdIndustryJobs) | **GET** /v1/characters/{character_id}/industry/jobs/ | List character industry jobs
[**getIndustryFacilities**](IndustryApi.md#getIndustryFacilities) | **GET** /v1/industry/facilities/ | List industry facilities
[**getIndustrySystems**](IndustryApi.md#getIndustrySystems) | **GET** /v1/industry/systems/ | List solar system cost indices


<a name="getCharactersCharacterIdIndustryJobs"></a>
# **getCharactersCharacterIdIndustryJobs**
> List&lt;GetCharactersCharacterIdIndustryJobs200Ok&gt; getCharactersCharacterIdIndustryJobs(characterId, datasource, includeCompleted, token, userAgent, xUserAgent)

List character industry jobs

List industry jobs placed by a character  ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiClient;
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.invoke.Configuration;
//import de.inventoris.eve.esi.invoke.auth.*;
//import de.inventoris.eve.esi.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
Boolean includeCompleted = true; // Boolean | Whether retrieve completed character industry jobs as well
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdIndustryJobs200Ok> result = apiInstance.getCharactersCharacterIdIndustryJobs(characterId, datasource, includeCompleted, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCharactersCharacterIdIndustryJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **includeCompleted** | **Boolean**| Whether retrieve completed character industry jobs as well | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdIndustryJobs200Ok&gt;**](GetCharactersCharacterIdIndustryJobs200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndustryFacilities"></a>
# **getIndustryFacilities**
> List&lt;GetIndustryFacilities200Ok&gt; getIndustryFacilities(datasource, userAgent, xUserAgent)

List industry facilities

Return a list of industry facilities  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetIndustryFacilities200Ok> result = apiInstance.getIndustryFacilities(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustryFacilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetIndustryFacilities200Ok&gt;**](GetIndustryFacilities200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndustrySystems"></a>
# **getIndustrySystems**
> List&lt;GetIndustrySystems200Ok&gt; getIndustrySystems(datasource, userAgent, xUserAgent)

List solar system cost indices

Return cost indices for solar systems  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetIndustrySystems200Ok> result = apiInstance.getIndustrySystems(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustrySystems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetIndustrySystems200Ok&gt;**](GetIndustrySystems200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

