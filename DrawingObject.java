/**
@author Neil Dustin Benedict A. Agner (220129)
@version March 6, 2023

This is the DrawingObject interface of the program. This is implemented by the various shapes and objects to be drawn.
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

public interface DrawingObject {
    void draw(Graphics2D g2d);
}
