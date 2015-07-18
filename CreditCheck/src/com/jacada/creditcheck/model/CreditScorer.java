package com.jacada.creditcheck.model;

import com.jacada.creditcheck.entities.Borrower;

public interface CreditScorer {
	int requestCreditScore(Borrower borrower);
}
