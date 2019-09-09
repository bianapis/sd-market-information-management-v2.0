package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis   {
  private String financialMarketInformationAdministrativePlanInstanceAnalysisData = null;

  private String financialMarketInformationAdministrativePlanInstanceAnalysisReportType = null;

  private Object financialMarketInformationAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialMarketInformationAdministrativePlanInstanceAnalysisData
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceAnalysisData() {
    return financialMarketInformationAdministrativePlanInstanceAnalysisData;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysisData(String financialMarketInformationAdministrativePlanInstanceAnalysisData) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysisData = financialMarketInformationAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialMarketInformationAdministrativePlanInstanceAnalysisReport
  **/

  public Object getFinancialMarketInformationAdministrativePlanInstanceAnalysisReport() {
    return financialMarketInformationAdministrativePlanInstanceAnalysisReport;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysisReport(Object financialMarketInformationAdministrativePlanInstanceAnalysisReport) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysisReport = financialMarketInformationAdministrativePlanInstanceAnalysisReport;
  }


}

