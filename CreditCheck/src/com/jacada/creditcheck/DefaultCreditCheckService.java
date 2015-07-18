package com.jacada.creditcheck;

import javax.jws.WebService;

import com.jacada.creditcheck.entities.Borrower;
import com.jacada.creditcheck.entities.CreditCheckRequest;
import com.jacada.creditcheck.entities.CreditCheckResponse;
import com.jacada.creditcheck.model.ApprovalManager;
import com.jacada.creditcheck.model.ApprovalManagerFactory;
import com.jacada.creditcheck.model.ApprovalStatus;
import com.jacada.creditcheck.model.CreditScorer;
import com.jacada.creditcheck.model.CreditScorerFactory;

@WebService(
        portName = "CreditCheckHttpPort",
        serviceName = "CreditCheckService",
        targetNamespace = "http://jacada.com/creditcheck",
        endpointInterface = "com.jacada.creditcheck.CreditCheckService")
public class DefaultCreditCheckService implements CreditCheckService {
	private CreditScorer creditScorer;
	private ApprovalManager approvalManager;
	
	public DefaultCreditCheckService() {
		creditScorer = CreditScorerFactory.getInstance();
		approvalManager = ApprovalManagerFactory.getInstance();
	}
	
	@Override
	public CreditCheckResponse creditCheck(CreditCheckRequest request) {
		CreditCheckResponse response = new CreditCheckResponse();
		try {
			Borrower borrower = new Borrower();
			borrower.setPostcode(request.getPostcode());
			borrower.setHouseNameOrNumber(request.getHouseNameOrNumber());
			borrower.setForename(request.getForename());
			borrower.setSurname(request.getSurname());
			
			int creditScore = creditScorer.requestCreditScore(borrower);
			ApprovalStatus status = approvalManager.requestApproval(creditScore, request.getLoanCurrency(), request.getLoanAmount());
			response.setCreditScore(creditScore);
			response.setStatus(status.toString());
		} catch (Exception e) {
			// Normally handle error but in this case, credit status is unknown
			response.setCreditScore(0);
			response.setStatus(ApprovalStatus.APPROVAL_UNKNOWN.toString());
		}
		return response;
	}
}
