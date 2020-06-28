package com.alexanderkomegunov.chain_of_responsibility;

public abstract class Number {
    public Number number;

    public Number(Number number) {
        this.number = number;
    }

    public void process(int n){
        if (number != null){
            number.process(n);
        }
    }
}
