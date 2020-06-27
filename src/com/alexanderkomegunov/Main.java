package com.alexanderkomegunov;

public class Main {
    public static void main(String[] args) {



        Test test = new Test();

        test.show();

    }

    static class Test {

        public String name = "Sasha";
        public Integer age = 21;

        public Test() {

        }

        {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("name " + name + " age " + age);
        }
    }

}
