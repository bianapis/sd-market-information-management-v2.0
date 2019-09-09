/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketInformationManagementApiService {

	SDMarketInformationManagementActivateOutputModel activate(SDMarketInformationManagementActivateInputModel request);
	
	BQReportingCaptureOutputModel captureReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingCaptureInputModel request);
	
	SDMarketInformationManagementConfigureOutputModel configure(String sdReferenceId, SDMarketInformationManagementConfigureInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanControlInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanCreateOutputModel create(String sdReferenceId, CRFinancialMarketInformationAdministrativePlanCreateInputModel request);
	
	BQReportingCreateOutputModel createReporting(String sdReferenceId, String crReferenceId, BQReportingCreateInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanExchangeInputModel request);
	
	BQReportingExecuteOutputModel executeReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingExecuteInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanExecuteInputModel request);
	
	SDMarketInformationManagementFeedbackOutputModel feedback(String sdReferenceId, SDMarketInformationManagementFeedbackInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanGrantInputModel request);
	
	BQReportingRequestOutputModel requestReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingRequestInputModel request);
	
	CRFinancialMarketInformationAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanRequestInputModel request);
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQImprovementRetrieveOutputModel retrieveImprovement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMarketInformationManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialMarketInformationAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanUpdateInputModel request);
	
	BQReportingUpdateOutputModel updateReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingUpdateInputModel request);
	
}
