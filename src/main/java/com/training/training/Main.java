package com.training.training;


public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Tata", 100, "Nexon");

        car1.start();
        car1.fuelType();
        car1.setSpeed(100);
        car1.accelerate(20);
        car1.accelerate(30, 5);
        car1.stop();
    }
}
