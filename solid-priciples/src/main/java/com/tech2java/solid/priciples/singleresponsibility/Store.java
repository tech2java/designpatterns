package com.tech2java.solid.priciples.singleresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static final Map<String,User> STORAGE=new HashMap<>();


    public void saveUser(User user){
        synchronized (STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }


    public User getUser(String name){
        synchronized (STORAGE) {
            return STORAGE.get(name);
        }
    }

}
