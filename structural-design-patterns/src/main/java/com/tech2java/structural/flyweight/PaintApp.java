package com.tech2java.structural.flyweight;

public class PaintApp {


    //with Flyweight pattern
    public void render(int noOfshapes){

        Shape shape=null;

        for(int i=1;i<=noOfshapes;i++){

            if(i%2==0){
                shape=ShapeFactory.getShape("circle");
                shape.draw(i,"red","white");
            }else{
                shape=ShapeFactory.getShape("rectangle");
                shape.draw(i,i+1,"dotted");
            }

        }
    }

    //without flyweight pattern
    /*
    public void render(int noOfshapes){

        Shape[] shapes=new Shape[noOfshapes+1];

        for(int i=1;i<=noOfshapes;i++){

            if(i%2==0){

                shapes[i]=new Circle();

                ((Circle)(shapes[i])).setRadius(i);
                ((Circle)(shapes[i])).setFillColor("Red");
                ((Circle)(shapes[i])).setLineColor("white");
                shapes[i].draw();
            }else{

                shapes[i]=new Rectangle();

                ((Rectangle)(shapes[i])).setLength(i);
                ((Rectangle)(shapes[i])).setBreadth(i+1);
                ((Rectangle)(shapes[i])).setFillStyle("dotted");
                shapes[i].draw();
            }
        }
    }
    */
}
