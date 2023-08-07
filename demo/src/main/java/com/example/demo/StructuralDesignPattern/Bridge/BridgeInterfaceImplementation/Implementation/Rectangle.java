package com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation;


import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Color;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Shape;

public class Rectangle implements Shape {

    Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle shape with color "+ color.getColor());
    }

}
