package com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Implementation.Rectangle;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Implementation.Red;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Shape;

public class Client {
    public void testBridge(){
        Shape shape1 = new Rectangle();
        Shape shape = new Rectangle(new Red());

        shape.getShape();
    }
}
