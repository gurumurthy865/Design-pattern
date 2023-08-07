package com.example.demo.CreationalDesignPattern.FactoryMethod.implementation;

import com.example.demo.CreationalDesignPattern.FactoryMethod.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Triangle shape");
    }
}
