/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the other shade of the Game Boy. The object was created using similar shapes used in the Game Boy body.
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

public class GBShade implements DrawingObject {
    private double x;
    private double y;
    private Rectangle r;
    private Ellipse e;
    private GBLeft left;
    private GBRight right;
    
    /** This method takes the x y positions and the color */
    public GBShade(double x, double y, Color color){
        this.x = x;
        this.y = y;

        //Makes a Rectangle Ellipse Shape for the Middle Part
        r = new Rectangle(0,0,GBBody.width,GBBody.height,color);
        e = new Ellipse(-r.getWidth()/1.2/2,r.getHeight()/5.9/2,r.getWidth()+r.getWidth()/1.2,r.getHeight(),color);

        //Makes the Left and Right Bumpers
        left = new GBLeft(0,0,GBBody.width+GBBody.width*0.02,GBBody.height,color);
        right = new GBRight(GBBody.width,0,GBBody.width+GBBody.width*0.02,GBBody.height,color);
    }

    /** This method draws the shade */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);
        
        r.draw(g2d);
        e.draw(g2d);
        left.draw(g2d);
        right.draw(g2d);
        g2d.setTransform(reset);
    }
}
