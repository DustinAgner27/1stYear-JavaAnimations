/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates the start and select graphic. The object is drawn using lines and circles.
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

public class StartSelect implements DrawingObject {
    private double x;
    private double y;
    private Line l1;
    private Line l2;
    private Circle c1;
    private Circle c2;
    
    /** This method takes the x y positions for the Start and Select object, and the color */
    public StartSelect(double x, double y, Color color){
        this.x = x;
        this.y = y;
        l1 = new Line(0,0,100,18,18,color);
        c1 = new Circle(90,10,15,Color.decode("#7B8B99"));
        l2 = new Line(0,30,100,48,18,color);
        c2 = new Circle(90,40,15,Color.decode("#7B8B99"));
    }

    /** This method draws the Start and Select object */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        l1.draw(g2d);
        c1.draw(g2d);
        l2.draw(g2d);
        c2.draw(g2d);

        g2d.setTransform(reset);
    }
}
