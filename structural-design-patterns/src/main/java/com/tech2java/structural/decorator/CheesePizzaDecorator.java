package com.tech2java.structural.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{

    CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding cheese toppings");
    }
}
