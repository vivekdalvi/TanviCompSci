/*
 * Point.java
 * by Tanvi Dalvi
 * Period 2
 * 1/30/20
 * Worked Alone
 */


import java.lang.Math;

public class Point
{
    //private instance variable
    private int locX;
    private int locY;
    //Constructors
    public Point()
    {
        locX = 0;
        locY = 0;
    }
    public Point (int x, int y)
    {
        locX = x;
        locY = y;
    } 
    //Mutators
    public void setX(int x)
    {
        locX = x;
    }
    public void setY(int y)
    {
        locY = y;
    }
    //Accessors
    public int getX()
    {
        return locX;
    }
    public int getY()
    {
        return locY;
    }
    public double getDistanceToOrigin()
    {
        return Math.sqrt( (double) (locX*locX + locY*locY));
    }
    public String toString()
    {
        return ("Point: ("+ locX + "," + locY + ")");
    }
    public void translate(int deltaX, int deltaY)
    {
        locX += deltaX;
        locY += deltaY;
    }
}


