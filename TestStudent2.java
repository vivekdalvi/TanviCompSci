import java.util.*;



public class TestStudent2
{

    public static void main (String[] args)
    {
        Student2 [] students = new Student2[3];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            System.out.println("enter name: ");
            String name = console.next();
            System.out.println("enter age: ");
            int age = console.nextInt();

            students[i] = new Student2(name, age);
        }

        for (int i = 0; i < 3; i++)
        {
            String str =  students[i].toString();
            System.out.println(str);

        }




    }

}