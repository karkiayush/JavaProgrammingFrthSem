package ClassCode.JavaAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComplexAwt {

    public ComplexAwt() {
        Frame frame = new Frame("Demo UI");
        /* Buttons */
        Button btn = new Button("Click me");
        // setting the position of button
        btn.setBounds(40, 50, 100, 50);
        btn.setBackground(Color.PINK);
        btn.setForeground(Color.white);


        /*Adding label: a simple text or any textual content*/
        Label label = new Label("Label is textual content");
        label.setBounds(20, 200, 120, 40);
        label.setForeground(Color.black);
        label.setBackground(Color.blue);

        TextField tf = new TextField();
        tf.setBounds(200, 40, 100, 30);
        tf.setBackground(Color.green);

        /*setlayout(null) sets the border to the button*/
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        /* These things needs to be at last */
        frame.add(btn);
        frame.add(label);
        frame.add(tf);

        //Code to make the frame to be visible
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ComplexAwt();
    }
}
