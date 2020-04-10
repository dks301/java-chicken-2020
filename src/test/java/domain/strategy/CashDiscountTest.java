package domain.strategy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class CashDiscountTest {

	@Test
	void discount() {
		assertThat(new CashDiscount().discount(10000)).isEqualTo(10000 * 0.95);
	}
}