package com.abstraction;

public abstract class Airplane extends Vehicle{
    public abstract void startEngine();

    public abstract void stopEngine();

    public Airplane(String engine) {
        super(engine);
    }
}
