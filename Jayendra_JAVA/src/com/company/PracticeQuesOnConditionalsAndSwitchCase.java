package com.company;
import java.util.Scanner;
public class PracticeQuesOnConditionalsAndSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 2
/* write a programme to find out whether a student is pass or fail, if it requires total 40% and at least 33% in each
subject to pass. Assume 3 subjects and take marks as an input from the user */

      /*  System.out.println("Enter your physics marks");
       int P = sc.nextInt();
        System.out.println("Enter your chemistry marks");
        int C = sc.nextInt();
        System.out.println("Enter your maths marks");
        int M = sc.nextInt();

        float avg = (P +C + M)/3.0f;


// also for percentage
       // System.out.println("your percentage is " +avg);
        float percentage = ( (P +C + M)/300.0f )*100.0f;
        System.out.println(percentage);
//percentage is added by self.

        if(avg>=40 && P>=33 && C>=33 && M>=33) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        } */


        // Problem 3
/* calculate income tax paid by an employee to the government as per the slabs mentioned below;
        income slab         tax
         upto 3L            Nil
         3L - 7L            5%             (This slab is of FY 24-25)
         7L - 10L           10%
         10L - 12L          15%
         12L - 15L          20%
         Above 15L          30%
    Note that there is no tax below 3L. Take amount as an input from user
      */
     /*   float tax = 0;
        float income;
        System.out.println("enter your income : ");
        income = sc.nextFloat();

        if (income<= 300000){
            tax = tax + 0.0f *(income);
            System.out.println(tax);
        }
        else if (income>300000 && income<700000) {
            tax = tax + 0.05f*(income);
            System.out.println(tax);
        }
        else if (income>=700000 && income<1000000){
            tax = tax + 0.10f*(income);
            System.out.println(tax);
        }
        else if (income>=1000000 && income<1200000) {
            tax = tax + 0.15f * (income);
            System.out.println(tax);
        }
        else if (income>=1200000 && income<1500000){
            tax = tax + 0.20f*(income);
            System.out.println(tax);
        }
        else {
            tax = tax + 0.30f*(income);
            System.out.println(tax);
        }

        }
    } */

        //Problem 4
// write a java programme to find out a day of the week given the number [1 for monday, 2 for tuesday , ..... and 50 on!]

 /*       System.out.print("enter number to know the day : ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
} */

        //Problem 5
// write a java programme to find whether a year entered by the user is a leap year or not.

 /*               System.out.print("Enter the year to be checked : ");
                int year= sc.nextInt();

                if((year%4==0 && year%100!=0)|| year%400==0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a leap year");
            }
        }  */


        //Problem 6
/* write a java programme to find out the type of website from the url
                .com --> commercial website
                .in  --> indian website
                .org --> organizational website
 */
  /*      System.out.print("enter website link : ");
            String website = sc.next();
            if (website.endsWith(".com")){
                System.out.println("this is commercial website");
            }
            else if (website.endsWith(".org")){
                System.out.println("this is an organizational website");
            }
            else if (website.endsWith(".in")){
                System.out.println("this is an indian website");
            }
    }
}  */
    }
}