package org.example;

import java.util.*;


public class NumberGame {
    int guesses = 0;
    int score = 0;


    public NumberGame(int guesses, int score) {
        this.guesses = guesses;
        this.score = score;
    }


    // Generate a random number within a specified range, such as 1 to 100.
    public void startGame() {
        guesses = 3;

        System.out.println("Welcome to the Number Game!");
        System.out.println("The computer will generate a random number from 1 to 10. Can you guess what it is?");

        int min = 1;
        int max = 10;
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println("Random number is: " + randomNum);

        getUserGuess(randomNum, guesses);
    }


    // Prompt the user to enter their guess for the generated number.
    public void getUserGuess(int randomNum, int guesses) {
        if (guesses >= 1) {
            System.out.println("Enter your guess.");

            Scanner guessScanner = new Scanner(System.in);
            int guessInput = guessScanner.nextInt();

            guesses--;

            System.out.println("Random number is: " + randomNum);


        } else {
            System.out.println("Sorry, you have no more guesses remaining. Game over!");
            System.out.println("Would you like to play again? Enter 'Y' or 'N'.");
            playAgain();
        }
    }


      /*
        3. Compare the user's guess with the generated number and provide feedback on whether the guess
        is correct, too high, or too low.
        4. Repeat steps 2 and 3 until the user guesses the correct number.

        You can incorporate additional details as follows:
        5. Limit the number of attempts the user has to guess the number.
        6. Add the option for multiple rounds, allowing the user to play again.
        7. Display the user's score, which can be based on the number of attempts taken or rounds won.
     */
}
