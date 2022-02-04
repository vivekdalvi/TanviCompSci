package Vehicles;


public class Bike implements Vehicle
{
    //instance variables
    private double speed;
    private int tiresnumber;
    private int maxpassengers;
    private int actualpassengers; 

    // constructors
    public Bike()
    {
        speed = 50.0;
        tiresnumber = 2;
        maxpassengers = 2;
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
        speed = 50;
    }
    public void setTiresnumber(int t)
    {
        tiresnumber = 2;
    }
    public void setActualpassengers(int a)
    {
        actualpassengers = a;
    }
    public void setMaxpassengers(int m)
    {
        maxpassengers = 2;
    }

    // toString	
    public String toString()
    {
        String str = ("You can add " + getAddpassengers() + " more passengers in the bike!");
        return str;
    }
}