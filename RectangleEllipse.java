/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates a unique rectangle ellipse shape. This was used for the body of the game boy.
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

public class RectangleEllipse implements DrawingObject {
    private Rectangle r;
    private Ellipse e;
    
    /** This method takes the x y position, width, height, and color */
    public RectangleEllipse(double x, double y, double width, double height, Color color){
        r = new Rectangle(x,y,width,height,color);
        e = new Ellipse(x+-r.getWidth()/1.2/2,y+r.getHeight()/5.9/2,r.getWidth()+r.getWidth()/1.2,r.getHeight(),color);
    }

    /** This method draws the shape */
    public void draw(Graphics2D g2d){
        e.draw(g2d);
        r.draw(g2d);
    }
}
