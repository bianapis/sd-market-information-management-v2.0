package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImprovementRetrieveOutputModelImprovementInstanceAnalysis;
import org.bian.dto.BQImprovementRetrieveOutputModelImprovementInstanceRecord;
import org.bian.dto.BQImprovementRetrieveOutputModelImprovementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveOutputModel
 */
public class BQImprovementRetrieveOutputModel   {
  private BQImprovementRetrieveOutputModelImprovementInstanceRecord improvementInstanceRecord = null;

  private String improvementRetrieveActionTaskReference = null;

  private Object improvementRetrieveActionTaskRecord = null;

  private String improvementRetrieveActionResponse = null;

  private BQImprovementRetrieveOutputModelImprovementInstanceReport improvementInstanceReport = null;

  private BQImprovementRetrieveOutputModelImprovementInstanceAnalysis improvementInstanceAnalysis = null;


  /**
   * Get improvementInstanceRecord
   * @return improvementInstanceRecord
  **/

  public BQImprovementRetrieveOutputModelImprovementInstanceRecord getImprovementInstanceRecord() {
    return improvementInstanceRecord;
  }

  public void setImprovementInstanceRecord(BQImprovementRetrieveOutputModelImprovementInstanceRecord improvementInstanceRecord) {
    this.improvementInstanceRecord = improvementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Improvement instance retrieve service call 
   * @return improvementRetrieveActionTaskReference
  **/

  public String getImprovementRetrieveActionTaskReference() {
    return improvementRetrieveActionTaskReference;
  }

  public void setImprovementRetrieveActionTaskReference(String improvementRetrieveActionTaskReference) {
    this.improvementRetrieveActionTaskReference = improvementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return improvementRetrieveActionResponse
  **/

  public String getImprovementRetrieveActionResponse() {
    return improvementRetrieveActionResponse;
  }

  public void setImprovementRetrieveActionResponse(String improvementRetrieveActionResponse) {
    this.improvementRetrieveActionResponse = improvementRetrieveActionResponse;
  }


  /**
   * Get improvementInstanceReport
   * @return improvementInstanceReport
  **/

  public BQImprovementRetrieveOutputModelImprovementInstanceReport getImprovementInstanceReport() {
    return improvementInstanceReport;
  }

  public void setImprovementInstanceReport(BQImprovementRetrieveOutputModelImprovementInstanceReport improvementInstanceReport) {
    this.improvementInstanceReport = improvementInstanceReport;
  }


  /**
   * Get improvementInstanceAnalysis
   * @return improvementInstanceAnalysis
  **/

  public BQImprovementRetrieveOutputModelImprovementInstanceAnalysis getImprovementInstanceAnalysis() {
    return improvementInstanceAnalysis;
  }

  public void setImprovementInstanceAnalysis(BQImprovementRetrieveOutputModelImprovementInstanceAnalysis improvementInstanceAnalysis) {
    this.improvementInstanceAnalysis = improvementInstanceAnalysis;
  }


}

