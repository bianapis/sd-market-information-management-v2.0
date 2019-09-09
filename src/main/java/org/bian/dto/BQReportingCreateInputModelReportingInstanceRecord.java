package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport;

import javax.validation.Valid;
  
/**
 * BQReportingCreateInputModelReportingInstanceRecord
 */
public class BQReportingCreateInputModelReportingInstanceRecord   {
  private BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport = null;


  /**
   * Get financialMarketInformationReport
   * @return financialMarketInformationReport
  **/

  public BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport getFinancialMarketInformationReport() {
    return financialMarketInformationReport;
  }

  public void setFinancialMarketInformationReport(BQReportingCreateInputModelReportingInstanceRecordFinancialMarketInformationReport financialMarketInformationReport) {
    this.financialMarketInformationReport = financialMarketInformationReport;
  }


}

