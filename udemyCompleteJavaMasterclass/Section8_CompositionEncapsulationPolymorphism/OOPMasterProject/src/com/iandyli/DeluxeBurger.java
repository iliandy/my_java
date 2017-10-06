package com.iandyli;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Wagyu", "Ciabatta", 11.00);
        super.addHamburgerTopping1("Chips", 1.50);
        super.addHamburgerTopping2("Drink", 1.25);
    }

    @Override
    public DeluxeBurger addHamburgerTopping1(String name, double price) {
        System.out.println("Additional items can't be added to Deluxe Burger.");
        return this;
    }

    @Override
    public DeluxeBurger addHamburgerTopping2(String name, double price) {
        System.out.println("Additional items can't be added to Deluxe Burger.");
        return this;
    }

    @Override
    public DeluxeBurger addHamburgerTopping3(String name, double price) {
        System.out.println("Additional items can't be added to Deluxe Burger.");
        return this;
    }

    @Override
    public DeluxeBurger addHamburgerTopping4(String name, double price) {
        System.out.println("Additional items can't be added to Deluxe Burger.");
        return this;
    }
}
