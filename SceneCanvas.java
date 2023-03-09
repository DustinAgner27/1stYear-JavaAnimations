/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class contains the canvas of the program. This is where all the objects are drawn.
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
import java.util.ArrayList;

import javax.swing.*;

public class SceneCanvas extends JComponent {
    public static int width;
    public static int height;
    private ArrayList<DrawingObject> objects;
    
    //Declared as their class types so they can be manipulated for animation
    private Pikachu pika;
    private ButtonA butA;
    private ButtonB butB;
    private GBBumpers bump;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        setPreferredSize(new Dimension(width, height));
        objects = new ArrayList<DrawingObject>();
        
        objects.add(new GBBody((SceneCanvas.width/2)-520/2,(SceneCanvas.height/2)-500/2,520,500));
        objects.add(new GBShade((SceneCanvas.width/2)-GBBody.width/2,(SceneCanvas.height/2)-GBBody.height/2-(GBBody.height*.05),Color.decode("#3681C6")));
        objects.add(new GBOutline((SceneCanvas.width/2)-GBBody.width/2,(SceneCanvas.height/2)-GBBody.height/2,GBBody.height*.065,GBBody.height*0.02,GBBody.width*0.02,GBBody.width*0.02,Color.BLACK));

        bump = new GBBumpers(width/2-GBBody.width/1.15,height/2-GBBody.height/1.88,GBBody.width/3,GBBody.height/2,Color.decode("#D9DFDB"));
        objects.add(bump);

        objects.add(new GBShadow(width/2-GBBody.width/1.2,height/2+GBBody.height/1.8,GBBody.width*1.7,GBBody.height*.2));
        objects.add(new GBLeft(width/2-GBBody.width/2,height/2-GBBody.height/2,GBBody.width+GBBody.width*0.02,GBBody.height,Color.decode("#145DA0")));
        objects.add(new GBRight(width/2+GBBody.width/2,height/2-GBBody.height/2,GBBody.width+GBBody.width*0.02,GBBody.height,Color.decode("#145DA0")));

        butA = new ButtonA(width/2+GBBody.width/2+GBBody.width/5,height/2-GBBody.height/4);
        objects.add(butA);

        butB = new ButtonB(width/2+GBBody.width/2+GBBody.width/24,height/2-GBBody.height/12);
        objects.add(butB);

        objects.add(new LED(width/2+GBBody.width/1.7,height/2-GBBody.height/2.3, 40));
        objects.add(new Speaker(width/2+GBBody.width/1.8,height/2+GBBody.height/4, Color.decode("#07243D")));
        objects.add(new StartSelect(width/2-GBBody.width/1.35,height/2+GBBody.height/5, Color.decode("#07243D")));
        objects.add(new Cross(width/2-GBBody.width/1.19,height/2-GBBody.height/3, Color.decode("#7B8B99")));

        pika = new Pikachu((int) ((SceneCanvas.width/2)-37*5/2),(int) ((SceneCanvas.height/2)-40*5/2),5);
        objects.add(pika);
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        AffineTransform reset = g2d.getTransform();

        //Background
        Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(Color.decode("#EEEFC6"));
        g2d.fill(r);
        
        //Draws the Game Boy Bumpers, Outline, Shade, and Body in that order
        for(int i=4; i>=0;i--){
            objects.get(i).draw(g2d);
        }

        //Draws the other elements
        for(int i=5; i<objects.size();i++){
            objects.get(i).draw(g2d);
        }

        g2d.setTransform(reset);        
    }    

    /** Methods to return the asked object */
    public Pikachu getPikachu(){
        return pika;
    }

    public ButtonA getButtonA(){
        return butA;
    }

    public ButtonB getButtonB(){
        return butB;
    }

    public GBBumpers getBumpers(){
        return bump;
    }
}
