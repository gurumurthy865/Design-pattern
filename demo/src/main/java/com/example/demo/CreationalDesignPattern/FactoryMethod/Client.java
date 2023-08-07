package com.example.demo.CreationalDesignPattern.FactoryMethod;


import com.example.demo.CreationalDesignPattern.FactoryMethod.Factory.ShapeFactory;
import com.example.demo.CreationalDesignPattern.FactoryMethod.Interface.Shape;
import com.example.demo.CreationalDesignPattern.FactoryMethod.implementation.Rectangle;
import com.example.demo.CreationalDesignPattern.FactoryMethod.implementation.Triangle;

public class Client {
    public static void testFactoryMethod(){
        ShapeFactory factoryMethod = new ShapeFactory();
        Shape rectangleShape = factoryMethod.getShape("Rectangle");
        rectangleShape.getShape();
        Shape triangleShape = factoryMethod.getShape("Triangle");
        triangleShape.getShape();
    }

    public static void main(String[] args) {
        testFactoryMethod();
    }

}
