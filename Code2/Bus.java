package com.assignment5;

public class Bus extends Vehicle{
    //2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.

    public void start() {
        System.out.println("The bus has started");
    }

    public void stop() {
        System.out.println("The bus has stopped");
    }
}
