package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImprovementRetrieveInputModelImprovementInstanceAnalysis;
import org.bian.dto.BQImprovementRetrieveInputModelImprovementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveInputModel
 */
public class BQImprovementRetrieveInputModel   {
  private Object improvementRetrieveActionTaskRecord = null;

  private String improvementRetrieveActionRequest = null;

  private BQImprovementRetrieveInputModelImprovementInstanceReport improvementInstanceReport = null;

  private BQImprovementRetrieveInputModelImprovementInstanceAnalysis improvementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return improvementRetrieveActionTaskRecord
  **/

  public Object getImprovementRetrieveActionTaskRecord() {
    return improvementRetrieveActionTaskRecord;
  }

  public void setImprovementRetrieveActionTaskRecord(Object improvementRetrieveActionTaskRecord) {
    this.improvementRetrieveActionTaskRecord = improvementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return improvementRetrieveActionRequest
  **/

  public String getImprovementRetrieveActionRequest() {
    return improvementRetrieveActionRequest;
  }

  public void setImprovementRetrieveActionRequest(String improvementRetrieveActionRequest) {
    this.improvementRetrieveActionRequest = improvementRetrieveActionRequest;
  }


  /**
   * Get improvementInstanceReport
   * @return improvementInstanceReport
  **/

  public BQImprovementRetrieveInputModelImprovementInstanceReport getImprovementInstanceReport() {
    return improvementInstanceReport;
  }

  public void setImprovementInstanceReport(BQImprovementRetrieveInputModelImprovementInstanceReport improvementInstanceReport) {
    this.improvementInstanceReport = improvementInstanceReport;
  }


  /**
   * Get improvementInstanceAnalysis
   * @return improvementInstanceAnalysis
  **/

  public BQImprovementRetrieveInputModelImprovementInstanceAnalysis getImprovementInstanceAnalysis() {
    return improvementInstanceAnalysis;
  }

  public void setImprovementInstanceAnalysis(BQImprovementRetrieveInputModelImprovementInstanceAnalysis improvementInstanceAnalysis) {
    this.improvementInstanceAnalysis = improvementInstanceAnalysis;
  }


}

