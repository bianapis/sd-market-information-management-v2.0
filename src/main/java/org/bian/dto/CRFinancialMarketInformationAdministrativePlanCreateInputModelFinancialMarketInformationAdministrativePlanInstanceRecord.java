package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabase;
import org.bian.dto.CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService;

import javax.validation.Valid;
  
/**
 * CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord
 */
public class CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecord   {
  private CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService financialMarketInformationService = null;

  private CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabase financialMarketInformationDatabase = null;


  /**
   * Get financialMarketInformationService
   * @return financialMarketInformationService
  **/

  public CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService getFinancialMarketInformationService() {
    return financialMarketInformationService;
  }

  public void setFinancialMarketInformationService(CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationService financialMarketInformationService) {
    this.financialMarketInformationService = financialMarketInformationService;
  }


  /**
   * Get financialMarketInformationDatabase
   * @return financialMarketInformationDatabase
  **/

  public CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabase getFinancialMarketInformationDatabase() {
    return financialMarketInformationDatabase;
  }

  public void setFinancialMarketInformationDatabase(CRFinancialMarketInformationAdministrativePlanCreateInputModelFinancialMarketInformationAdministrativePlanInstanceRecordFinancialMarketInformationDatabase financialMarketInformationDatabase) {
    this.financialMarketInformationDatabase = financialMarketInformationDatabase;
  }


}
