package domain.strategy;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class ChickenDiscount implements DisCountStrategy {
	private static final int MANY_CHICKEN_DISCOUNT = 10000;

	@Override
	public double discount(double total) {
		return total - MANY_CHICKEN_DISCOUNT;
	}
}
