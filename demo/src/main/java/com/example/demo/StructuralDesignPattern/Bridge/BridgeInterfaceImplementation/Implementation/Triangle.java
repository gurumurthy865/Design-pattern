package com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Color;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Shape;

public class Triangle implements Shape {
    Color color;
    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void getShape() {
        System.out.println("Triangle shape with color " + color.getColor());
    }

}
