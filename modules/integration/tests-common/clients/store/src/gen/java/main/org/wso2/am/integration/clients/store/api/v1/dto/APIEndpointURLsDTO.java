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
import org.wso2.am.integration.clients.store.api.v1.dto.APIEnvironmentURLsDTO;

/**
 * APIEndpointURLsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T19:19:28.212+05:30")
public class APIEndpointURLsDTO {
  @SerializedName("environmentName")
  private String environmentName = null;

  @SerializedName("environmentType")
  private String environmentType = null;

  @SerializedName("environmentURLs")
  private APIEnvironmentURLsDTO environmentURLs = null;

  public APIEndpointURLsDTO environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

   /**
   * Get environmentName
   * @return environmentName
  **/
  @ApiModelProperty(example = "Production and Sandbox", value = "")
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public APIEndpointURLsDTO environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

   /**
   * Get environmentType
   * @return environmentType
  **/
  @ApiModelProperty(example = "hybrid", value = "")
  public String getEnvironmentType() {
    return environmentType;
  }

  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  public APIEndpointURLsDTO environmentURLs(APIEnvironmentURLsDTO environmentURLs) {
    this.environmentURLs = environmentURLs;
    return this;
  }

   /**
   * Get environmentURLs
   * @return environmentURLs
  **/
  @ApiModelProperty(value = "")
  public APIEnvironmentURLsDTO getEnvironmentURLs() {
    return environmentURLs;
  }

  public void setEnvironmentURLs(APIEnvironmentURLsDTO environmentURLs) {
    this.environmentURLs = environmentURLs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEndpointURLsDTO apIEndpointURLs = (APIEndpointURLsDTO) o;
    return Objects.equals(this.environmentName, apIEndpointURLs.environmentName) &&
        Objects.equals(this.environmentType, apIEndpointURLs.environmentType) &&
        Objects.equals(this.environmentURLs, apIEndpointURLs.environmentURLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, environmentType, environmentURLs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEndpointURLsDTO {\n");
    
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
    sb.append("    environmentURLs: ").append(toIndentedString(environmentURLs)).append("\n");
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

