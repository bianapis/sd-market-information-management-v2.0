package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanGrantInputModel
 */
public class CRFinancialMarketInformationAdministrativePlanGrantInputModel   {
  private String marketInformationManagementServicingSessionReference = null;

  private String financialMarketInformationAdministrativePlanInstanceReference = null;

  private Object financialMarketInformationAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRFinancialMarketInformationAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return financialMarketInformationAdministrativePlanGrantActionTaskRecord
  **/

  public Object getFinancialMarketInformationAdministrativePlanGrantActionTaskRecord() {
    return financialMarketInformationAdministrativePlanGrantActionTaskRecord;
  }

  public void setFinancialMarketInformationAdministrativePlanGrantActionTaskRecord(Object financialMarketInformationAdministrativePlanGrantActionTaskRecord) {
    this.financialMarketInformationAdministrativePlanGrantActionTaskRecord = financialMarketInformationAdministrativePlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRFinancialMarketInformationAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

