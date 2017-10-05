package com.iandyli;

public class HealthyBurger extends Hamburger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, "Brown Rye Roll", price);
    }

    public HealthyBurger addHealthyTopping1(String name, double price) {
        this.healthyTopping1Name = name;
        this.healthyTopping1Price = price;
        return this;
    }

    public HealthyBurger addHealthyTopping2(String name, double price) {
        this.healthyTopping2Name = name;
        this.healthyTopping2Price = price;
        return this;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyTopping1Name != null) {
            hamburgerPrice += this.healthyTopping1Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.healthyTopping1Name, this.healthyTopping1Price));
        }
        if (this.healthyTopping2Name != null) {
            hamburgerPrice += this.healthyTopping2Price;
            System.out.println(String.format("Added %s for additional $%.2f.", this.healthyTopping2Name, this.healthyTopping2Price));
        }
        return hamburgerPrice;
    }
}
