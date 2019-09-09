package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingCreateOutputModelReportingInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingUpdateOutputModel
 */
public class BQReportingUpdateOutputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private BQReportingCreateOutputModelReportingInstanceRecord reportingInstanceRecord = null;

  private String reportingUpdateActionTaskReference = null;

  private Object reportingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return reportingUpdateActionTaskReference
  **/

  public String getReportingUpdateActionTaskReference() {
    return reportingUpdateActionTaskReference;
  }

  public void setReportingUpdateActionTaskReference(String reportingUpdateActionTaskReference) {
    this.reportingUpdateActionTaskReference = reportingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reportingUpdateActionTaskRecord
  **/

  public Object getReportingUpdateActionTaskRecord() {
    return reportingUpdateActionTaskRecord;
  }

  public void setReportingUpdateActionTaskRecord(Object reportingUpdateActionTaskRecord) {
    this.reportingUpdateActionTaskRecord = reportingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

