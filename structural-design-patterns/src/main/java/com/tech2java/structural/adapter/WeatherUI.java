package com.tech2java.structural.adapter;

public class WeatherUI {

    public static void main(String[] args) {
        new WeatherUI().showTemperature(1000);
    }

    public  void showTemperature(int zipCode){
        WeatherAdapter adapter=new WeatherAdapter();

        System.out.println(adapter.findTemperature(zipCode));
    }
}
