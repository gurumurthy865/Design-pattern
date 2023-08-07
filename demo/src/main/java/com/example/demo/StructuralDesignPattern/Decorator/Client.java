package com.example.demo.StructuralDesignPattern.Decorator;



import com.example.demo.StructuralDesignPattern.Decorator.Factory.RedShapeDecorator;
import com.example.demo.StructuralDesignPattern.Decorator.Interface.Shape;
import com.example.demo.StructuralDesignPattern.Decorator.implementation.Rectangle;

public class Client {
    public void testFactoryMethod(){

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        redRectangle.getShape();
    }
}
