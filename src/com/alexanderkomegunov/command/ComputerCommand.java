package com.alexanderkomegunov.command;

public class ComputerCommand implements Command{
    Computer computer;

    public ComputerCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.switchOnComputer();
    }
}
