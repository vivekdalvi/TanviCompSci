/*
  GuessingGame.java
  by Tanvi Dalvi
  11/12/19
  Period 2
 */
package semester1;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
    public static void main (String [] args)
    {
        //instantiates Scnner object
        Scanner kbReader = new Scanner(System.in);
        
        //gets the random number between 1-100
        int target = generateRandom();

        //initializes guess and count variable
        int guess = -1; 
        int count = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Your job is to guess that number.");

        //this is code for pseudocode that was given in the homework
        while (target != guess)
        {
            System.out.print("enter your guess: "); 
            guess = kbReader.nextInt();
            count++;
            if(guess < target)
            {
                System.out.println("Your guess is too low! Try again.");
            }
            else if(guess > target )
            {
                System.out.println("Your guess is too high! Try again.");
            }

        }
        kbReader.close();
        System.out.println("congratulations, you guessed my number in " + count + " tries. Thanks for playing");
    }


    //Random number generator (1-100)
    //It adds one so that we get 1-100 instead of 0-99
    public static int generateRandom()
    {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        return number;
    }
}