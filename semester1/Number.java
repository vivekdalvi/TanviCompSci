package semester1;

public class Number
{
   public static void main(String []args)
   {
   System.out.println("Hello Tanu");
   CountNumber();
   }
   public static void CountNumber()
   {
   for(int i=1; i<=10; i++)
   {
      for(int j=1; j<=i; j++)
      {
         System.out.print(j);
      }
      System.out.println();
   }
   }
}