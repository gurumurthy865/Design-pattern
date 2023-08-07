package com.example.demo.StructuralDesignPattern.Adapter.Implementation;

import com.example.demo.StructuralDesignPattern.Adapter.Interface.CalculatorInterface;
import com.example.demo.StructuralDesignPattern.Adapter.Interface.Rectangle;

public class Calculator implements CalculatorInterface {
    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
