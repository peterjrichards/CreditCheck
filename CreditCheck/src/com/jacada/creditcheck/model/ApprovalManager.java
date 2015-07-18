package com.jacada.creditcheck.model;

import java.math.BigDecimal;
import java.util.Currency;

public interface ApprovalManager {
	ApprovalStatus requestApproval(int creditScore, Currency currency, BigDecimal loanAmount);
}
