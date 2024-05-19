package com.tech2java.designpatterns.abstractfactory;

public class Demo {
    public static void main(String[] args) {

        //XML
        DaoAbstractFactory daf=DaoFactoryProducer.createFactory("xml");
        Dao empDao=daf.createDao("emp");
        empDao.save();

        Dao deptDao=daf.createDao("dept");
        deptDao.save();

        System.out.println("---------------------------------");
        //DB
        DaoAbstractFactory dbDaf=DaoFactoryProducer.createFactory("db");
        Dao dbEmpDao=dbDaf.createDao("emp");
        dbEmpDao.save();

        Dao dbDeptDao=dbDaf.createDao("dept");
        dbDeptDao.save();


    }
}
