package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;

public class NinteenFallFourB extends JFrame {
    public NinteenFallFourB() {
        setTitle("Graphics Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new CustomPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NinteenFallFourB app = new NinteenFallFourB();
            app.setVisible(true);
        });
    }
}

class CustomPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set font properties
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        g.setFont(font);

        // Set color to blue
        g.setColor(Color.BLUE);

        // Draw the text
        String text = "Pokhara University";
        g.drawString(text, 50, 100);
    }
}
