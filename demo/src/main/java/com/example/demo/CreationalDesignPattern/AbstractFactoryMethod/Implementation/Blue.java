package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;

public class Blue implements Color {
    @Override
    public void getColor() {
        System.out.println("Blue color");
    }
}
