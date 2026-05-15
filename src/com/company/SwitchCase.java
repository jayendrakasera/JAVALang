package com.company;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are going to be adult!");
                break;
            case 23:
                System.out.println("you are going to join a job!");
                break;
            case 60:
                System.out.println("you are going to be retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("thanks for using this code!");




    }
}
