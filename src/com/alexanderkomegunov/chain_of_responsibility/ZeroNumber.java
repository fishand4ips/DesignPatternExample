package com.alexanderkomegunov.chain_of_responsibility;

public class ZeroNumber extends Number {

    public ZeroNumber(Number number) {
        super(number);
    }

    public void process(int n) {
        if (n == 0){
            System.out.println("This is zero: " + n);
        } else {
            super.process(n);
        }
    }
}
