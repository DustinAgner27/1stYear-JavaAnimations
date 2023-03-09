/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the cross/D-Pad of the Game Boy. The object was drawn using rectangles and triangles.
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

public class Cross implements DrawingObject {
    private double x;
    private double y;
    private int crossWidth;
    private int crossHeight;
    private Rectangle r1;
    private Rectangle r2;
    private Rectangle r1Outline;
    private Rectangle r2Outline;
    private Triangle t;
    
    /** This method takes the x y position, and color */
    public Cross(double x, double y, Color color){
        this.x = x;
        this.y = y;

        crossWidth = 160;
        crossHeight = 45;

        //Makes a Rectangle Ellipse Shape for the Middle Part
        r1 = new Rectangle(0,crossWidth/2-crossHeight/2,crossWidth,crossHeight, color);
        r2 = new Rectangle(crossWidth/2-crossHeight/2,0,crossHeight,crossWidth, color);
        r1Outline = new Rectangle(0,crossWidth/2-crossHeight/2+4,crossWidth,crossHeight, Color.BLACK);
        r2Outline = new Rectangle(crossWidth/2-crossHeight/2+4,0,crossHeight,crossWidth, Color.BLACK);
        t = new Triangle(0,0,0,40,17,5,33,40,Color.decode("#6D7D8B"));
    }

    /** This method draws the cross */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);
        
        //Outline
        r1Outline.draw(g2d);
        r2Outline.draw(g2d);
        r1.draw(g2d);
        r2.draw(g2d);

        //Upper Triangle
        g2d.translate(crossWidth/2-crossHeight/2+5,0);
        t.draw(g2d);
        g2d.setTransform(reset);

        //Left Triangle
        g2d.translate(x,y);
        g2d.translate(0,crossWidth/2+crossHeight/2-5);
        g2d.rotate(Math.toRadians(-90));
        t.draw(g2d);
        g2d.setTransform(reset);

        //Right Triangle
        g2d.translate(x,y);
        g2d.translate(crossWidth,crossWidth/2-16);
        g2d.rotate(Math.toRadians(90));
        t.draw(g2d);
        g2d.setTransform(reset);

        //Right Triangle
        g2d.translate(x,y);
        g2d.translate(crossWidth/2-crossHeight/2+38,crossWidth);
        g2d.rotate(Math.toRadians(180));
        t.draw(g2d);
        g2d.setTransform(reset);
    }
}
