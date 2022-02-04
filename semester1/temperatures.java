package semester1;

import java.util.Scanner;

public class temperatures
{
    public static void main(String[] args)
    {
        int[] temps = new int[7];

        Scanner console = new Scanner(System.in);
        for (int i = 1; i<= 7; i++)
        {
            System.out.print("Enter Temperature Day" + i + ": ");
            temps[i-1] = console.nextInt();
        }
        
        double average = calculateAvg(temps);
        int days = PrintDays(average, temps);
        System.out.println(days + " days above average temperature!!!");
        console.close();
    }

    

    public static double calculateAvg (int[] a)
    {
        double total = 0;
    
        for (int i = 0; i < a.length; i++)
        {
            total += a[i];
        }

        double avg = total/a.length;
        return avg;

    }

    public static int PrintDays(double x, int[]a)
    {
        int days = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > x)
            {
                days++;
            }
        }
        return days;
    }
}