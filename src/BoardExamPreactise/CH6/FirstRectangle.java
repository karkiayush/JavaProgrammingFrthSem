package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;

public class FirstRectangle {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Draw Rectangle Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom JPanel for drawing
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRectangle(g);
            }
        };

        frame.getContentPane().add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void drawRectangle(Graphics g) {
        // Draw a rectangle using drawRect method
        g.drawRect(50, 50, 200, 150);
    }
}
