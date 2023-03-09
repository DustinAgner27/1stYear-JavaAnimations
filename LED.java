/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates an LED object. The LED is created using circles.
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

public class LED implements DrawingObject {
    private double x;
    private double y;
    private Circle outerCircle;
    private Circle innerCircle;
    
    /** This method takes the x y positions and the color */
    public LED(double x, double y, double size){
        this.x = x;
        this.y = y;
        outerCircle = new Circle(0,0, size, Color.decode("#5F9634"));
        innerCircle = new Circle(size*.15/2,size*.15/2, size*.85, Color.decode("#7CC644"));
    }

    /** This method draws the LED */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        outerCircle.draw(g2d);
        innerCircle.draw(g2d);

        g2d.setTransform(reset);
    }
}
