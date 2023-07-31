
// THis is server code 
package networkProg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

import javax.print.event.PrintEvent;

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
            System.out.println(soc);
            System.out.println("Connection established");

            // reading the server input
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            String str = in.readLine();
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String revString = sb.toString();

            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);

            if (str.equals(revString)) {

                out.println("Yes palindrome String");
            } else {
                out.println("No not a palindrome");
            }

            // soc.close();
            // ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
 * streams are used for reading or writing data. There are 2 types of strems :
 * i> InputStreams: for reading data
 * ii> OutputStreams: for writing data
 * 
 * 
 * 
 * 
 */