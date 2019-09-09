package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveOutputModelConsolidationInstanceRecord
 */
public class BQConsolidationRetrieveOutputModelConsolidationInstanceRecord   {
  private Object financialMarketInformationServiceReport = null;

  private String financialMarketInformationServiceReportProperties = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Refers to the content record provided by the external service provider in whatever form suitable  
   * @return financialMarketInformationServiceReport
  **/

  public Object getFinancialMarketInformationServiceReport() {
    return financialMarketInformationServiceReport;
  }

  public void setFinancialMarketInformationServiceReport(Object financialMarketInformationServiceReport) {
    this.financialMarketInformationServiceReport = financialMarketInformationServiceReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Key properties of the report used in its improvement (e.g. date created, qualifications of integrity) 
   * @return financialMarketInformationServiceReportProperties
  **/

  public String getFinancialMarketInformationServiceReportProperties() {
    return financialMarketInformationServiceReportProperties;
  }

  public void setFinancialMarketInformationServiceReportProperties(String financialMarketInformationServiceReportProperties) {
    this.financialMarketInformationServiceReportProperties = financialMarketInformationServiceReportProperties;
  }


}

