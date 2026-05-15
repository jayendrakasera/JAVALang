package com.company;

public class cwh_28_MultiDimensionalArray {
    public static void main(String[] args) {


    //    int[] marks = new int[5]; // 1-D array
        int[][] flats = new int[3][4];

        System.out.println("Printing 2-D Array using naive way");
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[0][3] = 103;
        flats[1][1] = 201;
        flats[1][2] = 202;
        flats[1][3] = 203;
        flats[2][1] = 301;
        flats[2][2] = 302;
        flats[2][3] = 303;
        System.out.println(flats[0][1]);
        System.out.println(flats[1][3]);

        System.out.println("printing 2-D Array using for-loops");
        for(int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}