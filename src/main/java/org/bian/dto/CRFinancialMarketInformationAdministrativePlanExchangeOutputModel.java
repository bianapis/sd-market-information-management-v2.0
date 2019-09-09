package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanExchangeOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanExchangeOutputModel   {
  private String financialMarketInformationAdministrativePlanExchangeActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanExchangeActionTaskRecord = null;

  private String financialMarketInformationAdministrativePlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance exchange service call 
   * @return financialMarketInformationAdministrativePlanExchangeActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanExchangeActionTaskReference() {
    return financialMarketInformationAdministrativePlanExchangeActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanExchangeActionTaskReference(String financialMarketInformationAdministrativePlanExchangeActionTaskReference) {
    this.financialMarketInformationAdministrativePlanExchangeActionTaskReference = financialMarketInformationAdministrativePlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanExchangeActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanExchangeActionTaskRecord() {
    return financialMarketInformationAdministrativePlanExchangeActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanExchangeActionTaskRecord(Object financialMarketInformationAdministrativePlanExchangeActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanExchangeActionTaskRecord = financialMarketInformationAdministrativePlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return financialMarketInformationAdministrativePlanExchangeActionResponse
  **/

  public String getFinancialMarketInformationAdministrativePlanExchangeActionResponse() {
    return financialMarketInformationAdministrativePlanExchangeActionResponse;
  }

  public void setFinancialMarketInformationAdministrativePlanExchangeActionResponse(String financialMarketInformationAdministrativePlanExchangeActionResponse) {
    this.financialMarketInformationAdministrativePlanExchangeActionResponse = financialMarketInformationAdministrativePlanExchangeActionResponse;
  }


}

