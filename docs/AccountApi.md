# AccountApi

All URIs are relative to *https://api.imgur.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccount**](AccountApi.md#getAccount) | **GET** /3/account/{userName} | Get information about an account. |
| [**getAccountImage**](AccountApi.md#getAccountImage) | **GET** /3/account/{userName}/images/{imageHash} | Get an image of an account. |
| [**getAccountImages**](AccountApi.md#getAccountImages) | **GET** /3/account/{userName}/images | Get images of an account. |
| [**getAccountImagesCount**](AccountApi.md#getAccountImagesCount) | **GET** /3/account/{userName}/images/count | Get images count of an account. |



## getAccount

> AccountResponse getAccount(userName)

Get information about an account.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.AccountApi;

public class Example {
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

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userName** | **String**|  | |

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## getAccountImage

> ImageResponse getAccountImage(imageHash, userName)

Get an image of an account.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String imageHash = "imageHash_example"; // String | 
        String userName = "userName_example"; // String | 
        try {
            ImageResponse result = apiInstance.getAccountImage(imageHash, userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccountImage");
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
| **userName** | **String**|  | |

### Return type

[**ImageResponse**](ImageResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## getAccountImages

> AccountImagesResponse getAccountImages(userName)

Get images of an account.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String userName = "userName_example"; // String | 
        try {
            AccountImagesResponse result = apiInstance.getAccountImages(userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccountImages");
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
| **userName** | **String**|  | |

### Return type

[**AccountImagesResponse**](AccountImagesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |


## getAccountImagesCount

> BasicInt32Response getAccountImagesCount(userName)

Get images count of an account.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.auth.*;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        String userName = "userName_example"; // String | 
        try {
            BasicInt32Response result = apiInstance.getAccountImagesCount(userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccountImagesCount");
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
| **userName** | **String**|  | |

### Return type

[**BasicInt32Response**](BasicInt32Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

