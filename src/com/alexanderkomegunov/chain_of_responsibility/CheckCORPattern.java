package com.alexanderkomegunov.chain_of_responsibility;

public class CheckCORPattern {
    public static void main(String[] args) {
        Number number = new NegativeNumber(new ZeroNumber(new PositiveNumber(null)));

        number.process(10);
        number.process(0);
        number.process(-10);
    }
}
