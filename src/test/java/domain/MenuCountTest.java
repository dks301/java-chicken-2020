package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class MenuCountTest {
	@DisplayName("자연수가 아닌 메뉴 수량일 때 예외처리 확인")
	@Test
	void constructorTest() {
		assertThatThrownBy(() -> new MenuCount(0))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("최소");
	}
}
