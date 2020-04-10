package domain.strategy;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class CashDiscount implements DisCountStrategy {

	private static final double CASH_DISCOUNT_RATE = 0.95;

	@Override
	public double discount(double total) {
		return total * CASH_DISCOUNT_RATE;
	}
}
