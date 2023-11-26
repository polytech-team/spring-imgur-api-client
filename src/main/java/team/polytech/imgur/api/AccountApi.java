package team.polytech.imgur.api;

import team.polytech.imgur.invoker.ImgurApiClient;

import team.polytech.imgur.model.AccountImagesResponse;
import team.polytech.imgur.model.AccountResponse;
import team.polytech.imgur.model.BasicInt32Response;
import team.polytech.imgur.model.ImageResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-26T20:01:36.060885+03:00[Europe/Moscow]")
@Component("team.polytech.imgur.api.AccountApi")
public class AccountApi {
    private ImgurApiClient imgurApiClient;

    public AccountApi() {
        this(new ImgurApiClient());
    }

    @Autowired
    public AccountApi(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    public ImgurApiClient getApiClient() {
        return imgurApiClient;
    }

    public void setApiClient(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    /**
     * Get information about an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return AccountResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountResponse getAccount(String userName) throws RestClientException {
        return getAccountWithHttpInfo(userName).getBody();
    }

    /**
     * Get information about an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return ResponseEntity&lt;AccountResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountResponse> getAccountWithHttpInfo(String userName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userName' is set
        if (userName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userName' when calling getAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userName", userName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AccountResponse> localReturnType = new ParameterizedTypeReference<AccountResponse>() {};
        return imgurApiClient.invokeAPI("/3/account/{userName}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an image of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @param userName  (required)
     * @return ImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageResponse getAccountImage(String imageHash, String userName) throws RestClientException {
        return getAccountImageWithHttpInfo(imageHash, userName).getBody();
    }

    /**
     * Get an image of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @param userName  (required)
     * @return ResponseEntity&lt;ImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageResponse> getAccountImageWithHttpInfo(String imageHash, String userName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageHash' is set
        if (imageHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageHash' when calling getAccountImage");
        }
        
        // verify the required parameter 'userName' is set
        if (userName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userName' when calling getAccountImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageHash", imageHash);
        uriVariables.put("userName", userName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oauth2" };

        ParameterizedTypeReference<ImageResponse> localReturnType = new ParameterizedTypeReference<ImageResponse>() {};
        return imgurApiClient.invokeAPI("/3/account/{userName}/images/{imageHash}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get images of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return AccountImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountImagesResponse getAccountImages(String userName) throws RestClientException {
        return getAccountImagesWithHttpInfo(userName).getBody();
    }

    /**
     * Get images of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return ResponseEntity&lt;AccountImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountImagesResponse> getAccountImagesWithHttpInfo(String userName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userName' is set
        if (userName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userName' when calling getAccountImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userName", userName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AccountImagesResponse> localReturnType = new ParameterizedTypeReference<AccountImagesResponse>() {};
        return imgurApiClient.invokeAPI("/3/account/{userName}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get images count of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return BasicInt32Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BasicInt32Response getAccountImagesCount(String userName) throws RestClientException {
        return getAccountImagesCountWithHttpInfo(userName).getBody();
    }

    /**
     * Get images count of an account.
     * 
     * <p><b>200</b> - Successful operation.
     * @param userName  (required)
     * @return ResponseEntity&lt;BasicInt32Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BasicInt32Response> getAccountImagesCountWithHttpInfo(String userName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userName' is set
        if (userName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userName' when calling getAccountImagesCount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userName", userName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oauth2" };

        ParameterizedTypeReference<BasicInt32Response> localReturnType = new ParameterizedTypeReference<BasicInt32Response>() {};
        return imgurApiClient.invokeAPI("/3/account/{userName}/images/count", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
