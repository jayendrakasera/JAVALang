package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println("choose 0 for Rock\nchoose 1 for Paper\nchoose 2 for Scissor");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("its your turn");

        int human = sc.nextInt(3);
        if (human == 0){
            System.out.println("You selected Rock");
        }
        if (human == 1){
            System.out.println("You selected Paper");
        }
        if (human ==2){
            System.out.println("You selected Scissor");
        }

        System.out.println("its computer's turn ");

        int computer = rn.nextInt(3);
        if (computer == 0) {
            System.out.println("system has selected Rock");
        }
        if (computer == 1){
            System.out.println("system has selected Paper");
        }
        if (computer ==2){
            System.out.println("system has selected Scissor");
        }
         if ( human == 0 && computer == 2 || human == 1 && computer == 0 || human == 2 && computer == 1 ) {
            System.out.println("you won !");
        }
         if ( human == 0 && computer == 0 || human == 1 && computer == 1 || human == 2 && computer == 2){
            System.out.println("its tie!");
        }
        else {
            System.out.println("oops, you lost!");
        }

    }

}
