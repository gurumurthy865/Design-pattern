package com.example.demo.StructuralDesignPattern.Facade.implementation;


import com.example.demo.StructuralDesignPattern.Facade.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Triangle shape");
    }
}
