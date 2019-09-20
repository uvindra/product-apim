/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ResourcePolicyInfoDTO;

/**
 * ResourcePolicyListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T19:19:21.534+05:30")
public class ResourcePolicyListDTO {
  @SerializedName("list")
  private List<ResourcePolicyInfoDTO> list = null;

  @SerializedName("count")
  private Integer count = null;

  public ResourcePolicyListDTO list(List<ResourcePolicyInfoDTO> list) {
    this.list = list;
    return this;
  }

  public ResourcePolicyListDTO addListItem(ResourcePolicyInfoDTO listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<ResourcePolicyInfoDTO> getList() {
    return list;
  }

  public void setList(List<ResourcePolicyInfoDTO> list) {
    this.list = list;
  }

  public ResourcePolicyListDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of policy resources returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of policy resources returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcePolicyListDTO resourcePolicyList = (ResourcePolicyListDTO) o;
    return Objects.equals(this.list, resourcePolicyList.list) &&
        Objects.equals(this.count, resourcePolicyList.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePolicyListDTO {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

