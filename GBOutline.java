/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates the outline of the Game Boy. The object was created using the GBShade class.
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

public class GBOutline implements DrawingObject {
    private GBShade topShade;
    private GBShade bottomShade;
    private GBShade topLeftShade;
    private GBShade bottomLeftShade;
    private GBShade topRightShade;
    private GBShade bottomRightShade;
    
    /** This method takes the x y positions, how far away from the middle the outline is, and the color*/
    public GBOutline(double x, double y, double top, double bottom, double left, double right, Color color){
        topShade = new GBShade(x,y-top,color);
        bottomShade = new GBShade(x,y+bottom,color);
        topLeftShade = new GBShade(x-left,y-top,color);
        bottomLeftShade = new GBShade(x-left,y+bottom,color);
        topRightShade = new GBShade(x+right,y-top,color);
        bottomRightShade = new GBShade(x+right,y+bottom,color);
    }

    /** This method draws the outline */
    public void draw(Graphics2D g2d){
        topShade.draw(g2d);
        bottomShade.draw(g2d);
        topLeftShade.draw(g2d);
        bottomLeftShade.draw(g2d);
        topRightShade.draw(g2d);
        bottomRightShade.draw(g2d);
    }
}
