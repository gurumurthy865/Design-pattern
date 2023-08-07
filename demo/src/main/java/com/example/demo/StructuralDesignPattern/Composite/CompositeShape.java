package com.example.demo.StructuralDesignPattern.Composite;

import com.example.demo.StructuralDesignPattern.Composite.Interface.Shape;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void getShape() {
        for (Shape shape : shapeList) {
            shape.getShape();
        }
    }

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public void removeShape(Shape shape){
        shapeList.remove(shape);
    }

}
