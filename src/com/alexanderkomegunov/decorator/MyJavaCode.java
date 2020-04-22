package com.alexanderkomegunov.decorator;

public class MyJavaCode extends DeveloperDecorator{

    public MyJavaCode(Developer developer) {
        super(developer);
    }

    public String betterCode(){
        return "writing the best code in the world...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + betterCode();
    }
}
