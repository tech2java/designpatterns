package com.tech2java.designpatterns.factory;

public class PizzaStore {

    //without PizzaFactory
    /*
    public Pizza orderPizza(String type){

        Pizza p=null;

        if(type.equals("veggie")){
            p=new VeggiePizza();
        }else if(type.equals("chicken")){
            p=new ChickenPizza();
        }else if(type.equals("cheese")){
            p=new CheesePizza();
        }

        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
    */

    public Pizza orderPizza(String type){

        Pizza p=PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}
