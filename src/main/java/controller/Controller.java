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
	public static void run() {
		start();
		final List<Table> tables = TableRepository.tables();
		OutputView.printTables(tables);

		final int tableNumber = InputView.inputTableNumber();

		final List<Menu> menus = MenuRepository.menus();
		OutputView.printMenus(menus);
	}

	private static void start() {
		Command command = readCommand();
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
}
