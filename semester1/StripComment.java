package semester1;

public class StripComment
{
    public static void main (String [] args)
    {
        printStripped("this is plain text");
        printStripped("this has a normal comment <right here> to be removed");
        printStripped("this has multiple less-than in a comment <<<<<see?>");
        printStripped("this > has <comment>greater-than outside a comment >>");
        printStripped("<hi>this has <foo> multiple <bar> comments<baz><>.");
    }   
    
    public static void printStripped(String str)
    {
        int length = str.length();

        String newstr = "";
        boolean commentopen = false;
       // boolean commentclose = false;
    

        for(int i = 0; i < length; i++)
        {
            char current = str.charAt(i);
            if (current == '<')
            {
                commentopen = true; 
                //commentclose = false;
            }
            if(current == '>' && commentopen == true)
            {
                commentopen = false;
                //commentclose = true;
            }
            if(commentopen != true && current != '>')
            {
                newstr = newstr + current;
            }
        }

        System.out.println(newstr);
    }
}