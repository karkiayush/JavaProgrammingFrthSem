package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;

public class TwentyOneSpringFourB extends JPanel {
    private int javaStudents = 20;
    private int phpStudents = 35;
    private int pythonStudents = 30;
    private int goStudents = 100 - (javaStudents + phpStudents + pythonStudents);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int totalStudents = javaStudents + phpStudents + pythonStudents + goStudents;
        int barWidth = getWidth() / 4;
        int maxHeight = getHeight() - 50;

        int x = 50;
        int y = getHeight() - 20;

        drawBar(g, x, y, barWidth, (javaStudents * maxHeight) / totalStudents, Color.BLUE, "Java");
        drawBar(g, x + barWidth, y, barWidth, (phpStudents * maxHeight) / totalStudents, Color.GREEN, "PHP");
        drawBar(g, x + 2 * barWidth, y, barWidth, (pythonStudents * maxHeight) / totalStudents, Color.RED, "Python");
        drawBar(g, x + 3 * barWidth, y, barWidth, (goStudents * maxHeight) / totalStudents, Color.ORANGE, "Go");

        g.setColor(Color.BLACK);
        g.drawString("Language Preference", getWidth() / 2 - 50, getHeight() - 5);
    }

    private void drawBar(Graphics g, int x, int y, int width, int height, Color color, String label) {
        g.setColor(color);
        g.fillRect(x, y - height, width, height);
        g.setColor(Color.BLACK);
        g.drawString(label, x + width / 2 - 15, y + 15);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Language Preference Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TwentyOneSpringFourB());
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
