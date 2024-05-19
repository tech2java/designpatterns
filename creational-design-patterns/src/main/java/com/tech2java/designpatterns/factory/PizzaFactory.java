package com.tech2java.designpatterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){

        Pizza p=null;
        if(type.equals("veggie")){
            p=new VeggiePizza();
        }else if(type.equals("chicken")){
            p=new ChickenPizza();
        }else if(type.equals("cheese")){
            p=new CheesePizza();
        }
        return p;
    }
}
