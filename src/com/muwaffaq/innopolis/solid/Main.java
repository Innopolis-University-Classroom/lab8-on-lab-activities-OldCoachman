package com.muwaffaq.innopolis.solid;


import com.muwaffaq.innopolis.solid.homework.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("hello main");

        Human.PersonalLife human = new Human.PersonalLife();
        System.out.println(human.sayHello(Human.PersonalLife.Languages.Arabic));
    }
}
