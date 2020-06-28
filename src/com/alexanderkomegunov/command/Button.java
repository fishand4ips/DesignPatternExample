package com.alexanderkomegunov.command;

public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pushButton(){
        command.execute();
    }
}
