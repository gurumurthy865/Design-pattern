package com.example.demo.StructuralDesignPattern.Composite.Implementation;

import com.example.demo.StructuralDesignPattern.Composite.Interface.Shape;

public class Triangle implements Shape {
    public Integer id;
    public String name;

    public Triangle(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void getShape() {
        System.out.println("Triangle");
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
