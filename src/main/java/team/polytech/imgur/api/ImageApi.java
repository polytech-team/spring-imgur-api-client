package team.polytech.imgur.api;

import team.polytech.imgur.invoker.ImgurApiClient;

import team.polytech.imgur.model.BasicBooleanResponse;
import team.polytech.imgur.model.BasicStringResponse;
import team.polytech.imgur.model.ImageResponse;

import java.util.Collections;
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
@Component("team.polytech.imgur.api.ImageApi")
public class ImageApi {
    private ImgurApiClient imgurApiClient;

    public ImageApi() {
        this(new ImgurApiClient());
    }

    @Autowired
    public ImageApi(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    public ImgurApiClient getApiClient() {
        return imgurApiClient;
    }

    public void setApiClient(ImgurApiClient imgurApiClient) {
        this.imgurApiClient = imgurApiClient;
    }

    /**
     * Delete an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return BasicBooleanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BasicBooleanResponse deleteImage(String imageHash) throws RestClientException {
        return deleteImageWithHttpInfo(imageHash).getBody();
    }

    /**
     * Delete an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return ResponseEntity&lt;BasicBooleanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BasicBooleanResponse> deleteImageWithHttpInfo(String imageHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageHash' is set
        if (imageHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageHash' when calling deleteImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageHash", imageHash);

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

        String[] localVarAuthNames = new String[] { "clientId", "oauth2" };

        ParameterizedTypeReference<BasicBooleanResponse> localReturnType = new ParameterizedTypeReference<BasicBooleanResponse>() {};
        return imgurApiClient.invokeAPI("/3/image/{imageHash}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Favorite an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return BasicStringResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BasicStringResponse favoriteImage(String imageHash) throws RestClientException {
        return favoriteImageWithHttpInfo(imageHash).getBody();
    }

    /**
     * Favorite an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return ResponseEntity&lt;BasicStringResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BasicStringResponse> favoriteImageWithHttpInfo(String imageHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageHash' is set
        if (imageHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageHash' when calling favoriteImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageHash", imageHash);

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

        ParameterizedTypeReference<BasicStringResponse> localReturnType = new ParameterizedTypeReference<BasicStringResponse>() {};
        return imgurApiClient.invokeAPI("/3/image/{imageHash}/favorite", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return ImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageResponse getImage(String imageHash) throws RestClientException {
        return getImageWithHttpInfo(imageHash).getBody();
    }

    /**
     * Get information about an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @return ResponseEntity&lt;ImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageResponse> getImageWithHttpInfo(String imageHash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageHash' is set
        if (imageHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageHash' when calling getImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageHash", imageHash);

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

        String[] localVarAuthNames = new String[] { "clientId", "oauth2" };

        ParameterizedTypeReference<ImageResponse> localReturnType = new ParameterizedTypeReference<ImageResponse>() {};
        return imgurApiClient.invokeAPI("/3/image/{imageHash}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @param description  (optional)
     * @param title  (optional)
     * @return BasicBooleanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BasicBooleanResponse updateImage(String imageHash, String description, String title) throws RestClientException {
        return updateImageWithHttpInfo(imageHash, description, title).getBody();
    }

    /**
     * Update an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param imageHash  (required)
     * @param description  (optional)
     * @param title  (optional)
     * @return ResponseEntity&lt;BasicBooleanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BasicBooleanResponse> updateImageWithHttpInfo(String imageHash, String description, String title) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageHash' is set
        if (imageHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageHash' when calling updateImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageHash", imageHash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (description != null)
            localVarFormParams.add("description", description);
        if (title != null)
            localVarFormParams.add("title", title);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "clientId", "oauth2" };

        ParameterizedTypeReference<BasicBooleanResponse> localReturnType = new ParameterizedTypeReference<BasicBooleanResponse>() {};
        return imgurApiClient.invokeAPI("/3/image/{imageHash}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param image  (required)
     * @param album  (optional)
     * @param description  (optional)
     * @param name  (optional)
     * @param title  (optional)
     * @return ImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImageResponse uploadImage(String image, String album, String description, String name, String title) throws RestClientException {
        return uploadImageWithHttpInfo(image, album, description, name, title).getBody();
    }

    /**
     * Upload an image.
     * 
     * <p><b>200</b> - Successful operation.
     * @param image  (required)
     * @param album  (optional)
     * @param description  (optional)
     * @param name  (optional)
     * @param title  (optional)
     * @return ResponseEntity&lt;ImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImageResponse> uploadImageWithHttpInfo(String image, String album, String description, String name, String title) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'image' when calling uploadImage");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (album != null)
            localVarFormParams.add("album", album);
        if (description != null)
            localVarFormParams.add("description", description);
        if (image != null)
            localVarFormParams.add("image", image);
        if (name != null)
            localVarFormParams.add("name", name);
        if (title != null)
            localVarFormParams.add("title", title);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = imgurApiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = imgurApiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "clientId", "oauth2" };

        ParameterizedTypeReference<ImageResponse> localReturnType = new ParameterizedTypeReference<ImageResponse>() {};
        return imgurApiClient.invokeAPI("/3/image", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
