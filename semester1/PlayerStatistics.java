/*
  PlayerStatistics.java
  by Tanvi Dalvi
  12/17/19
  Period 2
*/

package semester1;
import java.util.Scanner;
import java.io.*;

public class PlayerStatistics 

{
    public static void main (String [] args) throws FileNotFoundException
    {
        int totalweight = 0;
        int avgweight = 0;
        int numberofplayers = 0;
        
        File f = new File("C:\\text\\SeahawksRoster.txt");

        if(!f.exists())
        {
            System.out.println("File not found.");
        } 
        else 
        {
            PrintHeader();
            Scanner input = new Scanner(f);
            while(input.hasNextLine())
            {
                String line = input.nextLine();
               
                String playername = "";
                Scanner readplayer = new Scanner(line);
                while (!readplayer.hasNextInt())
                {
                    playername = playername + readplayer.next() + " ";
                }
                
                while (playername.length() != 40)
                {
                    playername += " ";
                }

                System.out.print(playername);
                int playerweight = readplayer.nextInt();
                System.out.print("\t" + playerweight);
                System.out.print("\t" + readplayer.next());
                System.out.print("\t" + readplayer.next());
                System.out.print("\t" + readplayer.nextLine());
                totalweight += playerweight;
                numberofplayers++;
                readplayer.close();
                System.out.println();
            }

            avgweight = totalweight/numberofplayers;
            
            System.out.println("Total weight for all players: " + totalweight);
            System.out.println("Average weight for all player: " + avgweight);
            input.close();

        }
    }

   
    

    public static void PrintHeader()
    {
        System.out.print("Name");
        System.out.printf("%45s", "Weight");
       
        System.out.print("\tAge");
        System.out.print("\tYears");
        System.out.print("\tSchool");
        System.out.println();

        System.out.print("-------------------------");
        System.out.printf("%25s", "-------");
        System.out.print("\t---");
        System.out.print("\t-----");
        System.out.print("\t------");
        System.out.println();


    }
    
}


