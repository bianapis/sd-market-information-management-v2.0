package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanRequestInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanRequestInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanRequestActionTaskRecord = null;

  private CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFinancialMarketInformationAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

