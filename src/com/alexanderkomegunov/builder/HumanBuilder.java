package com.alexanderkomegunov.builder;

public interface HumanBuilder {
    HumanBuilder setName(String name);
    HumanBuilder setSurname(String surname);
    HumanBuilder setAge(int age);
    Human build();
}
