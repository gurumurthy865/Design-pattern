package com.example.demo.CreationalDesignPattern.Prototype.Factory;

import com.example.demo.CreationalDesignPattern.Prototype.Implementation.Circle;
import com.example.demo.CreationalDesignPattern.Prototype.Implementation.Rectangle;
import com.example.demo.CreationalDesignPattern.Prototype.Interface.Shape;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
    public static void loadCache(){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        shapeMap.put("circle",circle);
        shapeMap.put("rectangle",rectangle);
    }

    public static Shape getShape(String shapeId){
       Shape cachedShape = shapeMap.get(shapeId);
       return (Shape) cachedShape.clone();
    }

}
