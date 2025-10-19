package com.training.training;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    @Override
    void fuelType() {
        System.out.println(model + " uses petrol.");
    }

    @Override
    public void start() {
        System.out.println(model + " is starting...");
    }

    public void accelerate(int increase) {
        setSpeed(getSpeed() + increase);
        System.out.println(model + " speed is now " + getSpeed());
    }

    public void accelerate(int increase, int time) {
        setSpeed(getSpeed() + increase);
        System.out.println(model + " increased speed by " + increase + " in " + time + " seconds.");
    }
}
