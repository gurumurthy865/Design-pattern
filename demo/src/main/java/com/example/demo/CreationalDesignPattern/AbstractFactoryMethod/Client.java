package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories.AbstractFactory;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.SuperFactory.FactoryProducer;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;


public class Client {

    public void testAbstractFactoryMethod(){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShape("Triangle");
        shape.getShape();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color = colorFactory.getColor("Red");
        color.getColor();
    }
}
