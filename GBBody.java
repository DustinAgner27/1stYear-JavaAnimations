/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates the main body, screen body, and screen of the Game Boy. The object was created using rectangles and ellipses.
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

public class GBBody implements DrawingObject {
    private double x;
    private double y;
    public static int width;
    public static int height;
    private Rectangle r;
    private Rectangle r2;
    private Rectangle r3;
    private Ellipse e;
    private Ellipse e2;
    private Ellipse e3;
    
    /** This method takes the x y positions, and the width and height of the body. 
     * The body measurements is heavily relied on by the other objects because it determines their position in the canvas */
    public GBBody(double x, double y, int w, int h){
        this.x = x;
        this.y = y;
        width = w;
        height = h;

        //Makes a Rectangle Ellipse Shape for the Middle Part
        r = new Rectangle(0,0,width,height,Color.decode("#145DA0"));
        e = new Ellipse(-r.getWidth()/1.2/2,r.getHeight()/5.9/2,r.getWidth()+r.getWidth()/1.2,r.getHeight(),Color.decode("#145DA0"));

        //Makes a Rectangle Ellipse Shape for the Screen Body
        r2 = new Rectangle((width-width*.8)/2,(height-height*.8)/2,width*.8,height*.8,Color.BLACK);
        e2 = new Ellipse(-r2.getWidth()/1.2/2+(width-width*.8)/2,r2.getHeight()/5.9/2+(height-height*.8)/2,r2.getWidth()+r2.getWidth()/1.2,r2.getHeight(),Color.BLACK);
        e3 = new Ellipse(-width/2/2,height*.04,width*1.5,height*.8,Color.BLACK);

        //Makes the screen
        r3 = new Rectangle((width-width*.8*.8)/2, (height-height*.8*.8)/2, width*.8*.8, height*.8*.8, Color.decode("#f37735"));
    }

    /** This method draws the body */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        e.draw(g2d);
        r.draw(g2d);
        e2.draw(g2d);
        e3.draw(g2d);
        r2.draw(g2d);
        r3.draw(g2d);

        g2d.setTransform(reset);
    }
}
