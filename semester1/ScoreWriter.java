
/*
  ScoreWriter.java
  by Tanvi Dalvi
  12/17/19
  Period 2
 */
package semester1;
import java.util.Scanner;
import java.io.*;


public class ScoreWriter
{

    public static void main(String[] args) throws IOException
    {
        File myFile = new File("c:\\text\\Scores.txt");
        if(myFile.exists()){
            myFile.delete();
        }
        myFile.createNewFile();
        
        PrintStream stream = new PrintStream(myFile);

        Scanner reader = new Scanner(System.in);

        //get how many students
        System.out.print("How many students are to be entered? ");
        int numofstudents = reader.nextInt();
        for (int i = 1; i <= numofstudents; i++)
        {
            System.out.print("Family Name: ");
            stream.print(reader.next() + " "); 
            System.out.print("First Name: ");
            stream.print(reader.next() + " "); 
            System.out.print("ID Number: ");
            int id = 0;
            while (id < 100000)
            {
                
                id = reader.nextInt();
                if (id < 100000)
                {
                    System.out.print ("ID needs to be six digits, please enter again: ");
                }
            }
            stream.print(id + " "); 

            System.out.print("Number of Test scores: ");
            int numberofscores = reader.nextInt();
            //stream.print(numberofscores + " ");
            for (int j = 1; j <= numberofscores; j++)
            {
                System.out.print("Please enter Test score #" + j + ": ");
                stream.print(reader.nextDouble() + " ");
            }
            stream.println();
        }
        reader.close();
        stream.flush();
        stream.close();
    }
}