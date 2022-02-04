/*
  FirstConstant.java
  by Tanvi Dalvi
  09/25/19
  Period 2
*/
package semester1;

public class FirstConstantFinal
{
    final static int SIZE = 4;

    public static void main (String [] args)
    {
        //calculates number of columns based on size
        int numberofcolumns = (2 + (SIZE-1)*4);

        //prints each row
        for (int row =0; row< SIZE; row++)
        {
            int exlaims = numberofcolumns - row*4;
            //print leading slashes
            for (int j = 1; j <= 2*row; j++)
            {
                System.out.print("\\");
            }

            //print middle exclaimation marks
            for (int k = 1; k<=exlaims; k++)
            {
                System.out.print("!");
            }

            //print trailing slashes
            for (int j = 1; j <= 2*row; j++)
            {
                System.out.print("/");
            }
            //prints new line
            System.out.println();
        }
    }
}