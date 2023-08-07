package com.example.demo;

import com.example.demo.CreationalDesignPattern.Builder.Client;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		1. FactoryMethod
//		Client factoryMethod = new Client();
//		factoryMethod.testFactoryMethod();

//		2. AbstractFactoryMethod
//		Client client = new Client();
//		client.testAbstractFactoryMethod();

//		3. Builder
		Client client = new Client();
		client.testBuilder();



	}

}
