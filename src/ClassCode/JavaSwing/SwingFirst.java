package ClassCode.JavaSwing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * SwingFirst
 */
public class SwingFirst {
    public static void main(String[] args) {
        // JFrame is the window to add the components of frame
        JFrame frame = new JFrame();
        // setting up the size of the frame
        frame.setSize(800, 400);
        // setting up title
        frame.setTitle("Java Swing Learning");
        // making the close button working
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * By default:
         * frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         */
        /* preventing from resizing */
        frame.setResizable(false);
        /* changing the login that comes by defualt */
        ImageIcon image = new ImageIcon(
                "desktop.png");
        frame.setIconImage(image.getImage());

        /* Changing the background color of frame */
        frame.getContentPane().setBackground(Color.gray);
        /*
         * using rgb values
         * frame.getContentPane().setBackground(new Color(0, 10, 0));
         * 
         * 
         * For the hex value, subtitute the rgb value with hex
         */

        /* making the whole root panel to visible */
        frame.setVisible(true);
    }
}