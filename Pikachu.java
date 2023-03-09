/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates a pixel art of pikachu. This class contains all the frames needed for the animation.
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
import java.awt.geom.AffineTransform;

public class Pikachu implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Square square;
    //Indicates what frame is going to be used
    private int face;
    
    /** This method takes the x y position, and the size of the pikachu */
    public Pikachu(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.size = size;
        face = 1;
        square = new Square(0,0,1*size, Color.BLACK);
    }

    //* This method draws the pikachu and handles the logic for what frames to use */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x,y);
        
        square.setColor(new Color(0f,0f,0f,.0f ));
        square.draw(g2d);

        //Tail Outline
        square.setColor(Color.BLACK);
        drawVertical(0, 11, 11);
        square.translate(1*size,12*size);
        square.translate(2*size,13*size);
        square.translate(3*size,14*size);
        square.translate(4*size,15*size);
        square.translate(5*size,16*size);
        square.translate(6*size,17*size);
        square.translate(7*size,18*size);
        square.translate(8*size,19*size);
        square.translate(9*size,20*size);
        square.translate(9*size,23*size);
        square.translate(8*size,24*size);
        square.translate(8*size,24*size);
        square.translate(7*size,25*size);
        square.translate(8*size,26*size);
        square.translate(9*size,27*size);
        square.translate(9*size,29*size);
        square.translate(1*size,22*size);
        square.translate(2*size,23*size);
        square.translate(3*size,24*size);
        square.translate(2*size,25*size);
        square.translate(2*size,26*size);
        square.translate(3*size,27*size);
        square.translate(4*size,28*size);
        square.translate(5*size,29*size);
        square.translate(6*size,30*size);
        square.translate(5*size,31*size);
        square.translate(6*size,32*size);
        square.translate(7*size,33*size);
        square.translate(8*size,33*size);
        square.translate(9*size,34*size);

        //Body Outline
        drawHorizontal(3, 4, 7);
        drawHorizontal(3, 5, 3);
        drawHorizontal(5, 6, 2);
        drawHorizontal(6, 7, 2);
        drawHorizontal(7, 8, 2);
        drawHorizontal(8, 9, 2);
        drawHorizontal(10, 10, 2);
        square.translate(13*size,10*size);
        drawVertical(12, 11, 2);
        drawVertical(11, 13, 3);
        drawVertical(10, 16, 7);
        drawVertical(11, 20, 2);
        square.translate(12*size,22*size);
        drawVertical(11, 23, 3);
        square.translate(12*size,24*size);
        drawVertical(10, 26, 9);
        drawVertical(11, 34, 2);
        square.translate(12*size,36*size);
        square.translate(13*size,37*size);
        drawVertical(12, 38, 2);
        drawHorizontal(13, 39, 4);
        drawHorizontal(16, 38, 3);
        drawHorizontal(18, 37, 7);
        drawHorizontal(25, 38, 2);
        drawHorizontal(26, 39, 5);
        square.translate(30*size,38*size);
        square.translate(29*size,37*size);
        square.translate(30*size,36*size);
        drawVertical(31, 34, 2);
        drawVertical(32, 27, 7);
        drawVertical(31, 23, 4);
        square.translate(30*size,22*size);
        drawVertical(31, 20, 2);
        drawVertical(32, 16, 4);
        drawVertical(31, 13, 3);
        drawVertical(30, 10, 3);
        square.translate(29*size,9*size);
        square.translate(31*size,9*size);
        square.translate(32*size,8*size);
        square.translate(33*size,7*size);
        drawVertical(34, 1, 6);
        drawVertical(35, 0, 6);
        drawVertical(36, 0, 4);
        drawVertical(33, 1, 2);
        drawHorizontal(31, 2, 2);
        square.translate(30*size,3*size);
        square.translate(29*size,4*size);
        square.translate(28*size,5*size);
        drawHorizontal(26, 6, 2);
        square.translate(25*size,7*size);
        drawHorizontal(18, 6, 7);
        square.translate(17*size,7*size);
        drawHorizontal(13, 6, 4);
        drawHorizontal(9, 5, 4);

        //Arms Outline
        drawVertical(14, 26, 2);
        drawVertical(15, 28, 2);
        square.translate(16*size,30*size);
        drawHorizontal(17, 31, 2);
        drawVertical(18, 25, 2);
        drawVertical(19, 27, 4);
        drawVertical(24, 27, 4);
        drawVertical(25, 25, 2);
        drawHorizontal(25, 31, 2);
        square.translate(27*size,30*size);
        drawVertical(28, 28, 2);
        drawVertical(29, 26, 2);

        //Body Misc Colors
        square.setColor(Color.decode("#8d5524"));
        square.translate(7*size,6*size);
        square.translate(8*size,7*size);
        square.translate(9*size,28*size);
        drawHorizontal(8, 30, 2);
        drawHorizontal(6, 31, 4);
        drawHorizontal(7, 32, 3);
        square.translate(9*size,33*size);

        square.setColor(Color.decode("#ff9800"));
        drawHorizontal(6, 5, 3);
        square.translate(12*size,6*size);
        square.translate(9*size,7*size);
        square.translate(16*size,7*size);
        drawHorizontal(9, 8, 3);
        drawHorizontal(10, 9, 3);
        square.translate(12*size,10*size);
        square.translate(12*size,13*size);
        square.translate(26*size,7*size);
        square.translate(28*size,9*size);
        square.translate(29*size,10*size);
        drawVertical(30, 8, 2);
        drawVertical(31, 7, 2);
        drawVertical(32, 6, 2);
        drawVertical(33, 5, 2);
        square.translate(12*size,21*size);
        square.translate(30*size,21*size);
        square.translate(12*size,23*size);
        square.translate(30*size,23*size);
        drawHorizontal(20, 23, 4);
        drawHorizontal(21, 24, 2);
        drawVertical(14, 28, 2);
        square.translate(15*size,30*size);
        square.translate(16*size,31*size);
        square.translate(27*size,31*size);
        square.translate(28*size,30*size);
        drawVertical(29, 28, 2);
        drawHorizontal(7, 28, 2);
        drawHorizontal(6, 29, 3);
        square.translate(7*size,30*size);
        square.translate(11*size,33*size);
        square.translate(12*size,35*size);
        square.translate(14*size,37*size);
        drawHorizontal(16, 37, 2);
        drawHorizontal(19, 36, 5);
        drawHorizontal(25, 37, 2);
        square.translate(28*size,37*size);

        square.translate(1*size,13*size);
        square.translate(2*size,14*size);
        square.translate(3*size,15*size);
        square.translate(4*size,16*size);
        square.translate(5*size,17*size);
        square.translate(6*size,18*size);
        square.translate(7*size,19*size);
        square.translate(8*size,20*size);
        square.translate(9*size,21*size);

        //Body Fill Colors
        square.setColor(Color.decode("#ffc107"));
        drawHorizontal(8, 6, 4);
        drawHorizontal(10, 7, 6);
        drawHorizontal(18, 7, 7);
        drawHorizontal(31, 3, 3);
        drawHorizontal(30, 4, 4);
        drawHorizontal(29, 5, 4);
        drawHorizontal(28, 6, 4);
        drawHorizontal(27, 7, 4);
        drawHorizontal(12, 8, 18);
        drawHorizontal(13, 9, 15);
        drawHorizontal(14, 10, 15);
        drawHorizontal(13, 11, 17);
        resetFace();
        drawHorizontal(13, 22, 17);
        drawHorizontal(13, 23, 7);
        drawHorizontal(24, 23, 6);
        drawHorizontal(13, 24, 8);
        drawHorizontal(23, 24, 8);
        drawHorizontal(12, 25, 6);
        drawHorizontal(19, 25, 6);
        drawHorizontal(26, 25, 5);
        drawHorizontal(11, 26, 3);
        drawHorizontal(15, 26, 3);
        drawHorizontal(19, 26, 6);
        drawHorizontal(26, 26, 3);
        square.translate(30*size,26*size);
        drawHorizontal(11, 27, 3);
        drawHorizontal(15, 27, 4);
        drawHorizontal(20, 27, 4);
        drawHorizontal(25, 27, 4);
        drawHorizontal(30, 27, 2);
        drawHorizontal(11, 28, 3);
        drawHorizontal(16, 28, 3);
        drawHorizontal(20, 28, 4);
        drawHorizontal(25, 28, 3);
        drawHorizontal(30, 28, 2);
        drawHorizontal(11, 29, 3);
        drawHorizontal(16, 29, 3);
        drawHorizontal(20, 29, 4);
        drawHorizontal(25, 29, 3);
        drawHorizontal(30, 29, 2);
        drawHorizontal(11, 30, 4);
        drawHorizontal(17, 30, 2);
        drawHorizontal(20, 30, 4);
        drawHorizontal(25, 30, 2);
        drawHorizontal(29, 30, 3);
        drawHorizontal(11, 31, 5);
        drawHorizontal(19, 31, 6);
        drawHorizontal(28, 31, 4);
        drawHorizontal(11, 32, 21);
        drawHorizontal(12, 33, 20);
        drawHorizontal(12, 34, 19);
        drawHorizontal(13, 35, 18);
        drawHorizontal(13, 36, 6);
        drawHorizontal(24, 36, 6);
        square.translate(15*size,37*size);
        square.translate(27*size,37*size);
        drawHorizontal(13, 38, 3);
        drawHorizontal(27, 38, 3);

        //Tail Fill
        drawVertical(1, 14, 8);
        drawVertical(2, 15, 8);
        drawVertical(3, 16, 8);
        drawVertical(3, 25, 2);
        drawVertical(4, 17, 11);
        drawVertical(5, 18, 11);
        drawVertical(6, 19, 10);
        drawVertical(7, 20, 5);
        drawVertical(7, 26, 2);
        drawVertical(8, 21, 3);
        square.translate(9*size,22*size);

        //Determines what frame of the pikachu to use
        if(face == 1)
            face1();
        else if(face == 2)
            face2();
        else if(face == 3)
            face3();
        else if(face == 4)
            face4();
        else if(face == 5){
            face4();
            g2d.translate(18,38);
            lightning1();
            g2d.setTransform(reset);
        }
        else if(face == 6){
            face4();
            g2d.translate(18,38);
            lightning1();
            g2d.setTransform(reset);
            
            g2d.translate(x,y);
            
            g2d.translate(32,38);
            lightning2();
    
            g2d.setTransform(reset);
        }
        else if(face == 7){
            face4();
            g2d.translate(18,38);
            lightning1();
            g2d.setTransform(reset);
            
            g2d.translate(x,y);
            
            g2d.translate(32,38);
            lightning2();

            g2d.setTransform(reset);

            g2d.translate(x,y);
            g2d.translate(180,-205);
            lightning3();
            g2d.setTransform(reset);
        }
        else if(face == 8){
            face4();
            g2d.translate(18,38);
            lightning1();
            g2d.setTransform(reset);
            
            g2d.translate(x,y);
            
            g2d.translate(32,38);
            lightning2();
    
            g2d.setTransform(reset);
    
            g2d.translate(x,y);
            g2d.translate(180,-205);
            lightning3();
            g2d.setTransform(reset);
    
            g2d.translate(x,y);
            g2d.translate(-170,-205);
            lightning2();
    
            g2d.setTransform(reset);
            
        }

        g2d.setTransform(reset);
    }

    /** Draws horizontal rectangles using squares */
    public void drawHorizontal(double x, double y, int iteration){
        for(int i = 0; i< iteration; i++)
            square.translate((x+i)*size,y*size);
    }

    /** Draws vertical rectangles using squares */
    public void drawVertical(double x, double y, int iteration){
        for(int i = 0; i< iteration; i++)
            square.translate(x*size,(y+i)*size);
    }

    /** Removes the facial features of pikachu */
    public void resetFace(){
        square.setColor(Color.decode("#ffc107"));
        drawHorizontal(13, 12, 17);
        drawHorizontal(13, 13, 18);
        drawHorizontal(12, 14, 19);
        drawHorizontal(12, 15, 19);
        drawHorizontal(11, 16, 21);
        drawHorizontal(11, 17, 21);
        drawHorizontal(11, 18, 21);
        drawHorizontal(11, 19, 21);
        drawHorizontal(12, 20, 19);
        drawHorizontal(13, 21, 17);
    }

    /** Draws the face of the 1st frame */
    public void face1(){
        resetFace();
        //Face Outline
        square.setColor(Color.BLACK);
        drawHorizontal(16, 12, 2);
        drawHorizontal(15, 13, 4);
        drawHorizontal(15, 14, 4);
        drawHorizontal(16, 15, 2);
        drawHorizontal(26, 12, 2);
        drawHorizontal(25, 13, 4);
        drawHorizontal(25, 14, 4);
        drawHorizontal(26, 15, 2);
        drawHorizontal(21, 16, 2);
        square.translate(18*size,18*size);
        drawHorizontal(21, 18, 2);
        square.translate(25*size,18*size);
        drawHorizontal(19, 19, 2);
        drawHorizontal(23, 19, 2);

        //Face Colors
        square.setColor(Color.WHITE);
        square.translate(17*size,13*size);
        square.translate(27*size,13*size);

        square.setColor(Color.decode("#ff0000"));
        drawHorizontal(13, 16, 2);
        drawHorizontal(12, 17, 4);
        drawHorizontal(12, 18, 4);
        drawHorizontal(13, 19, 2);
        drawHorizontal(29, 16, 2);
        drawHorizontal(28, 17, 4);
        drawHorizontal(28, 18, 4);
        drawHorizontal(29, 19, 2);
    }

    /** Draws the face of the 2nd frame */
    public void face2(){
        resetFace();
        //Face Outline
        square.setColor(Color.BLACK);
        drawHorizontal(15, 13, 4);
        drawHorizontal(15, 14, 4);
        drawHorizontal(16, 15, 2);
        drawHorizontal(25, 13, 4);
        drawHorizontal(25, 14, 4);
        drawHorizontal(26, 15, 2);
        drawHorizontal(21, 16, 2);
        drawHorizontal(19, 18, 5);
        square.translate(18*size,19*size);
        square.translate(24*size,19*size);

        //Face Colors
        square.setColor(Color.WHITE);
        square.translate(17*size,13*size);
        square.translate(27*size,13*size);

        square.setColor(Color.decode("#ff0000"));
        drawHorizontal(13, 16, 2);
        drawHorizontal(12, 17, 4);
        drawHorizontal(12, 18, 4);
        drawHorizontal(13, 19, 2);
        drawHorizontal(29, 16, 2);
        drawHorizontal(28, 17, 4);
        drawHorizontal(28, 18, 4);
        drawHorizontal(29, 19, 2);
    }

    /** Draws the face of the 3rd frame */
    public void face3(){
        resetFace();
        //Face Outline
        square.setColor(Color.BLACK);
        drawHorizontal(15, 14, 4);
        drawHorizontal(16, 15, 2);
        drawHorizontal(25, 14, 4);
        drawHorizontal(26, 15, 2);
        drawHorizontal(21, 16, 2);
        drawHorizontal(19, 18, 5);
        square.translate(18*size,19*size);
        square.translate(24*size,19*size);
        square.translate(17*size,20*size);
        square.translate(25*size,20*size);

        //Face Colors
        square.setColor(Color.decode("#ff0000"));
        drawHorizontal(13, 16, 2);
        drawHorizontal(12, 17, 4);
        drawHorizontal(12, 18, 4);
        drawHorizontal(13, 19, 2);
        drawHorizontal(29, 16, 2);
        drawHorizontal(28, 17, 4);
        drawHorizontal(28, 18, 4);
        drawHorizontal(29, 19, 2);

        square.setColor(Color.decode("#8d5524"));
        square.translate(7*size,6*size);
        square.translate(8*size,7*size);
        square.translate(9*size,28*size);
        drawHorizontal(8, 30, 2);
        drawHorizontal(6, 31, 4);
        drawHorizontal(7, 32, 3);
        square.translate(9*size,33*size);
    }

    /** Draws the face of the 4th frame */
    public void face4(){
        resetFace();
        //Face Outline
        square.setColor(Color.BLACK);
        drawHorizontal(16, 15, 2);
        drawHorizontal(26, 15, 2);
        drawHorizontal(21, 16, 2);
        drawHorizontal(19, 18, 5);
        square.translate(15*size,16*size);
        square.translate(18*size,16*size);
        square.translate(25*size,16*size);
        square.translate(28*size,16*size);
        square.translate(18*size,19*size);
        square.translate(24*size,19*size);
        square.translate(18*size,20*size);
        square.translate(24*size,20*size);
        drawHorizontal(19, 21, 5);

        //Face Colors
        square.setColor(Color.decode("#ff0000"));
        drawHorizontal(13, 16, 2);
        drawHorizontal(12, 17, 4);
        drawHorizontal(12, 18, 4);
        drawHorizontal(13, 19, 2);
        drawHorizontal(29, 16, 2);
        drawHorizontal(28, 17, 4);
        drawHorizontal(28, 18, 4);
        drawHorizontal(29, 19, 2);
        drawHorizontal(21, 19, 2);
        drawHorizontal(20, 20, 4);

        square.setColor(Color.decode("#961010"));
        drawHorizontal(19, 19, 2);
        square.translate(23*size,19*size);
        square.translate(19*size,20*size);

        square.setColor(Color.decode("#8d5524"));
        square.translate(7*size,6*size);
        square.translate(8*size,7*size);
        square.translate(9*size,28*size);
        drawHorizontal(8, 30, 2);
        drawHorizontal(6, 31, 4);
        drawHorizontal(7, 32, 3);
        square.translate(9*size,33*size);
    }

    /** Draws the bottom left lightning */
    public void lightning1(){
        size--;
        square.setColor(Color.decode("#ffc107"));
        drawHorizontal(21, 40, 2);
        drawHorizontal(20, 41, 2);
        drawHorizontal(18, 42, 4);
        drawHorizontal(15, 43, 6);
        drawHorizontal(13, 44, 7);
        drawHorizontal(11, 45, 8);
        drawHorizontal(8, 46, 9);
        drawHorizontal(2, 47, 13);
        drawHorizontal(2, 48, 13);
        drawHorizontal(2, 49, 11);
        drawHorizontal(2, 50, 10);
        drawHorizontal(2, 51, 9);
        drawHorizontal(2, 52, 8);
        drawHorizontal(2, 53, 7);
        drawHorizontal(2, 54, 5);
        square.translate(6*size,40*size);
        drawHorizontal(4, 41, 3);
        drawHorizontal(3, 42, 4);
        drawHorizontal(1, 43, 6);
        drawHorizontal(0, 44, 7);
        drawHorizontal(-2, 45, 9);
        drawHorizontal(-3, 46, 10);
        drawHorizontal(-4, 47, 6);
        drawHorizontal(-6, 48, 7);
        drawHorizontal(-7, 49, 6);
        drawHorizontal(-9, 50, 7);
        drawHorizontal(-10, 51, 6);
        drawHorizontal(-11, 52, 5);
        drawHorizontal(-12, 53, 4);
        drawHorizontal(-12, 54, 2);
        size++;
    }

    /** Draws the bottom right lightning*/
    public void lightning2(){
        size--;
        drawHorizontal(24, 40, 2);
        drawHorizontal(25, 41, 2);
        drawHorizontal(25, 42, 4);
        drawHorizontal(26, 43, 6);
        drawHorizontal(27, 44, 7);
        drawHorizontal(28, 45, 8);
        drawHorizontal(29, 46, 11);
        drawHorizontal(31, 47, 9);
        drawHorizontal(32, 48, 8);
        drawHorizontal(34, 49, 6);
        drawHorizontal(35, 50, 5);
        drawHorizontal(36, 51, 4);
        drawHorizontal(37, 52, 3);
        drawHorizontal(38, 53, 2);
        drawVertical(40, 40, 15);
        drawVertical(41, 41, 14);
        drawVertical(42, 41, 14);
        drawVertical(43, 42, 13);
        drawVertical(44, 43, 12);
        drawVertical(45, 43, 5);
        drawVertical(46, 44, 5);
        drawVertical(47, 45, 4);
        drawVertical(48, 45, 5);
        drawVertical(49, 46, 5);
        drawVertical(50, 47, 4);
        drawVertical(51, 48, 4);
        drawVertical(52, 48, 4);
        drawVertical(53, 49, 4);
        drawVertical(54, 50, 3);
        drawVertical(55, 50, 4);
        size++;
    }

    /** Draws the top right lightning */
    public void lightning3(){
        size--;
        square.setColor(Color.decode("#ffc107"));
        drawHorizontal(15, 43, 4);
        drawHorizontal(13, 44, 6);
        drawHorizontal(11, 45, 8);
        drawHorizontal(8, 46, 9);
        drawHorizontal(2, 47, 13);
        drawHorizontal(2, 48, 13);
        drawHorizontal(2, 49, 11);
        drawHorizontal(2, 50, 10);
        drawHorizontal(2, 51, 9);
        drawHorizontal(2, 52, 8);
        drawHorizontal(2, 53, 7);
        drawHorizontal(2, 54, 5);
        square.translate(6*size,40*size);
        drawHorizontal(4, 41, 3);
        drawHorizontal(3, 42, 4);
        drawHorizontal(1, 43, 6);
        drawHorizontal(0, 44, 7);
        drawHorizontal(-2, 45, 9);
        drawHorizontal(-3, 46, 10);
        drawHorizontal(-4, 47, 6);
        drawHorizontal(-6, 48, 7);
        drawHorizontal(-7, 49, 6);
        drawHorizontal(-9, 50, 7);
        drawHorizontal(-10, 51, 6);
        drawHorizontal(-11, 52, 5);
        drawHorizontal(-12, 53, 4);
        drawHorizontal(-12, 54, 2);
        size++;
    }

    /** This method is used to change what frame to use */
    public void setFace(int faceNum){
        face = faceNum;
    }
    
}
