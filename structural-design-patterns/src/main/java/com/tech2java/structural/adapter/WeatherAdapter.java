package com.tech2java.structural.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipCode){

        String city="";

        if(zipCode==1000){
            city="Hyderabad";
        }

        WeatherFinder finder=new WeatherFinderImpl();
        int temperature=finder.find(city);

        return temperature;
    }
}
