/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This class contains the main method of the program. It will call the scene frame methods.
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

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SceneStarter {
    public static void main (String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        SceneFrame sf = new SceneFrame(1024, 768);
        sf.setUpGUI();
        sf.setUpListeners();
        
        System.out.println("Welcome!");
        System.out.println("Press the A Button to use Thunderbolt.");
        System.out.println("Press the B Button to change Pikachu's emotion.");
    }
}
