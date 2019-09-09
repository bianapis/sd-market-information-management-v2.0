package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanUpdateOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanUpdateOutputModel   {
  private String financialMarketInformationAdministrativePlanUpdateActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialMarketInformationAdministrativePlanUpdateActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanUpdateActionTaskReference() {
    return financialMarketInformationAdministrativePlanUpdateActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanUpdateActionTaskReference(String financialMarketInformationAdministrativePlanUpdateActionTaskReference) {
    this.financialMarketInformationAdministrativePlanUpdateActionTaskReference = financialMarketInformationAdministrativePlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

