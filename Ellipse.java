/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates an ellipse. The ellipse is drawn according to the different parameters given.
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

public class Ellipse implements DrawingObject {
    private Color color;
    private Ellipse2D.Double e;
    
    /** This method takes the x y position, width and height of the ellipse, and color */
    public Ellipse(double x, double y, double width, double height, Color color){
        this.color = color;
        e = new Ellipse2D.Double(x,y,width,height);
    }

    /** This method draws the ellipse */
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.fill(e);
    }
}
