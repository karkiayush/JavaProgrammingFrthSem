package ClassCode.JavaSwing.SwingLabels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JLabel is a GUI display area for the string of text, an image or both
 */
public class FirstLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        // ImageIcon is used to display the image
        ImageIcon image = new ImageIcon("./src/ClassCode/JavaSwing/desktop.png");

        /* LABELS CODE */
        /* label text will be display after the image icon horizontally by default */
        label.setText("Label to be displayed");
        // styling the color of font
        label.setForeground(Color.black);
        // set the font of text
        label.setFont(new Font("Monaco", Font.PLAIN, 22));
        /*
         * Manipulating the text position
         * left,center,right for hoz.
         *
         * Top, bottom,CENTER for vertical
         */
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        /*
         * setIconTextGap works only for the vertical position and vertical value should
         * be either TOP or BUTTOM
         */
        label.setIconTextGap(10);
        label.setIcon(image);
        /* bydefault the label will be visible */
        label.setVisible(true);

        /* Frames code */
        frame.setSize(600, 400);
        frame.setTitle("JLabel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        /* Adding the label to frame */
        frame.add(label);
    }
}