package com.example.demo.StructuralDesignPattern.Flyweight.Factory;


import com.example.demo.StructuralDesignPattern.Flyweight.Interface.Shape;
import com.example.demo.StructuralDesignPattern.Flyweight.implementation.Rectangle;
import com.example.demo.StructuralDesignPattern.Flyweight.implementation.Triangle;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public FlyweightFactory() {
    }

    public static enum ShapeType{
        RECTANGLE,TRIANGLE;
    }
    private static final Map<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape>();

    public Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.RECTANGLE)) {
                shapeImpl = new Rectangle();
            } else if (type.equals(ShapeType.TRIANGLE)) {
                shapeImpl = new Triangle();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }


}
