package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateOutputModelReportingInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingRequestOutputModel
 */
public class BQReportingRequestOutputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private BQReportingCreateOutputModelReportingInstanceRecord reportingInstanceRecord = null;

  private String reportingRequestActionTaskReference = null;

  private Object reportingRequestActionTaskRecord = null;

  private String reportingRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get financialMarketInformationAdministrativePlanInstanceRecord
   * @return financialMarketInformationAdministrativePlanInstanceRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord getFinancialMarketInformationAdministrativePlanInstanceRecord() {
    return financialMarketInformationAdministrativePlanInstanceRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceRecord(CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord) {
    this.financialMarketInformationAdministrativePlanInstanceRecord = financialMarketInformationAdministrativePlanInstanceRecord;
  }


  /**
   * Get reportingInstanceRecord
   * @return reportingInstanceRecord
  **/

  public BQReportingCreateOutputModelReportingInstanceRecord getReportingInstanceRecord() {
    return reportingInstanceRecord;
  }

  public void setReportingInstanceRecord(BQReportingCreateOutputModelReportingInstanceRecord reportingInstanceRecord) {
    this.reportingInstanceRecord = reportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reporting instance request service call 
   * @return reportingRequestActionTaskReference
  **/

  public String getReportingRequestActionTaskReference() {
    return reportingRequestActionTaskReference;
  }

  public void setReportingRequestActionTaskReference(String reportingRequestActionTaskReference) {
    this.reportingRequestActionTaskReference = reportingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return reportingRequestActionTaskRecord
  **/

  public Object getReportingRequestActionTaskRecord() {
    return reportingRequestActionTaskRecord;
  }

  public void setReportingRequestActionTaskRecord(Object reportingRequestActionTaskRecord) {
    this.reportingRequestActionTaskRecord = reportingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reporting service request record 
   * @return reportingRequestRecordReference
  **/

  public String getReportingRequestRecordReference() {
    return reportingRequestRecordReference;
  }

  public void setReportingRequestRecordReference(String reportingRequestRecordReference) {
    this.reportingRequestRecordReference = reportingRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

