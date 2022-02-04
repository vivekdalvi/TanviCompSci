package semester1;

import java.util.Scanner;

public class test
{
    public static void main (String [] args)
    {
        Scanner kbReader = new Scanner (System.in);
        int function = 1;

        while (function == 1 || function ==2 || function == 3 || function == 4)
        {
            System.out.print("Enter function: 1. Add   2. Subtract   3. Multiply   4. Divide   5. Quit:     ");
            function = kbReader.nextInt();

            if (function != 5)
            {
                System.out.print("Enter x integer: ");
                int x = kbReader.nextInt();
                System.out.print("Enter y integer: ");
                int y = kbReader.nextInt();

                if (function == 1)
                {
                    int result = Add (x, y);
                    System.out.println("Addition is: " + result);
                }
                else if (function == 2)
                {
                    int result = Subtract (x, y);
                    System.out.println("Subtraction is: " + result);
                }
                else if (function == 3)
                {
                    int result = Multiplication (x, y);
                    System.out.println("Multiplication is: " + result);
                }
                else if (function == 4)
                {
                    int result = Division (x, y);
                    System.out.println("Division is: " + result);
                }
            }
            
        }
        kbReader.close();
    }
    
    public static int Add (int x, int y)
    {
        int Addi = x + y;
        return Addi; 
    }
    public static int Subtract (int x, int y)
    {
        int Sub = x - y;
        return Sub;
    }
    public static int Multiplication (int x, int y)
    {
        int Mult = x * y;
        return Mult;
    }
    public static int Division (int x, int y)
    {
        int Div = x / y;
        return Div;
    }
}