package ClassCode.JavaAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*Extending the Frame class which provides the frame for our GUI*/
public class AwtFirst extends Frame {

    /*Constructor made to invoke the different functionality of our program*/

    public AwtFirst() {
        /*providing the size of frame
        first: width & then height*/
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public  void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        /*temporary creation of obj */
        new AwtFirst();
    }
}






/*Alternative way of creating Frame in AWT i.e with explicitly extending the frame class*/
//package ClassCode.JavaAwt;
//
//import java.awt.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//
//public class AwtFirst {
//
//
//    public AwtFirst() {
//        /*making the obj of Frame class */
//        Frame frame = new Frame("Demo Desktop App");
//
//        frame.setSize(400, 500);
//        frame.setVisible(true);
//
//        /*Adding the window-listener so that the close option also works*/
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                frame.dispose();
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        AwtFirst af = new AwtFirst();
//    }
//}
