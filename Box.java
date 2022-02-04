/*
 * Box.java
 * by Tanvi Dalvi
 * Period 2
 * 2/8/20
 * Worked Alone
 */

 //Test


public class Box
{
     //private instance variables
    private int upperLeftX;
    private int upperLeftY;
    private int boxWidth;
    private int boxHeight; 
    private Point[] corners; 
    //constructors
    public Box (int x, int y, int width, int height)
    {
        upperLeftX = x;
        upperLeftY = y;
        boxHeight = height;
        boxWidth = width;
        corners = new Point[4];
        corners[0] = new Point(upperLeftX, upperLeftY);
        corners[1] = new Point(upperLeftX, upperLeftY + height);
        corners[2] = new Point(upperLeftX + width, upperLeftY + height);
        corners[3] = new Point(upperLeftX + width, upperLeftY);
    }
    //Accessors
    public int getX()
    {
        return upperLeftX;
    }
    public int getY()
    {
        return upperLeftY;
    }
    public int getWidth()
    {
        return boxWidth;
    }
    public int getHeight()
    {
        return boxHeight;
    }
    public int getArea()
    {
        int Area = boxHeight * boxWidth;
        return Area; 
    }
    public Point[] getCorners()
    {
        return corners;
    }
    //Mutators
    public void setX(int x)
    {
        upperLeftX = x;
    }
    public void setY(int y)
    {
        upperLeftY = y;
    }
    public void setWidth(int w)
    {
        boxWidth = w;
    }
    public void setHeight(int h)
    {
        boxHeight = h;
    }
    public void translate(int deltaX, int deltaY)
    {
        upperLeftX += deltaX;
        upperLeftY += deltaY; 
    }
    public String toString()
    {
        String  s = "Box at: (" + upperLeftX + ", " + upperLeftY +") \n" + "Width: " + getWidth() + " , Height: " + getHeight();
        return s; 
    }
    //get overlap
    public Box getOverlapBox (Box other)
    {
        Box b = null;

        Point[] thiscorners = this.getCorners();
        Point[] othercorners = other.getCorners();

        //other is completely inside this box, then returns other box as overlap
        if(thiscorners[0].getX() <= othercorners[0].getX() && 
           othercorners[3].getX() <= thiscorners[3].getX() && 
           thiscorners[0].getY() <= othercorners[0].getY() && 
           thiscorners[1].getY() >= othercorners[1].getY())
        {
            return other;
        }

        //if this box is completely inside the other box, then returns this box as overlap
        if(thiscorners[0].getX() >= othercorners[0].getX() && 
           othercorners[3].getX() >= thiscorners[3].getX() && 
           thiscorners[0].getY() >= othercorners[0].getY() && 
           thiscorners[1].getY() <= othercorners[1].getY())
        {
            return this;
        }

        //checking if there is an overlap
        for (int i=0; i <4; i++)
        {
            if (othercorners[i].getX() > thiscorners[0].getX() &&
                othercorners[i].getX() < thiscorners[3].getX() && 
                othercorners[i].getY() > thiscorners[0].getY() && 
                othercorners[i].getY() < thiscorners[2].getY())
            {
                int overlapx = 0;
                int overlapy= 0;
                int overlapwidth = 0;
                int overlapheight = 0;

                if(othercorners[0].getX() <= thiscorners[0].getX())
                {
                    overlapx = thiscorners[0].getX();
                    overlapwidth = othercorners[3].getX()-thiscorners[0].getX();
                }
                else
                {
                    overlapx = othercorners[i].getX();
                    overlapwidth = upperLeftX + boxWidth - othercorners[i].getX();
                }
                if (othercorners[0].getY() <= thiscorners[0].getY())
                {
                    overlapy = thiscorners[0].getY();
                    overlapheight = othercorners[1].getY() - thiscorners[0].getY();
                }
                else
                {
                    overlapy = othercorners[i].getY();
                    overlapheight = upperLeftY + boxHeight - othercorners[i].getY();
                }
                b = new Box(overlapx, overlapy, overlapwidth, overlapheight);
                return b;
            }
        }
        return b;
    }
}


