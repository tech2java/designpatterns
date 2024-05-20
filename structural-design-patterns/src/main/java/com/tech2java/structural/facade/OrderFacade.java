package com.tech2java.structural.facade;

public class OrderFacade {

    //Refactor
    OrderProcessor orderProcessor=new OrderProcessor();

    public void processOrder(String name,int quantity){
        //OrderProcessor orderProcessor=new OrderProcessor();
        if(orderProcessor.checkStock(name)){
            String orderId=orderProcessor.placeOrder(name,quantity);
            orderProcessor.shipOrder(orderId);
        }

    }
}
