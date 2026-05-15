package com.company;

public class cwh_29_PracticeSetArray {
    public static void main(String[] args) {
// video link ----->  https://youtu.be/XDlxr2wYNfU?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q
        // -----> Practice question 1
     /*    float [] marks = {69.5f, 96.3f, 89.7f, 73.4f, 65.2f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is" +sum);   */


        // -----> Practice question 2
    /*    float [] marks = {69.5f, 96.3f, 89.7f, 73.4f, 65.2f};
        float num = 96.3f;
        boolean IsInArray = false;
        for (float element : marks) {
            if (num == element) {
                IsInArray = true;
                break;
            }
        }
            if (IsInArray){
                System.out.println("The number is present in array");
            }
            else {
                System.out.println("The number is not present in array");
            }    */


        //-----> Practice question 3
   /*     float [] marks = {69.5f, 96.3f, 89.7f, 73.4f, 65.2f};  // average = sum of all number divided by total count of numbers
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is" +sum/marks.length);  */


        //-----> Practice question 4
    /*    int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};

        int[][] mat2 = {{2, 4, 6},
                        {8, 10, 12}};

        int[][] result = {{0, 0, 0},
                         {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column number of times
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //printing elements of 2-D array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }    */


        //-----> Practice question 5 (printing array in reverse order)
    /*    int [] arr = {1, 21, 32, 43, 54, 65, 76};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<n; i++) {
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i]= temp;
        }
            for (int element : arr){
                System.out.print(element + " ");
            }   */

        //-----> Practice question 6 (find maximum value in array)
 /*       int [] arr = {1, 21, 32, 453, 54, 65, 76};
        int max = 0 ;  // also we can use ---> int min = Integer.MAX_VALUE;

        for (int element : arr){
            if (element>max){
                max = element;
            }
        }
        System.out.println("the value of maximum element in array is : " + max);   */


        //-----> Practice question 7 (find minimum value in array)
/*        int [] arr = {1, 21, 32, 453, 54, 65, 76};
        int min = 453;  // also we can use ---> int min = Integer.MIN_VALUE;
        for (int e: arr){
            if(e<min){
                min = e;
            }

        }
        System.out.println("the value of minimum element in array is :" + min);  */

        //-----> Practice question 8 (check array is sorted or not "means the elements of arry is in increasing ordr or not")
 /*       boolean isSorted = true;
        int [] arr = {1, 21, 32, 43, 54, 65, 76};
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]> arr[i+1]){
                isSorted= false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        } */


    }
}


