package com.tech2java.designpatterns.factory;

public class VeggiePizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Preparing VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting VeggiePizza");
    }
}
