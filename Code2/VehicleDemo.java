package com.assignment5;

public class VehicleDemo {
    //2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        Bus b=new Bus();
        v.start();
        v.stop();
        c.start();
        c.stop();
        b.start();
        b.stop();
    }
}
