package team.polytech.imgur.api;

import team.polytech.imgur.invoker.ImgurApiClient;

import team.polytech.imgur.model.AccessToken;

import java.util.Collections;
import java.util.List;

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
@Component("team.polytech.imgur.api.AuthApi")
public class AuthApi {
    private ImgurApiClient imgurApiClient;

    public AuthApi() {
        this(new ImgurApiClient());
    }

    @Autowired
    public AuthApi(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    public ImgurApiClient getApiClient() {
        return imgurApiClient;
    }

    public void setApiClient(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    /**
     * Generate a new access token from given refresh token.
     * 
     * <p><b>200</b> - Successful operation.
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param grantType  (required)
     * @param refreshToken  (required)
     * @return AccessToken
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccessToken generateAccessToken(String clientId, String clientSecret, String grantType, String refreshToken) throws RestClientException {
        return generateAccessTokenWithHttpInfo(clientId, clientSecret, grantType, refreshToken).getBody();
    }

    /**
     * Generate a new access token from given refresh token.
     * 
     * <p><b>200</b> - Successful operation.
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param grantType  (required)
     * @param refreshToken  (required)
     * @return ResponseEntity&lt;AccessToken&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccessToken> generateAccessTokenWithHttpInfo(String clientId, String clientSecret, String grantType, String refreshToken) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling generateAccessToken");
        }
        
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientSecret' when calling generateAccessToken");
        }
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling generateAccessToken");
        }
        
        // verify the required parameter 'refreshToken' is set
        if (refreshToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refreshToken' when calling generateAccessToken");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (clientId != null)
            localVarFormParams.add("client_id", clientId);
        if (clientSecret != null)
            localVarFormParams.add("client_secret", clientSecret);
        if (grantType != null)
            localVarFormParams.add("grant_type", grantType);
        if (refreshToken != null)
            localVarFormParams.add("refresh_token", refreshToken);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccessToken> localReturnType = new ParameterizedTypeReference<AccessToken>() {};
        return imgurApiClient.invokeAPI("/oauth/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
