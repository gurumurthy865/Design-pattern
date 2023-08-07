package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation.Rectangle;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation.Triangle;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;

public class ShapeFactory implements AbstractFactory {
     @Override
    public Shape getShape(String shape) {
         if(shape == "Rectangle"){
             return new Rectangle();
         }
         return new Triangle();
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
