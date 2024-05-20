package com.tech2java.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        //Case 1
        Pizza pizza=new PlainPizza();
        pizza.bake();

        Pizza pizza1=new VeggiePizzaDecorator(new PlainPizza());
        pizza1.bake();


        Pizza pizza2=new CheesePizzaDecorator(new PlainPizza());
        pizza1.bake();




    }
}
