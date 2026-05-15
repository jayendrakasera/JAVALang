package com.company;

// video link ----> https://youtu.be/dm_bclqGhuc?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q

class circle{
    int radius;
   circle(){
       System.out.println("i am non parameterized constructor of circle class");
   }
   circle(int R){
       System.out.println("i am parameterized constructor of circle class");
       this.radius=R;
   }

   public double area(){
   return Math.PI*this.radius*this.radius;
   }
}

class cylinder1 extends circle{
    int height;

    cylinder1(){
        System.out.println("i am non parameterized constructor of cylinder class");
    }
    cylinder1(int r, int h){
        super(r);
        System.out.println("i am parameterized constructor of cylinder class");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class cwh_52_inheriatncePracticeSet {
    public static void main(String[] args) {

        cylinder1 clndr = new cylinder1(10,10);



    }
}
