package domain;

import java.math.BigDecimal;
import java.util.Date;

import util.DateHelper;

public abstract class PaymentClassification {

	public abstract BigDecimal calculatePay(Paycheck pc);

	protected boolean isInPayPeriod(Date date, Paycheck pc) {
		return DateHelper.isBetween(date, pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate());
	}

}
