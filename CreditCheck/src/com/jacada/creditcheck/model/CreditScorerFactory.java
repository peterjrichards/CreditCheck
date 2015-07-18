package com.jacada.creditcheck.model;

public class CreditScorerFactory {
	public static CreditScorer getInstance() {
		return new DefaultCreditScorer();
	}
}
