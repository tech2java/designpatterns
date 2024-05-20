package com.tech2java.structural.facade;

public class OrderProcessor {

    public boolean checkStock(String name){
        System.out.println("checking Order");
        return true;
    }

    public String placeOrder(String name,int quantity){
        System.out.println("Placing Order");
        return "ORDER123";
    }

    public void shipOrder(String orderId){
        System.out.println("Shipping Order");
    }


}
