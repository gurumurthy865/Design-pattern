package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Rectangle shape");
    }
}
