package com.example.demo.StructuralDesignPattern.Composite;

import com.example.demo.StructuralDesignPattern.Composite.Implementation.Rectangle;
import com.example.demo.StructuralDesignPattern.Composite.Implementation.Triangle;
import com.example.demo.StructuralDesignPattern.Composite.Interface.Shape;

public class Client {
    public void testComposite(){
        Shape rectangleShape = new Rectangle(1,"rect");
        Shape rectangleShape1 = new Rectangle(1,"rect");
        Shape triangleShape = new Triangle(1,"tri");
        CompositeShape compositeShape = new CompositeShape();
        compositeShape.addShape(rectangleShape);
        compositeShape.addShape(rectangleShape1);
        compositeShape.addShape(triangleShape);
        compositeShape.getShape();
    }
}
