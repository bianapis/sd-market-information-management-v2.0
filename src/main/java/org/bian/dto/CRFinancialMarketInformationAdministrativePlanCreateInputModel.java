package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanCreateInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private Object financialMarketInformationAdministrativePlanCreateActionRecord = null;

  private String financialMarketInformationAdministrativePlanInstanceStatus = null;

  private CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return financialMarketInformationAdministrativePlanCreateActionRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanCreateActionRecord() {
    return financialMarketInformationAdministrativePlanCreateActionRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanCreateActionRecord(Object financialMarketInformationAdministrativePlanCreateActionRecord) {
    this.financialMarketInformationAdministrativePlanCreateActionRecord = financialMarketInformationAdministrativePlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Market Information Administrative Plan instance (e.g. initialised, pending, active) 
   * @return financialMarketInformationAdministrativePlanInstanceStatus
  **/

  public String getFinancialMarketInformationAdministrativePlanInstanceStatus() {
    return financialMarketInformationAdministrativePlanInstanceStatus;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceStatus(String financialMarketInformationAdministrativePlanInstanceStatus) {
    this.financialMarketInformationAdministrativePlanInstanceStatus = financialMarketInformationAdministrativePlanInstanceStatus;
  }


  /**
   * Get financialMarketInformationAdministrativePlanInstanceRecord
   * @return financialMarketInformationAdministrativePlanInstanceRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord getFinancialMarketInformationAdministrativePlanInstanceRecord() {
    return financialMarketInformationAdministrativePlanInstanceRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceRecord(CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord) {
    this.financialMarketInformationAdministrativePlanInstanceRecord = financialMarketInformationAdministrativePlanInstanceRecord;
  }


}

