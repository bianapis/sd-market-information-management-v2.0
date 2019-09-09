package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord   {
  private String financialMarketInformationAdministrativePlanInstanceReportData = null;

  private String financialMarketInformationAdministrativePlanInstanceReportType = null;

  private Object financialMarketInformationAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialMarketInformationAdministrativePlanInstanceReportData
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReportData() {
    return financialMarketInformationAdministrativePlanInstanceReportData;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportData(String financialMarketInformationAdministrativePlanInstanceReportData) {
    this.financialMarketInformationAdministrativePlanInstanceReportData = financialMarketInformationAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialMarketInformationAdministrativePlanInstanceReportType
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReportType() {
    return financialMarketInformationAdministrativePlanInstanceReportType;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportType(String financialMarketInformationAdministrativePlanInstanceReportType) {
    this.financialMarketInformationAdministrativePlanInstanceReportType = financialMarketInformationAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialMarketInformationAdministrativePlanInstanceReport
  **/

  public Object getFinancialMarketInformationAdministrativePlanInstanceReport() {
    return financialMarketInformationAdministrativePlanInstanceReport;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReport(Object financialMarketInformationAdministrativePlanInstanceReport) {
    this.financialMarketInformationAdministrativePlanInstanceReport = financialMarketInformationAdministrativePlanInstanceReport;
  }


}

