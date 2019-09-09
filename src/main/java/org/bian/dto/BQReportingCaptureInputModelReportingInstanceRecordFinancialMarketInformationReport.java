package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport
 */
public class BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport   {
  private String financialMarketInformationReportAccessHistory = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is a log/record of access made to the report by bank users 
   * @return financialMarketInformationReportAccessHistory
  **/

  public String getFinancialMarketInformationReportAccessHistory() {
    return financialMarketInformationReportAccessHistory;
  }

  public void setFinancialMarketInformationReportAccessHistory(String financialMarketInformationReportAccessHistory) {
    this.financialMarketInformationReportAccessHistory = financialMarketInformationReportAccessHistory;
  }


}

