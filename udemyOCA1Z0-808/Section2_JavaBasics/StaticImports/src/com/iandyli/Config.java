package com.iandyli;

public class Config {
    public static final String NAME = "myName";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig() {
        System.out.println(String.format("name = %s, columnCount = %d", NAME, MAX_COLUMN_COUNT));
    }
}
