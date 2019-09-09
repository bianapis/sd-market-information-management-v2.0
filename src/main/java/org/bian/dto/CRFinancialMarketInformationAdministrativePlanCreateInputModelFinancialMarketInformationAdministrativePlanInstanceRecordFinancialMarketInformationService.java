package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService
 */
public class CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService   {
  private String financialMarketInformationProvider = null;

  private String financialMarketinformationDescription = null;

  private String financialMarketInformationServiceType = null;

  private String financialMarketInformationServiceSchedule = null;

  private String financialMarketInformationServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The external agency/source of financial market information 
   * @return financialMarketInformationProvider
  **/

  public String getFinancialMarketInformationProvider() {
    return financialMarketInformationProvider;
  }

  public void setFinancialMarketInformationProvider(String financialMarketInformationProvider) {
    this.financialMarketInformationProvider = financialMarketInformationProvider;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the scope/content of the financial market information 
   * @return financialMarketinformationDescription
  **/

  public String getFinancialMarketinformationDescription() {
    return financialMarketinformationDescription;
  }

  public void setFinancialMarketinformationDescription(String financialMarketinformationDescription) {
    this.financialMarketinformationDescription = financialMarketinformationDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of information service (e.g. a regular feed, periodic report) 
   * @return financialMarketInformationServiceType
  **/

  public String getFinancialMarketInformationServiceType() {
    return financialMarketInformationServiceType;
  }

  public void setFinancialMarketInformationServiceType(String financialMarketInformationServiceType) {
    this.financialMarketInformationServiceType = financialMarketInformationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sets out the delivery schedule for content 
   * @return financialMarketInformationServiceSchedule
  **/

  public String getFinancialMarketInformationServiceSchedule() {
    return financialMarketInformationServiceSchedule;
  }

  public void setFinancialMarketInformationServiceSchedule(String financialMarketInformationServiceSchedule) {
    this.financialMarketInformationServiceSchedule = financialMarketInformationServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to any agreement covering access to the external service 
   * @return financialMarketInformationServiceAgreement
  **/

  public String getFinancialMarketInformationServiceAgreement() {
    return financialMarketInformationServiceAgreement;
  }

  public void setFinancialMarketInformationServiceAgreement(String financialMarketInformationServiceAgreement) {
    this.financialMarketInformationServiceAgreement = financialMarketInformationServiceAgreement;
  }


}

