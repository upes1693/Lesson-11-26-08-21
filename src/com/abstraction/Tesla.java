package com.abstraction;

public class Tesla extends Car{
    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void drift() {
        System.out.println("Tesla is drifting");
    }

    public Tesla(String engine) {
        super(engine);
    }
}
