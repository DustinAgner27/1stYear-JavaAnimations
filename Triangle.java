/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates the a triangle shape. The triangle is drawn according to the different parameters given.
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

public class Triangle implements DrawingObject {
    private double x;
    private double y;
    private double firstPosX;
    private double firstPosY;
    private double secondPosX;
    private double secondPosY;
    private double thirdPosX;
    private double thirdPosY;
    private Color color;
    private Path2D.Double p;
    
    /** This method takes the x y positions for the object, the three points needed for the triangle, and the color */
    public Triangle(double x, double y, double firstPosX, double firstPosY, double secondPosX, double secondPosY, double thirdPosX, double thirdPosY, Color color){
        
        this.x = x;
        this.y = y;
        this.color = color;
        this.firstPosX = firstPosX;
        this.firstPosY = firstPosY;
        this.secondPosX = secondPosX;
        this.secondPosY = secondPosY;
        this.thirdPosX = thirdPosX;
        this.thirdPosY = thirdPosY;
        p = new Path2D.Double();
    }

    /** This method draws the triangle */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);

        p.moveTo(firstPosX, firstPosY);
        p.lineTo(secondPosX, secondPosY);
        p.lineTo(thirdPosX, thirdPosY);
        p.closePath();
        g2d.setColor(color);
        g2d.fill(p);

        g2d.setTransform(reset);
    }

}
