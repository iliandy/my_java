package com.iandyli;

public class Tesla extends Car {
    private int year;
    private String model;
    private int motors;
    private int batteryCapacity;
    private boolean ludiOn;

    public Tesla(int year, String model, int motors, int batteryCapacity) {
        super(4, 7, 600, "black");
        this.year = year;
        this.model = model;
        this.motors = motors;
        this.batteryCapacity = batteryCapacity;
        this.ludiOn = false;
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

    public boolean getLudaOn() { return ludiOn; }

    public boolean toggleLudicrousMode() {
        String mode;

        if (ludiOn) {
            mode = "disabled";
        }
        else {
            mode = "enabled";
        }
        ludiOn = !ludiOn;
        System.out.println(String.format("Ludicrous Mode: %s", mode));
        return ludiOn;
    }
}
