package com.tech2java.designpatterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

    //use volatile to avoid any issues in multithreaded environment
    private static volatile DateUtil instance=null;
    //Eager Initialization
    //private static DateUtil instance=new DateUtil();

    /*
    static {
        instance=new DateUtil();
    }
     */

    private DateUtil(){

    }

    //Lazy Initialization- when ever object is required then it will create
   /*
    public static DateUtil getInstance(){
            if (null == instance) {
               instance = new DateUtil();
            }
        return instance;
    }
    */

    /*
    public static DateUtil getInstance(){
           return  instance;
    }
    */


    //Handling multiple threads
    public static DateUtil getInstance(){
        //since acquiring  a lock is expensive - if instance is null then only the class level lock happened
        if(instance==null) {
            synchronized (DateUtil.class) {
                if (null == instance) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    //for resolving the deserialization issue- it calls this method to return already created object.
    //make it protected or private so that other classes can't call this method.
    protected Object readResolve(){
        System.out.println("Inside readResolve() method..");
        return instance;
    }
}
