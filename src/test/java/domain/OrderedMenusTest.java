package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class OrderedMenusTest {
	@DisplayName("menus가 주어졌을 때 주문 내역이 정상적으로 생성되는지 확인")
	@Test
	void constructorTest() {
		Menus menus = new Menus(
			Arrays.asList(new Menu(1, "asdf", Category.CHICKEN, 10000), new Menu(1, "asdf", Category.CHICKEN, 10000)));

		assertThat(new OrderedMenus(menus)).isNotNull();
	}

	@DisplayName("정상적인 주문 내역을 가져오는지 확인")
	@Test
	void getOrderedMenus() {
		Menus menus = new Menus(
			Arrays.asList(new Menu(1, "asdf", Category.CHICKEN, 10000), new Menu(1, "asdf", Category.CHICKEN, 10000)));

		assertThat(new OrderedMenus(menus).getOrderedMenus().containsKey(new Menu(1, "asdf", Category.CHICKEN, 10000)));
	}
}