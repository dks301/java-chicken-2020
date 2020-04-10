package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class OrderedMenus {
	private Map<Menu, Integer> orderedMenus;

	public OrderedMenus(Menus menus) {
		this.orderedMenus = new HashMap<>();
		for (Menu menu : menus.getMenus()) {
			if (orderedMenus.containsKey(menu)) {
				orderedMenus.put(menu, orderedMenus.get(menu) + 1);
				continue;
			}
			orderedMenus.put(menu, 1);
		}
	}

	public Map<Menu, Integer> getOrderedMenus() {
		return orderedMenus;
	}
}
