package com.company;

public class LogicalOperators {
    public static void main(String[] args) {
// Logical AND(&&) ----> evalutes to true if both the conditions are true.
        System.out.println("for logical AND.....");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

// Logical OR(||) ----> evalutes to true if at least one of the condition is true.
        System.out.println("for logical OR.....");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a1 || b1 || c1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
// Logical NOT(!)
            System.out.print("The Not of a1 is ");
            System.out.println(!a); //check boolean a1
            System.out.print("The Not of b1 is ");
            System.out.println(!b); //check boolean b1

    }
}
