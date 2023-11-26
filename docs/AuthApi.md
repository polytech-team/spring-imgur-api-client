# AuthApi

All URIs are relative to *https://api.imgur.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateAccessToken**](AuthApi.md#generateAccessToken) | **POST** /oauth/token | Generate a new access token from given refresh token. |



## generateAccessToken

> AccessToken generateAccessToken(clientId, clientSecret, grantType, refreshToken)

Generate a new access token from given refresh token.

### Example

```java
// Import classes:

import team.polytech.imgur.invoker.ImgurApiClient;
import team.polytech.imgur.invoker.ApiException;
import team.polytech.imgur.invoker.Configuration;
import team.polytech.imgur.invoker.models.*;
import team.polytech.imgur.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ImgurApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imgur.com");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String clientId = "clientId_example"; // String | 
        String clientSecret = "clientSecret_example"; // String | 
        String grantType = "refresh_token"; // String | 
        String refreshToken = "refreshToken_example"; // String | 
        try {
            AccessToken result = apiInstance.generateAccessToken(clientId, clientSecret, grantType, refreshToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#generateAccessToken");
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
| **clientId** | **String**|  | |
| **clientSecret** | **String**|  | |
| **grantType** | **String**|  | [enum: refresh_token] |
| **refreshToken** | **String**|  | |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

