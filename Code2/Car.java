package com.assignment5;

public class Car extends Vehicle{
    //2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.

    public void start() {
        System.out.println("The car has started");
    }


    public void stop() {
        System.out.println("The car has stopped");
    }
}
