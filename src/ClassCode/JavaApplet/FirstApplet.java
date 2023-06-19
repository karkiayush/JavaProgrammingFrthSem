package ClassCode.JavaApplet;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.desktop.AppEvent;

public class FirstApplet extends Applet {
    public void paint(Graphics g) {
        Color c;
        c = Color.black;
        g.setColor(c);
    }
}
