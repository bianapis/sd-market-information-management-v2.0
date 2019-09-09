package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCaptureInputModelReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingCaptureOutputModel
 */
public class BQReportingCaptureOutputModel   {
  private BQReportingCaptureInputModelReportingInstanceRecord reportingInstanceRecord = null;

  private String reportingCaptureActionTaskReference = null;

  private Object reportingCaptureActionTaskRecord = null;

  private String reportingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get reportingInstanceRecord
   * @return reportingInstanceRecord
  **/

  public BQReportingCaptureInputModelReportingInstanceRecord getReportingInstanceRecord() {
    return reportingInstanceRecord;
  }

  public void setReportingInstanceRecord(BQReportingCaptureInputModelReportingInstanceRecord reportingInstanceRecord) {
    this.reportingInstanceRecord = reportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reporting instance capture service call 
   * @return reportingCaptureActionTaskReference
  **/

  public String getReportingCaptureActionTaskReference() {
    return reportingCaptureActionTaskReference;
  }

  public void setReportingCaptureActionTaskReference(String reportingCaptureActionTaskReference) {
    this.reportingCaptureActionTaskReference = reportingCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return reportingCaptureActionTaskRecord
  **/

  public Object getReportingCaptureActionTaskRecord() {
    return reportingCaptureActionTaskRecord;
  }

  public void setReportingCaptureActionTaskRecord(Object reportingCaptureActionTaskRecord) {
    this.reportingCaptureActionTaskRecord = reportingCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reporting structured input transaction/record 
   * @return reportingCaptureRecordReference
  **/

  public String getReportingCaptureRecordReference() {
    return reportingCaptureRecordReference;
  }

  public void setReportingCaptureRecordReference(String reportingCaptureRecordReference) {
    this.reportingCaptureRecordReference = reportingCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

