/*
  CrazySeven.java
  by Tanvi Dalvi
  11/6/19
  Period 2
*/
package semester1;
import java.util.Random;


public  class CrazySeven
{
    public static void main(String[] args) 
    {
        //this tracks number of times dies score seven
        int scoreseven = 0;
        //this tracks number of times dies have to be rolled to achieve 100000 7s
        int totalthrows = 0;
        //all of these track nubmer of times different combination of 7s 
        int score16 = 0;
        int score25 = 0;
        int score34 = 0;

        //two random die1 & die2 represent two dies.
        Random die1 = new Random();
        Random die2 = new Random();
       

        //runs till seven is scored 100000 times
        while (scoreseven < 100000)
        {
            int die1value = rolldice(die1);
            int die2value = rolldice(die2);
            totalthrows++;

            //tracks each combination of 7s
            if (die1value + die2value == 7)
            {
                scoreseven++;
                if (die1value==1 && die2value==6 || die1value == 6 && die2value==1 )
                {
                    score16++;
                }
                else if (die1value==2 && die2value==5 || die1value == 5 && die2value==2 )
                {
                    score25++;
                }
                else if (die1value==3 && die2value==4 || die1value == 4 && die2value==3 )
                {
                    score34++;
                }
            }
        }


        //prints output
        printmessage(score16, score25, score34, scoreseven, totalthrows);
        


    }


    //prints messages
    public static void printmessage(int score16, int score25, int score34, int scoreseven, int totalthrows)
    {
        System.out.println("Out of" + totalthrows + "successful throws of 7 the number of sevens for each combination was:");
        System.out.println("\t" + score16 + " was the combination of a six and a one.");
        System.out.println("\t" + score25 + " was the combination of a five and a two.");
        System.out.println("\t" + score34 + " was the combination of a four and a three.");

        System.out.println("The overall probability of a seven in one throw is " + (float)(scoreseven*100/totalthrows) + " %." );

        System.out.println("This probability of a single throw of a pair of dice totalling 7 is, by combination");
        System.out.println("\t" + (float)(score16*100)/totalthrows + " % for a six and a one");
        System.out.println("\t" + (float)(score25*100)/totalthrows + " % for a five and a two");
        System.out.println("\t" + (float)(score34*100)/totalthrows + " % for a four and a three");
    }


    //rolls each dice and returns the number+1
    public static int rolldice(Random die)
    {
        int number = die.nextInt(6);
        return number + 1;
    }
}