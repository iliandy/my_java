package com.iandyli;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    private String color;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.color = "white";
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public Car startEngine() {
        System.out.println("Starting car engine...");
        return this;
    }

    public Car accelerate() {
        System.out.println("Accelerating...");
        return this;
    }

    public Car brake() {
        System.out.println("Braking...");
        return this;
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public Tesla startEngine() {
        System.out.println("Push button start with quiet electric engine...");
        return this;
    }

    @Override
    public Tesla accelerate() {
        System.out.println("Accelerating 0 - 60 mph in 5.1 sec.");
        return this;
    }

    @Override
    public Tesla brake() {
        System.out.println("Regenerative braking system.");
        return this;
    }
}

class Honda extends Car {
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public Honda accelerate() {
        System.out.println("Accelerating 0 - 60 mph in 7.5 sec.");
        return this;
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public Toyota accelerate() {
        System.out.println("Accelerating 0 - 60 mph in 8.3 sec.");
        return this;
    }
}

public class Main {

    public static void main(String[] args) {
	    Car myChiron = new Car(16, "Chiron");
	    myChiron.startEngine().accelerate().brake();
        System.out.println(String.format("Number of cylinders: %d", myChiron.getCylinders()));
        System.out.println(String.format("Name of car model: %s \n", myChiron.getName()));;

	    Tesla myModel3 = new Tesla(0, "Model 3");
	    myModel3.startEngine().accelerate().brake();
        System.out.println(String.format("Number of cylinders: %d", myModel3.getCylinders()));
        System.out.println(String.format("Name of car model: %s \n", myModel3.getName()));

        Honda myCRV = new Honda(4, "CRV");
        myCRV.startEngine().accelerate().brake();
        System.out.println(String.format("Number of cylinders: %d", myCRV.getCylinders()));
        System.out.println(String.format("Name of car model: %s \n", myCRV.getName()));

        Toyota myRAV4 = new Toyota(4, "RAV4");
        myRAV4.startEngine().accelerate().brake();
        System.out.println(String.format("Number of cylinders: %d", myRAV4.getCylinders()));
        System.out.println(String.format("Name of car model: %s \n", myRAV4.getName()));
    }
}
