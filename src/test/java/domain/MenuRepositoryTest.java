package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class MenuRepositoryTest {
	@DisplayName("기본 메뉴들을 정상적으로 반환하는지 사이즈 확인")
	@Test
	void menusTest() {
		assertThat(MenuRepository.menus().size()).isEqualTo(8);
	}

	@DisplayName("없는 메뉴 번호를 가져오려하면 예외처리하는지 확인")
	@Test
	void getMenu() {
		assertThatThrownBy(() -> MenuRepository.getMenu(7))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("존재하지");
	}
}