package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Triangle shape");
    }
}
