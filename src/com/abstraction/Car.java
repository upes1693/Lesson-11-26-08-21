package com.abstraction;

//We can create an abstract class that extends abstract class
//and define some more abstract methods
public abstract class Car extends Vehicle {
    public Car(String engine){
        super(engine);
    }

    @Override
    public void startEngine(){
        System.out.println("car engine is running!");
    }

    @Override
    public void stopEngine() {
        System.out.println("car engine is stopped!");
    }

    public abstract void drift();
}
