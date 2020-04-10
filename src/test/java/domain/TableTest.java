package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class TableTest {
	@DisplayName("테이블이 정상적으로 생성되는지 확인")
	@Test
	void constructorTest() {
		assertThat(new Table(1)).isInstanceOf(Table.class)
			.isNotNull();
	}

	@DisplayName("메뉴를 가지고 있지 않을때 false를 반환하는지 확인")
	@Test
	void hasMenu() {
		Table table = new Table(1);

		assertThat(table.hasMenu()).isFalse();
	}

	@DisplayName("정상적으로 add되는지 확인")
	@Test
	void addMenu() {
		Table table = new Table(1);

		table.addMenu(new Menu(1, "asdf", Category.CHICKEN, 10000));

		assertThat(table.hasMenu()).isTrue();
	}

	@DisplayName("정상적인 테이블 번호를 string으로 반환하는지 확인")
	@Test
	void testToString() {
		Table table = new Table(1);

		assertThat(table.toString()).isEqualTo("1");
	}

	@DisplayName("정상적으로 테이블 번호를 int로 반환하는지 확인")
	@Test
	void getNumber() {
		Table table = new Table(1);

		assertThat(table.getNumber()).isEqualTo(1);
	}
}