package com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Color;

public class Blue implements Color {
    @Override
    public String getColor() {
        return "Blue";
    }
}
