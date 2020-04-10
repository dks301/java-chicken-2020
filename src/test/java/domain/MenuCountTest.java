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
	@DisplayName("정상적으로 생성되는지 확인")
	@Test
	void constructorTest() {
		assertThat(new MenuCount(3)).isInstanceOf(MenuCount.class)
			.isNotNull();
	}

	@DisplayName("자연수가 아닌 메뉴 수량일 때 예외처리 확인")
	@Test
	void constructorTest2() {
		assertThatThrownBy(() -> new MenuCount(0))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("최소");
	}

	@DisplayName("정상적으로 메뉴 수량을 반환하는지 확인")
	@Test
	void getMenuCountTest() {
		assertThat(new MenuCount(3).getMenuCount()).isEqualTo(3);
	}
}
