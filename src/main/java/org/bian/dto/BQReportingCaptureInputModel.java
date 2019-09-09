package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCaptureInputModelCaptureRecordType;
import org.bian.dto.BQReportingCaptureInputModelReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingCaptureInputModel
 */
public class BQReportingCaptureInputModel   {
  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private String reportingInstanceReference = null;

  private BQReportingCaptureInputModelReportingInstanceRecord reportingInstanceRecord = null;

  private Object reportingCaptureActionTaskRecord = null;

  private BQReportingCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Financial Market Information Administrative Plan instance 
   * @return financialMarketInformationAdministrativePlanInstanceReference
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReference() {
    return financialMarketInformationAdministrativePlanInstanceReference;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReference(String financialMarketInformationAdministrativePlanInstanceReference) {
    this.financialMarketInformationAdministrativePlanInstanceReference = financialMarketInformationAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reporting instance 
   * @return reportingInstanceReference
  **/

  public String getReportingInstanceReference() {
    return reportingInstanceReference;
  }

  public void setReportingInstanceReference(String reportingInstanceReference) {
    this.reportingInstanceReference = reportingInstanceReference;
  }


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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQReportingCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQReportingCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

