package controller;

import domain.Command;
import domain.Menu;
import domain.MenuRepository;
import domain.Tables;
import view.InputView;
import view.OutputView;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class Controller {
	private static final int STATUS_NORMAL = 0;

	public static void run() {
		start();
		exit();
	}

	private static void start() {
		Command command;
		do {
			command = readCommand();
			if (command.isOrder()) {
				order();
			}
			if (command.isPay()) {
				pay();
			}
		} while (!command.isExit());
	}

	private static void order() {
		final Tables tables = Tables.getInstance();
		OutputView.printTables(tables.getTables());
		try {
			final int tableNumber = InputView.inputTableNumber();
			final Menu menu = readMenu();
			final int menuCount = InputView.inputMenuCount();
			tables.addMenuTo(tableNumber, menu, menuCount);
		} catch (IllegalArgumentException e) {
			OutputView.printException(e);
			order();
		}
	}

	private static Menu readMenu() {
		try {
			OutputView.printMenus(MenuRepository.menus());
			int selectMenu = InputView.inputSelectMenu();
			return MenuRepository.getMenu(selectMenu);
		} catch (IllegalArgumentException e) {
			OutputView.printException(e);
			return readMenu();
		}
	}

	private static Command readCommand() {
		try {
			OutputView.printCommand();
			return new Command(InputView.inputCommand());
		} catch (IllegalArgumentException e) {
			OutputView.printException(e);
			return readCommand();
		}
	}

	private static void pay() {

	}

	private static void exit() {
		OutputView.printExit();
		System.exit(STATUS_NORMAL);
	}
}
