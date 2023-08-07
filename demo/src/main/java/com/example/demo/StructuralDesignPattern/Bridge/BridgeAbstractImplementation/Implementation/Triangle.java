package com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Implementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Color;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Shape;

public class Triangle extends Shape {

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void getShape() {
        System.out.println("Triangle shape with color " + color.getColor());
    }

}
