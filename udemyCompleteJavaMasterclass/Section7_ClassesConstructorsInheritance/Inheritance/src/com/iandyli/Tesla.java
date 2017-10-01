package com.iandyli;

public class Tesla extends Car {
    private int year;
    private String model;
    private int motors;
    private int batteryCapacity;
    private boolean ludaOn;

    public Tesla(int year, String model, int motors, int batteryCapacity) {
        super(4, 7, 600, "black");
        this.year = year;
        this.model = model;
        this.motors = motors;
        this.batteryCapacity = batteryCapacity;
        this.ludaOn = false;
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

    public boolean getLudaOn() { return ludaOn; }

    public boolean toggleLudacrousMode() {
        String mode;

        if (ludaOn) {
            mode = "disabled";
        }
        else {
            mode = "enabled";
        }
        ludaOn = !ludaOn;
        System.out.println(String.format("Ludicrous Mode: %s", mode));
        return ludaOn;
    }
}
