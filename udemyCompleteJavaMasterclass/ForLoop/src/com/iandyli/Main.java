package com.iandyli;

import java.util.Collections;

public class Main {
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        double myAmt = 10000;
        for (int i = 2; i <= 8; i++) {
            System.out.println(myAmt + " amount at " + i + "% interest is " + String.format("%.2f", calculateInterest(myAmt, (double) i)));
        }

        System.out.println(String.join("", Collections.nCopies(30, "-")));

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int i = 8; i >= 2; i--) {
            System.out.println(myAmt + " amount at " + i + "% interest is " + String.format("%.2f", calculateInterest(myAmt, (double) i)));
        }

        System.out.println(String.join("", Collections.nCopies(30, "-")));

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int primeNums = 0;
        for (int i = 0; i < 101; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime.");
                primeNums++;
                if (primeNums == 3) {
                    break;
                }
            }
        }

    }
}
