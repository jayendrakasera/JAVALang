package com.company;


class Phone{
    public void greet(){
        System.out.println("aapka swagat hai");
    }

    public void on(){
        System.out.println("Turning on Phone.......");
    }
}

class SmartPhone extends Phone{
    public void greet(){
        System.out.println("your are welcome!");
    }

    public void on(){
        System.out.println("Turning on SmartPhone.....");
    }
    public void meth(){
        System.out.println("This is an method for SmartPhone...");
    }
}



public class cwh_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Phone Ph = new Phone(); // Allowed
        Ph.greet();
        Ph.on();
        Phone Ph1 = new SmartPhone(); // Allowed
        Ph1.greet();
        Ph1.on();
        //Ph1.meth();  // Not Allowed

        //SmartPhone Ph2 = new Phone(); //Not Allowed


    }
}
