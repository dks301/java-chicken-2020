package domain;

import java.util.List;

/**
 *    테이블 전체를 나타내는 일급 컬렉션 클래스입니다.
 *
 *    @author AnHyungJu
 */
public class Tables {
	private final List<Table> tables;

	private Tables(final List<Table> tables) {
		this.tables = tables;
	}

	public static Tables getInstance() {
		return TablesSingletonHolder.INSTANCE;
	}

	public void addMenuTo(int tableNumber, Menu menu, MenuCount menuCount) {
		Table targetTable = tables.stream()
			.filter(table -> table.getNumber() == tableNumber)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("유효하지 않은 테이블 번호입니다."));

		for (int i = 0; i < menuCount.getMenuCount(); i++) {
			targetTable.addMenu(menu);
		}
	}

	public List<Table> getTables() {
		return tables;
	}

	private static class TablesSingletonHolder {
		private static final Tables INSTANCE = new Tables(TableRepository.tables());
	}
}
