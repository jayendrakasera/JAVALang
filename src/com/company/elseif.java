package com.company;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();

        if(age>56){
            System.out.println("you are experienced");
        }
        else if (age>46) {
            System.out.println("you are semi experienced");
        }

        else if (age>36) {
            System.out.println("you are semi-semi experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
        if(age>18){
            System.out.println("you are not a baby");
        }
        else {
            System.out.println("you are baby");
        }

    }

}
