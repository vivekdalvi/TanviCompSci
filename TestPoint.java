/*
 * TestPoint.java
 * by Tanvi Dalvi
 * Period 2
 * 1/30/20
 * Worked Alone
 */



public class TestPoint
{
    public static void main (String[] args )
    {
        Point p1 = new Point();
        Point p2 = new Point(15, 15);

        p1.setX(4);
        p1.setY(3);

        p2.translate(-5, -5);

        int x = p2.getX();
        int y = p2.getY();

        System.out.println("Point: ("+ x + "," + y + ")");
        System.out.println(p1.toString());

        double distance = p1.getDistanceToOrigin();
        System.out.println("Point is " + distance + " away from origin!");


    }
}