/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates the top bumpers of the Game Boy. The object was created using rounded rectangles.
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

public class GBBumpers implements DrawingObject {
    private double x;
    private double y;
    private RoundRectangle2D leftBumper;
    private RoundRectangle2D leftBumperOutline;
    private RoundRectangle2D rightBumper;
    private RoundRectangle2D rightBumperOutline;
    private Color color;
    
    /** This method takes the x y positions, width, height, and the color */
    public GBBumpers(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        leftBumper = new RoundRectangle2D.Double(0, 0, width, height, 30, 40);
        leftBumperOutline = new RoundRectangle2D.Double(-width*0.05, -height*.035, width, height, 30, 40);
        rightBumper = new RoundRectangle2D.Double(GBBody.width+width*1.28, 0, width, height, 30, 40);
        rightBumperOutline = new RoundRectangle2D.Double(GBBody.width+width*1.33, -height*.035, width, height, 30, 40);
    }

    /** This method draws the object */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        g2d.setColor(Color.BLACK);
        g2d.fill(leftBumperOutline);
        g2d.setColor(color);
        g2d.fill(leftBumper);
        g2d.setColor(Color.BLACK);
        g2d.fill(rightBumperOutline);
        g2d.setColor(color);
        g2d.fill(rightBumper);
        
        g2d.setTransform(reset);
    }
}
