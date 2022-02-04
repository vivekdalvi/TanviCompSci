package semester1;
public class SameDashes
{
    public static void main (String [] args)
    {
        boolean test = sameDashes("1st-has-more characters", "2nd-has-less");
        if (test == true)
        {
             System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static boolean sameDashes (String a, String b)
    {
        
        int length1 = a.length();
        int length2 = b.length();
        if(length1 != length2)
        {
            return true;
        }
        char c1 = '@';
        char c2 = '@';
        boolean samedashes = false;

        for(int i = 0; i < length1; i++)
        {
            c1 = a.charAt(i);
            c2 = b.charAt(i);

            if(c1 == '-' && c2 == '-')
            {
                samedashes = true;
            }
            else
            {
                samedashes = false;
            }
          
        }

        return samedashes;
    }  

                
}