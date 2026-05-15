package com.company;

public class cwh_26and27_arrays {
    public static void main(String[] args) {
        /*For example : To store marks of 500 students of a branch or a classromm Array is used */

/* There are three types of syntax used for arrays, all of them are usefull and used according to need*/

/* 1. int[] marks;  ---> declaration!
      marks = new int [5];   --->   memory allocation! (5 is memory or number of students whose marks is to be stored)

   2. int[] marks = new int[5];   ---> Declaration + memory allocation!

   3. int[] marks = {98, 87 , 75, 92 , 80}  --->  Declaration + initialization !    ({} big bracket contains marks of students which automatically decide the index)

   array indices (index of array) starts from 0 and goes till (n-1) where n is the size of array.
      */

      //  int[] marks = {98, 87 , 75, 92 , 80};
        float[] marks = {98.1f, 87.2f , 75.3f, 92.5f , 80.6f};
        System.out.println(marks[1]);
        System.out.println(marks.length); //(This give us length of array )

        String [] students = {"harry" , "shubham" , "rohan" , "dhruv"};
        System.out.println(students[3]);
        System.out.println(students.length);

// array can be of using any datatype (int , float , double, string etc.)


        // Array can be displayed by two ways
        // (normal way)

        System.out.println("printing in naive(normal) way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        // Displaying array by using for loop
        System.out.println("printing using for loop");
        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // quick quiz : printing an array in reverse order
        System.out.println("printing array in reverse order");
        for (int i = marks.length -1 ; i>=0; i--){
            System.out.println(marks[i]);
        }

        // displaying the array (for-each loop)
        System.out.println("displaying using for-each loop");
        for (float element: marks){
            System.out.println(element);
        }

    }
}
