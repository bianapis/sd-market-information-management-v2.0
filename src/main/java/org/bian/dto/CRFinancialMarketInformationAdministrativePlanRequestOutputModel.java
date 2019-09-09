package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRequestOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanRequestOutputModel   {
  private String financialMarketInformationAdministrativePlanRequestActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance request service call 
   * @return financialMarketInformationAdministrativePlanRequestActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanRequestActionTaskReference() {
    return financialMarketInformationAdministrativePlanRequestActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanRequestActionTaskReference(String financialMarketInformationAdministrativePlanRequestActionTaskReference) {
    this.financialMarketInformationAdministrativePlanRequestActionTaskReference = financialMarketInformationAdministrativePlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanRequestActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanRequestActionTaskRecord() {
    return financialMarketInformationAdministrativePlanRequestActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanRequestActionTaskRecord(Object financialMarketInformationAdministrativePlanRequestActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanRequestActionTaskRecord = financialMarketInformationAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

