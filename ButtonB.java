/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class the creates the button B. The button is drawn using circles for the button and lines for the letter.
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

public class ButtonB implements DrawingObject {
    private double x;
    private double y;
    Circle circOutline;
    Circle circOuter;
    Circle circInner;
    Line b;
    Path2D.Double curve;
    
    /** This method takes the x y position */
    public ButtonB(double x, double y){
        this.x = x;
        this.y = y;
        circOutline = new Circle(3.5,7,83,Color.BLACK);
        circOuter = new Circle(5,5,80,Color.decode("#7B8B99"));
        circInner = new Circle(10,10,70,Color.decode("#8FA1B2"));
        b = new Line(35,60,35,30,10,Color.decode("#677784"));
        curve = new Path2D.Double();
    }

    /** This method draws the button */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        g2d.translate(x,y);
        
        //Draws the circle of the button
        circOutline.draw(g2d);
        circOuter.draw(g2d);
        circInner.draw(g2d);

        //Draws the letter B
        curve.moveTo(35,30);
        curve.curveTo(65,25,70,45,39,45);
        curve.curveTo(65,45,70,64,39,60);
        b.draw(g2d);
        g2d.draw(curve);

        g2d.setTransform(reset);
    }

    /** These methods are used for the animation */
    public void press(){
        circOutline.translate(0,-2.5);
    }

    public void release(){
        circOutline.translate(0,2.5);
    }
}
