/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates a circle. The circle is drawn according to the different parameters given.
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

public class Circle implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    
    /** This method takes the x y position, radius of the circle, and color */
    public Circle(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /** This method draws the circle */
    public void draw(Graphics2D g2d){
        Ellipse2D.Double c = new Ellipse2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(c);
    }

    /** This method translates the circle according to the given values */
    public void translate(double transx, double transy){
        this.x+= transx;
        this.y+= transy;
    }
}
