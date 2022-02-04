/*
 * Shape.java
 * by W P Osborne
 * 2/28/2020
 * Period 2
 */
package GeometricShapes;

import java.awt.*;
public interface Shape {
    public void draw(Graphics g);
    public void setX(int x);
    public void setY(int y);
    public int getX();
    public int getY();
    public double getArea();
    public void stretchBy(int factor);
}
