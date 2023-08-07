package com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation.Rectangle;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation.Red;
import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Shape;

public class BridgeInterface {
    public void testBridge(){
        Shape shape = new Rectangle(new Red());
        shape.getShape();
    }
}
