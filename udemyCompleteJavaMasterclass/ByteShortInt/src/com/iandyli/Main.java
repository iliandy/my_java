package com.iandyli;

public class Main {

    public static void main(String[] args) {
        // int has width of 32
        int myMinVal = -2_147_483_648;
        int myMaxVal = 2_147_483_647;
        int myTotal = myMinVal/2;
        System.out.println("myTotal = " + myTotal);

        // byte has width of 8
        byte myByteVal = -128;
        byte myNewByte = (byte) (myByteVal/2);
        System.out.println("myNewByte = " + myNewByte);

        // short has width of 16
        short myShortVal = 32767;
        short myNewShort = (short) (myShortVal/2);

        // long has width of 64
        long myLongVal = -9_223_372_036_854_775_807L;
    }
}
