package controller;

import java.util.List;

import domain.Command;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
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
		final List<Table> tables = TableRepository.tables();
		OutputView.printTables(tables);

		final int tableNumber = InputView.inputTableNumber();
		final List<Menu> menus = MenuRepository.menus();
		OutputView.printMenus(menus);
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
