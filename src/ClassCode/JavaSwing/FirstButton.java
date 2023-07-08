package ClassCode.JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FirstButton
 */
public class FirstButton {

    public FirstButton() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JTextField text = new JTextField();
        JButton button = new JButton();

        // frame related code
        frame.setTitle("Jbutton, Jlabel & JTextfield");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // button related code
        button.setText("Demo Jbutton");
        button.setBounds(40, 30, 100, 50);
        frame.setLayout(null);
        frame.add(button);

        // label related code
        label.setText("Hello guys, this is lable demo");
        label.setBounds(100, 100, 100, 40);
        frame.add(label);

        // textfield related code
        text.setBounds(30, 300, 150, 20);
        frame.add(text);

        // frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FirstButton fb = new FirstButton();
    }
}