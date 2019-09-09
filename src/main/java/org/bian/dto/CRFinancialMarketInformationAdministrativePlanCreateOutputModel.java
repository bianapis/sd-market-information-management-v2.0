package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanCreateOutputModel   {
  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private String financialMarketInformationAdministrativePlanCreateActionReference = null;

  private Object financialMarketInformationAdministrativePlanCreateActionRecord = null;

  private String financialMarketInformationAdministrativePlanInstanceStatus = null;

  private CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return financialMarketInformationAdministrativePlanCreateActionReference
  **/

  public String getFinancialMarketInformationAdministrativePlanCreateActionReference() {
    return financialMarketInformationAdministrativePlanCreateActionReference;
  }

  public void setFinancialMarketInformationAdministrativePlanCreateActionReference(String financialMarketInformationAdministrativePlanCreateActionReference) {
    this.financialMarketInformationAdministrativePlanCreateActionReference = financialMarketInformationAdministrativePlanCreateActionReference;
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

  public CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord getFinancialMarketInformationAdministrativePlanInstanceRecord() {
    return financialMarketInformationAdministrativePlanInstanceRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanInstanceRecord(CRFinancialMarketInformationAdministrativePlanCreateOutputModelFinancialMarketInformationAdministrativePlanInstanceRecord financialMarketInformationAdministrativePlanInstanceRecord) {
    this.financialMarketInformationAdministrativePlanInstanceRecord = financialMarketInformationAdministrativePlanInstanceRecord;
  }


}

