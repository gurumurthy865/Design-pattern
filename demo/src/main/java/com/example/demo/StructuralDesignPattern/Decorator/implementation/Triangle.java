package com.example.demo.StructuralDesignPattern.Decorator.implementation;


import com.example.demo.StructuralDesignPattern.Decorator.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Triangle shape");
    }
}
