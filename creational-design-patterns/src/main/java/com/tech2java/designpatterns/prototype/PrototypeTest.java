package com.tech2java.designpatterns.prototype;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Game game1=new Game();
        game1.setId(1);
        game1.setName("Cricket");
        //setting membership for the first object
        game1.setMembership(new Membership());


        //instead of creating object from Scratch
        Game game2= game1.clone();

        //Two different objects will be created
        System.out.println(game1);
        System.out.println(game2);

        //constructor copy
        Game game3=new Game(game1);
        System.out.println(game3);




    }
}
