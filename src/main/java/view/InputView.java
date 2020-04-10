package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static int inputTableNumber() {
		System.out.println("## 주문할 테이블을 선택하세요.");
		return scanner.nextInt();
	}

	public static int inputCommand() {
		System.out.println("## 원하는 기능을 선택하세요.");
		try {
			String command = scanner.nextLine();
			return Integer.parseInt(command);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
			return inputCommand();
		}
	}
}
