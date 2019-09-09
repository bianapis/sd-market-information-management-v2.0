/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketInformationManagementApiServiceImpl implements MarketInformationManagementApiService {

	public SDMarketInformationManagementActivateOutputModel activate(SDMarketInformationManagementActivateInputModel request){
		return JsonReader.read("activate-SDMarketInformationManagementActivateOutputModel.json",new TypeReference<SDMarketInformationManagementActivateOutputModel>(){});
	}
	
	public BQReportingCaptureOutputModel captureReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingCaptureInputModel request){
		return JsonReader.read("capture-BQReportingCaptureOutputModel.json",new TypeReference<BQReportingCaptureOutputModel>(){});
	}
	
	public SDMarketInformationManagementConfigureOutputModel configure(String sdReferenceId, SDMarketInformationManagementConfigureInputModel request){
		return JsonReader.read("configure-SDMarketInformationManagementConfigureOutputModel.json",new TypeReference<SDMarketInformationManagementConfigureOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRFinancialMarketInformationAdministrativePlanControlOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanControlOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanCreateOutputModel create(String sdReferenceId, CRFinancialMarketInformationAdministrativePlanCreateInputModel request){
		return JsonReader.read("create-CRFinancialMarketInformationAdministrativePlanCreateOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanCreateOutputModel>(){});
	}
	
	public BQReportingCreateOutputModel createReporting(String sdReferenceId, String crReferenceId, BQReportingCreateInputModel request){
		return JsonReader.read("create-BQReportingCreateOutputModel.json",new TypeReference<BQReportingCreateOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanExchangeInputModel request){
		return JsonReader.read("exchange-CRFinancialMarketInformationAdministrativePlanExchangeOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanExchangeOutputModel>(){});
	}
	
	public BQReportingExecuteOutputModel executeReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingExecuteInputModel request){
		return JsonReader.read("execute-BQReportingExecuteOutputModel.json",new TypeReference<BQReportingExecuteOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanExecuteInputModel request){
		return JsonReader.read("execute-CRFinancialMarketInformationAdministrativePlanExecuteOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanExecuteOutputModel>(){});
	}
	
	public SDMarketInformationManagementFeedbackOutputModel feedback(String sdReferenceId, SDMarketInformationManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketInformationManagementFeedbackOutputModel.json",new TypeReference<SDMarketInformationManagementFeedbackOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanGrantInputModel request){
		return JsonReader.read("grant-CRFinancialMarketInformationAdministrativePlanGrantOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanGrantOutputModel>(){});
	}
	
	public BQReportingRequestOutputModel requestReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingRequestInputModel request){
		return JsonReader.read("request-BQReportingRequestOutputModel.json",new TypeReference<BQReportingRequestOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRFinancialMarketInformationAdministrativePlanRequestOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanRequestOutputModel>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQImprovementRetrieveOutputModel retrieveImprovement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQImprovementRetrieveOutputModel.json",new TypeReference<BQImprovementRetrieveOutputModel>(){});
	}
	
	public BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReportingRetrieveOutputModel.json",new TypeReference<BQReportingRetrieveOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMarketInformationManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketInformationManagementRetrieveOutputModel.json",new TypeReference<SDMarketInformationManagementRetrieveOutputModel>(){});
	}
	
	public CRFinancialMarketInformationAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialMarketInformationAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRFinancialMarketInformationAdministrativePlanUpdateOutputModel.json",new TypeReference<CRFinancialMarketInformationAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQReportingUpdateOutputModel updateReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingUpdateInputModel request){
		return JsonReader.read("update-BQReportingUpdateOutputModel.json",new TypeReference<BQReportingUpdateOutputModel>(){});
	}
	
}
