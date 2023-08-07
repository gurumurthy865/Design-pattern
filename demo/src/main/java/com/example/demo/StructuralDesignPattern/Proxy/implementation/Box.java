package com.example.demo.StructuralDesignPattern.Proxy.implementation;


public class Box extends Rectangle {
    @Override
    public void getShape() {
        System.out.println("Box");
        super.getShape();
    }
}
