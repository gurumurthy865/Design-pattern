package com.example.demo.CreationalDesignPattern.Prototype;

import com.example.demo.CreationalDesignPattern.Prototype.Factory.ShapeCache;
import com.example.demo.CreationalDesignPattern.Prototype.Interface.Shape;

public class Client {
    public void testProtoType(){
		ShapeCache.loadCache();
		Shape clonedShape = ShapeCache.getShape("rectangle");
		clonedShape.draw();
    }
}
