/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates the right part of the Game Boy. The object was created using a rounded rectangle and curves.
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

public class GBRight implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private RoundRectangle2D rrect;
    private Path2D.Double curve;
    private Color color;
    
    /** This method takes the x y positions, width, height, and the color */
    public GBRight(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

        //Relative to the size of the GBBody
        rrect = new RoundRectangle2D.Double(-9, height*.1, width/2.35, height*.9, 30, 40);
        curve = new Path2D.Double();
        
    }

    /** This method draws the object */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        curve.moveTo(0,0);
        curve.curveTo(100,0,0,0,width/2.35-22,height*.1);
        curve.lineTo(0,height*.1);
        curve.lineTo(0,0);
        g2d.setColor(color);
        g2d.draw(curve);
        g2d.fill(curve);
        g2d.fill(rrect);
        g2d.draw(rrect);

        g2d.setTransform(reset);
    }
}
