package BoardExamPreactise.CH6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NinteenSpFourA extends JFrame {
    JTextField radiusTextField;
    JLabel resultLabel;

    public NinteenSpFourA() {
        setTitle("Circle Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        radiusTextField = new JTextField();
        JLabel radiusLabel = new JLabel("Enter Radius:");
        resultLabel = new JLabel("Area: ");

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });

        panel.add(radiusLabel);
        panel.add(radiusTextField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);
    }

    private void calculateArea() {
        try {
            double radius = Double.parseDouble(radiusTextField.getText());
            double area = Math.PI * radius * radius;
            resultLabel.setText("Area: " + area);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NinteenSpFourA().setVisible(true));
    }
}
