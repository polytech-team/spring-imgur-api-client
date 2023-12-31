/*
 * Imgur API
 * Imgur's API exposes the entire Imgur infrastructure via a standardized programmatic interface. Using Imgur's API, you can do just about anything you can do on imgur.com, while using your programming language of choice.
 *
 * The version of the OpenAPI document: 0.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package team.polytech.imgur.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccessToken
 */
@JsonPropertyOrder({
  AccessToken.JSON_PROPERTY_ACCESS_TOKEN,
  AccessToken.JSON_PROPERTY_ACCOUNT_ID,
  AccessToken.JSON_PROPERTY_ACCOUNT_USERNAME,
  AccessToken.JSON_PROPERTY_EXPIRES_IN,
  AccessToken.JSON_PROPERTY_REFRESH_TOKEN,
  AccessToken.JSON_PROPERTY_SCOPE,
  AccessToken.JSON_PROPERTY_TOKEN_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-26T20:01:36.060885+03:00[Europe/Moscow]")
public class AccessToken {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private String accessToken;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private Integer accountId;

  public static final String JSON_PROPERTY_ACCOUNT_USERNAME = "account_username";
  private String accountUsername;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expires_in";
  private Integer expiresIn;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  private String refreshToken;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "token_type";
  private String tokenType;

  public AccessToken() {
  }

  public AccessToken accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public AccessToken accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public AccessToken accountUsername(String accountUsername) {
    
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * Get accountUsername
   * @return accountUsername
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountUsername() {
    return accountUsername;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }


  public AccessToken expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getExpiresIn() {
    return expiresIn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AccessToken refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public AccessToken scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }


  public AccessToken tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenType() {
    return tokenType;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.accountId, accessToken.accountId) &&
        Objects.equals(this.accountUsername, accessToken.accountUsername) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken) &&
        Objects.equals(this.scope, accessToken.scope) &&
        Objects.equals(this.tokenType, accessToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accountId, accountUsername, expiresIn, refreshToken, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

