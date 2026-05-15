package com.company;

import java.util.Random;
import java.util.Scanner;

class game {
    int numberToGuess;
    //   int takeUserInput;
    int numberOFGuesses;

    // Constructor to generate random number
    public game (){
        Random random = new Random();
        this.numberToGuess= random.nextInt(1,100);
        numberOFGuesses=0;
    }

    // Method to take user input
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 0 to 100 :");
        return sc.nextInt();
    }


 /*  public int getTakeUserInput(){
       Scanner sc = new Scanner(System.in);
        return takeUserInput;
   }

   public void setTakeUserInput(int i){this.takeUserInput=i;} */

    // Method to check if Guessed number is correct
    public boolean isCorrectNumber(int userGuess){
        numberOFGuesses++;
        if (userGuess== numberToGuess){
            System.out.println("Congratulations! your guess is correct");
            return true;
        }
        else if(userGuess > numberToGuess){
            System.out.println("your guess is greater than the actual number");
        }
        else{
            System.out.println("your guess is less than the actual number");
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNumberOFGuesses() {
        return numberOFGuesses;
    }

    // Setter for noOfGuesses
    public void setNumberOFGuesses(int noOfGuesses) {
        this.numberOFGuesses = noOfGuesses;
    }
}
public class cwh_43_GuessTheNumber {

    /* Create a class game, which allows user to play "Guess The Number"
    game once. Game should have the following methods:
    1. constructor to generate the random number.
    2.takeUserInput() to take a user input of a number.
    3. isCorrectNumber() to detect whether the number entered by the user is true.
    4.getter and setter for noOfGuesses
    use properties such as noOfGuesses(int), etc to get this task done.
    */

    public static void main(String[] args) {

        game Game = new game();
        //   Scanner sc = new Scanner(System.in);
        boolean hasGuessesCorrectly = false;

        System.out.println("welcome to the number of guess game");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");


        while(!hasGuessesCorrectly){
            int numberToGuess = Game.takeUserInput();
            hasGuessesCorrectly = Game.isCorrectNumber(numberToGuess);
        }

        System.out.println("you guesses the number in " + Game.getNumberOFGuesses() + "attempts");

    }
}

