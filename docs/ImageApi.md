# ImageApi

All URIs are relative to *https://api.imgur.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImage**](ImageApi.md#deleteImage) | **DELETE** /3/image/{imageHash} | Delete an image. |
| [**favoriteImage**](ImageApi.md#favoriteImage) | **POST** /3/image/{imageHash}/favorite | Favorite an image. |
| [**getImage**](ImageApi.md#getImage) | **GET** /3/image/{imageHash} | Get information about an image. |
| [**updateImage**](ImageApi.md#updateImage) | **POST** /3/image/{imageHash} | Update an image. |
| [**uploadImage**](ImageApi.md#uploadImage) | **POST** /3/image | Upload an image. |



## deleteImage

> BasicBooleanResponse deleteImage(imageHash)

Delete an image.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.ImageApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure API key authorization: clientId
        ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
        clientId.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //clientId.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ImageApi apiInstance = new ImageApi(defaultClient);
        String imageHash = "imageHash_example"; // String | 
        try {
            BasicBooleanResponse result = apiInstance.deleteImage(imageHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageApi#deleteImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageHash** | **String**|  | |

### Return type

[**BasicBooleanResponse**](BasicBooleanResponse.md)

### Authorization

[clientId](../README.md#clientId), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## favoriteImage

> BasicStringResponse favoriteImage(imageHash)

Favorite an image.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.ImageApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ImageApi apiInstance = new ImageApi(defaultClient);
        String imageHash = "imageHash_example"; // String | 
        try {
            BasicStringResponse result = apiInstance.favoriteImage(imageHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageApi#favoriteImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageHash** | **String**|  | |

### Return type

[**BasicStringResponse**](BasicStringResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## getImage

> ImageResponse getImage(imageHash)

Get information about an image.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.ImageApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure API key authorization: clientId
        ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
        clientId.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //clientId.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ImageApi apiInstance = new ImageApi(defaultClient);
        String imageHash = "imageHash_example"; // String | 
        try {
            ImageResponse result = apiInstance.getImage(imageHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageApi#getImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageHash** | **String**|  | |

### Return type

[**ImageResponse**](ImageResponse.md)

### Authorization

[clientId](../README.md#clientId), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## updateImage

> BasicBooleanResponse updateImage(imageHash, description, title)

Update an image.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.ImageApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure API key authorization: clientId
        ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
        clientId.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //clientId.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ImageApi apiInstance = new ImageApi(defaultClient);
        String imageHash = "imageHash_example"; // String | 
        String description = "description_example"; // String | 
        String title = "title_example"; // String | 
        try {
            BasicBooleanResponse result = apiInstance.updateImage(imageHash, description, title);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageApi#updateImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageHash** | **String**|  | |
| **description** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |

### Return type

[**BasicBooleanResponse**](BasicBooleanResponse.md)

### Authorization

[clientId](../README.md#clientId), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## uploadImage

> ImageResponse uploadImage(image, album, description, name, title)

Upload an image.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.ImageApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure API key authorization: clientId
        ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
        clientId.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //clientId.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ImageApi apiInstance = new ImageApi(defaultClient);
        String image = "image_example"; // String | 
        String album = "album_example"; // String | 
        String description = "description_example"; // String | 
        String name = "name_example"; // String | 
        String title = "title_example"; // String | 
        try {
            ImageResponse result = apiInstance.uploadImage(image, album, description, name, title);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageApi#uploadImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | **String**|  | |
| **album** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |

### Return type

[**ImageResponse**](ImageResponse.md)

### Authorization

[clientId](../README.md#clientId), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

