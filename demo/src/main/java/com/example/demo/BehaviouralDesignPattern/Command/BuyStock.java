package com.example.demo.BehaviouralDesignPattern.Command;

public class BuyStock implements Order{
    @Override
    public void execute() {
        System.out.println("Buying stock");
    }
}
