package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Base {
   public int X ;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        System.out.println("I am in Base and i am setting X now");
        X = x;
    }
}

class Derived extends Base{
    public int Y;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and i am setting Y now");
        Y = y;
    }
}


//classes and Methods for QUICK QUIZ ----->
class Animal{
    Scanner sc = new Scanner(System.in);
    String A= sc.next();

    public String getA() {
        return A;
    }

    public void setA() {
        System.out.println("I am a " +A+ " I can walk and run too!");
        A = A;
    }
}

class Dog extends Animal {
    String d;

    public Dog(String d) {
        this.d = d;
    }

    public String getD() {
        System.out.println("i am a " + d +", i bark Bhowwww....Bhowwww......");
        return d;
    }

    public void setD(String d) {

        this.d = d;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {

        //creating an object of Base class
        Base b= new Base();
        b.setX(4);
        System.out.println(b.getX());

        //creating objects of Derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());

        d.setY(50);
        System.out.println(d.getY());



// QUICK QUIZ ----->  create a class Animal and Derive another class Dog from it.
        System.out.println("Enter name of Animal : ");
         Animal an = new Animal();
         an.setA();
        System.out.println(an.getA());


       // System.out.println("Enter dog here");
       Dog dogg = new Dog("dog");
        System.out.println(dogg.getD());

    }
}



