package semester1;

public class substring
{
    public static void main (String [] args)
    {
        String str1 = "car";
        String str2 = "fsdfsdsdfssddsfdsfsdcarsdsfsdfsdfsdfsdfdsfsdfsd";
        String match = "";

        for (int i = 0; i < str1.length(); i++)
        {
            for (int j = 0; j <str2.length(); j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    int k = i;
                    int l = j;
                    boolean endofstring = false;
                    while(str1.charAt(k) == str2.charAt(l) && endofstring == false)
                    {
                        String temp = Character.toString(str1.charAt(k));
                        match = match.concat(temp);
                        k++;
                        l++;
                        if(k >= str1.length() || l >= str2.length())
                        {
                            endofstring = true;
                            k--;
                            l--;
                            
                        }
                       
                    }
                    System.out.println(match);
                    match = "";
                    i = k;
                }
            }
        }

        


    }
}