package ClassCode.JavaSwing;


import javax.swing.*;
import java.awt.*;

class SButton{
    SButton(){
        JFrame frame = new JFrame();
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");



        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        frame.add(b3,BorderLayout.EAST);
        frame.add(b4,BorderLayout.NORTH);
        frame.add(b5,BorderLayout.CENTER);



        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
public class SwingButton {
    public static void main(String[] args) {
        SButton btn = new SButton();
    }

}
