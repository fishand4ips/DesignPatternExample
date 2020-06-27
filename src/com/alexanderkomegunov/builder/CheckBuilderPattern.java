package com.alexanderkomegunov.builder;

public class CheckBuilderPattern {
    public static void main(String[] args) {
        Human human = new HumanBuilderIml()
                .setName("Sasha")
                .setSurname("Viktorovich")
                .setAge(25)
                .build();
        human.display();
    }
}
