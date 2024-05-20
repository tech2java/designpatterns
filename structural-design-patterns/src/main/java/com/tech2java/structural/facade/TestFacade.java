package com.tech2java.structural.facade;

public class TestFacade {

    public static void main(String[] args) {

        //without facade
        /*
        OrderProcessor orderProcessor=new OrderProcessor();
        if(orderProcessor.checkStock("Iphone")){
            String orderId=orderProcessor.placeOrder("Iphone",34);
            orderProcessor.shipOrder(orderId);
        }
        */

        //with Facade
        OrderFacade orderFacade=new OrderFacade();
        orderFacade.processOrder("Iphone",20);
    }
}
