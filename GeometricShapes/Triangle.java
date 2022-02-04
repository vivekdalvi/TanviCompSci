/*
 * Triangle.java
 * by Tanvi Dalvi
 * 2/28/2020
 * Period 2
 */

package GeometricShapes;

import java.awt.*;


public class Triangle implements Shape{
    // instance variables
    private int x;
    private int y;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    // constructor
    public Triangle(int v1x, int v1y, int v2x, int v2y, int v3x, int v3y){
        x = v1x;
        y = v1y;
        x2 = v2x;
        y2 = v2y;
        x3 = v3x;
        y3 = v3y;
    }
    
    // accessors
    public double getArea(){
        double area = Math.abs((double)((x*y2 + x2*y3 + x3*y - y*x2 - y2*x3 - y3*x)/2));
        return area;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    // mutators
    public void setX(int x){
        int move = x- this.x;
        this.x = x;
        
        this.x2 += move;
        this.x3 += move;
    }
    public void setY(int y){
        int move = y - this.y;
        this.y = y;
        this.y2 += move;
        this.y3 += move;
    }
    public void stretchBy(int factor){
        y3 = y + (y3-y) * factor;
        x3 = x + (x3-x) * factor;
        y2 = y + (y2-y) * factor;
        x2 = x + (x2-x) * factor;
    }
    
    public void draw(Graphics g){
        int [] xPoints = new int [3];
        int [] yPoints = new int [3];

        xPoints[0] = x;
        xPoints[1] = x2;
        xPoints[2] = x3;

        yPoints[0] = y;
        yPoints[1] = y2;
        yPoints[2] = y3;

        g.drawPolygon(xPoints, yPoints, 3);
    }
}
