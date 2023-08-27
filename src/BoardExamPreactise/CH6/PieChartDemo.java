package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;
// import java.awt.geom.Arc2D;

public class PieChartDemo extends JPanel {

    int supportiveStudents = 25;
    int againstStudents = 15;
    int neutralStudents = 8;
    int totalStudents = supportiveStudents + againstStudents + neutralStudents;

    public static void main(String[] args) {
        PieChartDemo pd = new PieChartDemo();
        pd.createAndShowGUI();
    }

    void createAndShowGUI() {
        JFrame frame = new JFrame("Poll Result Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PieChartDemo());
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(getWidth(), getHeight()) / 3;

        drawPieSlice(g, centerX, centerY, radius, 0, (360 * supportiveStudents) / totalStudents, Color.GREEN);

        drawPieSlice(g, centerX, centerY, radius, (360 * supportiveStudents) / totalStudents,
                (360 * (supportiveStudents + againstStudents)) / totalStudents, Color.RED);

        drawPieSlice(g, centerX, centerY, radius, (360 * (supportiveStudents + againstStudents)) / totalStudents, 360,
                Color.BLUE);
    }

    void drawPieSlice(Graphics g, int centerX, int centerY, int radius, int startAngle, int endAngle,
            Color color) {
        g.setColor(color);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, startAngle, endAngle - startAngle);
    }
}
