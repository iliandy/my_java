package com.iandyli;

public class Couch {
    private String material;
    private int seats;
    private boolean sleeper;

    public Couch(String material, int seats, boolean sleeper) {
        this.material = material;
        this.seats = seats;
        this.sleeper = sleeper;
    }

    public String getMaterial() {
        return material;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSleeper() {
        return sleeper;
    }

    public void recline() {
        System.out.println("Couch is reclining...");
    }
}
