package com.jacada.creditcheck.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class DefaultApprovalManager implements ApprovalManager {

	private static final Currency EURO = Currency.getInstance("EUR");
	private static final Currency US = Currency.getInstance(Locale.US);
	private static final Currency UK = Currency.getInstance(Locale.UK);
	private static final Currency JAPAN = Currency.getInstance(Locale.JAPAN);

	@Override
	public ApprovalStatus requestApproval(int creditScore, Currency currency,
			BigDecimal loanAmount) {
		if (EURO.equals(currency)) {
			if (greaterThan(loanAmount, new BigDecimal(30000))) {
				return ApprovalStatus.APPROVAL_DECLINED;
			} else if (equalOrLessThan(loanAmount, new BigDecimal(30000))
					&& greaterThan(loanAmount, new BigDecimal(25000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(25000))
					&& greaterThan(loanAmount, new BigDecimal(15000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(15000))
					&& greaterThan(loanAmount, new BigDecimal(10000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(10000))
					&& greaterThan(loanAmount, new BigDecimal(5000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(5000))
					&& greaterThan(loanAmount, new BigDecimal(1000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(1000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else {
				return ApprovalStatus.APPROVAL_UNKNOWN;
			}
		} else if (US.equals(currency)) {
			if (greaterThan(loanAmount, new BigDecimal(50000))) {
				return ApprovalStatus.APPROVAL_DECLINED;
			} else if (equalOrLessThan(loanAmount, new BigDecimal(50000))
					&& greaterThan(loanAmount, new BigDecimal(37500))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(37500))
					&& greaterThan(loanAmount, new BigDecimal(30000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(30000))
					&& greaterThan(loanAmount, new BigDecimal(25000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(25000))
					&& greaterThan(loanAmount, new BigDecimal(17500))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(17500))
					&& greaterThan(loanAmount, new BigDecimal(12000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(12000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else {
				return ApprovalStatus.APPROVAL_UNKNOWN;
			}
		} else if (UK.equals(currency)) {
			if (greaterThan(loanAmount, new BigDecimal(25000))) {
				return ApprovalStatus.APPROVAL_DECLINED;
			} else if (equalOrLessThan(loanAmount, new BigDecimal(25000))
					&& greaterThan(loanAmount, new BigDecimal(20000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(20000))
					&& greaterThan(loanAmount, new BigDecimal(15000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(15000))
					&& greaterThan(loanAmount, new BigDecimal(10000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(10000))
					&& greaterThan(loanAmount, new BigDecimal(7500))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(7500))
					&& greaterThan(loanAmount, new BigDecimal(500))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(500))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else  {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else {
				return ApprovalStatus.APPROVAL_UNKNOWN;
			}
		} else if (JAPAN.equals(currency)) {
			if (greaterThan(loanAmount, new BigDecimal(5000000))) {
				return ApprovalStatus.APPROVAL_DECLINED;
			} else if (equalOrLessThan(loanAmount, new BigDecimal(5000000))
					&& greaterThan(loanAmount, new BigDecimal(3000000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(3000000))
					&& greaterThan(loanAmount, new BigDecimal(2000000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(2000000))
					&& greaterThan(loanAmount, new BigDecimal(1750000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(1750000))
					&& greaterThan(loanAmount, new BigDecimal(900000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(900000))
					&& greaterThan(loanAmount, new BigDecimal(500000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else if (equalOrLessThan(loanAmount, new BigDecimal(500000))) {
				if (creditScore > 800) {
					return ApprovalStatus.APPROVAL_APPROVED;
				} else if (creditScore > 350) {
					return ApprovalStatus.APPROVAL_HELD;
				} else {
					return ApprovalStatus.APPROVAL_DECLINED;
				}
			} else {
				return ApprovalStatus.APPROVAL_UNKNOWN;
			}
		} else {
			return ApprovalStatus.APPROVAL_UNKNOWN;
		}
	}

	private boolean equalOrLessThan(BigDecimal bg1, BigDecimal bg2) {
		return equalTo(bg1, bg2) || lessThan(bg1, bg2);
	}

	private boolean equalTo(BigDecimal bg1, BigDecimal bg2) {
		return bg1.compareTo(bg2) == 0;
	}

	private boolean lessThan(BigDecimal bg1, BigDecimal bg2) {
		return bg1.compareTo(bg2) == -1;
	}

	private boolean greaterThan(BigDecimal bg1, BigDecimal bg2) {
		return bg1.compareTo(bg2) == 1;
	}
}
