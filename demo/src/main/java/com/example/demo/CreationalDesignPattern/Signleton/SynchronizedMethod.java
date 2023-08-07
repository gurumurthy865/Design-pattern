package com.example.demo.CreationalDesignPattern.Signleton;

public class SynchronizedMethod {
    private static SynchronizedMethod uniqueInstance = null;
    private int data =0;

    private SynchronizedMethod(){
    }

    public static synchronized SynchronizedMethod  getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SynchronizedMethod();
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }
}
