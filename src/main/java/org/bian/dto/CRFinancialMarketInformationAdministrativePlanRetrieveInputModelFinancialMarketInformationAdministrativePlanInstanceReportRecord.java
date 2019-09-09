package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord   {
  private String financialMarketInformationAdministrativePlanInstanceReportReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReportType = null;

  private String financialMarketInformationAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialMarketInformationAdministrativePlanInstanceReportReference
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReportReference() {
    return financialMarketInformationAdministrativePlanInstanceReportReference;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportReference(String financialMarketInformationAdministrativePlanInstanceReportReference) {
    this.financialMarketInformationAdministrativePlanInstanceReportReference = financialMarketInformationAdministrativePlanInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialMarketInformationAdministrativePlanInstanceReportParameters
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReportParameters() {
    return financialMarketInformationAdministrativePlanInstanceReportParameters;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportParameters(String financialMarketInformationAdministrativePlanInstanceReportParameters) {
    this.financialMarketInformationAdministrativePlanInstanceReportParameters = financialMarketInformationAdministrativePlanInstanceReportParameters;
  }


}

