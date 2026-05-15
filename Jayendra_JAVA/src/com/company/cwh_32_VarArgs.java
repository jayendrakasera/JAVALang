package com.company;

public class cwh_32_VarArgs {
    static int sum(int...arr) {
        // Available as int [] arr
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(" <---- Welcome to VarArgs ----> ");

        System.out.println(" the sum of 4 and 5 is :" +sum(4,5));
        System.out.println(" the sum of 3, 4 and 5 is :" +sum(3,4,5));
        System.out.println(" the sum of 2, 3, 4 and 5 is :" +sum(2,3,4,5));
        System.out.println(" the sum of nothing is :" +sum());
        System.out.println(" the sum of 1 is :" +sum(1));
    }
}
