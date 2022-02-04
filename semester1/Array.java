package semester1;

public class Array
{
    public static void main(String[] args)
    {

        
        //int[] first = {7, 2, 8, 9, 4, 13, 7, 1, 9};
     //   int[] second = {8, 8, 8, 8, 8};

       // isUnique(second);
       // boolean test = contains(first, second);
        //int[] test = collapse(first); 
    }


    public static int[] collapse(int[] a)
    {
        int[] b ;
        if(a.length %2 == 0)
        {
            b = new int [a.length/2];
        }
        else
        {
            b = new int [a.length/2 + 1];
            b [b.length - 1] = a[a.length - 1];
        }

        int j = 0;
        for(int i = 0; i < a.length - 1; i = i+2)
        {
            b[j] = a[i] + a[i+1];
            j++;
        }

        return b; 
    }


    public static boolean contains(int[] a, int[] b)
    {
        int[] longarray; 
        int[] shortarray;

        if(a.length >= b.length)
        {
            shortarray = b;
            longarray = a;
        }
        else
        {
            longarray = b;
            shortarray = a;
        }

        boolean iscontains = false; 
       for (int i =0; i < longarray.length; i++)
       {
           if(shortarray[0] == longarray[i])
           {
               if(longarray.length - i >= shortarray.length)
               {
                    for(int j = 0; j < shortarray.length; j++)
                    {
                        if(shortarray[j] != longarray[j+i])
                        {
                            iscontains = false;
                            j = shortarray.length;
                        }
                        else
                        {
                            iscontains = true;
                        }
                    }
                    if(iscontains == true)
                    {
                        return true;
                    }
                }
            }
       }
       return iscontains;
    }

    public static int priceIsRight(int[] bids, int price)
    {

        int finalprice = -1;
        for (int i = 0; i < bids.length; i++ )
        {
            if (bids[i] > finalprice && bids[i] <= price)
            {
                finalprice = bids[i];

            }
        }
        return finalprice;

    }

    public static boolean isUnique (int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    

    public static double percentEven(int[] a)
    {
        double percenteven = 0;
        int totaleven = 0;

        if(a.length == 0)
        {
            return percenteven;
        }
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i]%2 == 0)
            {
                totaleven++;
            }
        }
        percenteven = ((double)totaleven/(double)a.length) * 100;
        return percenteven;
    }
}