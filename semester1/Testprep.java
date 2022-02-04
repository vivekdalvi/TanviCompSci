package semester1;

import java.util.Scanner;
import java.util.Random;

public class Testprep
{
    public static void  main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
       // testLuck(5, console);
       //balanceCheckbook(console);
      // boolean test = sameDashes("criminal-plan", "(206-555-1384");
      console.close();

      //boolean test = IsAnagram("vivek", "tanvi");
    }

    public static boolean IsAnagram (String a, String b)
    {
        boolean isanagram = true;
        int length = a.length();
        int index = 0;
        while (isanagram = true && index < length)
        {
            if (a.charAt(index) != b.charAt(length - 1 -index))
            {
                isanagram = false;
            }
            index++;
        }
        return isanagram;
    }

    public static boolean sameDashes (String a, String b)
    {
        int l1 = a.length();
        //int l2 = b.length();
        //int iterationsize = 0;
    
        boolean sameDash = true;
       
        for (int i = 0; i< l1; i++)
        {
            if ((a.charAt(i) == '-' && b.charAt(i) != '-') || (a.charAt(i) != '-' && b.charAt(i) == '-'))
            {
                sameDash = false;
            }
        }
        return sameDash;
    }

    public static boolean balanceCheckbook(Scanner console)
    {
        boolean balancedcheckbook = true;

        System.out.print("Initial Balance: ");
        double ib = console.nextDouble();
        System.out.print("How many transactions: ");
        int num = console.nextInt();
        double nb = ib; 
        double min = nb;
        for (int i = 1; i<=num; i++ )
        {
            System.out.print(i + "/" + num + " amount: ");
            double enter = console.nextDouble();
            
            System.out.println("New Balance = " + (nb + enter));
           
            nb = nb + enter; 
            if(nb <= min)
            { 
                min = nb;
            }
        }
        System.out.println ("Min Balance: " + min);
        if (nb >= 0)
        {
            balancedcheckbook = false; 
        }
        else
        {
            balancedcheckbook = true;
        }

       return balancedcheckbook;
    }


    public static void testLuck(int n, Scanner console)
    {
        System.out.println("Guess " + n + " one digit odd number");
        Random r = new Random();
        int numbercorrect = 0;
        for (int i = 1; i <= n; i++)
        {
            int number = 0;
            number = r.nextInt(5)*2 + 1;
            System.out.print("Guess #" + i + "? ");
            int guess = console.nextInt();
            
            if (guess == number)
            {
                System.out.println("Correct!");
                numbercorrect++;
            }
            else 
            {
                System.out.println("Incorrect...Answer was " + number);
            }

        }
        System.out.println("Expected correct = " + n/5.0);
        System.out.println("You got " + numbercorrect + " correct");
    }
}
