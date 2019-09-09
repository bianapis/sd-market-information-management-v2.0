package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanExecuteOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanExecuteOutputModel   {
  private String financialMarketInformationAdministrativePlanExecuteActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance execute service call 
   * @return financialMarketInformationAdministrativePlanExecuteActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanExecuteActionTaskReference() {
    return financialMarketInformationAdministrativePlanExecuteActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanExecuteActionTaskReference(String financialMarketInformationAdministrativePlanExecuteActionTaskReference) {
    this.financialMarketInformationAdministrativePlanExecuteActionTaskReference = financialMarketInformationAdministrativePlanExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

