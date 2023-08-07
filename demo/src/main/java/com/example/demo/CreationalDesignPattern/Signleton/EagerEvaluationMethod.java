package com.example.demo.CreationalDesignPattern.Signleton;

public class EagerEvaluationMethod {
    private static EagerEvaluationMethod uniqueInstance = new EagerEvaluationMethod();
    private int data = 0;

    private EagerEvaluationMethod() {
    }

    public static EagerEvaluationMethod getInstance() {
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }
}
