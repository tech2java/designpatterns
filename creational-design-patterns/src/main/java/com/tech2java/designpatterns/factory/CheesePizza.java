package com.tech2java.designpatterns.factory;

public class CheesePizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting CheesePizza");
    }
}
