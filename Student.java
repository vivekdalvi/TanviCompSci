

import java.util.*;

public class Student
{

    public static void main (String[] args)
    {
        String[] names = new String [3];
        int[] ages = new  int[3];

        
        Scanner console = new Scanner(System.in);

        for(int i= 0; i <names.length; i++)
        {
            System.out.print("enter Name: "); 
            String name = console.next();
            System.out.print("enter Age: "); 
            int age = console.nextInt();
            names[i] = name;
            ages[i] = age;
        }
        Arrays.sort(ages);
        Arrays.sort(names);

        System.out.println("Name    Age");
        for(int i= 0; i <names.length; i++)
        {
            System.out.print(names[i] + "    ");
            System.out.println(ages[i]);
        }

        // tic tac toe practice
        String [][] boards = new String [3][3];
        boards[0][0]= "x";
        boards[0][1]= "o";
        boards[0][2]= "o";

        boards[1][0]= "o";
        boards[1][1]= "x";
        boards[1][2]= "o";
        
        boards[2][0]= "o";
        boards[2][1]= "o";
        boards[2][2]= "x";

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(boards[i][j]);
            }
            System.out.println();
           
        }
        



        
    }
}