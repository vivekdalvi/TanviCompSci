package Vehicles;


public class Car implements Vehicle
{
    //instance variables
    private double speed;
    private int tiresnumber;
    private int maxpassengers;
    private int actualpassengers; 

    // constructors
    public Car()
    {
        speed = 0.0;
        tiresnumber = 0;
        maxpassengers = 5;
        actualpassengers = 0;
    }

    // accessors
    public double getSpeed()
    {
        return speed;
    }
    public int gettiresnumber()
    {
        return tiresnumber;
    }
    public int getAddpassengers()
    {
        return maxpassengers - actualpassengers;
    }

    // mutators
    public void setSpeed(double s)
    {
        speed = s;
    }
    public void setTiresnumber(int t)
    {
        tiresnumber = t;
    }
    public void setActualpassengers(int a)
    {
        actualpassengers = a;
    }
    public void setMaxpassengers(int m)
    {
        maxpassengers = m;
    }

    // toString
    public String toString()
    {
        String str = ("You can add " + getAddpassengers() + " more passengers in the car!");
        return str;
    }
}