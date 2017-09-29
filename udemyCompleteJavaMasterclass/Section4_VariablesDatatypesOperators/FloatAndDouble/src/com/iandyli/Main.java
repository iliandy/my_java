package com.iandyli;

public class Main {

    public static void main(String[] args) {
//        Convert a given number of pounds to kilograms.
//        1. Create a variable to store number of pounds.
//        2. Calculate number of kilograms for number above and store in a variable.
//        3. Print out result.
//        NOTE: 1 lb = 0.45359237 kg
        double myLbs = 300d;
        double myLbsToKgs = 0.45359237d * myLbs;
        System.out.println("myLbsToKgs = " + myLbsToKgs);
    }
}
