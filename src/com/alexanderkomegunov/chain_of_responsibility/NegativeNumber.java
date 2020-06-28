package com.alexanderkomegunov.chain_of_responsibility;

public class NegativeNumber extends Number {
    public NegativeNumber(Number number) {
        super(number);
    }

    public void process(int n) {
        if (n < 0){
            System.out.println("This is negative number: " + n);
        } else {
            super.process(n);
        }
    }
}
