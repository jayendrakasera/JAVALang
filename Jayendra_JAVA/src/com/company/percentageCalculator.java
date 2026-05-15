package com.company;
import java.util.Scanner;
public class percentageCalculator {
    public static void main(String[] args) {
        System.out.println("enter marks for all five subjects");
        Scanner marks = new Scanner(System.in);
        System.out.println("subject1");
        float sub1 = marks.nextInt();
        System.out.println("subject2");
        float sub2 = marks.nextInt();
        System.out.println("subject3");
        float sub3 = marks.nextInt();
        System.out.println("subject4");
        float sub4 = marks.nextInt();
        System.out.println("subject5");
        float sub5 = marks.nextInt();
        float sum = (sub1 + sub2 + sub3+ sub4 + sub5);
        System.out.println("enter total marks");
        float total;
        total = marks.nextInt();
        double percentage = (sum / total) * 100;
        System.out.println("your percentage is");
        System.out.println("sum : " +sum);
        System.out.println("percentage : " +percentage);
    }
}
//except float in 18th line other floats may be changed into 'int' but if 'int' is used you will get approximated percentage.
//if float in 18th line is removed then the percentage calculated as output will vary.