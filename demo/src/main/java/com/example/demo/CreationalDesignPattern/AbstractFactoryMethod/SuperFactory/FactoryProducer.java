package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.SuperFactory;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories.AbstractFactory;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories.ColorFactory;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice == "Shape"){
            return new ShapeFactory();
        } else if (choice == "Color") {
            return new ColorFactory();
        }
        return null;
    }

}

