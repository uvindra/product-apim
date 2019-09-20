/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wso2.am.integration.clients.store.api.v1.dto.APIBusinessInformationDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.APIEndpointURLsDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.LabelDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ScopeInfoDTO;

/**
 * APIDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T19:19:28.212+05:30")
public class APIDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("wsdlUri")
  private String wsdlUri = null;

  @SerializedName("lifeCycleStatus")
  private String lifeCycleStatus = null;

  @SerializedName("isDefaultVersion")
  private Boolean isDefaultVersion = null;

  @SerializedName("transport")
  private List<String> transport = null;

  @SerializedName("authorizationHeader")
  private String authorizationHeader = null;

  @SerializedName("securityScheme")
  private List<String> securityScheme = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("tiers")
  private List<String> tiers = null;

  @SerializedName("hasThumbnail")
  private Boolean hasThumbnail = false;

  @SerializedName("additionalProperties")
  private Map<String, String> additionalProperties = null;

  @SerializedName("endpointURLs")
  private List<APIEndpointURLsDTO> endpointURLs = null;

  @SerializedName("businessInformation")
  private APIBusinessInformationDTO businessInformation = null;

  @SerializedName("labels")
  private List<LabelDTO> labels = null;

  @SerializedName("environmentList")
  private List<String> environmentList = null;

  @SerializedName("scopes")
  private List<ScopeInfoDTO> scopes = null;

  public APIDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public APIDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "Name of the API")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description about the API
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "A brief description about the API")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * A string that represents thecontext of the user&#39;s request
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "A string that represents thecontext of the user's request")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the API
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "The version of the API")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public APIDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given user invoking the api will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", required = true, value = "If the provider value is not given user invoking the api will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIDTO wsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
    return this;
  }

   /**
   * WSDL URL if the API is based on a WSDL endpoint 
   * @return wsdlUri
  **/
  @ApiModelProperty(example = "http://www.webservicex.com/globalweather.asmx?wsdl", value = "WSDL URL if the API is based on a WSDL endpoint ")
  public String getWsdlUri() {
    return wsdlUri;
  }

  public void setWsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
  }

  public APIDTO lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * This describes in which status of the lifecycle the API is.
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(example = "PUBLISHED", required = true, value = "This describes in which status of the lifecycle the API is.")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public APIDTO isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Get isDefaultVersion
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public APIDTO transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public APIDTO addTransportItem(String transportItem) {
    if (this.transport == null) {
      this.transport = new ArrayList<>();
    }
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @ApiModelProperty(example = "[\"http\",\"https\"]", value = "")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public APIDTO authorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
    return this;
  }

   /**
   * Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. 
   * @return authorizationHeader
  **/
  @ApiModelProperty(value = "Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. ")
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }

  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }

  public APIDTO securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public APIDTO addSecuritySchemeItem(String securitySchemeItem) {
    if (this.securityScheme == null) {
      this.securityScheme = new ArrayList<>();
    }
    this.securityScheme.add(securitySchemeItem);
    return this;
  }

   /**
   * Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. 
   * @return securityScheme
  **/
  @ApiModelProperty(value = "Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. ")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }

  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
  }

  public APIDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public APIDTO addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Search keywords related to the API
   * @return tags
  **/
  @ApiModelProperty(example = "[\"substract\",\"add\"]", value = "Search keywords related to the API")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public APIDTO tiers(List<String> tiers) {
    this.tiers = tiers;
    return this;
  }

  public APIDTO addTiersItem(String tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * The subscription tiers selected for the particular API
   * @return tiers
  **/
  @ApiModelProperty(example = "[\"Unlimited\"]", value = "The subscription tiers selected for the particular API")
  public List<String> getTiers() {
    return tiers;
  }

  public void setTiers(List<String> tiers) {
    this.tiers = tiers;
  }

  public APIDTO hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

   /**
   * Get hasThumbnail
   * @return hasThumbnail
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasThumbnail() {
    return hasThumbnail;
  }

  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  public APIDTO additionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public APIDTO putAdditionalPropertiesItem(String key, String additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Custom(user defined) properties of API 
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "{}", value = "Custom(user defined) properties of API ")
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public APIDTO endpointURLs(List<APIEndpointURLsDTO> endpointURLs) {
    this.endpointURLs = endpointURLs;
    return this;
  }

  public APIDTO addEndpointURLsItem(APIEndpointURLsDTO endpointURLsItem) {
    if (this.endpointURLs == null) {
      this.endpointURLs = new ArrayList<>();
    }
    this.endpointURLs.add(endpointURLsItem);
    return this;
  }

   /**
   * Get endpointURLs
   * @return endpointURLs
  **/
  @ApiModelProperty(value = "")
  public List<APIEndpointURLsDTO> getEndpointURLs() {
    return endpointURLs;
  }

  public void setEndpointURLs(List<APIEndpointURLsDTO> endpointURLs) {
    this.endpointURLs = endpointURLs;
  }

  public APIDTO businessInformation(APIBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

   /**
   * Get businessInformation
   * @return businessInformation
  **/
  @ApiModelProperty(value = "")
  public APIBusinessInformationDTO getBusinessInformation() {
    return businessInformation;
  }

  public void setBusinessInformation(APIBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
  }

  public APIDTO labels(List<LabelDTO> labels) {
    this.labels = labels;
    return this;
  }

  public APIDTO addLabelsItem(LabelDTO labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels of micro-gateway environments attached to the API. 
   * @return labels
  **/
  @ApiModelProperty(value = "Labels of micro-gateway environments attached to the API. ")
  public List<LabelDTO> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelDTO> labels) {
    this.labels = labels;
  }

  public APIDTO environmentList(List<String> environmentList) {
    this.environmentList = environmentList;
    return this;
  }

  public APIDTO addEnvironmentListItem(String environmentListItem) {
    if (this.environmentList == null) {
      this.environmentList = new ArrayList<>();
    }
    this.environmentList.add(environmentListItem);
    return this;
  }

   /**
   * The environment list configured with non empty endpoint URLs for the particular API.
   * @return environmentList
  **/
  @ApiModelProperty(example = "[\"PRODUCTION\",\"SANDBOX\"]", value = "The environment list configured with non empty endpoint URLs for the particular API.")
  public List<String> getEnvironmentList() {
    return environmentList;
  }

  public void setEnvironmentList(List<String> environmentList) {
    this.environmentList = environmentList;
  }

  public APIDTO scopes(List<ScopeInfoDTO> scopes) {
    this.scopes = scopes;
    return this;
  }

  public APIDTO addScopesItem(ScopeInfoDTO scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public List<ScopeInfoDTO> getScopes() {
    return scopes;
  }

  public void setScopes(List<ScopeInfoDTO> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIDTO API = (APIDTO) o;
    return Objects.equals(this.id, API.id) &&
        Objects.equals(this.name, API.name) &&
        Objects.equals(this.description, API.description) &&
        Objects.equals(this.context, API.context) &&
        Objects.equals(this.version, API.version) &&
        Objects.equals(this.provider, API.provider) &&
        Objects.equals(this.wsdlUri, API.wsdlUri) &&
        Objects.equals(this.lifeCycleStatus, API.lifeCycleStatus) &&
        Objects.equals(this.isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(this.transport, API.transport) &&
        Objects.equals(this.authorizationHeader, API.authorizationHeader) &&
        Objects.equals(this.securityScheme, API.securityScheme) &&
        Objects.equals(this.tags, API.tags) &&
        Objects.equals(this.tiers, API.tiers) &&
        Objects.equals(this.hasThumbnail, API.hasThumbnail) &&
        Objects.equals(this.additionalProperties, API.additionalProperties) &&
        Objects.equals(this.endpointURLs, API.endpointURLs) &&
        Objects.equals(this.businessInformation, API.businessInformation) &&
        Objects.equals(this.labels, API.labels) &&
        Objects.equals(this.environmentList, API.environmentList) &&
        Objects.equals(this.scopes, API.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, wsdlUri, lifeCycleStatus, isDefaultVersion, transport, authorizationHeader, securityScheme, tags, tiers, hasThumbnail, additionalProperties, endpointURLs, businessInformation, labels, environmentList, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    wsdlUri: ").append(toIndentedString(wsdlUri)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    endpointURLs: ").append(toIndentedString(endpointURLs)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    environmentList: ").append(toIndentedString(environmentList)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

