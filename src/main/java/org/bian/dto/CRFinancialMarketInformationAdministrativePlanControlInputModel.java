package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanControlInputModelFinancialMarketInformationAdministrativePlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanControlInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanControlInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanControlActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanControlInputModelFinancialMarketInformationAdministrativePlanControlActionRequest financialMarketInformationAdministrativePlanControlActionRequest = null;


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
   * Get financialMarketInformationAdministrativePlanControlActionRequest
   * @return financialMarketInformationAdministrativePlanControlActionRequest
  **/

  public CRFinancialMarketInformationAdministrativePlanControlInputModelFinancialMarketInformationAdministrativePlanControlActionRequest getFinancialMarketInformationAdministrativePlanControlActionRequest() {
    return financialMarketInformationAdministrativePlanControlActionRequest;
  }

  public void setFinancialMarketInformationAdministrativePlanControlActionRequest(CRFinancialMarketInformationAdministrativePlanControlInputModelFinancialMarketInformationAdministrativePlanControlActionRequest financialMarketInformationAdministrativePlanControlActionRequest) {
    this.financialMarketInformationAdministrativePlanControlActionRequest = financialMarketInformationAdministrativePlanControlActionRequest;
  }


}

