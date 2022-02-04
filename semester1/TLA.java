

/*
 * TLA.java
 * by Tanvi Dalvi
 * Period 2
 * 1/19/20
 * Worked Alone
 */
package semester1;

import java.util.Scanner;

public class TLA
{
    public static void main (String [] args)
    {
        int[] indices = GetTLA();
        System.out.println(Words1[indices[0]] + " " + Words2[indices[1]] + " " + Words3[indices[2]] );
    }

    public static int[] GetTLA()
    {
       
        int[] indices = new int[3];
        
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What TLA would you like to expand? ");
        String word = kbReader.next();
        word = word.toUpperCase();
        if (word.length() == 3)
        {
            for (int i = 0; i < 3; i++)
            {
                char c = word.charAt(i);
                if (i != -1)
                {
                    indices[i] = findIndex(c);
                }
                else 
                {
                    System.out.println("Incorrect input!");
                }
                
            }
        }
        else
        {
            System.out.println("Incorrect input!");
        }
        kbReader.close();

        return indices;
    }

    public static int findIndex(char c){
        for(int i = 0; i < LETTERS.length(); i++){    
            if(c == LETTERS.charAt(i)){
                return i;
            }
        }
        return -1; // not found
    }



    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String[] Words1 =
    {
        "All",
        "Brain",
        "Cantelopes",
        "Dungeons",
        "Extremophiles",
        "Foxyt",
        "Genome",
        "Havana",
        "Iguanas",
        "Jello",
        "Kangaroos",
        "Lima Beans",
        "Mowgli's",
        "Nanograms",
        "OompaLoompas",
        "Pepino",
        "Quesedillas",
        "Raincoats",
        "Scooby",
        "Tails",
        "Unicorns",
        "Visco",
        "Whales",
        "X-ray",
        "Yodeling",
        "Zoo"
    } ;

    private static final String[] Words2 =
    {
        "American",
        "Best",
        "Catterpillars",
        "Demons",
        "Endoplasmic Reticulum",
        "Fantastic",
        "Geometry",
        "Hold",
        "Is",
        "Jumbo",
        "Knapsack",
        "Loud",
        "Mile",
        "Novelty",
        "Office",
        "Peppa Pig",
        "Qdoba",
        "River",
        "Songs",
        "Tomatoes",
        "Unibrows",
        "Vicious",
        "Wonderous",
        "X-ample",
        "York",
        "Zero"
    } ;

    private static final String[] Words3 =
    {
        "Association",
        "Bro",
        "Camels",
        "Drangons",
        "Excellence",
        "Federation",
        "Gone",
        "Home",
        "India",
        "Jigglypuff",
        "Kim Possible",
        "Lentils",
        "Mine",
        "Nobody",
        "O-some",
        "Park",
        "Quebec",
        "Radio",
        "Snakes",
        "Tantrums",
        "Uniform",
        "Vaccum Cleaners",
        "World",
        "X-ray",
        "Yams",
        "Zookeepers"
    } ;
}