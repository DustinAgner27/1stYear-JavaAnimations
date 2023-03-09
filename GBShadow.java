/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates the bottom shadow of the Game Boy. The shadow is created using ellipses.
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

public class GBShadow implements DrawingObject {
    private Ellipse2D.Double e;
    private Ellipse2D.Double e2;
    
    /** This method takes the x y positions, width, and height of the shadow */
    public GBShadow(double x, double y, double width, double height){
        e = new Ellipse2D.Double(x,y,width,height);
        e2 = new Ellipse2D.Double(x-width*.05,y+height*.02,width*1.1,height*1.1);
    }

    /** This method draws the shadow */
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.decode("#E6E7BF"));
        g2d.fill(e2);
        g2d.setColor(Color.decode("#D5D6B2"));
        g2d.fill(e);
    }
}
