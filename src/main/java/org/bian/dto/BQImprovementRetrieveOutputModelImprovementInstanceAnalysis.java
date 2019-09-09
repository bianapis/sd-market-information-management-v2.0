package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveOutputModelImprovementInstanceAnalysis
 */
public class BQImprovementRetrieveOutputModelImprovementInstanceAnalysis   {
  private Object improvementInstanceAnalysisRecord = null;

  private String improvementInstanceAnalysisReportType = null;

  private String improvementInstanceAnalysisParameters = null;

  private Object improvementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return improvementInstanceAnalysisRecord
  **/

  public Object getImprovementInstanceAnalysisRecord() {
    return improvementInstanceAnalysisRecord;
  }

  public void setImprovementInstanceAnalysisRecord(Object improvementInstanceAnalysisRecord) {
    this.improvementInstanceAnalysisRecord = improvementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return improvementInstanceAnalysisReportType
  **/

  public String getImprovementInstanceAnalysisReportType() {
    return improvementInstanceAnalysisReportType;
  }

  public void setImprovementInstanceAnalysisReportType(String improvementInstanceAnalysisReportType) {
    this.improvementInstanceAnalysisReportType = improvementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return improvementInstanceAnalysisParameters
  **/

  public String getImprovementInstanceAnalysisParameters() {
    return improvementInstanceAnalysisParameters;
  }

  public void setImprovementInstanceAnalysisParameters(String improvementInstanceAnalysisParameters) {
    this.improvementInstanceAnalysisParameters = improvementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return improvementInstanceAnalysisReport
  **/

  public Object getImprovementInstanceAnalysisReport() {
    return improvementInstanceAnalysisReport;
  }

  public void setImprovementInstanceAnalysisReport(Object improvementInstanceAnalysisReport) {
    this.improvementInstanceAnalysisReport = improvementInstanceAnalysisReport;
  }


}

