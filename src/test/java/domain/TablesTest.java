package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class TablesTest {
	@DisplayName("tables가 하나의 인스턴스만 생성되는지 확인")
	@Test
	void getInstance() {
		Tables tables = Tables.getInstance();
		assertThat(tables).isEqualTo(Tables.getInstance());
	}

	@DisplayName("유효하지 않은 테이블 번호에 메뉴를 추가하려고 할때 예외처리하는지 확인")
	@Test
	void addMenuTo() {
		Tables tables = Tables.getInstance();

		Menu menu = new Menu(1, "asdf", Category.CHICKEN, 10000);

		assertThatThrownBy(() -> tables.addMenuTo(10, menu, new MenuCount(1)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("유효하지 않은");

	}

	@DisplayName("정상적으로 테이블리스트를 반환하는지 확인")
	@Test
	void getTables() {
		Tables tables = Tables.getInstance();

		assertThat(tables.getTables()).isNotNull();
	}
}