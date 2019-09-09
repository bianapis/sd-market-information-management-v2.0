package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport;

import javax.validation.Valid;
  
/**
 * BQReportingCreateOutputModelReportingInstanceRecord
 */
public class BQReportingCreateOutputModelReportingInstanceRecord   {
  private BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport = null;


  /**
   * Get financialMarketInformationReport
   * @return financialMarketInformationReport
  **/

  public BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport getFinancialMarketInformationReport() {
    return financialMarketInformationReport;
  }

  public void setFinancialMarketInformationReport(BQReportingCreateOutputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport) {
    this.financialMarketInformationReport = financialMarketInformationReport;
  }


}

