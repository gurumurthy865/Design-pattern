package com.example.demo.CreationalDesignPattern.Prototype.Implementation;

import com.example.demo.CreationalDesignPattern.Prototype.Interface.Shape;
import org.w3c.dom.css.Rect;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public Object clone() {
        Object clone;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
