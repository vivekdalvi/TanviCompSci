
package semester1;
import java.util.Random;


public class RandomWalk
{
    public static void main (String [] args)
    {
        Random r = new Random();
        randomWalk(r, 2);
    }

    public static void randomWalk(Random r, int t)
    {
        int posi = 0;
        int min = 0;
        int max = 0;
        System.out.println("goal = " + t + ", pos = 0");
        while (posi != t)
        {
            int add = r.nextInt(5) - 2;
            posi = posi + add;
            System.out.println("adding " + add + ", pos = " + posi);
            if (min > posi)
            {
                min = posi;
            }
            else if (max < posi)
            {
                max = posi;
            }

        }
        System.out.println("min = " + min + ", max = " + max);
    }

}