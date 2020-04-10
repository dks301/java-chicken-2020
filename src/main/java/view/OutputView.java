package view;

import java.util.List;
import java.util.Map;

import domain.Menu;
import domain.OrderedMenus;
import domain.Table;

public class OutputView {
	private static final String TOP_LINE = "┌ ─ ┐";
	private static final String TABLE_FORMAT = "| %s |";
	private static final String BOTTOM_LINE = "└ ─ ┘";
	private static final String BOTTOM_PAYED_LINE = "└ $ ┘";

	public static void printTables(final List<Table> tables) {
		System.out.println("## 테이블 목록");
		final int size = tables.size();
		printLine(TOP_LINE, size);
		printTableNumbers(tables);
		printBottomLine(tables, size);
	}

	public static void printMenus(final List<Menu> menus) {
		for (final Menu menu : menus) {
			System.out.println(menu);
		}
	}

	private static void printBottomLine(final List<Table> tables, final int count) {
		for (int index = 0; index < count; index++) {
			if (tables.get(index).hasMenu()) {
				System.out.print(BOTTOM_PAYED_LINE);
				continue;
			}
			System.out.print(BOTTOM_LINE);
		}
		System.out.println();
	}

	private static void printLine(final String line, final int count) {
		for (int index = 0; index < count; index++) {
			System.out.print(line);
		}
		System.out.println();
	}

	private static void printTableNumbers(final List<Table> tables) {
		for (final Table table : tables) {
			System.out.printf(TABLE_FORMAT, table);
		}
		System.out.println();
	}

	public static void printCommand() {
		System.out.println("##메인화면");
		System.out.println("1 - 주문등록");
		System.out.println("2 - 결제하기");
		System.out.println("3 - 프로그램 종료");
	}

	public static void printException(Exception e) {
		System.out.println(e.getMessage());
	}

	public static void printExit() {
		System.out.println("프로그램을 종료합니다.");
	}

	public static void printOrderedMenus(OrderedMenus orderedMenus) {
		System.out.println("## 주문 내역");
		System.out.println("메뉴 수량 금액");
		Map<Menu, Integer> ordered = orderedMenus.getOrderedMenus();

		for (Menu menu : ordered.keySet()) {
			System.out.println(String.format("%s %d %d", menu.getName(), ordered.get(menu), menu.getPrice()));
		}
	}
}
