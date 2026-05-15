package com.company;
import java.util.Scanner;
public class inputpractice2 {
    public static void main(String[] args) {
        Scanner jayendra = new Scanner(System.in);
        System.out.println("give input");
        System.out.println("enter a number having two digits after decimal");
        double a = jayendra.nextDouble();
        System.out.println("enter another number having two digits after decimal");
        double b = jayendra.nextDouble();
        System.out.print("the sum of both numbers is : ");
        double sum = (a + b);
        System.out.println(sum);
    }

}
