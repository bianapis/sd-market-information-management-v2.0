package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveOutputModelImprovementInstanceReport
 */
public class BQImprovementRetrieveOutputModelImprovementInstanceReport   {
  private Object improvementInstanceReportRecord = null;

  private String improvementInstanceReportType = null;

  private String improvementInstanceReportParameters = null;

  private Object improvementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return improvementInstanceReportRecord
  **/

  public Object getImprovementInstanceReportRecord() {
    return improvementInstanceReportRecord;
  }

  public void setImprovementInstanceReportRecord(Object improvementInstanceReportRecord) {
    this.improvementInstanceReportRecord = improvementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return improvementInstanceReportType
  **/

  public String getImprovementInstanceReportType() {
    return improvementInstanceReportType;
  }

  public void setImprovementInstanceReportType(String improvementInstanceReportType) {
    this.improvementInstanceReportType = improvementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return improvementInstanceReportParameters
  **/

  public String getImprovementInstanceReportParameters() {
    return improvementInstanceReportParameters;
  }

  public void setImprovementInstanceReportParameters(String improvementInstanceReportParameters) {
    this.improvementInstanceReportParameters = improvementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return improvementInstanceReport
  **/

  public Object getImprovementInstanceReport() {
    return improvementInstanceReport;
  }

  public void setImprovementInstanceReport(Object improvementInstanceReport) {
    this.improvementInstanceReport = improvementInstanceReport;
  }


}

