/*
 * Mastermind.java
 * by Tanvi Dalvi
 * Period 2
 * 1/19/20
 * Worked Alone
 */
package semester1;

import java.util.Random;
import java.util.Arrays;

public class lotto
{

    private static final int SIZE = 50;
    private static final int NUMBEROFNUMBERS = 6;

    public static void main(String [] args)
    {
        int[] winningnumbers = GenerateRandomArray();
        Arrays.sort(winningnumbers);
        System.out.println("Winners: [" + winningnumbers[0] + ", " + winningnumbers[1] + ", " + winningnumbers[2] + ", " + winningnumbers[3] + ", " + winningnumbers[4] + ", " + winningnumbers[5] + "]");

        int totalbets = 0; 

        for (int i = 0; i < SIZE; i ++)
        {
            boolean match = false;
            int numberofbets = 0;
            while( match == false)
            {
                int[] bets = GenerateRandomArray();
                Arrays.sort(bets);
                numberofbets++;
                int compare = Arrays.compare(winningnumbers, bets);
                if (compare == 0)
                {
                    System.out.println("Number of Bets to winning: " + numberofbets);
                    totalbets += numberofbets;
                    match = true;
                }
            }
        }

        System.out.println("SIZE: " + SIZE + " Average Bets: " + totalbets/SIZE);
        System.out.println("*****************************************************");
        double totalmoney = totalbets * 0.5;
        System.out.printf("Total money bet: " + totalmoney + " for $1,000,000 lottery!");
        double diff = totalmoney - 1000000;
        System.out.println("Total money lost: " + diff + " for $1,000,000 lottery!");
    }

    public static int[] GenerateRandomArray()
    {
        int [] generator = new int [NUMBEROFNUMBERS];
        for (int i = 0; i < NUMBEROFNUMBERS; i++)
        {
            boolean check = true;
            while( check == true)
            {
                Random r = new Random();
                int store = r.nextInt(49) + 1;
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

