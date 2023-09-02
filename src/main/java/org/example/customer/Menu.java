package org.example.customer;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String menuName) {
        return menuItems.stream()
            .filter(menuItem -> menuItem.matches(menuName))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("해당하는 메뉴가 없습니다."));
    }
}
