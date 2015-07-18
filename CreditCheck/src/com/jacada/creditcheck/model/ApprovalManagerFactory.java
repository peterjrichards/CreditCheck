package com.jacada.creditcheck.model;

public class ApprovalManagerFactory {
	public static ApprovalManager getInstance() {
		return new DefaultApprovalManager();
	}
}
