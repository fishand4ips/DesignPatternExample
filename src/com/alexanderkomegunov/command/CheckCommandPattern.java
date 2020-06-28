package com.alexanderkomegunov.command;

public class CheckCommandPattern {
    public static void main(String[] args) {
        Button button = new Button(new ComputerCommand(new Computer()));
        button.pushButton();
    }
}
