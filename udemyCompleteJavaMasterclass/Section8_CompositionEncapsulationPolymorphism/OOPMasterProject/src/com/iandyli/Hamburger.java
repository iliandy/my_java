package com.iandyli;

public class Hamburger {
    private String name;
    private String meat;
    private String bread;
    private double price;

    private String topping1Name;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    private String topping3Name;
    private double topping3Price;

    private String topping4Name;
    private double topping4Price;

    public Hamburger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public Hamburger addHamburgerTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
        return this;
    }

    public Hamburger addHamburgerTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
        return this;
    }

    public Hamburger addHamburgerTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
        return this;
    }

    public Hamburger addHamburgerTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
        return this;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(String.format("%s hamburger with %s on a %s is priced at $%.2f.", this.name, this.meat, this.bread, this.price));

        if (this.topping1Name != null) {
            hamburgerPrice += this.topping1Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.topping1Name, this.topping1Price));
        }
        if (this.topping2Name != null) {
            hamburgerPrice += this.topping2Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.topping2Name, this.topping2Price));
        }
        if (this.topping3Name != null) {
            hamburgerPrice += this.topping3Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.topping3Name, this.topping3Price));
        }
        if (this.topping4Name != null) {
            hamburgerPrice += this.topping4Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.topping4Name, this.topping4Price));
        }

        return hamburgerPrice;
    }


}
