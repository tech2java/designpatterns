package com.tech2java.designpatterns.factory;

public class ChickenPizza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("Preparing ChickenPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChickenPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting ChickenPizza");
    }
}
