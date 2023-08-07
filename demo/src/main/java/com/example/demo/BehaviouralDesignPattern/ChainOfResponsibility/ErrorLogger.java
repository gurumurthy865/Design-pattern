package com.example.demo.BehaviouralDesignPattern.ChainOfResponsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int error) {
        this.level=error;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger "+message);
    }
}
