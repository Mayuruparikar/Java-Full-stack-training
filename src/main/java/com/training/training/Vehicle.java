package com.training.training;

public abstract class Vehicle implements Machine {
    private String brand;  // Encapsulation
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter and Setter (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //abstract method
    abstract void fuelType();

    public void stop() {
        System.out.println(brand + " has stopped.");
    }
}
