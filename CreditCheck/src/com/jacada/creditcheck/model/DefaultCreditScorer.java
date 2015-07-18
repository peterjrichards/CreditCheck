package com.jacada.creditcheck.model;

import com.jacada.creditcheck.entities.Borrower;

public class DefaultCreditScorer implements CreditScorer {

	private final static int MIN_SCORE = 0;
	private final static int MAX_SCORE = 999;

	@Override
	public int requestCreditScore(Borrower borrower) {
		// Provide some predefined scores based on borrower
		if ("Smith".equalsIgnoreCase(borrower.getSurname()) &&
			"John".equalsIgnoreCase(borrower.getForename())) {
			return 856;
		} else if ("Smith".equalsIgnoreCase(borrower.getSurname()) &&
				   "Kerry".equalsIgnoreCase(borrower.getForename())) {
			return 212;
		} else if ("Palmer".equalsIgnoreCase(borrower.getSurname()) &&
				   "Kevin".equalsIgnoreCase(borrower.getForename())) {
			return 655;
		} else {
			// everything else is a random score
			return MIN_SCORE + (int)(Math.random() * ((MAX_SCORE - MIN_SCORE) + 1));
		}
	}

}
