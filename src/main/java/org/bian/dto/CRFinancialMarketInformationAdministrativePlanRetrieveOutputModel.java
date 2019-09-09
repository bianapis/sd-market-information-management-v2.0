package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel   {
  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;

  private String financialMarketInformationAdministrativePlanRetrieveActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanRetrieveActionTaskRecord = null;

  private String financialMarketInformationAdministrativePlanRetrieveActionResponse = null;

  private CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord financialMarketInformationAdministrativePlanInstanceReportRecord = null;

  private CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis financialMarketInformationAdministrativePlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance retrieve service call 
   * @return financialMarketInformationAdministrativePlanRetrieveActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanRetrieveActionTaskReference() {
    return financialMarketInformationAdministrativePlanRetrieveActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanRetrieveActionTaskReference(String financialMarketInformationAdministrativePlanRetrieveActionTaskReference) {
    this.financialMarketInformationAdministrativePlanRetrieveActionTaskReference = financialMarketInformationAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanRetrieveActionTaskRecord() {
    return financialMarketInformationAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanRetrieveActionTaskRecord(Object financialMarketInformationAdministrativePlanRetrieveActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanRetrieveActionTaskRecord = financialMarketInformationAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialMarketInformationAdministrativePlanRetrieveActionResponse
  **/

  public String getFinancialMarketInformationAdministrativePlanRetrieveActionResponse() {
    return financialMarketInformationAdministrativePlanRetrieveActionResponse;
  }

  public void setFinancialMarketInformationAdministrativePlanRetrieveActionResponse(String financialMarketInformationAdministrativePlanRetrieveActionResponse) {
    this.financialMarketInformationAdministrativePlanRetrieveActionResponse = financialMarketInformationAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get financialMarketInformationAdministrativePlanInstanceReportRecord
   * @return financialMarketInformationAdministrativePlanInstanceReportRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord getFinancialMarketInformationAdministrativePlanInstanceReportRecord() {
    return financialMarketInformationAdministrativePlanInstanceReportRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportRecord(CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord financialMarketInformationAdministrativePlanInstanceReportRecord) {
    this.financialMarketInformationAdministrativePlanInstanceReportRecord = financialMarketInformationAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get financialMarketInformationAdministrativePlanInstanceAnalysis
   * @return financialMarketInformationAdministrativePlanInstanceAnalysis
  **/

  public CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis getFinancialMarketInformationAdministrativePlanInstanceAnalysis() {
    return financialMarketInformationAdministrativePlanInstanceAnalysis;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysis(CRFinancialMarketInformationAdministrativePlanRetrieveOutputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis financialMarketInformationAdministrativePlanInstanceAnalysis) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysis = financialMarketInformationAdministrativePlanInstanceAnalysis;
  }


}

