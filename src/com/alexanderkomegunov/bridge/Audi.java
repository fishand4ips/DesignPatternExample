package com.alexanderkomegunov.bridge;

public class Audi implements Model{
    @Override
    public void drive(String s) {
        System.out.println(s + " Audi");
    }
}
