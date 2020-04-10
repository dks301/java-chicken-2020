package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class PayTest {
	@DisplayName("유효하지 않은 방법을 선택하면 예외처리 확인")
	@Test
	void constructorTest() {
		assertThatThrownBy(() -> new Pay(0, 10000))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("유효하지");
	}
}