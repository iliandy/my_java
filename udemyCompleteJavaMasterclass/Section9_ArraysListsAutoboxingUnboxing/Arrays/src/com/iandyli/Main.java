package com.iandyli;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num) {
        System.out.println(String.format("Please enter %d integers.\r", num));

        int[] ints = new int[num];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        return ints;
    }

    public static void printArray(int[] numArr) {
        System.out.println(Arrays.toString(numArr));
    }

    public static int[] sortIntegers(int[] numArr) {
        int[] sortedArr = Arrays.copyOf(numArr, numArr.length);
        Arrays.sort(sortedArr);
        return sortedArr;
    }


    public static void main(String[] args) {
	    int[] myInts = getIntegers(5);

	    printArray(myInts);
        printArray(sortIntegers(myInts));

    }
}
