package com.iandyli;

public class Main {
    public static void main(String[] args) {
        // print size of args
        System.out.println(String.format("args-size: %d", args.length));

        /**
         * print arg per line
         */
        for (int i=0; i < args.length; i++) {
            System.out.println(String.format("args[%d] = %s", i, args[i]));
        }

    }

    /**
     *
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
