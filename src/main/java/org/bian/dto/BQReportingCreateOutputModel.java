package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateOutputModelReportingInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingCreateOutputModel
 */
public class BQReportingCreateOutputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private String reportingInstanceReference = null;

  private String reportingInitiateActionReference = null;

  private Object reportingInitiateActionRecord = null;

  private String reportingInstanceStatus = null;

  private BQReportingCreateOutputModelReportingInstanceRecord reportingInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return reportingInitiateActionReference
  **/

  public String getReportingInitiateActionReference() {
    return reportingInitiateActionReference;
  }

  public void setReportingInitiateActionReference(String reportingInitiateActionReference) {
    this.reportingInitiateActionReference = reportingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return reportingInitiateActionRecord
  **/

  public Object getReportingInitiateActionRecord() {
    return reportingInitiateActionRecord;
  }

  public void setReportingInitiateActionRecord(Object reportingInitiateActionRecord) {
    this.reportingInitiateActionRecord = reportingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reporting instance (e.g. initialised, pending, active) 
   * @return reportingInstanceStatus
  **/

  public String getReportingInstanceStatus() {
    return reportingInstanceStatus;
  }

  public void setReportingInstanceStatus(String reportingInstanceStatus) {
    this.reportingInstanceStatus = reportingInstanceStatus;
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


}

