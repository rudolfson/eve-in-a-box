# BookmarksApi

All URIs are relative to *https://esi.tech.ccp.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdBookmarks**](BookmarksApi.md#getCharactersCharacterIdBookmarks) | **GET** /v1/characters/{character_id}/bookmarks/ | List bookmarks
[**getCharactersCharacterIdBookmarksFolders**](BookmarksApi.md#getCharactersCharacterIdBookmarksFolders) | **GET** /v1/characters/{character_id}/bookmarks/folders/ | List bookmark folders


<a name="getCharactersCharacterIdBookmarks"></a>
# **getCharactersCharacterIdBookmarks**
> List&lt;GetCharactersCharacterIdBookmarks200Ok&gt; getCharactersCharacterIdBookmarks(characterId, datasource, token, userAgent, xUserAgent)

List bookmarks

List your character&#39;s personal bookmarks  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiClient;
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.invoke.Configuration;
//import de.inventoris.eve.esi.invoke.auth.*;
//import de.inventoris.eve.esi.api.BookmarksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

BookmarksApi apiInstance = new BookmarksApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdBookmarks200Ok> result = apiInstance.getCharactersCharacterIdBookmarks(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookmarksApi#getCharactersCharacterIdBookmarks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdBookmarks200Ok&gt;**](GetCharactersCharacterIdBookmarks200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdBookmarksFolders"></a>
# **getCharactersCharacterIdBookmarksFolders**
> List&lt;GetCharactersCharacterIdBookmarksFolders200Ok&gt; getCharactersCharacterIdBookmarksFolders(characterId, datasource, token, userAgent, xUserAgent)

List bookmark folders

List your character&#39;s personal bookmark folders  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import de.inventoris.eve.esi.invoke.ApiClient;
//import de.inventoris.eve.esi.invoke.ApiException;
//import de.inventoris.eve.esi.invoke.Configuration;
//import de.inventoris.eve.esi.invoke.auth.*;
//import de.inventoris.eve.esi.api.BookmarksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

BookmarksApi apiInstance = new BookmarksApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdBookmarksFolders200Ok> result = apiInstance.getCharactersCharacterIdBookmarksFolders(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookmarksApi#getCharactersCharacterIdBookmarksFolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdBookmarksFolders200Ok&gt;**](GetCharactersCharacterIdBookmarksFolders200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
