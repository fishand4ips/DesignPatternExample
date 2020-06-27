package com.alexanderkomegunov.builder;

public class HumanBuilderIml implements HumanBuilder{

    Human human = new Human();

    @Override
    public HumanBuilder setName(String name) {
        human.name = name;
        return this;
    }

    @Override
    public HumanBuilder setSurname(String surname) {
        human.surname = surname;
        return this;
    }

    @Override
    public HumanBuilder setAge(int age) {
        human.age = age;
        return this;
    }

    @Override
    public Human build() {
        return human;
    }
}
