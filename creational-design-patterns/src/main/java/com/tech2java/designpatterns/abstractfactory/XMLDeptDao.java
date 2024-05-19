package com.tech2java.designpatterns.abstractfactory;

public class XMLDeptDao implements Dao{


    @Override
    public void save() {
        System.out.println("Saving Dept data to XML");
    }
}
