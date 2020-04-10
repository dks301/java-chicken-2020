package domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class MenusTest {
	@DisplayName("한 메뉴를 100개 넣으면 예외처리하는지 확인")
	@Test
	void addTest() {
		Menus menus = new Menus(new ArrayList<>());
		for (int i = 0; i < 99; i++) {
			menus.add(new Menu(1, "asdf", Category.CHICKEN, 10000));
		}

		assertThatThrownBy(() -> menus.add(new Menu(1, "asdf", Category.CHICKEN, 10000)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("최대");
	}

	@DisplayName("메뉴가 하나도 없으면 false를 반환하는지 확인")
	@Test
	void hasMenu() {
		Menus menus = new Menus(new ArrayList<>());

		assertThat(menus.hasMenu()).isFalse();
	}
}
