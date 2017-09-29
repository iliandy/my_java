package com.iandyli;

public class Tesla extends Car {
    private int year;
    private String model;
    private int motors;
    private int batteryCapacity;

    public Tesla(int doors, int seats, int horsepower, String color, int year, String model, int motors, int batteryCapacity) {
        super(4, 7, 600, "black");
        this.year = year;
        this.model = model;
        this.motors = motors;
        this.batteryCapacity = batteryCapacity;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getMotors() {
        return motors;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
