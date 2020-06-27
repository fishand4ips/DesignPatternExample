package com.alexanderkomegunov.bridge;

public class Truck extends Vehicle {

    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Truck");
    }
}
