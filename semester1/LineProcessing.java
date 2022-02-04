/*
LineProcessing.java    
by Tanvi Dalvi
12/7/19
Period 2
*/
package semester1;
// I was absent on Wednesday. 
import java.util.Scanner;
import java.io.*;

public class LineProcessing 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("C:\\myLines.txt");
        if(!f.exists())
        {
            System.out.println("File not found.");
        } 
        else 
        {
            
            int numberOfLines = 0;
            int numberOfWords = 0;
            int numberOfChars = 0;
            int numberOfEs = 0;

            Scanner input = new Scanner(f);
            while(input.hasNextLine())
            {
                String line = input.nextLine();
                int words = CountWords(line);
                int chars = CountCharacters(line);
                int Es = CountEs(line);
                numberOfEs += Es;
                numberOfWords += words;
                numberOfChars += chars;
                numberOfLines++;
            }
            System.out.println("Number of lines: " + numberOfLines);
            System.out.println("Number of words: " + numberOfWords);
            System.out.println("Number of Chars: " + numberOfChars);
            System.out.println("Number of es and   Es: " + numberOfEs);
            input.close();
        } 
        
    }
     
    // Method to count words
    public static int CountWords(String line)
    {
        int wordcount = 0;
        Scanner scan = new Scanner(line);
        while(scan.hasNext()){
            scan.next();  
            wordcount++;
        }
        scan.close();
        return wordcount;
    }

    // Method to count characters
    public static int CountCharacters(String line)
    {
        int charcount = 0;

        Scanner scan = new Scanner(line);
        while(scan.hasNext()){
            String str = scan.next();  
            charcount += str.length();
        }
        scan.close();
        return charcount;
    }

    // Method to count e's and E's
    public static int CountEs(String line)
    {
        int ecount = 0;

        Scanner scan = new Scanner(line);
        while(scan.hasNext()){
            String str = scan.next();  
            for (int i =0; i< str.length(); i++)
            {
                if(str.charAt(i) == 'e' || str.charAt(i) == 'E')
                {
                    ecount++;
                }
            }
        }
        scan.close();
        return ecount;
    }
}
