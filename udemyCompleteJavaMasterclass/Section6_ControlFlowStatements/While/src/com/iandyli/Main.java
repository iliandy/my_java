package com.iandyli;

public class Main {
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 5;
        int endNum = 20;
        int countEvens = 0;

        while (num < endNum) {
            if (!isEvenNumber(num)) {
                num++;
                continue;
            }
            System.out.println(num + " is even.");
            countEvens++;
            num++;

            if (countEvens >= 5) {
                break;
            }
        }

        System.out.println("Total number of even numbers is " + countEvens + ".");
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

    }
}
