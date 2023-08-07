package com.example.demo.StructuralDesignPattern.Flyweight.implementation;


import com.example.demo.StructuralDesignPattern.Flyweight.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Rectangle shape");
    }
}
