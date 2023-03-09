/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates a the speaker graphic. The speaker was created using lines.
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

public class Speaker implements DrawingObject {
    private double x;
    private double y;
    private Line l1;
    private Line l2;
    private Line l3;
    private Line l4;
    private Line l5;
    
    /** This method takes the x y positions and the color */
    public Speaker(double x, double y, Color color){
        this.x = x;
        this.y = y;
        l1 = new Line(0,0,100,-18,5,color);
        l2 = new Line(0,15,100,-3,5,color);
        l3 = new Line(0,30,100,12,5,color);
        l4 = new Line(0,45,100,27,5,color);
        l5 = new Line(0,60,100,42,5,color);
    }

    /** This method draws the Speaker */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        l1.draw(g2d);
        l2.draw(g2d);
        l3.draw(g2d);
        l4.draw(g2d);
        l5.draw(g2d);

        g2d.setTransform(reset);
    }
}
