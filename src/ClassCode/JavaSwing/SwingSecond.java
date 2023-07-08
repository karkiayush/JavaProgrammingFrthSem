package ClassCode.JavaSwing;

import java.awt.Color;
import javax.swing.JFrame;

public class SwingSecond extends JFrame {
    /* constructor */
    SwingSecond() {
        this.setSize(800, 400);
        this.setTitle("Java Swing Learning Extending the JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.gray);
        this.setVisible(true);
    }
}
