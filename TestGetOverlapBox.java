
/*
 * TestGetOverlapBox.java
 * by Tanvi Dalvi
 * Period 2
 * 2/8/20
 * Worked Alone
 */

import java.awt.*; //for using Graphics class with drawing panel

public class TestGetOverlapBox
{
    public static void main (String[] args)
    {
        Box b1 = new Box (20, 10, 70, 50);
        Box b2 = new Box (50, 40, 60, 40);
        Box overlap = b1.getOverlapBox(b2);
        System.out.println("Box1:");
        PrintBox(b1);
        System.out.println("Box2:");
        PrintBox(b2);
        System.out.println("Overlap Box:");
        PrintBox(overlap);
        DrawBoxes(b1, b2, overlap);

        b1 = new Box (50, 10, 60, 20);
        b2 = new Box (10, 40, 60, 40);
        overlap = b1.getOverlapBox(b2);
        System.out.println("Box1:");
        PrintBox(b1);
        System.out.println("Box2:");
        PrintBox(b2);
        System.out.println("Overlap Box:");
        PrintBox(overlap);
    }

    //Draws boxes using the DrawingPanel class from Fall semester
    public static void DrawBoxes( Box b1, Box b2, Box overlap)
    {
        DrawingPanel panel  = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.black);
        g.fillRect(b1.getX(), b1.getY(), b1.getWidth(), b1.getHeight());
        g.setColor(Color.GRAY);
        g.fillRect(b2.getX(), b2.getY(), b2.getWidth(), b2.getHeight());
        g.setColor(Color.MAGENTA);
        g.fillRect(overlap.getX(), overlap.getY(), overlap.getWidth(), overlap.getHeight());
    } 

    //Writes output for a box on terminal
    public static void PrintBox(Box b)
    {
        if(b != null)
        {
            System.out.println(b.toString());
        }
        else
        {
            System.out.println("null");
        }
    }
}

/* Other cases tested

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (50, 40, 60, 40);

b1 = new Box (50, 10, 60, 20);
b2 = new Box (10, 40, 60, 40);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (10, 30, 20, 60);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (60, 0, 50, 20);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (0, 0, 40, 30);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (30, 20, 10, 10);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (10, 0, 90, 70);

Box b1 = new Box (50, 10, 60, 20);
Box b2 = new Box (10, 40, 60, 40);

Box b1 = new Box (20, 10, 70, 50);
Box b2 = new Box (20, 0, 10, 20);

*/