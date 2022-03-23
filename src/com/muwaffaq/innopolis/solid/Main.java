package com.muwaffaq.innopolis.solid;


import com.muwaffaq.innopolis.solid.homework.*;

public class Main {


    public static void main(String[] args) {
        Human.PersonalLife human = new Human.PersonalLife();
        human.sayHello(Human.PersonalLife.Languages.Arabic);
        System.out.println("hello main");
    }
}
