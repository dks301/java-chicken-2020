package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static int inputTableNumber() {
		System.out.println("## 주문할 테이블을 선택하세요.");
		try {
			String tableNumber = scanner.nextLine();
			return Integer.parseInt(tableNumber);
		} catch (NumberFormatException e) {
			System.out.println("테이블의 숫자를 입력해주세요.");
			return inputTableNumber();
		}
	}

	public static int inputCommand() {
		System.out.println("## 원하는 기능을 선택하세요.");
		try {
			String command = scanner.nextLine();
			return Integer.parseInt(command);
		} catch (NumberFormatException e) {
			System.out.println("명령어의 숫자를 입력해주세요.");
			return inputCommand();
		}
	}

	public static int inputSelectMenu() {
		System.out.println("## 등록할 메뉴를 선택하세요.");
		try {
			String menu = scanner.nextLine();
			return Integer.parseInt(menu);
		} catch (NumberFormatException e) {
			System.out.println("메뉴의 숫자를 입력해주세요");
			return inputSelectMenu();
		}
	}

	public static int inputMenuCount() {
		System.out.println("## 메뉴의 수량을 입력해주세요.");
		try {
			String menuCount = scanner.nextLine();
			return Integer.parseInt(menuCount);
		} catch (NumberFormatException e) {
			System.out.println("수량을 숫자로 입력해주세요.");
			return inputMenuCount();
		}
	}
}
