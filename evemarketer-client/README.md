# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import marketer.invoke.*;
import marketer.invoke.auth.*;
import marketer.model.*;
import marketer.api.MarketstatApi;

import java.io.File;
import java.util.*;

public class MarketstatApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.evemarketer.com/ec*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MarketstatApi* | [**marketstatGet**](docs/MarketstatApi.md#marketstatGet) | **GET** /marketstat | XML Marketstat
*MarketstatApi* | [**marketstatJsonGet**](docs/MarketstatApi.md#marketstatJsonGet) | **GET** /marketstat/json | JSON Marketstat


## Documentation for Models

 - [ExecAPI](docs/ExecAPI.md)
 - [ForQuery](docs/ForQuery.md)
 - [MarketStatXML](docs/MarketStatXML.md)
 - [MarketStatXMLInner](docs/MarketStatXMLInner.md)
 - [Type](docs/Type.md)
 - [TypeStat](docs/TypeStat.md)
 - [TypeStatXML](docs/TypeStatXML.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



