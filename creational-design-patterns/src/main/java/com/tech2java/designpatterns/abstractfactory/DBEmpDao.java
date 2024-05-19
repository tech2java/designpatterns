package com.tech2java.designpatterns.abstractfactory;

public class DBEmpDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving Employee data to DB");
    }
}
