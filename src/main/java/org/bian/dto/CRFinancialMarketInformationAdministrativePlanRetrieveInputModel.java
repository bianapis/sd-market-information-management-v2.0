package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRetrieveInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanRetrieveInputModel   {
  private Object financialMarketInformationAdministrativePlanRetrieveActionTaskRecord = null;

  private String financialMarketInformationAdministrativePlanRetrieveActionRequest = null;

  private CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord financialMarketInformationAdministrativePlanInstanceReportRecord = null;

  private CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis financialMarketInformationAdministrativePlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialMarketInformationAdministrativePlanRetrieveActionRequest
  **/

  public String getFinancialMarketInformationAdministrativePlanRetrieveActionRequest() {
    return financialMarketInformationAdministrativePlanRetrieveActionRequest;
  }

  public void setFinancialMarketInformationAdministrativePlanRetrieveActionRequest(String financialMarketInformationAdministrativePlanRetrieveActionRequest) {
    this.financialMarketInformationAdministrativePlanRetrieveActionRequest = financialMarketInformationAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get financialMarketInformationAdministrativePlanInstanceReportRecord
   * @return financialMarketInformationAdministrativePlanInstanceReportRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord getFinancialMarketInformationAdministrativePlanInstanceReportRecord() {
    return financialMarketInformationAdministrativePlanInstanceReportRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReportRecord(CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceReportRecord financialMarketInformationAdministrativePlanInstanceReportRecord) {
    this.financialMarketInformationAdministrativePlanInstanceReportRecord = financialMarketInformationAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get financialMarketInformationAdministrativePlanInstanceAnalysis
   * @return financialMarketInformationAdministrativePlanInstanceAnalysis
  **/

  public CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis getFinancialMarketInformationAdministrativePlanInstanceAnalysis() {
    return financialMarketInformationAdministrativePlanInstanceAnalysis;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceAnalysis(CRFinancialMarketInformationAdministrativePlanRetrieveInputModelFinancialMarketInformationAdministrativePlanInstanceAnalysis financialMarketInformationAdministrativePlanInstanceAnalysis) {
    this.financialMarketInformationAdministrativePlanInstanceAnalysis = financialMarketInformationAdministrativePlanInstanceAnalysis;
  }


}

