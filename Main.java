
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args ){
        // instance variables - replace the example below with your own
        Scanner in = new Scanner(System.in);
        Random correctAnswer = new Random();
        int numberToGuess = correctAnswer.nextInt(26);
        int numberOfGuesses = 0;
        boolean win = false;
        int prevGuess = 100;
    
        
        
    
    
    
        while (win == false){
    
        
            System.out.print("Please guess a number between 0 and 25");
            int guess = in.nextInt();
            
            
            if (prevGuess != guess) {numberOfGuesses++;}
            prevGuess = guess;
    
            if (guess == numberToGuess) {win = true;}
    
    
            else if (guess > numberToGuess) {System.out.println("Too High");}
    
    
            else if (guess < numberToGuess) {System.out.println("Too Low");}
    
            
            
            
            
                //  if (guess != prevGuess) {numberOfGuesses++;}
                // initialise instance variables
        
    
        
    
        
    
    
    
        }

        System.out.println("Correct Guess");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfGuesses + " tries");
 
    }
}