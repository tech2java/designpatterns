package com.tech2java.designpatterns.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory createFactory(String factoryType){

        DaoAbstractFactory daoAbstractFactory=null;

        if(factoryType.equals("xml")){
            daoAbstractFactory=new XMLDaoFactory();
        }else if(factoryType.equals("db")){
            daoAbstractFactory=new DBDaoFactory();
        }

        return daoAbstractFactory;
    }
}
