/*Create a popup menu attached to frame, if you click within the area of frame popup menu will be shown. Similarly clicked on menu item show message "..... item is selected" on label.

Write code in java using awt only not swing*/

package ClassCode.JavaAwt;

import java.awt.*;
import java.awt.event.*;

public class FallFourATwentyTwo extends Frame {
    private Label label;

    public FallFourATwentyTwo() {
        setTitle("Popup Menu Example");
        setSize(300, 200);
        setLayout(new BorderLayout());

        // Create a label to display the selected item
        label = new Label("");
        add(label, BorderLayout.SOUTH);

        // Create the popup menu
        PopupMenu popupMenu = new PopupMenu();
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");

        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Item 1 is selected");
            }
        });

        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Item 2 is selected");
            }
        });

        popupMenu.add(item1);
        popupMenu.add(item2);

        // Attach the popup menu to the frame
        add(popupMenu);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(FallFourATwentyTwo.this, e.getX(), e.getY());
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FallFourATwentyTwo();
    }
}
