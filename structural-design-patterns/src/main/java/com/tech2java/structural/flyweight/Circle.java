package com.tech2java.structural.flyweight;

public class Circle /*implements*/ extends Shape{

    private String label;
   /* private int radius;
    private String fillColor;
    private String lineColor;*/

    Circle(){

        label="Circle";
    }

    @Override
    public void draw(int radius,String fillColor,String lineColor) {

        System.out.println("Drawing a "+ label +"  with a radius "+radius +" with filled color "+fillColor +" with line color "+lineColor);
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /*public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }*/
}
