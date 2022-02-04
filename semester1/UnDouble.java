package semester1;

public class UnDouble
{
    public static void main (String [] args)
    {
        String newstring = unDouble("Tanvi");
        System.out.println("Tanvi");
        System.out.println(newstring);
    }

    public static String unDouble(String str)
    {
        String newstring = ""; 
        int length = str.length();
        char current; 
        char previous = ' ';

        for (int i = 0; i < length; i++ )
        {
             current = str.charAt(i);
             if (current != previous)
             {
                newstring = newstring + current;
             }
             previous = current;
        }
        return newstring; 
    }
}