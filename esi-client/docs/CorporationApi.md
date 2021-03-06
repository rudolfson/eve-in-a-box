# CorporationApi

All URIs are relative to *https://esi.tech.ccp.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporationsCorporationId**](CorporationApi.md#getCorporationsCorporationId) | **GET** /v3/corporations/{corporation_id}/ | Get corporation information
[**getCorporationsCorporationIdAlliancehistory**](CorporationApi.md#getCorporationsCorporationIdAlliancehistory) | **GET** /v2/corporations/{corporation_id}/alliancehistory/ | Get alliance history
[**getCorporationsCorporationIdBlueprints**](CorporationApi.md#getCorporationsCorporationIdBlueprints) | **GET** /v1/corporations/{corporation_id}/blueprints/ | Get corporation blueprints
[**getCorporationsCorporationIdDivisions**](CorporationApi.md#getCorporationsCorporationIdDivisions) | **GET** /v1/corporations/{corporation_id}/divisions/ | Get corporation divisions
[**getCorporationsCorporationIdIcons**](CorporationApi.md#getCorporationsCorporationIdIcons) | **GET** /v1/corporations/{corporation_id}/icons/ | Get corporation icon
[**getCorporationsCorporationIdMembers**](CorporationApi.md#getCorporationsCorporationIdMembers) | **GET** /v2/corporations/{corporation_id}/members/ | Get corporation members
[**getCorporationsCorporationIdMembersLimit**](CorporationApi.md#getCorporationsCorporationIdMembersLimit) | **GET** /v1/corporations/{corporation_id}/members/limit/ | Get corporation member limit
[**getCorporationsCorporationIdMembertracking**](CorporationApi.md#getCorporationsCorporationIdMembertracking) | **GET** /v1/corporations/{corporation_id}/membertracking/ | Track corporation members
[**getCorporationsCorporationIdRoles**](CorporationApi.md#getCorporationsCorporationIdRoles) | **GET** /v1/corporations/{corporation_id}/roles/ | Get corporation member roles
[**getCorporationsCorporationIdStructures**](CorporationApi.md#getCorporationsCorporationIdStructures) | **GET** /v1/corporations/{corporation_id}/structures/ | Get corporation structures
[**getCorporationsCorporationIdTitles**](CorporationApi.md#getCorporationsCorporationIdTitles) | **GET** /v1/corporations/{corporation_id}/titles/ | Get corporation titles
[**getCorporationsNames**](CorporationApi.md#getCorporationsNames) | **GET** /v1/corporations/names/ | Get corporation names
[**getCorporationsNpccorps**](CorporationApi.md#getCorporationsNpccorps) | **GET** /v1/corporations/npccorps/ | Get npc corporations
[**putCorporationsCorporationIdStructuresStructureId**](CorporationApi.md#putCorporationsCorporationIdStructuresStructureId) | **PUT** /v1/corporations/{corporation_id}/structures/{structure_id}/ | Update structure vulnerability schedule


<a name="getCorporationsCorporationId"></a>
# **getCorporationsCorporationId**
> GetCorporationsCorporationIdOk getCorporationsCorporationId(corporationId, datasource, userAgent, xUserAgent)

Get corporation information

Public information about a corporation  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiException;
//import eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdOk result = apiInstance.getCorporationsCorporationId(corporationId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdOk**](GetCorporationsCorporationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdAlliancehistory"></a>
# **getCorporationsCorporationIdAlliancehistory**
> List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt; getCorporationsCorporationIdAlliancehistory(corporationId, datasource, userAgent, xUserAgent)

Get alliance history

Get a list of all the alliances a corporation has been a member of  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiException;
//import eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdAlliancehistory200Ok> result = apiInstance.getCorporationsCorporationIdAlliancehistory(corporationId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdAlliancehistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;**](GetCorporationsCorporationIdAlliancehistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdBlueprints"></a>
# **getCorporationsCorporationIdBlueprints**
> List&lt;GetCorporationsCorporationIdBlueprints200Ok&gt; getCorporationsCorporationIdBlueprints(corporationId, datasource, page, token, userAgent, xUserAgent)

Get corporation blueprints

Returns a list of blueprints the corporation owns  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdBlueprints200Ok> result = apiInstance.getCorporationsCorporationIdBlueprints(corporationId, datasource, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdBlueprints");
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

[**List&lt;GetCorporationsCorporationIdBlueprints200Ok&gt;**](GetCorporationsCorporationIdBlueprints200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdDivisions"></a>
# **getCorporationsCorporationIdDivisions**
> GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisions(corporationId, datasource, token, userAgent, xUserAgent)

Get corporation divisions

Return corporation hangar and wallet division names, only show if a division is not using the default name  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdDivisionsOk result = apiInstance.getCorporationsCorporationIdDivisions(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdDivisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdDivisionsOk**](GetCorporationsCorporationIdDivisionsOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdIcons"></a>
# **getCorporationsCorporationIdIcons**
> GetCorporationsCorporationIdIconsOk getCorporationsCorporationIdIcons(corporationId, datasource, userAgent, xUserAgent)

Get corporation icon

Get the icon urls for a corporation  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiException;
//import eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdIconsOk result = apiInstance.getCorporationsCorporationIdIcons(corporationId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdIcons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdIconsOk**](GetCorporationsCorporationIdIconsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembers"></a>
# **getCorporationsCorporationIdMembers**
> List&lt;GetCorporationsCorporationIdMembers200Ok&gt; getCorporationsCorporationIdMembers(corporationId, datasource, token, userAgent, xUserAgent)

Get corporation members

Read the current list of members if the calling character is a member.  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMembers200Ok> result = apiInstance.getCorporationsCorporationIdMembers(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMembers200Ok&gt;**](GetCorporationsCorporationIdMembers200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembersLimit"></a>
# **getCorporationsCorporationIdMembersLimit**
> Integer getCorporationsCorporationIdMembersLimit(corporationId, datasource, token, userAgent, xUserAgent)

Get corporation member limit

Return a corporation&#39;s member limit, not including CEO himself  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    Integer result = apiInstance.getCorporationsCorporationIdMembersLimit(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembersLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**Integer**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembertracking"></a>
# **getCorporationsCorporationIdMembertracking**
> List&lt;GetCorporationsCorporationIdMembertracking200Ok&gt; getCorporationsCorporationIdMembertracking(corporationId, datasource, token, userAgent, xUserAgent)

Track corporation members

Returns additional information about a corporation&#39;s members which helps tracking their activities  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMembertracking200Ok> result = apiInstance.getCorporationsCorporationIdMembertracking(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembertracking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMembertracking200Ok&gt;**](GetCorporationsCorporationIdMembertracking200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdRoles"></a>
# **getCorporationsCorporationIdRoles**
> List&lt;GetCorporationsCorporationIdRoles200Ok&gt; getCorporationsCorporationIdRoles(corporationId, datasource, token, userAgent, xUserAgent)

Get corporation member roles

Return the roles of all members if the character has the personnel manager role or any grantable role.  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdRoles200Ok> result = apiInstance.getCorporationsCorporationIdRoles(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdRoles200Ok&gt;**](GetCorporationsCorporationIdRoles200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStructures"></a>
# **getCorporationsCorporationIdStructures**
> List&lt;GetCorporationsCorporationIdStructures200Ok&gt; getCorporationsCorporationIdStructures(corporationId, datasource, language, page, token, userAgent, xUserAgent)

Get corporation structures

Get a list of corporation structures  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdStructures200Ok> result = apiInstance.getCorporationsCorporationIdStructures(corporationId, datasource, language, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdStructures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdStructures200Ok&gt;**](GetCorporationsCorporationIdStructures200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdTitles"></a>
# **getCorporationsCorporationIdTitles**
> List&lt;GetCorporationsCorporationIdTitles200Ok&gt; getCorporationsCorporationIdTitles(corporationId, datasource, token, userAgent, xUserAgent)

Get corporation titles

Returns a corporation&#39;s titles  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdTitles200Ok> result = apiInstance.getCorporationsCorporationIdTitles(corporationId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdTitles200Ok&gt;**](GetCorporationsCorporationIdTitles200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsNames"></a>
# **getCorporationsNames**
> List&lt;GetCorporationsNames200Ok&gt; getCorporationsNames(corporationIds, datasource, userAgent, xUserAgent)

Get corporation names

Resolve a set of corporation IDs to corporation names  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiException;
//import eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
List<Long> corporationIds = Arrays.asList(56L); // List<Long> | A comma separated list of corporation IDs
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsNames200Ok> result = apiInstance.getCorporationsNames(corporationIds, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationIds** | [**List&lt;Long&gt;**](Long.md)| A comma separated list of corporation IDs |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsNames200Ok&gt;**](GetCorporationsNames200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsNpccorps"></a>
# **getCorporationsNpccorps**
> List&lt;Integer&gt; getCorporationsNpccorps(datasource, userAgent, xUserAgent)

Get npc corporations

Get a list of npc corporations  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiException;
//import eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getCorporationsNpccorps(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsNpccorps");
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

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCorporationsCorporationIdStructuresStructureId"></a>
# **putCorporationsCorporationIdStructuresStructureId**
> putCorporationsCorporationIdStructuresStructureId(corporationId, newSchedule, structureId, datasource, token, userAgent, xUserAgent)

Update structure vulnerability schedule

Update the vulnerability window schedule of a corporation structure  --- 

### Example
```java
// Import classes:
//import eve.esi.invoke.ApiClient;
//import eve.esi.invoke.ApiException;
//import eve.esi.invoke.Configuration;
//import eve.esi.invoke.auth.*;
//import eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> newSchedule = Arrays.asList(new PutCorporationsCorporationIdStructuresStructureIdNewSchedule()); // List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> | New vulnerability window schedule for the structure
Long structureId = 789L; // Long | A structure ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.putCorporationsCorporationIdStructuresStructureId(corporationId, newSchedule, structureId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#putCorporationsCorporationIdStructuresStructureId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **newSchedule** | [**List&lt;PutCorporationsCorporationIdStructuresStructureIdNewSchedule&gt;**](PutCorporationsCorporationIdStructuresStructureIdNewSchedule.md)| New vulnerability window schedule for the structure |
 **structureId** | **Long**| A structure ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

