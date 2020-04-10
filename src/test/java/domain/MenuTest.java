package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class MenuTest {
	@DisplayName("정상적으로 생성되는지 확인")
	@Test
	void constructorTest() {
		Menu menu = new Menu(1, "asdf", Category.CHICKEN, 10000);

		assertThat(menu.getNumber()).isEqualTo(1);
	}

	@DisplayName("정상적인 포멧의 string을 반환하는지 확인")
	@Test
	void toStringTest() {
		Menu menu = new Menu(1, "asdf", Category.CHICKEN, 10000);

		assertThat(menu.toString()).isInstanceOf(String.class)
			.isEqualTo("[치킨] 1 - asdf : 10000원");
	}
}
