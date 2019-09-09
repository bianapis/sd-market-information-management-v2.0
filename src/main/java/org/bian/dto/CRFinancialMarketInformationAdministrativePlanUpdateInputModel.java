package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanUpdateInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanUpdateInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanUpdateActionTaskRecord() {
    return financialMarketInformationAdministrativePlanUpdateActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanUpdateActionTaskRecord(Object financialMarketInformationAdministrativePlanUpdateActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanUpdateActionTaskRecord = financialMarketInformationAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

