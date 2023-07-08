package LabCode;

import ClassCode.JavaAwt.AwtFirst;

import java.awt.*;

public class AwtLab extends Frame {

    public AwtLab() {
        Frame f = new Frame("Laboratory UI Development");
        Label lb = new Label("Demo of Awt in lab");
        f.add(lb);

        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
        lb.setLocation(60, 80);
        // lb.setBounds();

        Button btn = new Button("Press here");
        btn.setBounds(20, 40, 100, 40);
        f.add(btn);

    }

    public static void main(String[] args) {
        AwtLab al = new AwtLab();
    }
}

/*
 * import org.w3c.dom.Text;
 * 
 * import java.awt.*;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * import java.util.Objects;
 * 
 * public class examQuestion extends Frame {
 * 
 * public examQuestion(){
 * Frame f = new Frame("Exam Question");
 * 
 * Label name = new Label("Name");
 * name.setLocation(250,40);
 * Label password = new Label("Password");
 * name.setLocation(200,30);
 * 
 * 
 * Label result = new Label("");
 * result.setLocation(300,60);
 * 
 * 
 * TextField nameText = new TextField();
 * TextField passwordText = new TextField();
 * 
 * Button submitButton = new Button("Submit");
 * 
 * f.add(name);
 * f.add(nameText);
 * f.add(password);
 * f.add(passwordText);
 * 
 * f.add(result);
 * 
 * f.add(submitButton);
 * 
 * submitButton.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * String text = nameText.getText();
 * String password = passwordText.getText();
 * 
 * if (Objects.equals(text, "nabin") && Objects.equals(password, "abc")){
 * result.setText("User login Success");
 * }else {
 * result.setText("Login Failed");
 * }
 * 
 * }
 * });
 * 
 * 
 * f.setSize(800,800);
 * f.setLayout(new FlowLayout());
 * f.setVisible(true);
 * 
 * 
 * }
 * 
 * 
 * 
 * public static void main(String[] args) {
 * new examQuestion();
 * }
 * 
 * }
 */