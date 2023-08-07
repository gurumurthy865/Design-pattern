package com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Implementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeInterfaceImplementation.Interfaces.Color;

public class Red implements Color {
    @Override
    public String getColor() {
        return "Red";
    }
}
