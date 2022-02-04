/*
 * TestBox.java
 * by Tanvi Dalvi
 * Period 2
 * 2/8/20
 * Worked Alone
 */

import java.util.Scanner;

public class TestBox
{
    public static void main (String [] args)
    {
        int x =0;
        int y = 0; 
        int height = 0;
        int width = 0;
        Scanner kbReader = new Scanner(System.in);
        Box [] boxes = new Box[3];

        for (int i = 0; i< 3; i++)
        {
            System.out.print("enter x: "); 
            x = kbReader.nextInt();
            System.out.print("enter y: "); 
            y = kbReader.nextInt();
            System.out.print("enter width: "); 
            width = kbReader.nextInt();
            System.out.print("enter height: "); 
            height = kbReader.nextInt();
            boxes[i]= new Box(x, y, width, height);
        }

        for (int i = 0; i  < 3; i++)
        {
            System.out.println(boxes[i].toString());
        }

        kbReader.close();
    }
}