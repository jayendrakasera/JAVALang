package com.company;


abstract class Parent{
    public Parent(){
        System.out.println("i am constructor of Parent class");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    abstract public void greet();
    abstract public void greet1();
}


class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet1(){
        System.out.println("Good Evening");
    }
}

abstract class child2 extends Parent{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
     //   Parent p = new Parent(); // Throws error

        child c = new child();

     // child2 ch = new child2(); // Throws error

    }
}
