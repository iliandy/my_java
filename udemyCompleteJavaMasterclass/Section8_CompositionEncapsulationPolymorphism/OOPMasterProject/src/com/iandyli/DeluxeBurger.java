package com.iandyli;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Wagyu", "Ciabatta", 11.00);
        super.addHamburgerTopping1("Chips", 1.50);
        super.addHamburgerTopping2("Drink", 1.25);
    }
}
