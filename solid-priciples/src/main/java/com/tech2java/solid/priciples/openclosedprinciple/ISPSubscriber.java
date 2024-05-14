package com.tech2java.solid.priciples.openclosedprinciple;

public class ISPSubscriber extends Subscriber {


    //Move below properties to solid base class(Subscriber).
    /*
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;
    getters & setters
   */
    private long freeUsage;


    public ISPSubscriber(){

    }

    //- Open for extension
    @Override
    public double calculateBill(){
        //logic to calculate bill

        // can use base class properties here.
        //subscriberId
        return 345.90;
    }


}
