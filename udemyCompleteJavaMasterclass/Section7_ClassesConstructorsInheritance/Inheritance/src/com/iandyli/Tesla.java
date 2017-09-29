package com.iandyli;

public class Tesla extends Car {
    private int year;
    private String model;
    private int motors;
    private int batteryCapacity;

    public Tesla(int year, String model, int motors, int batteryCapacity) {
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

    public boolean toggleLudacrousMode() {
        boolean state = true;

        System.out.println(String.format("Ludicrous Mode: %b", state));
        return !state;
    }
}
