package com.example.demo.CreationalDesignPattern.Signleton;

import java.util.Formatter;

public class BillPloughMethod {
    private BillPloughMethod(){
    }
    private static class BillPloughHelper{
        private static BillPloughMethod uniqueInstance = new BillPloughMethod();
    }

    public static BillPloughMethod getUniqueInstance() {
        return BillPloughHelper.uniqueInstance;
    }

}
