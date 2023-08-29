package BoardExamPreactise.NetworkProgramming;

/**
 * TwentyTwoFallFiveA
 */

import java.awt.*;
import java.awt.event.*;
import java.net.*;

/**
 * TwentyTwoFallFiveA
 */
public class TwentyTwoFallFiveA {
    public static void main(String[] args) {
        Frame frame = new Frame("Menu based program");
        frame.setSize(600, 400);
        frame.setVisible(true);
        TextArea output = new TextArea();

        // Adding the menubar inside of frame
        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);

        // adding the actions menu inside of menubar
        Menu actionsMenu = new Menu("Menu Options");
        menuBar.add(actionsMenu);

        // creating the options to add inside fo the actions menu
        MenuItem netflixItem = new MenuItem("Print Netflix IP Addresses");
        MenuItem localhostItem = new MenuItem("Display Localhost Address");
        MenuItem loopbackItem = new MenuItem("Print Loopback Address");
        MenuItem exitItem = new MenuItem("Exit");

        // adding the menu option in the action menu
        actionsMenu.add(netflixItem);
        actionsMenu.add(localhostItem);
        actionsMenu.add(loopbackItem);
        actionsMenu.add(exitItem);

        try {
            URL url = new URL("https://www.netflix.com/np/");
            InetAddress url = new URL("https://www.netflix.com/np/");

            localhostItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    output.setText(url.getHost());
                }
            });

            loopbackItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    output.setText(url.getLoopbackAddress());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        // addding the action listener on menu option

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

// public class TwentyTwoFallFiveA extends Frame implements ActionListener {
// private TextArea resultArea;

// public TwentyTwoFallFiveA() {
// setTitle("IP Address Tool");
// setSize(400, 300);
// setLayout(new BorderLayout());

// MenuBar menuBar = new MenuBar();
// setMenuBar(menuBar);

// Menu actionsMenu = new Menu("Actions");
// menuBar.add(actionsMenu);

// MenuItem netflixItem = new MenuItem("Print Netflix IP Addresses");
// MenuItem localhostItem = new MenuItem("Display Localhost Address");
// MenuItem loopbackItem = new MenuItem("Print Loopback Address");
// MenuItem exitItem = new MenuItem("Exit");

// netflixItem.addActionListener(this);
// localhostItem.addActionListener(this);
// loopbackItem.addActionListener(this);
// exitItem.addActionListener(this);

// actionsMenu.add(netflixItem);
// actionsMenu.add(localhostItem);
// actionsMenu.add(loopbackItem);
// actionsMenu.addSeparator();
// actionsMenu.add(exitItem);

// resultArea = new TextArea();
// add(resultArea, BorderLayout.CENTER);

// addWindowListener(new WindowAdapter() {
// public void windowClosing(WindowEvent we) {
// System.exit(0);
// }
// });
// }

// public void actionPerformed(ActionEvent ae) {
// String command = ae.getActionCommand();

// if (command.equals("Print Netflix IP Addresses")) {
// printNetflixIPAddresses();
// } else if (command.equals("Display Localhost Address")) {
// displayLocalhostAddress();
// } else if (command.equals("Print Loopback Address")) {
// printLoopbackAddress();
// } else if (command.equals("Exit")) {
// System.exit(0);
// }
// }

// private void printNetflixIPAddresses() {
// try {
// InetAddress[] addresses = InetAddress.getAllByName("www.netflix.com");
// resultArea.setText("Netflix IP Addresses:\n");
// for (InetAddress address : addresses) {
// resultArea.append(address.getHostAddress() + "\n");
// }
// } catch (UnknownHostException e) {
// resultArea.setText("Unable to resolve Netflix IP addresses.");
// }
// }

// private void displayLocalhostAddress() {
// try {
// InetAddress localhost = InetAddress.getLocalHost();
// resultArea.setText("Localhost Address: " + localhost.getHostAddress());
// } catch (UnknownHostException e) {
// resultArea.setText("Unable to determine localhost address.");
// }
// }

// private void printLoopbackAddress() {
// InetAddress loopback = InetAddress.getLoopbackAddress();
// resultArea.setText("Loopback Address: " + loopback.getHostAddress());
// }

// public static void main(String[] args) {
// TwentyTwoFallFiveA app = new TwentyTwoFallFiveA();
// app.setVisible(true);
// }
// }
