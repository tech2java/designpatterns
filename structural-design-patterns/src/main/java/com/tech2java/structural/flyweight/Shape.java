package com.tech2java.structural.flyweight;

public /*interface*/abstract class Shape {

    //Separate the Extrinsic state
    //Pass them as parameters
    public void draw(int radius,String fillColor,String lineColor){
        //no-operation
    }


    //Separate the Extrinsic state
    //Pass them as parameters
    public void draw(int length,int breadth,String fillStyle){
        //no-operation
    }
}
