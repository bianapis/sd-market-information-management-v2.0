package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanControlOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanControlOutputModel   {
  private String financialMarketInformationAdministrativePlanControlActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanControlActionTaskRecord = null;

  private String financialMarketInformationAdministrativePlanControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance control processing service call 
   * @return financialMarketInformationAdministrativePlanControlActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanControlActionTaskReference() {
    return financialMarketInformationAdministrativePlanControlActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanControlActionTaskReference(String financialMarketInformationAdministrativePlanControlActionTaskReference) {
    this.financialMarketInformationAdministrativePlanControlActionTaskReference = financialMarketInformationAdministrativePlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanControlActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanControlActionTaskRecord() {
    return financialMarketInformationAdministrativePlanControlActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanControlActionTaskRecord(Object financialMarketInformationAdministrativePlanControlActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanControlActionTaskRecord = financialMarketInformationAdministrativePlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return financialMarketInformationAdministrativePlanControlActionResponse
  **/

  public String getFinancialMarketInformationAdministrativePlanControlActionResponse() {
    return financialMarketInformationAdministrativePlanControlActionResponse;
  }

  public void setFinancialMarketInformationAdministrativePlanControlActionResponse(String financialMarketInformationAdministrativePlanControlActionResponse) {
    this.financialMarketInformationAdministrativePlanControlActionResponse = financialMarketInformationAdministrativePlanControlActionResponse;
  }


}

