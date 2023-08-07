package com.example.demo.StructuralDesignPattern.Decorator.Factory;

import com.example.demo.StructuralDesignPattern.Decorator.Interface.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.getShape();
    }
}
