/*
  RockPaperScissors.java
  by Tanvi Dalvi
  11/15/19
  Period 2
*/
package semester1;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main (String [] args)
   {
      Random r = new Random();
      Scanner kbReader = new Scanner(System.in);
      int option = 1;

      while (option == 1)
      {   
         System.out.print("Would you like to play a game? 1) yes 2) No: ");
         option = getMenuSelection(kbReader);
         if ( option == 1)
         {
            System.out.print("Enter 1) Rock 2) Paper 3) Scissor: ");
            int userchoice = getMenuSelection(kbReader);
            int computerchoice = generateRandom(r);
            printResults(userchoice, computerchoice);
         }
      } 
   }

   public static void printResults(int userchoice, int computerchoice)
   {
      if (userchoice == 1 && computerchoice == 2)
         {
            System.out.println("You picked Rock");
            System.out.println("Computer picked Paper");
            System.out.println("Computer wins!");
         }
         else if (userchoice == 1 && computerchoice == 3)
         {
            System.out.println("You picked Rock");
            System.out.println("Computer picked Paper");
            System.out.println("You win!"); 
         }
         else if (userchoice == 2 && computerchoice == 3)
         {
            System.out.println("You picked Paper");
            System.out.println("Computer picked Scissor");
            System.out.println("Computer wins!");
         }
         else if (userchoice == 2 && computerchoice ==1)
         {
            System.out.println("You picked Paper");
            System.out.println("Computer picked Rock");
            System.out.println("You win!");
         }
         else if (userchoice == 3 && computerchoice == 1)
         {
            System.out.println("You picked Scissor");
            System.out.println("Computer picked Rock");
            System.out.println("Computer wins!");
         }
         else if (userchoice == 3 && computerchoice == 2)
         {
            System.out.println("You picked Scissor");
            System.out.println("Computer picked Paper");
            System.out.println("You win!");
         }
         else if (userchoice == computerchoice)
         {
            System.out.println("Computer and you picked the same object.");
            System.out.println("The game is a tie. :) ");
         }
   }
    
    // generates 3 numbers
    public static int generateRandom(Random r)
    {
        int x = r.nextInt(3) +1;
        return x;
    }

    public static int getMenuSelection(Scanner kbReader)
    {
        int result = -1;
        while(result != 1 && result != 2 && result != 3)
        {
           while(!kbReader.hasNextInt())
           {
              kbReader.next();
              System.out.print("Not an integer; try again: ");
           }
           result = kbReader.nextInt();
           if(result != 1 && result != 2 && result != 3)
           {
              System.out.print("Please enter 1 for yes, 2 for no: ");
           }
        }
        return result;
     }
}
