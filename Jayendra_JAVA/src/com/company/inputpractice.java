package com.company;
import java.util.Scanner;
public class inputpractice {

    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner jay = new Scanner(System.in);
        System.out.println("enter a number in decimal");
       float a = jay.nextFloat();
        System.out.println("enter another number in decimal");
       float b = jay.nextFloat();
        System.out.println("the sum is : ");
       float sum = (a + b);
        System.out.println(sum);

    }

}

