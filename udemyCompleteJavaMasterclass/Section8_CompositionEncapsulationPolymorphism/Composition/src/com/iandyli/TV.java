package com.iandyli;

public class TV {
    private String manufacturer;
    private String model;
    private String technology;

    public TV(String manufacturer, String model, String technology) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.technology = technology;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getTechnology() {
        return technology;
    }

    public void turnOn() {
        System.out.println(String.format("%s %s is being turned on...", this.manufacturer, this.model));
    }

    public void changeCh(int channel) {
        System.out.println(String.format("TV channel is changed to %d.", channel));
    }
}
