package com.company;

import java.util.Scanner;
public class strings {
    public static void main(String[] args){
   // String name = new String("Jayendra");
      String name = "jayendra";
        System.out.println(name);


         int a = 6 ;
        float b = 5.6546f;
        System.out.printf("The value of a is %d and the value of f is %f" , a , b); // mostly printf and format is used in C and C++
        System.out.format("The value of a is %d and the value of f is %f" , a , b);
        /* %d is used for int and double
         %f is used for float
         %c is used for char
         %s is used for string
         */

        Scanner sc = new Scanner(System.in);
         String st = sc.next();
         System.out.println(st);
          String St = sc.nextLine();
          System.out.println(St);
        // Use above st and St one by one by commenting out one at a time and check difference.



    }
}
