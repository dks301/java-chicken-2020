package domain;

import java.util.ArrayList;

public class Table {
	private final int number;
	private Menus menus;

	public Table(final int number) {
		this.number = number;
		this.menus = new Menus(new ArrayList<>());
	}

	public boolean hasMenu() {
		return menus.hasMenu();
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	@Override
	public String toString() {
		return Integer.toString(number);
	}

	public int getNumber() {
		return number;
	}

	public Menus getMenus() {
		return menus;
	}
}
