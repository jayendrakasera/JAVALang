package com.company;

public class cwh_35_PracticeSetOn_Methods {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n" ,n, i , n*i);
        }
    }

    static void pattern1(int n){
        for (int i=0; i<n;i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int SumRec(int n){
        if (n==1){
            return 1;
        }
        else{
            return n + SumRec(n-1);
        }
    }

    static void pattern2(int n) {
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
       /* if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
// or in place of above if else pair we can write
        if (n==1 || n==2){
            return (n-1);
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    static double average(int...arr) {
        // Available as int [] arr
        double result =0;
        for (int a : arr){
            result +=a;
        }
        int length = arr.length;
        return result/length;
    }


    public static void main(String[] args) {

        //problem 1
    System.out.print("problem 1");
        multiplication(6);

        // problem 2
    System.out.print("problem 2");
        pattern1(5);

        // problem 3
        System.out.println("problem 3");
            int c = SumRec(3);
            System.out.println(c);

        // problem 4
        System.out.println("problem 4");
        pattern2(4);

        // problem 5
        // Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        System.out.println("problem 5");
        int e = fib(5);
        System.out.println(e);


        // problem 6
        System.out.println("problem 6");
        System.out.println("The average of 1 +2 +3 +4 +5 +6 +7 +8 +9 +10 is:" +average(1,2,3,4,5,6,7,8,9,10));
        System.out.println("The average of 500+183 is:" +average(500,183));
    }
}
