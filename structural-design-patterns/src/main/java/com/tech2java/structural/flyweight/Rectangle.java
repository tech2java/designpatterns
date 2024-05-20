package com.tech2java.structural.flyweight;

public class Rectangle /*implements*/ extends Shape{

    private String label;
   /* private int length;
    private int breadth;
    private String fillStyle;*/

    Rectangle(){
        label="Rectangle";
    }

    @Override
    public void draw(int length,int breadth,String fillStyle) {
        System.out.println("Drawing a "+ label +"  with a length "+length +" Breadth  "+breadth +" with fill Style "+fillStyle);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /*public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }*/
}
