package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;

public class Red implements Color {
    @Override
    public void getColor() {
        System.out.println("Red color");
    }
}
