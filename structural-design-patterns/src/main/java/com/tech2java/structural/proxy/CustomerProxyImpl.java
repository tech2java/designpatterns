package com.tech2java.structural.proxy;

import java.util.Arrays;
import java.util.List;

//Like Hibernate created this kind of Object at runtime using reflection
public class CustomerProxyImpl implements Customer{


    //Real/Actual object
    private CustomerImpl customer=new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {

        List<Order> orders= Arrays.asList(new Order(1,"Iphone",100),new Order(2,"Mac",300));

        return orders;
    }
}
