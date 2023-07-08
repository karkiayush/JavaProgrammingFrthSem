package ClassCode.JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowListenerActionListener {
    public WindowListenerActionListener() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JButton jbutton = new JButton();
        JTextField textField = new JTextField();

        /*frame code*/
        frame.setTitle("Window & ActionListener");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Label code*/
        label.setText("Demo Label");
        label.setBounds(50, 20, 200, 20);
        frame.add(label);

        /*Button code*/
        jbutton.setText("Click Me");
        jbutton.setBounds(30, 40, 100, 50);
        frame.setLayout(null);
        frame.add(jbutton);


        /*functionality is added after adding the component in the frame*/
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text is changed after button  click");
                textField.setText("Filling text in text-field");
            }
        });

        /*Text field code*/
        textField.setBounds(180, 40, 200, 30);
        frame.add(textField);

        frame.setVisible(true);
    }
}
