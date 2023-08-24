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

            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            BufferedReader brss = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            while (serverInput != "exit") {
                // for client chat
                String userInput = br.readLine();
                System.out.print("Client chat: " + userInput + "\n");

                // for server chat
                System.out.print("Server chat: ");
                serverInput = brss.readLine();
                out.println(serverInput);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}