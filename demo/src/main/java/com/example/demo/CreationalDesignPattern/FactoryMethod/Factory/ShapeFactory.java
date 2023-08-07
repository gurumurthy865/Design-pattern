package com.example.demo.CreationalDesignPattern.FactoryMethod.Factory;


import com.example.demo.CreationalDesignPattern.FactoryMethod.Interface.Shape;
import com.example.demo.CreationalDesignPattern.FactoryMethod.implementation.Rectangle;
import com.example.demo.CreationalDesignPattern.FactoryMethod.implementation.Triangle;

public class ShapeFactory  {

    public Shape getShape(String shape) {
         if(shape == "Rectangle"){
             return new Rectangle();
         } else if (shape == "Triangle") {
             return new Triangle();
         }
        return null;
    }

}
