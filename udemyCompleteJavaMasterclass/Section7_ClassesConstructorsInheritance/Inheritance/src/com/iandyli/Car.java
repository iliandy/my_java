package com.iandyli;

public class Car extends Vehicle {
    private int doors;
    private int seats;
    private int horsepower;
    private String color;

    public Car(int doors, int seats, int horsepower, String color) {
        super(4000, 4, "carbonSteel", "gasoline", "roads");
        this.doors = doors;
        this.seats = seats;
        this.horsepower = horsepower;
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getColor() {
        return color;
    }

    public Car changeGears(int gearNum) {
        System.out.printf(String.format("Changing gear to %d.", gearNum));
        return this;
    }
}
