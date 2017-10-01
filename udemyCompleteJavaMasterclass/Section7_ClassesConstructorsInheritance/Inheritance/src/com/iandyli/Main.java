package com.iandyli;

public class Main {

    public static void main(String[] args) {
        Vehicle myBike = new Vehicle(20, 2, "carbon", "myLegs", "road");
        System.out.println(String.format("My bike is made of %s.", myBike.getConstructionMaterial()));

        Car myAccord = new Car(4, 5, 244, "silver");
        System.out.println(String.format("My Accord is made of %s and is %s.", myAccord.getConstructionMaterial(), myAccord.getColor()));

        Tesla myModel3 = new Tesla(2018, "3", 2, 74);
        System.out.println(String.format("My Model 3 is made of %s and is %s and has %d motors.", myModel3.getConstructionMaterial(), myModel3.getColor(), myModel3.getMotors()));
        myModel3.toggleLudacrousMode();
        myModel3.toggleLudacrousMode();
    }
}
