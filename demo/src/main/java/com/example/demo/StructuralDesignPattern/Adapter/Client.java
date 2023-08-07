package com.example.demo.StructuralDesignPattern.Adapter;

import com.example.demo.StructuralDesignPattern.Adapter.Implementation.Calculator;
import com.example.demo.StructuralDesignPattern.Adapter.Interface.CalculatorInterface;
import com.example.demo.StructuralDesignPattern.Adapter.Interface.Rectangle;
import com.example.demo.StructuralDesignPattern.Adapter.adapter.CalculatorAdapter;
import com.example.demo.StructuralDesignPattern.Adapter.adapter.Triangle;

public class Client {
    public void testAdapter(){
		Calculator calculator = new Calculator();
		System.out.println("Rectangle area" + calculator.getArea(new Rectangle(10,20)));
		Triangle triangle = new Triangle(10,20);
		CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);
		System.out.println(calculatorAdapter.getArea(null));
		CalculatorInterface calculatorInterface = new Calculator();
		calculatorInterface.getArea(new Rectangle(10,20));

    }
}
