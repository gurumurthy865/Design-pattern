package com.example.demo.StructuralDesignPattern.Proxy;

import com.example.demo.StructuralDesignPattern.Proxy.Interface.Shape;
import com.example.demo.StructuralDesignPattern.Proxy.implementation.Box;

public class Client {
    public void testFlyweightMethod(){
        Shape shape = new Box();
        shape.getShape();

    }
}

//https://www.digitalocean.com/community/tutorials/flyweight-design-pattern-java
//https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/