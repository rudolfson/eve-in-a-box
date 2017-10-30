# MarketstatApi

All URIs are relative to *https://api.evemarketer.com/ec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketstatGet**](MarketstatApi.md#marketstatGet) | **GET** /marketstat | XML Marketstat
[**marketstatJsonGet**](MarketstatApi.md#marketstatJsonGet) | **GET** /marketstat/json | JSON Marketstat


<a name="marketstatGet"></a>
# **marketstatGet**
> ExecAPI marketstatGet(typeid, regionlimit, usesystem)

XML Marketstat

### Example
```java
// Import classes:
//import marketer.invoke.ApiException;
//import marketer.api.MarketstatApi;


MarketstatApi apiInstance = new MarketstatApi();
List<Integer> typeid = Arrays.asList(56); // List<Integer> | TypeID. Multiple TypeIDs can be specified in the following format (max 200): typeid=34&typeid=35 or typeid=34,35 
Integer regionlimit = 56; // Integer | Limit the statistics to a single region.
Integer usesystem = 56; // Integer | Limit the statistics to a single solar system.
try {
    ExecAPI result = apiInstance.marketstatGet(typeid, regionlimit, usesystem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketstatApi#marketstatGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeid** | [**List&lt;Integer&gt;**](Integer.md)| TypeID. Multiple TypeIDs can be specified in the following format (max 200): typeid&#x3D;34&amp;typeid&#x3D;35 or typeid&#x3D;34,35  |
 **regionlimit** | **Integer**| Limit the statistics to a single region. | [optional]
 **usesystem** | **Integer**| Limit the statistics to a single solar system. | [optional]

### Return type

[**ExecAPI**](ExecAPI.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

<a name="marketstatJsonGet"></a>
# **marketstatJsonGet**
> List&lt;Type&gt; marketstatJsonGet(typeid, regionlimit, usesystem)

JSON Marketstat

### Example
```java
// Import classes:
//import marketer.invoke.ApiException;
//import marketer.api.MarketstatApi;


MarketstatApi apiInstance = new MarketstatApi();
List<Integer> typeid = Arrays.asList(56); // List<Integer> | TypeID. Multiple TypeIDs can be specified in the following format (max 200): typeid=34&typeid=35 or typeid=34,35 
Integer regionlimit = 56; // Integer | Limit the statistics to a single region.
Integer usesystem = 56; // Integer | Limit the statistics to a single region.
try {
    List<Type> result = apiInstance.marketstatJsonGet(typeid, regionlimit, usesystem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketstatApi#marketstatJsonGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeid** | [**List&lt;Integer&gt;**](Integer.md)| TypeID. Multiple TypeIDs can be specified in the following format (max 200): typeid&#x3D;34&amp;typeid&#x3D;35 or typeid&#x3D;34,35  |
 **regionlimit** | **Integer**| Limit the statistics to a single region. | [optional]
 **usesystem** | **Integer**| Limit the statistics to a single region. | [optional]

### Return type

[**List&lt;Type&gt;**](Type.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

