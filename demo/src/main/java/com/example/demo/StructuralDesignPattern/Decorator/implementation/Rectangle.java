package com.example.demo.StructuralDesignPattern.Decorator.implementation;


import com.example.demo.StructuralDesignPattern.Decorator.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Rectangle shape");
    }
}
