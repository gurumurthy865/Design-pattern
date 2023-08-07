package com.example.demo.CreationalDesignPattern.Builder;

public class Client {
    public void testBuilder(){
		User user = new User.UserBuilder("guru","murthy").age(25).build();
    }
}
