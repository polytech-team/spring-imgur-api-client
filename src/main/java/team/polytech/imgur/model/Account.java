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
import team.polytech.imgur.model.AccountUserFollow;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Account
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_AVATAR,
  Account.JSON_PROPERTY_BIO,
  Account.JSON_PROPERTY_CREATED,
  Account.JSON_PROPERTY_ID,
  Account.JSON_PROPERTY_PRO_EXPIRATION,
  Account.JSON_PROPERTY_REPUTATION_NAME,
  Account.JSON_PROPERTY_REPUTATION,
  Account.JSON_PROPERTY_URL,
  Account.JSON_PROPERTY_USER_FOLLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-26T20:01:36.060885+03:00[Europe/Moscow]")
public class Account {
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private String avatar;

  public static final String JSON_PROPERTY_BIO = "bio";
  private String bio;

  public static final String JSON_PROPERTY_CREATED = "created";
  private Integer created;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PRO_EXPIRATION = "pro_expiration";
  private Boolean proExpiration;

  public static final String JSON_PROPERTY_REPUTATION_NAME = "reputation_name";
  private String reputationName;

  public static final String JSON_PROPERTY_REPUTATION = "reputation";
  private Integer reputation;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USER_FOLLOW = "user_follow";
  private AccountUserFollow userFollow;

  public Account() {
  }

  public Account avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public Account bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBio() {
    return bio;
  }


  @JsonProperty(JSON_PROPERTY_BIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBio(String bio) {
    this.bio = bio;
  }


  public Account created(Integer created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(Integer created) {
    this.created = created;
  }


  public Account id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Account proExpiration(Boolean proExpiration) {
    
    this.proExpiration = proExpiration;
    return this;
  }

   /**
   * Get proExpiration
   * @return proExpiration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRO_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getProExpiration() {
    return proExpiration;
  }


  @JsonProperty(JSON_PROPERTY_PRO_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProExpiration(Boolean proExpiration) {
    this.proExpiration = proExpiration;
  }


  public Account reputationName(String reputationName) {
    
    this.reputationName = reputationName;
    return this;
  }

   /**
   * Get reputationName
   * @return reputationName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPUTATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReputationName() {
    return reputationName;
  }


  @JsonProperty(JSON_PROPERTY_REPUTATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReputationName(String reputationName) {
    this.reputationName = reputationName;
  }


  public Account reputation(Integer reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * Get reputation
   * @return reputation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPUTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getReputation() {
    return reputation;
  }


  @JsonProperty(JSON_PROPERTY_REPUTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReputation(Integer reputation) {
    this.reputation = reputation;
  }


  public Account url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Account userFollow(AccountUserFollow userFollow) {
    
    this.userFollow = userFollow;
    return this;
  }

   /**
   * Get userFollow
   * @return userFollow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_FOLLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountUserFollow getUserFollow() {
    return userFollow;
  }


  @JsonProperty(JSON_PROPERTY_USER_FOLLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserFollow(AccountUserFollow userFollow) {
    this.userFollow = userFollow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.avatar, account.avatar) &&
        Objects.equals(this.bio, account.bio) &&
        Objects.equals(this.created, account.created) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.proExpiration, account.proExpiration) &&
        Objects.equals(this.reputationName, account.reputationName) &&
        Objects.equals(this.reputation, account.reputation) &&
        Objects.equals(this.url, account.url) &&
        Objects.equals(this.userFollow, account.userFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, bio, created, id, proExpiration, reputationName, reputation, url, userFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proExpiration: ").append(toIndentedString(proExpiration)).append("\n");
    sb.append("    reputationName: ").append(toIndentedString(reputationName)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userFollow: ").append(toIndentedString(userFollow)).append("\n");
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

