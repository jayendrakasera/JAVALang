package com.company;

public class operatorsInJava {
    public static void main(String[] args) {
   //type of operators

        //arithmatic operators : + , -, * , % , ++ , --
        int a = 6;
        int b = 3 % a;
        System.out.println(b);

        //assignment operators : = , += , -= , *=
        int c = 10;
        c *= 3;
        System.out.println(c);

        //comparison operators : == , >= , <=  (gives true or false)
        System.out.println(" comparison operator : ");
        System.out.println(6==8);
        System.out.println(8==8);
        System.out.println(8>= 5);
        System.out.println(5<=10);
        System.out.println(5>=10);
        System.out.println(55>6);

        // logical operators : && , || (or) , !
        System.out.println(" logical operator :  ");
        System.out.println(55>6 && 55>8 );
        System.out.println(55>6 && 55<8 );  // &&(end) operator need all values correct to get true.
        System.out.println(55>6 || 55<8 );  // ||(or) operator need any one value correct to get true.

        //Bitwise operators : & , | (operates bitwise)

    }
}
