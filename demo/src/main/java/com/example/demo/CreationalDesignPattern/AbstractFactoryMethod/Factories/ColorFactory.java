package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation.Blue;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Implementation.Red;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;

public class ColorFactory implements  AbstractFactory {


    @Override
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color){
        if(color == "Red"){
            return new Red();
        }
        return new Blue();
    }

}
