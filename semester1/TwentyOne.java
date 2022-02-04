package semester1;

import java.util.Random;
import java.util.Scanner;

/*
  TwentyOne.java
  by Tanvi Dalvi
  11/14/19
  Period 2
*/

public class TwentyOne
{

    public static void main (String [] args)
    {
        Random r = new Random();
        Scanner kbReader = new Scanner(System.in);       
        boolean gamecontinue = true;

        System.out.print("Would you like to play a game? 1) yes 2)No: ");
        
        if (getMenuSelection(kbReader) != 1)
        {
            gamecontinue = false;
        }
        while (gamecontinue == true)
        {    
            
            int playertotal = Playerplay(kbReader, r);
            if(playertotal  > 21)
            {
                System.out.println("you have lost!");
                
            }
            else
            {
                int computertotal = Computerplay(r, playertotal);
                if (computertotal > 21)
                {
                    System.out.println ("you have won!");
                }
                else 
                {
                    System.out.println ("you have lost!");
                }
            }               
            System.out.print("Would you like to play a game? 1) yes 2)No: ");
            if(getMenuSelection(kbReader) == 2)
            {
                gamecontinue = false;
            }
        }
    }

    public static int Playerplay(Scanner s, Random r)
    {
        int playertotal = 0;
        boolean exit = false;
        while (playertotal < 21 && exit == false)
        {
            int draw = generateRandom(r);
            playertotal += draw;
            System.out.println("you have drawn " + draw + " for a total of " + playertotal);
            if( playertotal < 21)
            {
                System.out.print("Do you want to draw another number? 1) yes 2)No: ");
                if (getMenuSelection(s) == 2)
                {
                    exit = true;
                }
            }
        }
        return playertotal;
    }

    public static int Computerplay(Random r, int playertotal)
    {
        int computertotal = 0;

        while (computertotal < 21 && computertotal < playertotal)
        {
            int draw = generateRandom(r);
            computertotal += draw;
            System.out.println("Computer has drawn " + draw + " for a total of " + computertotal);
        }

        return computertotal;
    }


    public static int getMenuSelection(Scanner kbReader)
    {
        int result = -1;
        while(result != 1 && result != 2)
        {
           while(!kbReader.hasNextInt())
           {
              kbReader.next();
              System.out.print("Not an integer; try again: ");
           }
           result = kbReader.nextInt();
           if(result != 1 && result != 2)
           {
              System.out.print("Please enter 1 for yes, 2 for no: ");
           }
        }
        return result;
     }
  

    public static int generateRandom(Random r)
    {
        
        int number = r.nextInt(13) + 1;
        return number;
    }
}