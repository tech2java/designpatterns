package com.tech2java.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String,Shape> shapes=new HashMap<>();

    public static Shape getShape(String type){

        Shape shape=null;
        if(shapes.get(type)!=null){
            shape=shapes.get(type);
        }else{
            if(type.equals("circle")){
                shape=new Circle();
            }else{
                shape=new Rectangle();
            }

            shapes.put(type,shape);
        }

        return shape;
    }
}
