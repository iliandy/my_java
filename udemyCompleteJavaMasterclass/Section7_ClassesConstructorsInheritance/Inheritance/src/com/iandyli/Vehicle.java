package com.iandyli;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Vehicle {
    private int weight;
    private int wheels;
    private String constructionMaterial;
    private String energySource;
    private String terrainType;

    public Vehicle(int weight, int wheels, String constructionMaterial, String energySource, String terrainType) {
        this.weight = weight;
        this.wheels = wheels;
        this.constructionMaterial = constructionMaterial;
        this.energySource = energySource;
        this.terrainType = terrainType;
    }

    public int getWeight() {
        return weight;
    }

    public int getWheels() {
        return wheels;
    }

    public String getConstructionMaterial() {
        return constructionMaterial;
    }

    public String getEnergySource() {
        return energySource;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public Vehicle steering(String direction) {
        System.out.println(String.format("Steering %s...", direction));
        return this;
    }

    public Vehicle changeGears(int gearNum) {
        System.out.printf(String.format("Changing gear to %d.", gearNum));
        return this;
    }

    public Vehicle move(double speed) {
        System.out.println(String.format("Moved at %f mph.", speed));
        return this;
    }
}
