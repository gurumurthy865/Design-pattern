package com.example.demo.StructuralDesignPattern.Flyweight.implementation;


import com.example.demo.StructuralDesignPattern.Flyweight.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Triangle shape");
    }
}
