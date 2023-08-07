package com.example.demo.StructuralDesignPattern.Decorator.Factory;

import com.example.demo.StructuralDesignPattern.Decorator.Interface.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    @Override
    public void getShape() {
        decoratedShape.getShape();
        setRedBorder(decoratedShape);
    }
}
