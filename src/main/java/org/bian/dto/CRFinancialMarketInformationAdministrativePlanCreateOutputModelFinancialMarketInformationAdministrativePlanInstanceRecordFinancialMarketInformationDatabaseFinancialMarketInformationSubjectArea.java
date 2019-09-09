package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabaseFinancialMarketInformationSubjectArea
 */
public class CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabaseFinancialMarketInformationSubjectArea   {
  private String financialMarketInformationSubjectAreaDescription = null;

  private String financialMarketInformationSubjectAreaUpdateHistory = null;

  private Object financialMarketInformationSubjectAreaRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the information content of the subject area 
   * @return financialMarketInformationSubjectAreaDescription
  **/

  public String getFinancialMarketInformationSubjectAreaDescription() {
    return financialMarketInformationSubjectAreaDescription;
  }

  public void setFinancialMarketInformationSubjectAreaDescription(String financialMarketInformationSubjectAreaDescription) {
    this.financialMarketInformationSubjectAreaDescription = financialMarketInformationSubjectAreaDescription;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated improved information, includes current and past historical records as necessary 
   * @return financialMarketInformationSubjectAreaRecord
  **/

  public Object getFinancialMarketInformationSubjectAreaRecord() {
    return financialMarketInformationSubjectAreaRecord;
  }

  public void setFinancialMarketInformationSubjectAreaRecord(Object financialMarketInformationSubjectAreaRecord) {
    this.financialMarketInformationSubjectAreaRecord = financialMarketInformationSubjectAreaRecord;
  }


}

