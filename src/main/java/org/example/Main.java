package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a simple number guessing game, that takes in some user input matches it to a 'secret' number.
        // Prompt user to enter number
        System.out.println("Guess My Secret Number :D");
        // Collect user input
        Scanner reader = new Scanner(System.in);
        String secretnumber = reader.nextLine();
        // if number is 22 print 'woohoo'
        String result = secretnumber.equals("22") ? "woohoo" : "Try Again!";
        System.out.println(result);
        // otherwise print 'womp womp'
        //
        // The program should indicate if an incorrect guess is too high or too low.It should, of course, let the user
        // know if they have guessed the number correctly.
        // code for too high

        Scanner sc = new Scanner(System.in);

        int secretNumber = reader.nextInt();

        if (secretNumber == 22){
            System.out.println("woohoo");
        }
        else if (secretNumber > 22 ){
            System.out.println("too high");
        }
        // If true print 'too high'
        else if (secretNumber < 22 ){
            System.out.println("too low");
        }
        // code for too low
        // if true print 'too low'


    }
}
