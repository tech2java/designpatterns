package com.tech2java.designpatterns.abstractfactory;

public class DBDeptDao implements Dao{


    @Override
    public void save() {
        System.out.println("Saving Dept data to DB.");
    }
}
