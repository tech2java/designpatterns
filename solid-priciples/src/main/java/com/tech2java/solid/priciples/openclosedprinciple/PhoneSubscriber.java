package com.tech2java.solid.priciples.openclosedprinciple;

public class PhoneSubscriber extends Subscriber{

    /*
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;
    getters & setters
   */

    public PhoneSubscriber(){

    }
    @Override
    public double calculateBill(){
        //logic to calculate bill
        return 1000;
    }

}
