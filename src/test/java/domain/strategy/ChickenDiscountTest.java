package domain.strategy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class ChickenDiscountTest {

	@Test
	void discount() {
		assertThat(new ChickenDiscount().discount(10000)).isEqualTo(0);
	}
}