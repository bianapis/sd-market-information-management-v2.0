package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanGrantOutputModel
 */
public class CRFinancialMarketInformationAdministrativePlanGrantOutputModel   {
  private String financialMarketInformationAdministrativePlanGrantActionTaskReference = null;

  private Object financialMarketInformationAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRFinancialMarketInformationAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Market Information Administrative Plan instance grant service call 
   * @return financialMarketInformationAdministrativePlanGrantActionTaskReference
  **/

  public String getFinancialMarketInformationAdministrativePlanGrantActionTaskReference() {
    return financialMarketInformationAdministrativePlanGrantActionTaskReference;
  }

  public void setFinancialMarketInformationAdministrativePlanGrantActionTaskReference(String financialMarketInformationAdministrativePlanGrantActionTaskReference) {
    this.financialMarketInformationAdministrativePlanGrantActionTaskReference = financialMarketInformationAdministrativePlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRFinancialMarketInformationAdministrativePlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRFinancialMarketInformationAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

