/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class creates the frame and container for the canvas. This is also where the event handling happens.
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
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.sound.sampled.*;

public class SceneFrame{
    private int width;
    private int height;

    private JFrame frame;
    private Container cp;
    private SceneCanvas sc;

    private Timer timer;
    private Timer timerA;
    private Timer timerB;
    private EventListener el;

    private int xCoords;
    private int yCoords;

    private int  face = 2;

    private Clip aButtonClip;
    private Clip bButton1Clip;
    private Clip bButton2Clip;
    private Clip bButton3Clip;
    private Clip bButton4Clip;
    private Clip bgMusicClip;

    public SceneFrame(int w, int h){
        width = w;
        height = h;
        frame = new JFrame();
        sc = new SceneCanvas(width, height);
    }

    public void setUpGUI(){
        cp = frame.getContentPane();
        cp.add(sc);

        //Frame Specifications
		frame.setSize(width,height);
		frame.setTitle("Midterm Project- Agner, Neil Dustin Benedict - 220129");
        frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

    }

    public void setUpListeners() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        //Adds an event listener to the container panel
        el = new EventListener();
        cp.addMouseListener(el);

        //Timer for Button A Animation
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                sc.getButtonA().release();
                sc.repaint();                
            }
        });

        //Timer for Pikachu Animation
        timerA = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                //Changes the face of pikachu
                if(face == 1){
                    sc.getPikachu().setFace(1);
                    sc.repaint();
                    face++;
                }
                else if(face == 2){
                    sc.getPikachu().setFace(2);
                    sc.repaint();
                    face++;
                }
                else if(face == 3){
                    sc.getPikachu().setFace(3);
                    sc.repaint();
                    face++;
                }
                else if(face == 4){
                    sc.getPikachu().setFace(4);
                    sc.repaint();
                    face++;
                }
                else if(face == 5){
                    sc.getPikachu().setFace(5);
                    sc.repaint();
                    face++;
                }
                else if(face == 6){
                    sc.getPikachu().setFace(6);
                    sc.repaint();
                    face++;
                }
                else if(face == 7){
                    sc.getPikachu().setFace(7);
                    sc.repaint();
                    face++;
                }
                else if(face == 8){
                    sc.getPikachu().setFace(8);
                    sc.repaint();
                    face=1;
                    timerA.stop();
                }
                else
                    timerA.stop();
            }
        });

        //Timer for Button B Animation
        timerB = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                sc.getButtonB().release();
                sc.repaint();
            }
        });

        //Setting up for the audio
        File aButtonFile = new File("Audio/thunderbolt.wav");
        File bButton1File = new File("Audio/firstSound.wav");
        File bButton2File = new File("Audio/secondSound.wav");
        File bButton3File = new File("Audio/thirdSound.wav");
        File bButton4File = new File("Audio/fourthSound.wav");
        File bgMusicFile = new File("Audio/Route1.wav");
        AudioInputStream aButtonAudio = AudioSystem.getAudioInputStream(aButtonFile);
        AudioInputStream bButton1Audio = AudioSystem.getAudioInputStream(bButton1File);
        AudioInputStream bButton2Audio = AudioSystem.getAudioInputStream(bButton2File);
        AudioInputStream bButton3Audio = AudioSystem.getAudioInputStream(bButton3File);
        AudioInputStream bButton4Audio = AudioSystem.getAudioInputStream(bButton4File);
        AudioInputStream bgMusicAudio = AudioSystem.getAudioInputStream(bgMusicFile);
        aButtonClip = AudioSystem.getClip();
        bButton1Clip = AudioSystem.getClip();
        bButton2Clip = AudioSystem.getClip();
        bButton3Clip = AudioSystem.getClip();
        bButton4Clip = AudioSystem.getClip();
        bgMusicClip = AudioSystem.getClip();
        aButtonClip.open(aButtonAudio);
        bButton1Clip.open(bButton1Audio);
        bButton2Clip.open(bButton2Audio);
        bButton3Clip.open(bButton3Audio);
        bButton4Clip.open(bButton4Audio);
        bgMusicClip.open(bgMusicAudio);
        bgMusicClip.loop(Clip.LOOP_CONTINUOUSLY);
        bgMusicClip.start();
    }

    /** This inner class handles the mouse events needed for the program */
    private class EventListener implements MouseInputListener{

			@Override
            public void mouseClicked(MouseEvent e) {
                xCoords = e.getX();
                yCoords = e.getY();

                //Checks if the cursor is clicking the A Button
                if(Math.sqrt(Math.pow(xCoords-921,2)+Math.pow(yCoords-306,2))<=41)
                    clickButtonA();

                //Checks if the cursor is clicking the B Button
                if(Math.sqrt(Math.pow(xCoords-838, 2)+Math.pow(yCoords-388, 2))<=41)
                    clickButtonB();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.print("");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.print("");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.print("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.print("");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.print("");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.print("");
            }
    }

    /** Called when Button A is pressed */
    public void clickButtonA(){
        //Button Pressed Animation
        sc.getButtonA().press();
        sc.repaint(); 
        
        aButtonClip.setFramePosition(0);
        aButtonClip.start();

        timer.setRepeats(false);
        timer.start(); 
        
        //Pikachu Animation
        timerA.setRepeats(true);
        timerA.start(); 
    }

    /** Called when Button B is pressed */
    public void clickButtonB(){
        //Button Pressed Animation
        sc.getButtonB().press();
        sc.repaint(); 

        //Prevents overlapping of audio
        bButton1Clip.stop();
        bButton2Clip.stop();
        bButton3Clip.stop();
        bButton4Clip.stop();
        bButton1Clip.setFramePosition(0);
        bButton2Clip.setFramePosition(0);
        bButton3Clip.setFramePosition(0);
        bButton4Clip.setFramePosition(0);
        
        timerB.setRepeats(false);
        timerB.start();  

        //Changes the face of Pikachu
        if(face == 1){
            sc.getPikachu().setFace(1);
            sc.repaint();
            bButton1Clip.start();
            face++;
        }
        else if(face == 2){
            sc.getPikachu().setFace(2);
            sc.repaint();
            bButton2Clip.start();
            face++;
        }
        else if(face == 3){
            sc.getPikachu().setFace(3);
            sc.repaint();
            bButton3Clip.start();
            face++;
        }
        else if(face == 4){
            sc.getPikachu().setFace(4);
            sc.repaint();
            bButton4Clip.start();
            face=1;
        }
    }
}
