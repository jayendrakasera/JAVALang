package com.company;

//write a java program to encrypt a grade by adding 8 to it. decrypt it to show the correct grade.
public class PracticeSet02 {
    public static void main(String[] args) {
        char grade = 'B' ;
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
