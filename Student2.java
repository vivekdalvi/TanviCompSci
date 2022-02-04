public class Student2
{

    //instance variables
    private String name ;
    private int age;

    //constructor
    public Student2()
    {
        name = "";
        age = 0;
    }
    public Student2(String n, int a)
    {
        name = n;
        age = a;
    }

    //accessors
    public String GetName()
    {
        return name;
    }
    public int GetAge()
    {
        return age;
    }

    //mutators
    public void SetName(String n)
    {
        name = n;
    }
    public void SetAge(int a)
    {
        age = a;
    }
    //other functions

    public String ToString()
    {
        String str = name +" " + age;
        return str;
    }
}