package com.example.demo.CreationalDesignPattern.FactoryMethod.implementation;


import com.example.demo.CreationalDesignPattern.FactoryMethod.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Rectangle shape");
    }
}
