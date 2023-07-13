package networkProg;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * DemoSocketProgrammingServer
 */
public class DemoSocketProgrammingServer {
    public static void main(String[] args) {

        try {
            System.out.println("Waiting for the clients.......");

            ServerSocket ss = new ServerSocket(9806);

            /*
             * Now the serversocket will be waiting for the incoming client connections and
             * soc is the object of socket class
             * 
             * 
             * 
             */
            Socket soc = ss.accept();
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}