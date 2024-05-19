package com.tech2java.designpatterns.singleton;

import java.io.*;

public class TestSingleton {

    public static <ObjectOutputStreamam> void main(String[] args) throws IOException, ClassNotFoundException {


        //case 1
       /*
        DateUtil dateUtil1=DateUtil.getInstance();
        DateUtil dateUtil2=DateUtil.getInstance();
        //Checking both objects are same or not.
        System.out.println(dateUtil1==dateUtil2);
        */


        //Serialization
        DateUtil dateUtil1=DateUtil.getInstance();
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("E://dateUtil.ser"));
        oos.writeObject(dateUtil1);

        //Deserialization
        DateUtil dateUtil2=null;

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E://dateUtil.ser"));
        dateUtil2=(DateUtil)ois.readObject();

        oos.close();
        ois.close();

        //Checking both objects are same or not.
        System.out.println(dateUtil1==dateUtil2);
    }
}
