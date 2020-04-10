package domain;

/**
 *    메뉴 수량을 나타내는 클래스입니다.
 *
 *    @author AnHyungJu
 */
public class MenuCount {
	private static final int MINIMUM = 1;

	private int menuCount;

	public MenuCount(int menuCount) {
		validate(menuCount);
		this.menuCount = menuCount;
	}

	private void validate(int menuCount) {
		if (menuCount < MINIMUM) {
			throw new IllegalArgumentException("최소 1이상 주문해야 합니다.");
		}
	}

	public int getMenuCount() {
		return menuCount;
	}
}
