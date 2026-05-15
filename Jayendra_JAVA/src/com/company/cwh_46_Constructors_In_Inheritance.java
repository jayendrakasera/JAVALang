package com.company;


class Base1{
    //Constructor of base classs
    Base1(){
        System.out.println("i am a Base class constructor");
    }
    //Overloaded Constructor of base classs
    Base1(int X){
        System.out.println("i am a Overloaded Base class constructor :" +X);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a Derived class constructor");
    }
    Derived1(int X,int Y){
        super(X);
        System.out.println("i am a Overloaded Derived class constructor :" +Y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("i am a ChildOfDerived class constructor");
    }
    ChildOfDerived(int X, int Y, int Z){
        super(X,Y);
        System.out.println("i am a Overloaded ChildOfDerived class constructor :" +Z);
    }
}
public class cwh_46_Constructors_In_Inheritance {
    public static void main(String[] args) {

        ChildOfDerived ch = new ChildOfDerived();
        Derived1 Dr = new Derived1();
        Derived1 drvd = new Derived1(25, 30);
        ChildOfDerived chod = new ChildOfDerived(10,1,20);

    }
}
