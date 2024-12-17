package Question3;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents a simple graphical application that draws a stick figure.
 * It extends the `JFrame` class to create a window and overrides the `paint` method
 * to define the drawing logic.
 */
public class Question3 extends JFrame {

    //************************************************//
    public Question3() {
        // Set the title of the window
        setTitle("Question 3");

        // Set the dimensions of the window
        setSize(300, 300);

        // Define how the window should close (exit the application)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        setVisible(true);
    }
    //************************************************//

    /**
     * This method is called by the system whenever the window needs to be repainted.
     * It overrides the `paint` method from the `JFrame` class and is responsible for
     * drawing the stick figure on the window's surface.
     *
     * @param g The graphics context used for drawing on the window.
     */
    //************************************************//
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the parent class's paint method to handle default behavior

        // Draw the head (yellow circle)
        g.setColor(Color.YELLOW);
        g.fillOval(120, 30, 50, 50); // x, y, width, height

        // Draw the chest (blue rectangle)
        g.setColor(Color.BLUE);
        g.fillRect(135, 80, 30, 50); // x, y, width, height

        // Draw the left leg (blue rectangle)
        g.setColor(Color.BLUE);
        g.fillRect(135, 130, 10, 70); // x, y, width, height

        // Draw the right leg (blue rectangle)
        g.setColor(Color.BLUE);
        g.fillRect(155, 130, 10, 70); // x, y, width, height

        // Draw the left arm (blue line)
        g.setColor(Color.BLUE);
        g.drawLine(135, 90, 100, 130); // x1, y1, x2, y2

        // Draw the right arm (blue line)
        g.setColor(Color.BLUE);
        g.drawLine(165, 90, 200, 130); // x1, y1, x2, y2
    }
    //************************************************//

    //main method
    //************************************************//
    public static void main(String[] args) {
        // Schedule the creation and display of the Question3 frame on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            Question3 frame = new Question3();

            // Optionally simulate some background work before repainting
            new Thread(() -> {
                try {
                    Thread.sleep(2000); // Wait for 2 seconds before repainting
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                frame.repaint(); // Repaint the frame to trigger redrawing
            }).start();
        });
    }
    //*********************EndOfFile***************************//
}