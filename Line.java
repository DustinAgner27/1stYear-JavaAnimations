/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates a line. The line is drawn according to the different parameters given.
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

public class Line implements DrawingObject {
    private float thickness;
    private Color color;
    private Line2D.Double l;
    
    /** This method takes the starting and end points, thickness, and color */
    public Line(double xStart, double yStart, double xEnd, double yEnd, float thickness, Color color){
        this.thickness = thickness;
        this.color = color;
        l = new Line2D.Double(xStart, yStart, xEnd, yEnd);
    }

    /** This method draws the line */
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(l);
    }
}
