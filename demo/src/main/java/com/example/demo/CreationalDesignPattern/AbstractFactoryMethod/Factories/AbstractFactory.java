package com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Factories;

import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Color;
import com.example.demo.CreationalDesignPattern.AbstractFactoryMethod.Interfaces.Shape;

public interface  AbstractFactory {
      Shape getShape(String shape);
      Color getColor(String color);
}
