/*
  RollingRockSimulation.java
  by Tanvi Dalvi && Bill Gates :-)
  11/6/19
  Period 2
*/
package semester1;
import java.util.Random;

public class RollingRockSimulation
{
    //class constant to run simulation 10000 times
    public static final int NUMBEROFATTEMPTS = 10000;
    public static final int MOVELIMIT = 9;

    public static void main (String[] args)
    {
        int total = 0; //counts number of resets for each boulder   

        //repeats for crushBoulder function 10000 times
        for (int i =0 ; i <NUMBEROFATTEMPTS; i++)
        {
            Random boulder = new Random ();
            int reset = crushBoulder(boulder);
            System.out.println("Rock [" + (i+1) + "] took " + reset + " resets to get crushed!");
            total += reset; 
        }

        System.out.println("Average number of resets for " + NUMBEROFATTEMPTS +" rocks: " + (float)total/NUMBEROFATTEMPTS);
    }

    //crushBoulder function simulates each boulder movement
    //it takes Random as input
    //it returns number of resets each boulder had to reach the top
    public static int crushBoulder(Random boulder)
    {
        int distancefromtop = 100; //uses to track distance from top.
        int reset = 0; //uses to track number of times boulder goes to begining

        //runs this loop while distance from top is still greater than 0
        while (distancefromtop > 0)
        {
            //calls generateRandom function to get a random movement 
            int move = generateRandom(boulder);
            //if move is 0 then boulder goes back to beginning
            if (move == 0)
            {
                distancefromtop = 100;
                reset++; //adds to number of attempt
            }
            else 
            {
               distancefromtop = distancefromtop - move;
            }
        }
        return reset; //returns number of resets
    }

    //Random number generator (0-9)
    //takes Random object as a parameter and returns a random number within move limit
    public static int generateRandom(Random r)
    {
        int number = r.nextInt(MOVELIMIT);
        return number;
    }
}
