package com.tech2java.solid.priciples.interfacesegregation.service;

import com.tech2java.solid.priciples.interfacesegregation.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long,Order> ORDERS=new HashMap<>();

    @Override
    public void save(Order entity) {

        synchronized (ORDERS){
            ORDERS.put(entity.getId(),entity);
        }
    }

    @Override
    public void delete(Order entity) {

        synchronized (ORDERS){
            ORDERS.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS){
            return ORDERS.get(id);
        }
    }

    //Order doesn't have name -it's violating interface segregation principle
   //Remove below method .
    /*
    @Override
    public List<Order> findByName(String name) {
         throw  new UnsupportedOperationException("Find by name is not supported.");
    }
     */
}
