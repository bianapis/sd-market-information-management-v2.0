package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport
 */
public class BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport   {
  private String financialMarketInformationReportType = null;

  private String financialMarketInformationReportSchedule = null;

  private String financialMarketInformationReportAccessHistory = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The report represents a specific managed information view of the scrubbed financial market information 
   * @return financialMarketInformationReportType
  **/

  public String getFinancialMarketInformationReportType() {
    return financialMarketInformationReportType;
  }

  public void setFinancialMarketInformationReportType(String financialMarketInformationReportType) {
    this.financialMarketInformationReportType = financialMarketInformationReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the schedule for maintaining the report content 
   * @return financialMarketInformationReportSchedule
  **/

  public String getFinancialMarketInformationReportSchedule() {
    return financialMarketInformationReportSchedule;
  }

  public void setFinancialMarketInformationReportSchedule(String financialMarketInformationReportSchedule) {
    this.financialMarketInformationReportSchedule = financialMarketInformationReportSchedule;
  }


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

