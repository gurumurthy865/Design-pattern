package com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Implementation;

import com.example.demo.StructuralDesignPattern.Bridge.BridgeAbstractImplementation.Interfaces.Color;

public class Blue implements Color {
    @Override
    public String getColor() {
        return "Blue";
    }
}
