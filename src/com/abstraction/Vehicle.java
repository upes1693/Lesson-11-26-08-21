package com.abstraction;

//Sometimes we may come across a situation where we cannot provide
//implementation to all the methods in a class. We want to leave the
//implementation to a class that extends it. In such case we declare a class
//as abstract.To make a class abstract we use the abstract keyword.
//Any class that contains one or more abstract methods is declared as abstract.
//If we don’t declare class as abstract which contains abstract methods we get
//compile time error.

//Abstraction is also the process of hiding the implementation details and showing only
// functionality to the user.

//Abstraction can be achieved with either abstract classes or interfaces
//The abstract keyword is a non-access modifier, used for classes and methods
//Abstract class: is a restricted class that cannot be used to create objects
//(to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body.
//The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
public abstract class Vehicle {
    private String engine;

    public Vehicle(String engine){
        this.engine=engine;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public String getEngine(){
        return engine;
    }

    public void drive(){
        System.out.println("Driving");
    }
}
