package domain.strategy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class NoDiscountTest {
	@Test
	void discount() {
		assertThat(new NoDiscount().discount(10000)).isEqualTo(10000);
	}
}