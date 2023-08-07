package com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Implementation;


import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Color;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Shape;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
       this.color = color;
    }

    public Rectangle() {
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle shape with color "+ color.getColor());
    }

}
