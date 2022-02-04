/*
   RandomDie.java
   by Tanvi Dalvi
   11/4/19
   Period 2
*/
package semester1;
import java.util.Random;

public class RandomDie
{
    public static void main(String [] args)
    {
        Random gen = new Random();
        
        int numberOne =0, numberTwo = 0, numberThree = 0, numberFour = 0, numberFive = 0, numberSix = 0;

        for(int i =1; i<= 100000; i++)
        {
            int number = gen.nextInt(6);
            if (number == 0)
            {
                numberOne++;
            }
            else if (number == 1)
            {
                numberTwo++;
            }
            else if (number == 2)
            {
                numberThree++;
            }
            else if (number == 3)
            {
                numberFour++;
            }
            else if (number == 4)
            {
                numberFive++;
            }
            else if (number == 5)
            {
                numberSix++;
            }
           
        }

        System.out.println("The Number 1 appeared " + numberOne + " Times");
        System.out.println("The Number 2 appeared " + numberTwo + " Times");
        System.out.println("The Number 3 appeared " + numberThree + " Times");
        System.out.println("The Number 4 appeared " + numberFour + " Times");
        System.out.println("The Number 5 appeared " + numberFive + " Times");
        System.out.println("The Number 6 appeared " + numberSix + " Times");
        int total = numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix;
        System.out.println("Total of all numbers: " + total );
    }
}