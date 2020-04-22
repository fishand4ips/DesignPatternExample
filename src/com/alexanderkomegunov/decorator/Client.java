package com.alexanderkomegunov.decorator;

public class Client {
    public static void main(String[] args) {
        Developer developer = new MyJavaCode(new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper())));
        System.out.print(developer.makeJob());
    }
}
