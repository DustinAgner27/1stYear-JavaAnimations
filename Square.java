/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates a square graphic. This class was mostly used for the Pikachu class, especially the translate method.
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

public class Square implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    private Graphics2D g2d;
    
    /** This method takes the x y position, size of square, and color */
    public Square(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /** This method draws the square */
    public void draw(Graphics2D g2d){
        this.g2d = g2d;
        Rectangle2D.Double r = new Rectangle2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(r);
    }

    /** This method duplicates the square according to the given position */
    public void translate(double transx, double transy){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(transx,transy);
        draw(g2d);
        g2d.setTransform(reset);
    }

    /** This method changes the color of the square */
    public void setColor(Color color){
        this.color = color;
    }
}
