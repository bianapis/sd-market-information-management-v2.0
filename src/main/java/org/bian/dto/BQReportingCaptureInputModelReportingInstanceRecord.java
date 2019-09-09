package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport;

import javax.validation.Valid;
  
/**
 * BQReportingCaptureInputModelReportingInstanceRecord
 */
public class BQReportingCaptureInputModelReportingInstanceRecord   {
  private BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport = null;


  /**
   * Get financialMarketInformationReport
   * @return financialMarketInformationReport
  **/

  public BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport getFinancialMarketInformationReport() {
    return financialMarketInformationReport;
  }

  public void setFinancialMarketInformationReport(BQReportingCaptureInputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport) {
    this.financialMarketInformationReport = financialMarketInformationReport;
  }


}

