package com.example.demo.BehaviouralDesignPattern.Command;

public class SellStock implements Order{

    @Override
    public void execute() {
        System.out.println("Selling stock");
    }
}
