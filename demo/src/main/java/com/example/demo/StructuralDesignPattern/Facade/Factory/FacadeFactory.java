package com.example.demo.StructuralDesignPattern.Facade.Factory;


import com.example.demo.StructuralDesignPattern.Facade.Interface.Shape;

public class FacadeFactory {
    private Shape rectangeShape;
    public Shape triangleShape;

    public FacadeFactory(Shape rectangeShape, Shape triangleShape) {
        this.rectangeShape = rectangeShape;
        this.triangleShape = triangleShape;
    }

    public FacadeFactory() {

    }

    public void buyRectangle(){
        System.out.println("Buy rectangle facade");
    }

    public void buyTriangle(){
        System.out.println("Buy triangle facade");
    }


}
