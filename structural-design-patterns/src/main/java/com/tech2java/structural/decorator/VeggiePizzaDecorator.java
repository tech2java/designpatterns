package com.tech2java.structural.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{

    VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding veggie toppings");
    }
}
