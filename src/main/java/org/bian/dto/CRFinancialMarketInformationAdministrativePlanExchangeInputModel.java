package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanExchangeInputModelFinancialMarketInformationAdministrativePlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanExchangeInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanExchangeInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanExchangeActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanExchangeInputModelFinancialMarketInformationAdministrativePlanExchangeActionRequest financialMarketInformationAdministrativePlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketInformationManagementServicingSessionReference
  **/

  public String getMarketInformationManagementServicingSessionReference() {
    return marketInformationManagementServicingSessionReference;
  }

  public void setMarketInformationManagementServicingSessionReference(String marketInformationManagementServicingSessionReference) {
    this.marketInformationManagementServicingSessionReference = marketInformationManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Market Information Administrative Plan instance 
   * @return financialMarketInformationAdministrativePlanInstanceReference
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceReference() {
    return financialMarketInformationAdministrativePlanInstanceReference;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceReference(String financialMarketInformationAdministrativePlanInstanceReference) {
    this.financialMarketInformationAdministrativePlanInstanceReference = financialMarketInformationAdministrativePlanInstanceReference;
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
   * Get financialMarketInformationAdministrativePlanExchangeActionRequest
   * @return financialMarketInformationAdministrativePlanExchangeActionRequest
  **/

  public CRFinancialMarketInformationAdministrativePlanExchangeInputModelFinancialMarketInformationAdministrativePlanExchangeActionRequest getFinancialMarketInformationAdministrativePlanExchangeActionRequest() {
    return financialMarketInformationAdministrativePlanExchangeActionRequest;
  }

  public void setFinancialMarketInformationAdministrativePlanExchangeActionRequest(CRFinancialMarketInformationAdministrativePlanExchangeInputModelFinancialMarketInformationAdministrativePlanExchangeActionRequest financialMarketInformationAdministrativePlanExchangeActionRequest) {
    this.financialMarketInformationAdministrativePlanExchangeActionRequest = financialMarketInformationAdministrativePlanExchangeActionRequest;
  }


}

