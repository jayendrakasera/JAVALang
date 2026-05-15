package com.company;
import java.util.Scanner;
public class KmToMilesCnvrsn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter kilometers");
        double km = sc.nextInt();

        double In1KmtThereAreMiles = 0.62137119;

        System.out.println(km * In1KmtThereAreMiles + " miles ");
    }

}
