package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveOutputModelImprovementInstanceRecord
 */
public class BQImprovementRetrieveOutputModelImprovementInstanceRecord   {
  private String financialMarketInformationImprovementTaskType = null;

  private String financialMarketInformationImprovementTaskSources = null;

  private String financialMarketInformationImprovementTaskWorkProducts = null;

  private String financialMarketInformationImprovementTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of technique used to improve the content (e.g. cross verification, pattern/anomaly detection) 
   * @return financialMarketInformationImprovementTaskType
  **/

  public String getFinancialMarketInformationImprovementTaskType() {
    return financialMarketInformationImprovementTaskType;
  }

  public void setFinancialMarketInformationImprovementTaskType(String financialMarketInformationImprovementTaskType) {
    this.financialMarketInformationImprovementTaskType = financialMarketInformationImprovementTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: References to the different sources of financial market information used to improve the content (can be primary source and comparison data)  
   * @return financialMarketInformationImprovementTaskSources
  **/

  public String getFinancialMarketInformationImprovementTaskSources() {
    return financialMarketInformationImprovementTaskSources;
  }

  public void setFinancialMarketInformationImprovementTaskSources(String financialMarketInformationImprovementTaskSources) {
    this.financialMarketInformationImprovementTaskSources = financialMarketInformationImprovementTaskSources;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the enquiry 
   * @return financialMarketInformationImprovementTaskWorkProducts
  **/

  public String getFinancialMarketInformationImprovementTaskWorkProducts() {
    return financialMarketInformationImprovementTaskWorkProducts;
  }

  public void setFinancialMarketInformationImprovementTaskWorkProducts(String financialMarketInformationImprovementTaskWorkProducts) {
    this.financialMarketInformationImprovementTaskWorkProducts = financialMarketInformationImprovementTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Output of the improvement task that is recorded back to the Financial Market Information Database 
   * @return financialMarketInformationImprovementTaskResult
  **/

  public String getFinancialMarketInformationImprovementTaskResult() {
    return financialMarketInformationImprovementTaskResult;
  }

  public void setFinancialMarketInformationImprovementTaskResult(String financialMarketInformationImprovementTaskResult) {
    this.financialMarketInformationImprovementTaskResult = financialMarketInformationImprovementTaskResult;
  }


}

