package domain;

import domain.strategy.CashDiscount;
import domain.strategy.DisCountStrategy;
import domain.strategy.NoDiscount;

/**
 *    주문 결제를 나타내는 클래스입니다.
 *
 *    @author AnHyungJu
 */
public class Pay {
	private static final int CARD = 1;
	private static final int CASH = 2;

	private final int payType;
	private double totalPay;
	private DisCountStrategy disCountStrategy;

	public Pay(final int payType, final double totalPay) {
		validate(payType);
		this.payType = payType;
		this.totalPay = totalPay;
		this.disCountStrategy = new NoDiscount();
	}

	private void validate(int payType) {
		if (payType != CARD && payType != CASH) {
			throw new IllegalArgumentException("유효하지 않은 계산 방법입니다.");
		}
	}

	public double getTotalPay() {
		if (payType == CASH) {
			disCountStrategy = new CashDiscount();
		}
		return disCountStrategy.discount(totalPay);
	}
}
