package com.example.demo.StructuralDesignPattern.Facade;


import com.example.demo.StructuralDesignPattern.Facade.Factory.FacadeFactory;

public class Client {
    public void testFactoryMethod(){
        FacadeFactory factory = new FacadeFactory();
        factory.buyRectangle();
        factory.buyTriangle();
    }
}
