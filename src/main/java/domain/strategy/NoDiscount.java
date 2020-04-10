package domain.strategy;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class NoDiscount implements DisCountStrategy {
	@Override
	public double discount(double total) {
		return total;
	}
}
