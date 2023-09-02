package org.example.customer;

public class Customer {
    public void order(String menuName, Menu menu, Chief chief) {
        MenuItem menuItem = menu.choose(menuName);
        chief.makeCook(menuItem);
    }
}
