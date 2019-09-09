package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanExecuteInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanExecuteInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanExecuteActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanExecuteActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanExecuteActionTaskRecord() {
    return financialMarketInformationAdministrativePlanExecuteActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanExecuteActionTaskRecord(Object financialMarketInformationAdministrativePlanExecuteActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanExecuteActionTaskRecord = financialMarketInformationAdministrativePlanExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFinancialMarketInformationAdministrativePlanExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

