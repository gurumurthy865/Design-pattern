package com.example.demo.CreationalDesignPattern.Prototype.Implementation;

import com.example.demo.CreationalDesignPattern.Prototype.Interface.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
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
