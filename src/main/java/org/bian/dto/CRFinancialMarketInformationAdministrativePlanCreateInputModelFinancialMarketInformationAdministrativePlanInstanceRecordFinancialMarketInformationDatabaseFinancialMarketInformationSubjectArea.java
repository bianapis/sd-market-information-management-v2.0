package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabaseFinancialMarketInformationSubjectArea
 */
public class CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabaseFinancialMarketInformationSubjectArea   {
  private String financialMarketInformationSubjectAreaUpdateHistory = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the update history of the content 
   * @return financialMarketInformationSubjectAreaUpdateHistory
  **/

  public String getFinancialMarketInformationSubjectAreaUpdateHistory() {
    return financialMarketInformationSubjectAreaUpdateHistory;
  }

  public void setFinancialMarketInformationSubjectAreaUpdateHistory(String financialMarketInformationSubjectAreaUpdateHistory) {
    this.financialMarketInformationSubjectAreaUpdateHistory = financialMarketInformationSubjectAreaUpdateHistory;
  }


}

