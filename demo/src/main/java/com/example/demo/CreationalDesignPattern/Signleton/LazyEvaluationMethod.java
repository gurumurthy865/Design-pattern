package com.example.demo.CreationalDesignPattern.Signleton;

public class LazyEvaluationMethod {
    private static LazyEvaluationMethod uniqueInstance = null;
    private int data =0;

    private LazyEvaluationMethod(){
    }

    public static LazyEvaluationMethod  getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LazyEvaluationMethod();
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }
}
