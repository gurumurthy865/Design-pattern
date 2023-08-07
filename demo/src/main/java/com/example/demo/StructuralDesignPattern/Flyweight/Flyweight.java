package com.example.demo.StructuralDesignPattern.Flyweight;


import com.example.demo.StructuralDesignPattern.Flyweight.Factory.FlyweightFactory;
import com.example.demo.StructuralDesignPattern.Flyweight.Interface.Shape;
import com.example.demo.StructuralDesignPattern.Flyweight.implementation.Rectangle;

import static com.example.demo.StructuralDesignPattern.Flyweight.Factory.FlyweightFactory.ShapeType.RECTANGLE;

public class Flyweight {
    public void testFlyweightMethod(){
        FlyweightFactory factory = new FlyweightFactory();
        Shape shape = factory.getShape(RECTANGLE);
        System.out.println(shape.getClass());


    }
}

//https://www.digitalocean.com/community/tutorials/flyweight-design-pattern-java
//https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/