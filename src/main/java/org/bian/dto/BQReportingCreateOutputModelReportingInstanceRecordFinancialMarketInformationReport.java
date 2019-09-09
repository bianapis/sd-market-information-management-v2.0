package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport
 */
public class BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport   {
  private String financialMarketInformationReportType = null;

  private String financialMarketInformationReportDescription = null;

  private String financialMarketInformationReportSchedule = null;

  private String financialMarketInformationReportAccessHistory = null;

  private Object financialMarketInformationReport = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is a detailed definition of the report contents, including properties that clarify the quality/integrity and timeliness of the content 
   * @return financialMarketInformationReportDescription
  **/

  public String getFinancialMarketInformationReportDescription() {
    return financialMarketInformationReportDescription;
  }

  public void setFinancialMarketInformationReportDescription(String financialMarketInformationReportDescription) {
    this.financialMarketInformationReportDescription = financialMarketInformationReportDescription;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the report itself, including historical versions as appropriate 
   * @return financialMarketInformationReport
  **/

  public Object getFinancialMarketInformationReport() {
    return financialMarketInformationReport;
  }

  public void setFinancialMarketInformationReport(Object financialMarketInformationReport) {
    this.financialMarketInformationReport = financialMarketInformationReport;
  }


}

