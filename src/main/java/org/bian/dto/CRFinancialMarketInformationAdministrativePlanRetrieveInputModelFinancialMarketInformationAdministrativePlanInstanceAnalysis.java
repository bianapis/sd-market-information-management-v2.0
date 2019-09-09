package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis   {
  private String financialMarketInformationAdministrativePlanInstanceAnalysisReference = null;

  private String financialMarketInformationAdministrativePlanInstanceAnalysisReportType = null;

  private String financialMarketInformationAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialMarketInformationAdministrativePlanInstanceAnalysisReference
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceAnalysisReference() {
    return financialMarketInformationAdministrativePlanInstanceAnalysisReference;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysisReference(String financialMarketInformationAdministrativePlanInstanceAnalysisReference) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysisReference = financialMarketInformationAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialMarketInformationAdministrativePlanInstanceAnalysisReportType
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceAnalysisReportType() {
    return financialMarketInformationAdministrativePlanInstanceAnalysisReportType;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysisReportType(String financialMarketInformationAdministrativePlanInstanceAnalysisReportType) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysisReportType = financialMarketInformationAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialMarketInformationAdministrativePlanInstanceAnalysisParameters
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceAnalysisParameters() {
    return financialMarketInformationAdministrativePlanInstanceAnalysisParameters;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysisParameters(String financialMarketInformationAdministrativePlanInstanceAnalysisParameters) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysisParameters = financialMarketInformationAdministrativePlanInstanceAnalysisParameters;
  }


}

