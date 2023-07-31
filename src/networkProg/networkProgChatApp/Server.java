package networkProg.networkProgChatApp;

import java.io.*;
import java.net.*;
import java.util.*;

/*Here our Server class is implementing the runnable interface which basically means now this class can be passed to
a thread and thread pool and cam be executed concurrently with other runnable classes or other classes that
implements the runnable interface*/
public class Server implements Runnable {
    /*if we implement the Runnable than we need to implement the run function*/

    private ArrayList<ConnectionHandler> connections;

    @Override
    public void run() {
        /*This run method consist of the code that does the task when we run the code*/

        try {
            ServerSocket server = new ServerSocket(9999);
            Socket client = server.accept();

            ConnectionHandler handler = new ConnectionHandler(client);
            connections.add(handler);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //inner class
    class ConnectionHandler implements Runnable {
        private Socket client;
        private BufferedReader in;
        private PrintWriter out;
        private String nickName;

        //defining constructor for the connection handling of multiple clients
        public ConnectionHandler(Socket client) {
            this.client = client;
        }


        @Override
        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                //asking the user to enter the username
                out.println("Please enter a nickname");
                nickName = in.readLine();

                System.out.println(nickName + " connected!");
                /*Now we need to broadcast this someone connecting info to all the clients. For that we need the list
                 of clients connected in the system */
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
