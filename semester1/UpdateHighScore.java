package semester1;

/*
 * UpdateHighScore.java
 * by Tanvi Dalvi
 * 12/19/19
 * Period 2
 */

import java.util.Scanner;
import java.io.*;

public class UpdateHighScore
{
    public static void main(String[] args) throws IOException
    {
        
        //Ask the user for name and new score
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter player name: ");
        String newname = reader.next();
        System.out.print("Please enter new score: ");
        int newscore = reader.nextInt();
        reader.close();

        //Reader for current file
        File oldFile = new File("c:\\text\\currentHighScore.txt");
        Scanner currentfileReader = GetReader(oldFile);
        
        //Writer for new file
        File newFile = new File("c:\\text\\newHighScore.txt");
        PrintStream updatefileStream = GetWriter(newFile);

        int scorecount = 0;
        //read each value and compare
        while (currentfileReader.hasNext())
        {
            //reader value for a given player
            String playername = currentfileReader.next();
            int playerscore = currentfileReader.nextInt();
           
            //decides if new score should be inserted here
            if(playerscore <= newscore && scorecount < 5)
            {
                //write newscore and then replace newscore
                updatefileStream.println(newname + " " + newscore);
                newname = playername;
                newscore = playerscore;
                scorecount++;
            }
            else if (playerscore > newscore && scorecount < 5)
            {
                //write old playerscore
                updatefileStream.println(playername + " " + playerscore);
                scorecount++;
            }
            
        }
        updatefileStream.flush();
        updatefileStream.close();
        currentfileReader.close();
        
        //cleans up old file
        CleanupFiles(oldFile, newFile);
        
        //prints current file and old (backup) file
        File currentFile = new File("c:\\text\\currentHighScore.txt");
        System.out.println("********************Updated Results File********************");
        PrintFile(currentFile);
    }

    public static Scanner GetReader (File f) throws IOException
    {
        Scanner fileReader = null;
        if(!f.exists())
        {
            System.out.println("File not found");
        }
        else
        {
            fileReader = new Scanner(f);
        }
        return fileReader;
    }

    public static void PrintFile(File currentFile) throws IOException
    {
        
        Scanner currentfileReader = GetReader(currentFile); 
        while (currentfileReader.hasNextLine())
        {
            System.out.println(currentfileReader.nextLine());
        }
        currentfileReader.close();
    }

    public static PrintStream GetWriter(File f) throws IOException
    {
        if(f.exists()){
            f.delete();
        }
        f.createNewFile();
        PrintStream writer = new PrintStream(f);
        return writer;
    }

    public static void CleanupFiles (File oldFile, File newFile)
    {
        File backupFile = new File("c:\\text\\backupHighScore.txt");
        if(backupFile.exists()){
            backupFile.delete();
        }

        oldFile.renameTo(backupFile);
        newFile.renameTo(oldFile);
    }
}