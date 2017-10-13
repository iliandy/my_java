package com.iandyli;

import a.b.c.d.*;

import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));

        System.out.println(ExampleClass.something());
        System.out.println(MyClass.thing());
    }
}
