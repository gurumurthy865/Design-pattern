package com.example.demo.StructuralDesignPattern.Proxy.implementation;


import com.example.demo.StructuralDesignPattern.Proxy.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void getShape() {
        System.out.println("Rectangle shape");
    }
}
