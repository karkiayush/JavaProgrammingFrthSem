package BoardExamPreactise.NetworkProgramming;

import java.io.*;
import java.net.*;

public class SingleServerChatSystem {
    public static void main(String[] args) {
        try {
            String serverInput = "Start";
            System.out.println("Server is waiting.........");

            ServerSocket ss = new ServerSocket(9500);
            Socket soc = ss.accept();
            System.out.println("Connection is established");

            // to read the client input
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            // to send the server chat to client
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            // to read the server input
            BufferedReader brss = new BufferedReader(new InputStreamReader(System.in));

            while (serverInput != "exit") {
                // for client chat
                String userInput = br.readLine();
                System.out.print("Client chat: " + userInput);

                // for server chat
                System.out.print("\nServer chat: ");
                serverInput = brss.readLine();
                out.println(serverInput);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}