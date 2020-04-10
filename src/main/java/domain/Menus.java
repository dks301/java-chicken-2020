package domain;

import java.util.List;

/**
 *    메뉴들을 나타내는 클래스입니다.
 *
 *    @author AnHyungJu
 */
public class Menus {
	private static final int MAXIMUM = 99;
	private List<Menu> menus;

	public Menus(List<Menu> menus) {
		this.menus = menus;
	}

	public boolean hasMenu() {
		return !menus.isEmpty();
	}

	public void add(Menu menu) {
		if (menus.stream()
			.filter(m -> m.equals(menu))
			.count() >= MAXIMUM) {
			throw new IllegalArgumentException("한 메뉴의 최대 수량은 99개 입니다.");
		}
		menus.add(menu);
	}

	public List<Menu> getMenus() {
		return menus;
	}
}
