/*
 * Mastermind.java
 * by Tanvi Dalvi
 * Period 2
 * 1/19/20
 * Worked Alone
 */

package semester1;
import java.util.Scanner;
import java.util.Random;
    
public class Mastermind
{
   public static void main(String [] args)
   {
      int[] generator = GenerateRandomArray();
      System.out.println("The computer has randomely chosen 4 different numbers.");
      System.out.println("Guess the numbers in correct order.");
      
         int play = 1; // 1 is to continue, and 2 is to quit.
         int guesses = 0;

         while (play == 1)
         {
            int [] userGuess = ReadValues();
            guesses ++;
            
            for (int i = 0; i < 4; i++)
            {
               if (generator [i] == userGuess [i])
               {
                  System.out.println(userGuess[i] + " is correct and in the correct position.");
               }
               
               else if (userGuess [i] == generator [0] || userGuess [i] == generator [1] || userGuess [i] == generator [2] || userGuess [i] == generator [3])
               {
                  System.out.println(userGuess[i] + " is correct but in INCORRECT position.");
               }                                             
            }
            if (generator [1] == userGuess [1] && generator [2] == userGuess [2] && generator [0] == userGuess [0] && generator [3] == userGuess [3])
            {
               System.out.println("CONGRATULATIONS!!! Your sequence matches the computer's sequence.");
               System.out.println("The computer's sequence was: " + generator[0] + " " + generator[1] + " " + generator[2] + " " + generator[3]);
               System.out.println("Number of guesses is: " + guesses);
               play = 2;
            }
            else
            {
               Scanner console = new Scanner(System.in);
               System.out.print("Please enter 1 to continue or 2 to quit game: ");
               play = console.nextInt();
               if (play == 2)
               {
                  System.out.println("Your sequence does not match the computer's. Better luck next time!");
                  System.out.println("The correct numbers in order are: " + generator[0] + " " + generator[1] + " " + generator[2] + " " + generator[3]);
                  System.out.println("Number of guesses is: " + guesses);
               }
               console.close();
            }
         }
   }
   
   public static int[] ReadValues()
   {
      int [] userGuess = new int[4];
      System.out.print("To guess enter 4 numbers seperated by spaces: ");
      Scanner kbReader = new Scanner(System.in);
      String str = kbReader.nextLine();
      Scanner scan = new Scanner(str);
     
      for (int i = 0; i < userGuess.length; i++)
      {
         userGuess[i] = scan.nextInt();
         //userGuess[i] = generator[i];
      }
      kbReader.close();
      scan.close();
      return userGuess;
   }
   
   
   public static int[] GenerateRandomArray()
   {
      int [] generator = new int [4];
      for (int i = 0; i < 4; i++)
      {
         boolean check = true;
         while( check == true)
         {
            Random r = new Random();
            int store = r.nextInt(9) + 1;
            check = hasValue(generator, store);
            if (check == false)
            {
               generator[i] = store;
            }
         }    
      }
      return generator;
   }
   
   public static boolean hasValue(int[] a, int b)
   {
      for(int n = 0; n < a.length; n++)
      {
         if (b == a[n])
         {
            return true;
         }
      }
      return false;
   }
    
}
