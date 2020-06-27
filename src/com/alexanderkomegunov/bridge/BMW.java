package com.alexanderkomegunov.bridge;

public class BMW implements Model{
    @Override
    public void drive(String s) {
        System.out.println(s + " BMW");
    }
}
