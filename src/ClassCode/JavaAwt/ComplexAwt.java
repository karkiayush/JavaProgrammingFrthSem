package ClassCode.JavaAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComplexAwt extends Frame {

    public ComplexAwt() {
        setTitle("Demo UI");
        /* Buttons */
        Button btn = new Button("Click me");
        // setting the position of button
        btn.setBounds(40, 50, 100, 50);
        add(btn);

        setLayout(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        /* These things needs to be at last */
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComplexAwt();
    }
}
