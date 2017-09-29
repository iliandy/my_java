package com.iandyli;

public class Main {
    public static void main(String[] args) {
//        1. Create a byte variable and set it to any valid byte number.
//        2. Create a short variable and set it to any valid short number.
//        3. Create a int variable and set it to any valid int number.
//        4. Create a long variable, make it equal to 50000 + 10 times sum of byte, plus short plus int

        byte myByte = 10;
        short myShort = 30;
        int myInt = 100;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("myLong = " + myLong);
    }
}