# spring-imgur-api-client

Imgur API

- API version: 0.4.0

- Build date: 2023-11-26T20:01:36.060885+03:00[Europe/Moscow]

Imgur's API exposes the entire Imgur infrastructure via a standardized programmatic interface. Using Imgur's API, you can do just about anything you can do on imgur.com, while using your programming language of choice.

Command to generate:
```shell
openapi-generator generate \
-i schema.oas.yml \
--api-package team.polytech.imgur.api \
--model-package team.polytech.imgur.model \
--invoker-package team.polytech.imgur.invoker \
--group-id team.polytech \
--artifact-id spring-imgur-api-client \
--artifact-version 0.0.1 \
-g java \
-p java8=true \
-p generateClientAsBean=true \
--library resttemplate \
-o spring-imgur-api-client
```

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>team.polytech</groupId>
  <artifactId>spring-imgur-api-client</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'spring-imgur-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'spring-imgur-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "team.polytech:spring-imgur-api-client:0.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/spring-imgur-api-client-0.0.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import team.polytech.imgur.invoker.*;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.model.*;
import team.polytech.imgur.api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String userName = "userName_example"; // String | 
        try {
            AccountResponse result = apiInstance.getAccount(userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.imgur.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /3/account/{userName} | Get information about an account.
*AccountApi* | [**getAccountImage**](docs/AccountApi.md#getAccountImage) | **GET** /3/account/{userName}/images/{imageHash} | Get an image of an account.
*AccountApi* | [**getAccountImages**](docs/AccountApi.md#getAccountImages) | **GET** /3/account/{userName}/images | Get images of an account.
*AccountApi* | [**getAccountImagesCount**](docs/AccountApi.md#getAccountImagesCount) | **GET** /3/account/{userName}/images/count | Get images count of an account.
*AuthApi* | [**generateAccessToken**](docs/AuthApi.md#generateAccessToken) | **POST** /oauth/token | Generate a new access token from given refresh token.
*ImageApi* | [**deleteImage**](docs/ImageApi.md#deleteImage) | **DELETE** /3/image/{imageHash} | Delete an image.
*ImageApi* | [**favoriteImage**](docs/ImageApi.md#favoriteImage) | **POST** /3/image/{imageHash}/favorite | Favorite an image.
*ImageApi* | [**getImage**](docs/ImageApi.md#getImage) | **GET** /3/image/{imageHash} | Get information about an image.
*ImageApi* | [**updateImage**](docs/ImageApi.md#updateImage) | **POST** /3/image/{imageHash} | Update an image.
*ImageApi* | [**uploadImage**](docs/ImageApi.md#uploadImage) | **POST** /3/image | Upload an image.


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [Account](docs/Account.md)
 - [AccountImagesResponse](docs/AccountImagesResponse.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountUserFollow](docs/AccountUserFollow.md)
 - [BasicBooleanResponse](docs/BasicBooleanResponse.md)
 - [BasicInt32Response](docs/BasicInt32Response.md)
 - [BasicStringResponse](docs/BasicStringResponse.md)
 - [Image](docs/Image.md)
 - [ImageResponse](docs/ImageResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="clientId"></a>
### clientId


- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="oauth2"></a>
### oauth2


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://api.imgur.com/oauth2/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



