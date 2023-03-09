/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates the rectangle shape. Custom methods were made to get useful information.
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/
import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    private Rectangle2D.Double r;
    private Graphics2D g2d;
    
    /** This method takes the x y position, width, height, and color */
    public Rectangle(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        r = new Rectangle2D.Double(x,y,width,height);
    }

    /** This method draws the rectangle */
    public void draw(Graphics2D g2d){
        this.g2d = g2d;
        g2d.setColor(color);
        g2d.fill(r);
    }

    /** This method moves the rectangle according to the given values */
    public void translate(double transx, double transy){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(transx,transy);
        draw(g2d);
        g2d.setTransform(reset);
    }

    //* These methods return useful information about the rectangle */
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
}
