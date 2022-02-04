/*
 * TestTriangle.java
 * by Tanvi Dalvi
 * Period 2
 * 3/1/20
 * Worked Alone
 */

package GeometricShapes;
import java.awt.*; //for using Graphics class with drawing panel

public class TestTriangle
{
    public static void main (String[] args )
    {
        Triangle t = new Triangle(20, 20, 20, 40, 40, 20);
        DrawingPanel panel  = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        t.draw(g);
        t.setX(40);
        t.setY(40);
        t.stretchBy(2);
        t.draw(g);
    }
}