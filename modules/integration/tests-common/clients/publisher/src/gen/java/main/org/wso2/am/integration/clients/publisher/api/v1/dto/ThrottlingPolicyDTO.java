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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ThrottlingPolicyDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T19:19:21.534+05:30")
public class ThrottlingPolicyDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets policyLevel
   */
  @JsonAdapter(PolicyLevelEnum.Adapter.class)
  public enum PolicyLevelEnum {
    SUBSCRIPTION("subscription"),
    
    API("api");

    private String value;

    PolicyLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyLevelEnum fromValue(String text) {
      for (PolicyLevelEnum b : PolicyLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PolicyLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PolicyLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("policyLevel")
  private PolicyLevelEnum policyLevel = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = null;

  @SerializedName("requestCount")
  private Long requestCount = null;

  @SerializedName("unitTime")
  private Long unitTime = null;

  @SerializedName("timeUnit")
  private String timeUnit = null;

  /**
   * This attribute declares whether this policy is available under commercial or free 
   */
  @JsonAdapter(TierPlanEnum.Adapter.class)
  public enum TierPlanEnum {
    FREE("FREE"),
    
    COMMERCIAL("COMMERCIAL");

    private String value;

    TierPlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TierPlanEnum fromValue(String text) {
      for (TierPlanEnum b : TierPlanEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TierPlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TierPlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TierPlanEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TierPlanEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tierPlan")
  private TierPlanEnum tierPlan = null;

  @SerializedName("stopOnQuotaReach")
  private Boolean stopOnQuotaReach = null;

  @SerializedName("monetizationProperties")
  private Map<String, String> monetizationProperties = null;

  public ThrottlingPolicyDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Platinum", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThrottlingPolicyDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Allows 50 request(s) per minute.", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThrottlingPolicyDTO policyLevel(PolicyLevelEnum policyLevel) {
    this.policyLevel = policyLevel;
    return this;
  }

   /**
   * Get policyLevel
   * @return policyLevel
  **/
  @ApiModelProperty(example = "api", value = "")
  public PolicyLevelEnum getPolicyLevel() {
    return policyLevel;
  }

  public void setPolicyLevel(PolicyLevelEnum policyLevel) {
    this.policyLevel = policyLevel;
  }

  public ThrottlingPolicyDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "Platinum", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ThrottlingPolicyDTO attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ThrottlingPolicyDTO putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes added to the policy policy 
   * @return attributes
  **/
  @ApiModelProperty(example = "{}", value = "Custom attributes added to the policy policy ")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public ThrottlingPolicyDTO requestCount(Long requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Maximum number of requests which can be sent within a provided unit time 
   * @return requestCount
  **/
  @ApiModelProperty(example = "50", required = true, value = "Maximum number of requests which can be sent within a provided unit time ")
  public Long getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }

  public ThrottlingPolicyDTO unitTime(Long unitTime) {
    this.unitTime = unitTime;
    return this;
  }

   /**
   * Get unitTime
   * @return unitTime
  **/
  @ApiModelProperty(example = "60000", required = true, value = "")
  public Long getUnitTime() {
    return unitTime;
  }

  public void setUnitTime(Long unitTime) {
    this.unitTime = unitTime;
  }

  public ThrottlingPolicyDTO timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @ApiModelProperty(example = "min", value = "")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public ThrottlingPolicyDTO tierPlan(TierPlanEnum tierPlan) {
    this.tierPlan = tierPlan;
    return this;
  }

   /**
   * This attribute declares whether this policy is available under commercial or free 
   * @return tierPlan
  **/
  @ApiModelProperty(example = "FREE", required = true, value = "This attribute declares whether this policy is available under commercial or free ")
  public TierPlanEnum getTierPlan() {
    return tierPlan;
  }

  public void setTierPlan(TierPlanEnum tierPlan) {
    this.tierPlan = tierPlan;
  }

  public ThrottlingPolicyDTO stopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
    return this;
  }

   /**
   * By making this attribute to false, you are capabale of sending requests even if the request count exceeded within a unit time 
   * @return stopOnQuotaReach
  **/
  @ApiModelProperty(example = "true", required = true, value = "By making this attribute to false, you are capabale of sending requests even if the request count exceeded within a unit time ")
  public Boolean isStopOnQuotaReach() {
    return stopOnQuotaReach;
  }

  public void setStopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
  }

  public ThrottlingPolicyDTO monetizationProperties(Map<String, String> monetizationProperties) {
    this.monetizationProperties = monetizationProperties;
    return this;
  }

  public ThrottlingPolicyDTO putMonetizationPropertiesItem(String key, String monetizationPropertiesItem) {
    if (this.monetizationProperties == null) {
      this.monetizationProperties = new HashMap<>();
    }
    this.monetizationProperties.put(key, monetizationPropertiesItem);
    return this;
  }

   /**
   * Properties of a tier plan which are related to monetization
   * @return monetizationProperties
  **/
  @ApiModelProperty(example = "{}", value = "Properties of a tier plan which are related to monetization")
  public Map<String, String> getMonetizationProperties() {
    return monetizationProperties;
  }

  public void setMonetizationProperties(Map<String, String> monetizationProperties) {
    this.monetizationProperties = monetizationProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottlingPolicyDTO throttlingPolicy = (ThrottlingPolicyDTO) o;
    return Objects.equals(this.name, throttlingPolicy.name) &&
        Objects.equals(this.description, throttlingPolicy.description) &&
        Objects.equals(this.policyLevel, throttlingPolicy.policyLevel) &&
        Objects.equals(this.displayName, throttlingPolicy.displayName) &&
        Objects.equals(this.attributes, throttlingPolicy.attributes) &&
        Objects.equals(this.requestCount, throttlingPolicy.requestCount) &&
        Objects.equals(this.unitTime, throttlingPolicy.unitTime) &&
        Objects.equals(this.timeUnit, throttlingPolicy.timeUnit) &&
        Objects.equals(this.tierPlan, throttlingPolicy.tierPlan) &&
        Objects.equals(this.stopOnQuotaReach, throttlingPolicy.stopOnQuotaReach) &&
        Objects.equals(this.monetizationProperties, throttlingPolicy.monetizationProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, policyLevel, displayName, attributes, requestCount, unitTime, timeUnit, tierPlan, stopOnQuotaReach, monetizationProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottlingPolicyDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyLevel: ").append(toIndentedString(policyLevel)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    unitTime: ").append(toIndentedString(unitTime)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    tierPlan: ").append(toIndentedString(tierPlan)).append("\n");
    sb.append("    stopOnQuotaReach: ").append(toIndentedString(stopOnQuotaReach)).append("\n");
    sb.append("    monetizationProperties: ").append(toIndentedString(monetizationProperties)).append("\n");
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

