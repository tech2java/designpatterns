package com.tech2java.solid.priciples.singleresponsibility;

public class UserPersistenceService {

    private Store store=new Store();

    public void saveUser(User user){

        store.saveUser(user);
    }
}
