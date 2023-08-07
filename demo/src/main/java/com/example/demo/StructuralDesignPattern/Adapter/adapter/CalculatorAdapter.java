package com.example.demo.StructuralDesignPattern.Adapter.adapter;

import com.example.demo.StructuralDesignPattern.Adapter.Implementation.Calculator;
import com.example.demo.StructuralDesignPattern.Adapter.Interface.CalculatorInterface;
import com.example.demo.StructuralDesignPattern.Adapter.Interface.Rectangle;
import com.example.demo.StructuralDesignPattern.Adapter.adapter.Triangle;

public class CalculatorAdapter implements CalculatorInterface {

    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        Calculator cal = new Calculator();
        Rectangle r = null;
        if(triangle instanceof Triangle){
            r = new Rectangle(triangle.base,triangle.height/2);
        }
//        else{
//            Rectangle r = new Rectangle(3.142*r*r);
//        }

        return cal.getArea(r);
    }
}

