package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TTFallFourB {
    int FRAME_WIDTH = 400;
    int FRAME_HEIGHT = 200;
    int CIRCLE_RADIUS = 10;

    int circleX = (FRAME_WIDTH - CIRCLE_RADIUS) / 2;
    int circleY = (FRAME_HEIGHT - CIRCLE_RADIUS) / 2;

    public static void main(String[] args) {
        TTFallFourB tb = new TTFallFourB();
        tb.createAndShowGUI();
    }

    void createAndShowGUI() {
        JFrame frame = new JFrame("Moving Circle Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawCircle(g);
            }
        };

        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleY -= 10;
                panel.repaint();
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleY += 10;
                panel.repaint();
            }
        });

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleX -= 10;
                panel.repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleX += 10;
                panel.repaint();
            }
        });

        frame.getContentPane().add(panel);
        frame.getContentPane().add(upButton, BorderLayout.NORTH);
        frame.getContentPane().add(downButton, BorderLayout.SOUTH);
        frame.getContentPane().add(leftButton, BorderLayout.WEST);
        frame.getContentPane().add(leftButton, BorderLayout.WEST);
        frame.getContentPane().add(rightButton, BorderLayout.EAST);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void drawCircle(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, CIRCLE_RADIUS, CIRCLE_RADIUS);
    }
}
