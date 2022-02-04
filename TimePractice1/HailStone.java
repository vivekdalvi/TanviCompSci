package TimePractice1;



public class HailStone {

    static int len ;
    public static void main(String[] args)
    {
        String s = "This is just Best BEST a text of review is it best";
        String[] words = s.split(" ");

        for (String word : words) 
        {
            //if(word.compareTo("best") == 0)
            if(word.indexOf("best") != -1)
            //if(word.equals("best") == true)
            { 
                System.out.println(word);
                System.out.println(s.indexOf("best") );
            }
        }
        
    }

    // APID: 48U4X0V5
    // Initials: TVD
    // FRQ1 PART C
    // all the methods in the class will be required.as i will be using to first get sequence 
    //then determinse if the sequence is long or not. if it is long then i will need to decide thwat exactly is the answer

    public static int hailstoneLength(int n)
    {
        len = 1;
        
        while (n != 1)
        {
            if(n%2 == 0)
            {
                n = n/2;
            }
            else
            {
                n = 3*n +1;
            }
            len++;
        }

        return len;
    }

    public static boolean propLong(int n)
    {
        return true;
    }

}