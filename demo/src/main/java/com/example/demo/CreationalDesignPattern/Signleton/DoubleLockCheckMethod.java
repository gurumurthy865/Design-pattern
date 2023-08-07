package com.example.demo.CreationalDesignPattern.Signleton;

public class DoubleLockCheckMethod {
    private static DoubleLockCheckMethod uniqueInstance = null;
    private int data =0;

    private DoubleLockCheckMethod(){
    }

    public static  DoubleLockCheckMethod  getInstance(){
        if(uniqueInstance == null){
            synchronized (DoubleLockCheckMethod.class){
                if(uniqueInstance == null){
                    uniqueInstance = new DoubleLockCheckMethod();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }
}
