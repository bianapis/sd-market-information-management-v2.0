package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateInputModelReportingInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQReportingRequestInputModel
 */
public class BQReportingRequestInputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private String reportingInstanceReference = null;

  private BQReportingCreateInputModelReportingInstanceRecord reportingInstanceRecord = null;

  private Object reportingRequestActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQReportingCreateInputModelReportingInstanceRecord getReportingInstanceRecord() {
    return reportingInstanceRecord;
  }

  public void setReportingInstanceRecord(BQReportingCreateInputModelReportingInstanceRecord reportingInstanceRecord) {
    this.reportingInstanceRecord = reportingInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

