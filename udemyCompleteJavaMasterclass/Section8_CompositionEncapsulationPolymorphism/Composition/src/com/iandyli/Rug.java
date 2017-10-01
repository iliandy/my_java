package com.iandyli;

public class Rug {
    private double length;
    private double width;
    private String material;

    public Rug(double length, double width, String material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public double getArea() {
        double area = this.length * this.width;
        System.out.println(String.format("Rug area is %.2f sq ft.", area));
        return area;
    }

    public String getMaterial() {
        return material;
    }

    public void cleanRug() {
        System.out.println("Rug is being cleaned...");
    }
}
