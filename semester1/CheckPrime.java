
package semester1;
public class CheckPrime
{
    public static void main (String [] args)
    {
        boolean test = checkPrime(17);
        if(test == true)
        {
            System.out.println("Prime!");
        }
        else
        {
            System.out.println(" Not Prime!");
        }
    }

    public static boolean checkPrime(int n)
    {
        System.out.print("Factor of " + n + "=");
        int totalfact = 0;
        boolean isprime = true; 

        for (int i=1; i <= n; i++)
        {
            if(n%i == 0)
            {
                System.out.print( i + ", ");
                totalfact++;
            }
        }
        System.out.println("Total factors: " + totalfact);
        if (totalfact < 3)
        {    
            isprime = true;
        }
        else
        {
            isprime = false;
        }
        return isprime;
    }
}