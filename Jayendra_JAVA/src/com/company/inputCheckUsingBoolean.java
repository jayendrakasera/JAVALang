package com.company;
import java.util.Scanner;
public class inputCheckUsingBoolean {
    public static void main(String[] args) {
        System.out.println("take input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        boolean a = sc.hasNextInt();
        System.out.println(a);
    }
}

