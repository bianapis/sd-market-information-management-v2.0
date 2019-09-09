package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateInputModelReportingInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQReportingExecuteInputModel
 */
public class BQReportingExecuteInputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private String reportingInstanceReference = null;

  private BQReportingCreateInputModelReportingInstanceRecord reportingInstanceRecord = null;

  private Object reportingExecuteActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return reportingExecuteActionTaskRecord
  **/

  public Object getReportingExecuteActionTaskRecord() {
    return reportingExecuteActionTaskRecord;
  }

  public void setReportingExecuteActionTaskRecord(Object reportingExecuteActionTaskRecord) {
    this.reportingExecuteActionTaskRecord = reportingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

