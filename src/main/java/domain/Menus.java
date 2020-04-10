package domain;

import java.util.List;

/**
 *    메뉴들을 나타내는 클래스입니다.
 *
 *    @author AnHyungJu
 */
public class Menus {
	private List<Menu> menus;

	public Menus(List<Menu> menus) {
		this.menus = menus;
	}

	public boolean hasMenu() {
		return !menus.isEmpty();
	}

	public void add(Menu menu) {
		menus.add(menu);
	}
}
