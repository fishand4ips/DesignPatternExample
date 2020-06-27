package com.alexanderkomegunov.bridge;

public class CheckBridgePattern {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new BMW());
        vehicle1.drive();

        Vehicle vehicle2 = new Truck(new BMW());
        vehicle2.drive();

        Vehicle vehicle3 = new Car(new Audi());
        vehicle3.drive();

        Vehicle vehicle4 = new Truck(new Audi());
        vehicle4.drive();
    }
}
