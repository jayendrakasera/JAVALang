package com.company;
import java.util.Scanner;
public class TocheckinputisANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println(sc.hasNextInt());
    }
}
//run once entering a number and run once entering a word and check difference.