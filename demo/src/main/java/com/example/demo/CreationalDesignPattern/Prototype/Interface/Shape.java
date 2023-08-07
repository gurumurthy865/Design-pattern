package com.example.demo.CreationalDesignPattern.Prototype.Interface;

public interface Shape extends Cloneable {
      void draw();

    default Object clone() {
        return null;
    }
}
