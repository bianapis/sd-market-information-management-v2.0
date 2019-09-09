/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class MarketInformationManagementApiController {

	@Autowired
	MarketInformationManagementApiService service;
	
	@Administer.Activate
	public BianResponse<SDMarketInformationManagementActivateOutputModel> activate(@RequestBody BianRequest<SDMarketInformationManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Administer.Capture
	public BianResponse<BQReportingCaptureOutputModel> captureReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReportingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureReporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDMarketInformationManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketInformationManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRFinancialMarketInformationAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Create
	public BianResponse<CRFinancialMarketInformationAdministrativePlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Administer.Create
	public BianResponse<BQReportingCreateOutputModel> createReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQReportingCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createReporting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Exchange
	public BianResponse<CRFinancialMarketInformationAdministrativePlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Administer.Execute
	public BianResponse<BQReportingExecuteOutputModel> executeReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReportingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeReporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Execute
	public BianResponse<CRFinancialMarketInformationAdministrativePlanExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDMarketInformationManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketInformationManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Grant
	public BianResponse<CRFinancialMarketInformationAdministrativePlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Administer.Request
	public BianResponse<BQReportingRequestOutputModel> requestReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReportingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestReporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRFinancialMarketInformationAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Retrieve
	public BianResponse<BQConsolidationRetrieveOutputModel> retrieveConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("improvement")
	@Administer.Retrieve
	public BianResponse<BQImprovementRetrieveOutputModel> retrieveImprovement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveImprovement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reporting")
	@Administer.Retrieve
	public BianResponse<BQReportingRetrieveOutputModel> retrieveReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRFinancialMarketInformationAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDMarketInformationManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRFinancialMarketInformationAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialMarketInformationAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reporting")
	@Administer.Update
	public BianResponse<BQReportingUpdateOutputModel> updateReporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReportingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
