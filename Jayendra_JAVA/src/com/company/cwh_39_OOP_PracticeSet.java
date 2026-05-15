package com.company;

// video link for questions ----> https://youtu.be/wQZCbojRawg?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q

//For Problem1
class Employee {
    int salary;
    int DOB;
    String name;

    public int getSalary(){
        return salary;
    }

    public int DOB(){
        return DOB;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name =n;
    }
}

//For Problem2
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println("Calling shubham...");
    }
}
//For Problem3
class Square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

//For Problem4
class rectangle {
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

//For Problem5
class TommyVecceti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("Firing on enemy");
    }
}


public class cwh_39_OOP_PracticeSet {

    public static void main(String[] args) {
       // Problem 1
        Employee AccDept = new Employee();
        AccDept.setName("Jayendra");
        AccDept.DOB=23032005;
        AccDept.salary=100;
        System.out.println(AccDept.getName());
        System.out.println(AccDept.getSalary());
        System.out.println(AccDept.DOB());

        AccDept.setName("shubham");
        AccDept.salary=110;
        AccDept.DOB=29082004;
        System.out.println(AccDept.getName());
        System.out.println(AccDept.getSalary());
        System.out.println(AccDept.DOB);

        //Problem 2
        CellPhone poco = new CellPhone();
        poco.callFriend();
        poco.ring();
        poco.vibrate();

        //Problem 3
        Square sq = new Square();
        sq.side=10;
        System.out.println(sq.area());
        System.out.println( sq.perimeter());

        //Problem 4
        rectangle rct = new rectangle();
        rct.length=5;
        rct.breadth=10;
        System.out.println(rct.area());
        System.out.println(rct.perimeter());

        //Problem 5
        TommyVecceti player1 = new TommyVecceti();
        player1.hit();
        player1.fire();
        player1.run();
    }
}
