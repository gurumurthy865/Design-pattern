package com.example.demo.BehaviouralDesignPattern.Command;

public class Stock {
    private String name;
    private int quantity;

    public void buy(){
        System.out.println("Bought "+ quantity +" quantity"+ name +"stock.");
    }

    public void sold(){
        System.out.println("Sold "+ quantity +" quantity"+ name +"stock.");
    }

}
