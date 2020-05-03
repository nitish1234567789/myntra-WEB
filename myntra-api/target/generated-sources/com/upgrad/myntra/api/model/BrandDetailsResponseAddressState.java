package com.upgrad.myntra.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrandDetailsResponseAddressState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-02T14:32:30.097+05:30")

public class BrandDetailsResponseAddressState   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("state_name")
  private String stateName = null;

  public BrandDetailsResponseAddressState id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the state in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the state in a standard UUID format")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BrandDetailsResponseAddressState stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * Name of the state
   * @return stateName
  **/
  @ApiModelProperty(value = "Name of the state")


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandDetailsResponseAddressState brandDetailsResponseAddressState = (BrandDetailsResponseAddressState) o;
    return Objects.equals(this.id, brandDetailsResponseAddressState.id) &&
        Objects.equals(this.stateName, brandDetailsResponseAddressState.stateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandDetailsResponseAddressState {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
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

