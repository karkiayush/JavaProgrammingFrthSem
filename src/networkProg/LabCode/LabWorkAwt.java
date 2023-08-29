package LabCode;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabWorkAwt extends Frame {
    public LabWorkAwt() {
        String username = "Aayush Karki";
        String userpassword = "abc";
        Frame f = new Frame("User Authenticator");

        Label name = new Label("Name");
        Label password = new Label("Password");

        TextField nameField = new TextField();
        nameField.setBounds(200, 40, 100, 30);
        TextField passwordField = new TextField();
        passwordField.setBounds(200, 40, 100, 30);

        Button btn = new Button("Submit");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredName = nameField.getText();
                String enteredPw = passwordField.getText();

                if (enteredName.equals(username) && enteredPw.equals(userpassword)) {
                    Label lb= new Label("Valid");
                    f.add(lb);
                }
            }
        });


        f.add(name);
        f.add(nameField);
        f.add(password);
        f.add(passwordField);
        f.add(btn);
        f.setVisible(true);
        f.setSize(400, 200);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        LabWorkAwt lwa = new LabWorkAwt();
    }
}
