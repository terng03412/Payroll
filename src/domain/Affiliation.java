package domain;

import java.math.BigDecimal;

public interface Affiliation {

	BigDecimal calculateDeductions(Paycheck pc);

}
