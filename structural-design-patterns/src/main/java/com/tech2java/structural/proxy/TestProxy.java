package com.tech2java.structural.proxy;

public class TestProxy {

    public static void main(String[] args) {

        Customer customer=new CustomerImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());

        System.out.println("=====================");
        //using proxy
        Customer customer2=new CustomerProxyImpl();
        System.out.println(customer2.getId());
        System.out.println(customer2.getOrders());

    }
}
